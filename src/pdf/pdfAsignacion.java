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

public class pdfAsignacion {
 
    DataConnection miConexion;
    
    public void GenerarPDF_AsignacionInsumos(String Codigo){
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
            DatosPrestamo = "SELECT CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), pre.ObservacionPr, pre.FechaSolicitudPr, pre.HoraSolicitudPr "
                          + "FROM funcionarios AS fun, prestamos AS pre "
                          + "WHERE (fun.RutFu=pre.FuncionarioPr) AND pre.CodigoPr = '"+ CodigoPre +"'";
            Statement stDatos = miConexion.con.createStatement();            
            ResultSet rsDatos = stDatos.executeQuery(DatosPrestamo);
            
            Paragraph contenido = new Paragraph();
            Paragraph contenido2 = new Paragraph();
            Paragraph contenido3 = new Paragraph();
            Paragraph final_pagina = new Paragraph();
            
            if(rsDatos.next() == true){
                String Nombre = rsDatos.getString("CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu)");
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
                            +   "se le han asignado los siguientes insumos de nuestro establecimiento, los cuales quedan a su entera responsabilidad.\n\n"
                            +   "Estos insumos deberán ser devueltos (a más tardar) en las dos semanas siguientes al término del año escolar.\n\n\n"
                            +   "Detalle del préstamo:\n\n");
                contenido.setAlignment(Paragraph.ALIGN_JUSTIFIED);
                
                
                contenido2.add("\n\nObservaciones del prestamo:\n"+ Observacion);
                contenido2.setAlignment(Paragraph.ALIGN_JUSTIFIED);
                
                contenido3.add("\n\n**En el caso de los notebooks, desktop y all-in-one es usted quien debe realizar el respaldo de sus archivos "
                            + "antes de entregarlo a la unidad informática, ya que ésta no se hará responsable en caso de perdidas de información.\n\n\n\n\n\n");
                contenido3.setAlignment(Paragraph.ALIGN_JUSTIFIED);
                
                
                final_pagina.add("_______________________________\n"
                            +   ""+ Nombre +"\n"
                            +   "Firma");
                final_pagina.setAlignment(Paragraph.ALIGN_CENTER);
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al generar el PDF");
            }
            
            /***************************************************************
            *******************    CREACION DE PDF     ********************
            **************************************************************/
                
            Document document = new Document(PageSize.LETTER, 80, 80, 50, 50);
            FileOutputStream salida = new FileOutputStream(System.getProperty("user.home") + "\\Desktop\\"+ CodigoPre +"_asignacion.pdf");
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
            document.add(contenido3);
            document.add(final_pagina);
            document.close();
            
            JOptionPane.showMessageDialog(null, "El PDF se ha generado correctamente bajo el nombre "+ CodigoPre +"_asignacion.pdf\nLo encontrará en el escritorio de su equipo");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
