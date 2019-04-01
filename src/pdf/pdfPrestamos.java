package pdf;

import clases.DataConnection;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ventanasprestamos.jdDevoluciones;

/**
 * @author "Víctor Sandoval Millar"
 */
public class pdfPrestamos {
    
    DataConnection miConexion;
    
    public void GenerarPDF_PrestamoInsumos(String Codigo){
        try{
            String CodigoPre = Codigo;
            
            //cargar tabla con los prestamos
            String LlenarTabla = "SELECT det.InsumoDe, CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                               + "FROM prestamos AS pre, detalleprestamos AS det, insumos AS ins, marcasinsumos AS mar, "
                               + "modelosinsumos AS mo, tiposinsumos AS tip, funcionarios AS fun, cursos AS cur "
                               + "WHERE (pre.CursoPr=cur.CodigoCu) AND (pre.FuncionarioPr=fun.RutFu) AND "
                               + "(det.CodigoPrestamoDe=pre.CodigoPr) AND (det.InsumoDe=ins.CodigoIn) AND (ins.TipoInsumoIn=tip.CodigoTi) "
                               + "AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND pre.CodigoPr = '"+ CodigoPre +"'";
            Statement stTabla = miConexion.con.createStatement();
            ResultSet rsTabla = stTabla.executeQuery(LlenarTabla);
            PdfPTable miTabla = new PdfPTable(2);
            PdfPCell codigo1 = new PdfPCell(new Paragraph("Codigo"));
            PdfPCell detalle2 = new PdfPCell(new Paragraph("Detalle del insumo"));
            miTabla.addCell(codigo1);
            miTabla.addCell(detalle2);
            while(rsTabla.next()){                
                PdfPCell codigo = new PdfPCell(new Paragraph(rsTabla.getString("det.InsumoDe")));
                PdfPCell detalle = new PdfPCell(new Paragraph(rsTabla.getString("CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo)")));
                miTabla.setWidthPercentage(100F);
                miTabla.setHorizontalAlignment(Element.ALIGN_CENTER);                
                miTabla.addCell(codigo);
                miTabla.addCell(detalle);                
            }
            
            //Cargar los datos del funcionario
            String DatosPrestamo;
            DatosPrestamo = "SELECT CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), cur.CursoCu, pre.ObservacionPr, pre.FechaSolicitudPr, pre.HoraSolicitudPr "
                          + "FROM funcionarios AS fun, prestamos AS pre, cursos AS cur "
                          + "WHERE (fun.RutFu=pre.FuncionarioPr) AND (pre.CursoPr=cur.CodigoCu) AND pre.CodigoPr = '"+ CodigoPre +"'";
            Statement stDatos = miConexion.con.createStatement();            
            ResultSet rsDatos = stDatos.executeQuery(DatosPrestamo);
            
            Paragraph contenido = new Paragraph();
            Paragraph contenido2 = new Paragraph();
            Paragraph final_pagina = new Paragraph();
            
            if(rsDatos.next() == true){
                String Nombre = rsDatos.getString("CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu)");
                String Curso = rsDatos.getString("cur.CursoCu");
                String Observacion = rsDatos.getString("pre.ObservacionPr");
                String FechaGringa = rsDatos.getString("pre.FechaSolicitudPr");
                String anio,mes,dia;
                anio = FechaGringa.substring(0, 4);
                mes  = FechaGringa.substring(5, 7);
                dia  = FechaGringa.substring(8, 10);
                String FechaPrestamo = (dia+"-"+mes+"-"+anio);
                String HoraPrestamo = rsDatos.getString("pre.HoraSolicitudPr");
                
                                
                contenido.add("Estimado(a): "+ Nombre +".\n\n"
                            +   "Nuestros registros indican que el día "+ FechaPrestamo +" a las "+ HoraPrestamo +" hrs "
                            +   "ha solicitado un insumo de nuestro establecimiento para ser usado en el curso/lugar: "+ Curso +".\n\n\n"
                            +   "Detalle del préstamo:\n\n");
                contenido.setAlignment(Paragraph.ALIGN_JUSTIFIED);
                
                
                contenido2.add("\n\nObservaciones del prestamo:\n"+ Observacion +"\n\n\n\n");
                contenido2.setAlignment(Paragraph.ALIGN_JUSTIFIED);
                
                
                final_pagina.add("____________________________\n"
                            +   ""+ Nombre +"\n"
                            +   "Firma");
                final_pagina.setAlignment(Paragraph.ALIGN_CENTER);
                
                
                /***************************************************************
                *******************    CREACION DE PDF     ********************
                **************************************************************/
                
                Document document = new Document(PageSize.LETTER, 80, 80, 50, 50);
                FileOutputStream salida = new FileOutputStream(System.getProperty("user.home") + "\\Desktop\\"+ CodigoPre +"_prestamo.pdf");
                PdfWriter writer = PdfWriter.getInstance(document, salida);
                writer.setInitialLeading(0);

                Paragraph titulo = new Paragraph();
                titulo.add("Escuela Artística Armando Dufey Blanc\nN° "+ CodigoPre +"\n\n\n");
                titulo.setAlignment(Paragraph.ALIGN_CENTER);        

                document.open();
                document.add(titulo);
                document.add(contenido);
                document.add(miTabla);
                document.add(contenido2);
                document.add(final_pagina);
                document.close();

                JOptionPane.showMessageDialog(null, "El PDF se ha generado correctamente bajo el nombre "+ CodigoPre +"_prestamo.pdf\nLo encontrará en el escritorio de su equipo");
                
            }else{
                JOptionPane.showMessageDialog(null, "No hay datos con los que generar un PDF");
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
