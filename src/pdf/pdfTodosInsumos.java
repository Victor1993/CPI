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

public class pdfTodosInsumos {
    
    DataConnection miConexion;
    
    public void GenerarPDF_TodosLosInsumos(){
        try{
            
            //cargar tabla con los prestamos
            String LlenarTabla = "SELECT ins.CodigoIn, CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo), est.EstadoEs, lug.NombreLug "
                    + "FROM insumos ins, marcasinsumos mar, modelosinsumos mo, tiposinsumos tip, estadosinsumos est, lugares lug "
                    + "WHERE (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND (ins.EstadoIn=est.CodigoEs) "
                    + "AND (ins.LugarIn=lug.CodigoLug) ORDER BY ins.CodigoIn ASC";
            Statement stTabla = miConexion.con.createStatement();
            ResultSet rsTabla = stTabla.executeQuery(LlenarTabla);
            PdfPTable miTabla = new PdfPTable(4);
            PdfPCell codigo1 = new PdfPCell(new Paragraph("Codigo"));
            PdfPCell detalle1 = new PdfPCell(new Paragraph("Detalle del insumo"));
            PdfPCell estado1 = new PdfPCell(new Paragraph("Estado"));
            PdfPCell ubicacion1 = new PdfPCell(new Paragraph("Ubicación"));
            miTabla.addCell(codigo1);
            miTabla.addCell(detalle1);
            miTabla.addCell(estado1);
            miTabla.addCell(ubicacion1);
            while(rsTabla.next()){                
                PdfPCell codigo = new PdfPCell(new Paragraph(rsTabla.getString("ins.CodigoIn")));
                PdfPCell detalle = new PdfPCell(new Paragraph(rsTabla.getString("CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo)")));
                PdfPCell estado = new PdfPCell(new Paragraph(rsTabla.getString("est.EstadoEs")));
                PdfPCell ubicacion = new PdfPCell(new Paragraph(rsTabla.getString("lug.NombreLug")));
                miTabla.setWidthPercentage(100F);
                miTabla.setHorizontalAlignment(Element.ALIGN_CENTER);                
                miTabla.addCell(codigo);
                miTabla.addCell(detalle);
                miTabla.addCell(estado);
                miTabla.addCell(ubicacion);
            }
            
            //cargar tabla con la cantidad de insumos por tipo de insumo
            String LlenarTabla2 = "SELECT tip.TipoInsumoTi, COUNT(*) FROM insumos ins, tiposinsumos tip "
                    + "WHERE (ins.TipoInsumoIn=tip.CodigoTi) GROUP BY tip.TipoInsumoTi ORDER BY tip.TipoInsumoTi ASC";
            Statement stTabla2 = miConexion.con.createStatement();
            ResultSet rsTabla2 = stTabla2.executeQuery(LlenarTabla2);
            PdfPTable miTabla2 = new PdfPTable(2);
            PdfPCell tipoInsumo = new PdfPCell(new Paragraph("Tipo de Insumo"));
            PdfPCell contador = new PdfPCell(new Paragraph("Total"));
            miTabla2.addCell(tipoInsumo);
            miTabla2.addCell(contador);
            while(rsTabla2.next()){                
                PdfPCell tipoInsumo1 = new PdfPCell(new Paragraph(rsTabla2.getString("tip.TipoInsumoTi")));
                PdfPCell contador1 = new PdfPCell(new Paragraph(rsTabla2.getString("COUNT(*)")));
                miTabla2.setWidthPercentage(100F);
                miTabla2.setHorizontalAlignment(Element.ALIGN_CENTER);                
                miTabla2.addCell(tipoInsumo1);
                miTabla2.addCell(contador1);
            }
            
            //Cargar los datos del funcionario
            String DatosPrestamo;
            DatosPrestamo = "SELECT COUNT(*) FROM insumos";
            Statement stDatos = miConexion.con.createStatement();            
            ResultSet rsDatos = stDatos.executeQuery(DatosPrestamo);
            
            Paragraph contenido = new Paragraph();
            Paragraph contenido1 = new Paragraph();
            Paragraph contenido2 = new Paragraph();
            Paragraph final_pagina = new Paragraph();
            
            if(rsDatos.next() == true){                
                
                String Contador = rsDatos.getString("COUNT(*)");
                
                contenido.add("Estimado(a).\n\n"
                            +   "Se han contabilizado un total de "+ Contador +" insumos registrados.\n\n"
                            +   "Detalle del préstamo:\n\n");
                contenido.setAlignment(Paragraph.ALIGN_JUSTIFIED);
                
                
                contenido1.add("\n\nTotal de insumos, según el tipo de insumo:\n\n");
                
                contenido2.add("\n\nObservaciones:\n"
                            + "Algunos insumos no tienen asignado un código individual por lo que se contabiliza con el valor '1' y en la observación "
                            + "del préstamo se agrega la cantidad real.\n\n\n\n\n");
                contenido2.setAlignment(Paragraph.ALIGN_JUSTIFIED);
                
                
                final_pagina.add("____________________________\n"
                            +   "Víctor Sandoval\n"
                            +   "Coordinador Informático");
                final_pagina.setAlignment(Paragraph.ALIGN_CENTER);
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al generar el PDF");
            }
            
            /***************************************************************
            *******************    CREACION DE PDF     ********************
            **************************************************************/
                
            Document document = new Document(PageSize.LETTER, 80, 80, 50, 50);
            FileOutputStream salida = new FileOutputStream(System.getProperty("user.home") + "\\Desktop\\insumos_totales.pdf");
            PdfWriter writer = PdfWriter.getInstance(document, salida);
            writer.setInitialLeading(0);
            
            Paragraph titulo = new Paragraph();
            titulo.add("Escuela Artística Armando Dufey Blanc\n\n\n");
            titulo.setAlignment(Paragraph.ALIGN_CENTER);        

            document.open();
            document.add(titulo);
            document.add(contenido);
            document.add(miTabla);
            document.add(contenido1);
            document.add(miTabla2);
            document.add(contenido2);
            document.add(final_pagina);
            document.close();
            
            JOptionPane.showMessageDialog(null, "El PDF se ha generado correctamente bajo el nombre insumos_totales.pdf\nLo encontrará en el escritorio de su equipo");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
    }
}
