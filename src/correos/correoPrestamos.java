package correos;

import clases.DataConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
//libreria JAVAMAIL 1.4.7
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * @author Víctor Sandoval Millar
 */
public class correoPrestamos {
    
    DataConnection miConexion;
    
    /********** DATOS CORREO **********/
    public static String Usuario = "informatica.dufey@gmail.com";
    public static String Clave = "Dufey2016";
    String Mensaje = "";
    String Para = "";
    String Asunto = "";
    /**********************************/
    
    //Funcion que envia la informacion del prestamo
    public void funcionEnviarCorreo(String Prestamo){
        try{
            
            String CodigoPre = Prestamo;
            
            //Datos prestamo
            String datos;
            datos = "SELECT CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), fun.CorreoFu "
                  + "FROM funcionarios AS fun, prestamos AS pre "
                  + "WHERE (fun.RutFu=pre.FuncionarioPr) AND pre.CodigoPr = '"+ CodigoPre +"'";
            Statement st = miConexion.con.createStatement();
            ResultSet rs = st.executeQuery(datos);
            if(rs.next() == true){
            
                //Entregar datos a variables
                String NombreFuncionario = rs.getString("CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu)");
                String CorreoFuncionario = rs.getString("fun.CorreoFu");                
                
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

                String str_Asunto   = NombreFuncionario + " ha solicitado un insumo";
                // Se compone la parte del texto
                BodyPart str_Mensaje = new MimeBodyPart();
                str_Mensaje.setText("Estimado(a): "+ NombreFuncionario +".\n\n"
                                    + "Se adjunta comprobante de préstamo de insumos.\n\n"
                                    + "Saluda atentamente.-\n\n"
                                    + "Víctor Sandoval\n"
                                    + "Coordinador Informático");
                
                // Se compone el adjunto con la imagen
                BodyPart adjunto = new MimeBodyPart();
                adjunto.setDataHandler(
                    new DataHandler(new FileDataSource(System.getProperty("user.home") + "\\Desktop\\"+ CodigoPre +"_prestamo.pdf")));
                adjunto.setFileName(CodigoPre +"_prestamo.pdf");

                // Una MultiParte para agrupar texto e imagen.
                MimeMultipart multiParte = new MimeMultipart();
                multiParte.addBodyPart(str_Mensaje);
                multiParte.addBodyPart(adjunto);

                try {
                    // Se compone el correo, dando to, from, subject y el
                    // contenido.
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(Usuario));
                    message.addRecipient(
                        Message.RecipientType.TO,
                        new InternetAddress(CorreoFuncionario));
                    message.setSubject(str_Asunto);                    
                    message.setContent(multiParte, "text/html");
                    Transport.send(message);
                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }
                
                JOptionPane.showMessageDialog(null, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">El correo se envió correctamente</div></html>", //Mensaje
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
