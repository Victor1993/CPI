package ventanasprestamos;

import clases.DataConnection;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import correos.correoDevolucion;
import correos.correoPrestamos;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import pdf.pdfPrestamos;
import principal.jfPrincipal;

/**
 * @author "Víctor Sandoval Millar"
 */
public class jdDevoluciones extends javax.swing.JDialog {

    DataConnection miConexion;
    
    /********** DATOS CORREO **********/
    public static String Usuario = "informatica.dufey@gmail.com";
    public static String Clave = "Dufey2016";
    String Mensaje = "";
    String Para = "";
    String Asunto = "";
    /**********************************/
    
    public jdDevoluciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblFecha.setVisible(false);
        lblHora.setVisible(false);
        tfCodigoInsumo.setText("");
        lblCodigoPrestamo.setVisible(false);
        tfCodigoInsumo.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfCodigoInsumo = new javax.swing.JTextField();
        btnDevolver = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblCodigoPrestamo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Devolución de insumos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingrese el código del insumo prestado:");

        tfCodigoInsumo.setEditable(false);
        tfCodigoInsumo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        tfCodigoInsumo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDevolver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aplicar.png"))); // NOI18N
        btnDevolver.setText("Devolver");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_ficha.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lblFecha.setText("00-00-0000");

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lblHora.setText("00:00:00");

        lblCodigoPrestamo.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lblCodigoPrestamo.setText("00-00-0000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigoInsumo)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoPrestamo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFecha)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(tfCodigoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnDevolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblHora)
                    .addComponent(lblCodigoPrestamo))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean corriendo = false;
    String formato = "HH:mm:ss";
    Thread hilo = new Thread() {

        @Override
        public void run() {/*Implementamos el metodo abstracto run*/
            while (true) {/*Ciclo infinito para que siempre se actualice la hora*/
                DateFormat D_Formato = new SimpleDateFormat(formato);/*Crear e inicializar variable tipo DateFormat*/
                java.util.Date date = new java.util.Date();/*Crear e inicializar variable tipo Date*/
                //tfHora.setHorizontalAlignment(SwingConstants.CENTER);
                lblHora.setText(D_Formato.format(date)+"  ");
                //Mostrar Fecha
                Calendar Cal = Calendar.getInstance();
                DecimalFormat df = new DecimalFormat("00");
                int dia  = Cal.get(Calendar.DATE);
                int mes  = Cal.get((Calendar.MONTH))+1;
                int anio = Cal.get(Calendar.YEAR);
                lblFecha.setText(anio+"-"+df.format(mes)+"-"+df.format(dia)+"  ");
                try {
                    Thread.sleep(1000);/*El hilo duerme 1000 miliseg, es decir 1 seg*/
                } catch (InterruptedException ex) {/*Excepciones*/
                    Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }/*Fin de Excepciones*/
            }/*Fin del Ciclo*/
        }/*Fin de metodo run*/
    };
    
    //Recibir rut
    public void setText(String CodigoInsumo, String CodigoPrestamo){
        tfCodigoInsumo.setText(CodigoInsumo);
        lblCodigoPrestamo.setText(CodigoPrestamo);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        hilo.start();
        corriendo = true;
    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        jdBuscarPrestamo miBuscar = new jdBuscarPrestamo(new jfPrincipal(),true);
        miBuscar.setLocationRelativeTo(null);
        this.dispose();
        miBuscar.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed
 
    
    //Agregar prestamo
    private void funcionDevolverPrestamo(){
        try{
            if("".equals(tfCodigoInsumo.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el número de préstamo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfCodigoInsumo.requestFocus();
            }else{
                //Comprobar que el codigo de pedido exista
                String Real;
                Real = "SELECT CodigoIn FROM insumos "
                    + "WHERE CodigoIn = '"+ tfCodigoInsumo.getText() +"' LIMIT 1";
                Statement stR = miConexion.con.createStatement();
                ResultSet rsR = stR.executeQuery(Real);
                if(rsR.next() == true){                        
                    //Devolver prestamo
                    String Devolver;
                    Devolver = "UPDATE detalleprestamos SET "
                            + "FechaEntregaDe = '"+ lblFecha.getText() +"', "
                            + "HoraEntregaDe = '"+ lblHora.getText() +"', "
                            + "EntregadoDe = '1' "
                            + "WHERE InsumoDe = '"+ tfCodigoInsumo.getText() +"' "
                            + "AND CodigoPrestamoDe = '"+ lblCodigoPrestamo.getText() +"'";
                    Statement stAdd = miConexion.con.createStatement();
                    stAdd.executeUpdate(Devolver);
                    JOptionPane.showMessageDialog(this, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">El préstamo fue devuelto exitosamente</div></html>", //Mensaje
                            "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    //Preguntar si desea notificar por correo electrónico
                    int seleccion = JOptionPane.showOptionDialog(
                    null, // Componente padre
                    "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    + "font-size:12px}</style>"
                    + "<div align=\"center\">¿Desea notificar al funcionario que el insumo fue devuelto?.</div></html>", //Mensaje
                    "Notificación", // Titulo del Mensaje
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,    // null para icono por defecto.
                    new Object[] { "Sí", "No"},    // null para YES, NO y CANCEL
                    "No");//Boton seleccionado por defecto
                        if (seleccion != -1){
                            if((seleccion + 1)==1){
                                //Accion a realizar al precionar "SI"
                                //Enviar correo informando que el insumo fue devuelto
                                if(!"".equals(tfCodigoInsumo.getText())){
                                    correoDevolucion miCorreo = new correoDevolucion();
                                    miCorreo.funcionNotificarDevolucion(tfCodigoInsumo.getText(),lblCodigoPrestamo.getText());
                                    tfCodigoInsumo.setText("");
                                }else{
                                    JOptionPane.showMessageDialog(this, 
                                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                                        +   "font-size:12px}</style>"
                                        +   "<div align=\"center\">No ha ingresado el código del insumo</div></html>", //Mensaje
                                            "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                                    tfCodigoInsumo.requestFocus();
                                    tfCodigoInsumo.setText("");
                                }
                            }else{
                               //Accion a realizar al precionar "NO"
                               tfCodigoInsumo.setText("");
                            }
                        }
                }else{
                    JOptionPane.showMessageDialog(this, 
                                "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                            +   "font-size:12px}</style>"
                            +   "<div align=\"center\">El número de préstamo no coincide con ningún registro de la base de datos</div></html>", //Mensaje
                                "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    tfCodigoInsumo.selectAll();
                    tfCodigoInsumo.requestFocus();
                }                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al registrar el préstamo",JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    
    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        funcionDevolverPrestamo();        
    }//GEN-LAST:event_btnDevolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jdDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdDevoluciones dialog = new jdDevoluciones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCodigoPrestamo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    public javax.swing.JTextField tfCodigoInsumo;
    // End of variables declaration//GEN-END:variables
}