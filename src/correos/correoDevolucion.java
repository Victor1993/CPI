package correos;

import clases.DataConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 * @author vitho
 */
public class correoDevolucion {
    
    DataConnection miConexion;
    
    /********** DATOS CORREO **********/
    public static String Usuario = "informatica.dufey@gmail.com";
    public static String Clave = "Dufey2016";
    String Mensaje = "";
    String Para = "";
    String Asunto = "";
    
    /**
     * @param Insumo*
     * @param Prestamo
     *******************************/
    
    //Funcion que notifica la devolucion del insumo
    public void funcionNotificarDevolucion(String Insumo, String Prestamo){
        try{
            
            String CodigoIns = Insumo;
            String CodigoPre = Prestamo;
            
            //Datos prestamo
            String datos;
            datos = "SELECT pre.CodigoPr, CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), fun.CorreoFu, "
                  + "CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo), det.FechaEntregaDe, det.HoraEntregaDe, pre.FechaSolicitudPr, pre.HoraSolicitudPr "
                  + "FROM funcionarios AS fun, prestamos AS pre, detalleprestamos AS det, insumos AS ins, marcasinsumos AS mar, modelosinsumos AS mo, tiposinsumos AS tip "
                  + "WHERE (fun.RutFu=pre.FuncionarioPr) AND (det.CodigoPrestamoDe=pre.CodigoPr) AND (det.InsumoDe=ins.CodigoIn) AND (ins.TipoInsumoIn=tip.CodigoTi) "
                  + "AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND det.InsumoDe = '"+ CodigoIns +"' AND det.CodigoPrestamoDe = '"+ CodigoPre +"' AND det.EntregadoDe = '1'";
            Statement st = miConexion.con.createStatement();
            ResultSet rs = st.executeQuery(datos);
            if(rs.next() == true){
            
                //Entregar datos a variables
                String CodigoPrestamo = rs.getString("pre.CodigoPr");
                String NombreFuncionario = rs.getString("CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu)");
                String CorreoFuncionario = rs.getString("fun.CorreoFu");
                String DetalleInsumo = rs.getString("CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo)");
                String FechaGringaSol = rs.getString("pre.FechaSolicitudPr");
                /** Convertir fecha al formato AAAA-MM-DD**/
                String anios,mess,dias;
                anios = FechaGringaSol.substring(0, 4);
                mess  = FechaGringaSol.substring(5, 7);
                dias  = FechaGringaSol.substring(8, 10);
                String FechaSolicitud = (dias+"-"+mess+"-"+anios);
                /****************************************/
                String HoraSolicitud = rs.getString("pre.HoraSolicitudPr");
                String FechaGringaEnt = rs.getString("det.FechaEntregaDe");
                /** Convertir fecha al formato AAAA-MM-DD**/
                String anioe,mese,diae;
                anioe = FechaGringaEnt.substring(0, 4);
                mese  = FechaGringaEnt.substring(5, 7);
                diae  = FechaGringaEnt.substring(8, 10);
                String FechaEntrega = (diae+"-"+mese+"-"+anioe);
                /*****************************************/
                String HoraEntrega = rs.getString("det.HoraEntregaDe");
                
                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");

                Session session = Session.getInstance(props,
                        new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(Usuario, Clave);
                            }
                        });

                String str_Asunto  = NombreFuncionario + " ha devuelto un insumo";
                String str_Mensaje = "<html><div align='justify'>Estimado(a): <strong>"+ NombreFuncionario +".</strong><br><br>"
                                    + "Le escribo para notificar que el/la <strong>"+ DetalleInsumo +"</strong> correspondiente al código "
                                    + "<strong>"+ CodigoIns +"</strong> ha sido devuelto el día <strong>"+ FechaEntrega +"</strong> a las <strong>"+ HoraEntrega +"</strong>.<br><br>"
                                    + "La devolución corresponde al código de préstamo: <strong>"+ CodigoPrestamo +"</strong> "
                                    + "originado el día <strong>"+ FechaSolicitud +"</strong> a las <strong>"+ HoraSolicitud +"</strong>.<br><br>"
                                    + "Saluda atentamente.-<br><br>"
                                    + "Víctor Sandoval<br>"
                                    + "Coordinador Informático</div></html>";

                try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(Usuario));
                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(CorreoFuncionario));            
                    message.setSubject(str_Asunto);
                    message.setText(str_Mensaje);
                    message.setContent(str_Mensaje, "text/html");
                    Transport.send(message);
                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }      
                
                JOptionPane.showMessageDialog(null, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">El funcionario fue notificado correctamente.</div></html>", //Mensaje
                            "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">Ocurrió un error al cargar los datos del préstamo, no se enviará el correo</div></html>", //Mensaje
                            "Mensaje de información", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage(),"Error al enviar el correo",JOptionPane.ERROR_MESSAGE); 
        }
    }    
    
}
