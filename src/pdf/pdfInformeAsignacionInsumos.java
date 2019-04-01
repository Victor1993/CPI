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

public class pdfInformeAsignacionInsumos {
    
    DataConnection miConexion;
    
    public void GenerarPDF_PrestamoInsumos(String Codigo){
        try{
            String CodigoPre = Codigo;
            
            //cargar tabla con los prestamos
            String LlenarTabla = "SELECT det.InsumoDe, CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo), ent.EntregadoEn, det.FechaEntregaDe, det.HoraEntregaDe "
                               + "FROM prestamos AS pre, detalleprestamos AS det, insumos AS ins, marcasinsumos AS mar, "
                               + "modelosinsumos AS mo, tiposinsumos AS tip, funcionarios AS fun, cursos AS cur, entregados AS ent "
                               + "WHERE (pre.CursoPr=cur.CodigoCu) AND (pre.FuncionarioPr=fun.RutFu) AND (det.EntregadoDe=ent.CodigoEn) AND "
                               + "(det.CodigoPrestamoDe=pre.CodigoPr) AND (det.InsumoDe=ins.CodigoIn) AND (ins.TipoInsumoIn=tip.CodigoTi) "
                               + "AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND pre.CodigoPr = '"+ CodigoPre +"'";
            Statement stTabla = miConexion.con.createStatement();
            ResultSet rsTabla = stTabla.executeQuery(LlenarTabla);
            PdfPTable miTabla = new PdfPTable(5);
            PdfPCell codigo1 = new PdfPCell(new Paragraph("Codigo"));
            PdfPCell detalle1 = new PdfPCell(new Paragraph("Detalle del insumo"));
            PdfPCell entregado1 = new PdfPCell(new Paragraph("Entregado"));
            PdfPCell fecha1 = new PdfPCell(new Paragraph("Fecha entrega"));
            PdfPCell hora1 = new PdfPCell(new Paragraph("Hora entrega"));
            miTabla.addCell(codigo1);
            miTabla.addCell(detalle1);
            miTabla.addCell(entregado1);
            miTabla.addCell(fecha1);
            miTabla.addCell(hora1);
            while(rsTabla.next()){                
                PdfPCell codigo = new PdfPCell(new Paragraph(rsTabla.getString("det.InsumoDe")));
                PdfPCell detalle = new PdfPCell(new Paragraph(rsTabla.getString("CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo)")));
                PdfPCell entregado = new PdfPCell(new Paragraph(rsTabla.getString("ent.EntregadoEn")));
                PdfPCell fecha = new PdfPCell(new Paragraph(rsTabla.getString("det.FechaEntregaDe")));
                PdfPCell hora = new PdfPCell(new Paragraph(rsTabla.getString("det.HoraEntregaDe")));
                miTabla.setWidthPercentage(100F);
                miTabla.setHorizontalAlignment(Element.ALIGN_CENTER);                
                miTabla.addCell(codigo);
                miTabla.addCell(detalle);
                miTabla.addCell(entregado);
                miTabla.addCell(fecha);
                miTabla.addCell(hora);
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
                            +   "usted solicitó los siguientes insumos de nuestro establecimiento para ser usados en el curso/lugar: "+ Curso +".\n\n\n"
                            +   "Detalle del préstamo:\n\n");
                contenido.setAlignment(Paragraph.ALIGN_JUSTIFIED);
                
                
                contenido2.add("\n\nObservaciones del prestamo:\n"+ Observacion +"\n\n\n\n\n");
                contenido2.setAlignment(Paragraph.ALIGN_JUSTIFIED);
                
                
                final_pagina.add("____________________________\n"
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
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
