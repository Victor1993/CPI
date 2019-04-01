package principal;

import clases.DataConnection;
import clases.Rut;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author "Víctor Sandoval Millar"
 */
public class jfLogin extends javax.swing.JFrame {

    DataConnection miConexion;
    Rut miRut;
    
    public jfLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNombreEstablecimiento = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        tfClave = new javax.swing.JPasswordField();
        lblNombreEstablecimiento1 = new javax.swing.JLabel();
        lblNombreEstablecimiento2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        lblNombreEstablecimiento3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Usuario");
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNombreEstablecimiento.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        lblNombreEstablecimiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreEstablecimiento.setText("CPI");

        tfUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        tfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyTyped(evt);
            }
        });

        tfClave.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tfClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClaveActionPerformed(evt);
            }
        });
        tfClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfClaveKeyTyped(evt);
            }
        });

        lblNombreEstablecimiento1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNombreEstablecimiento1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreEstablecimiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        lblNombreEstablecimiento1.setText("Usuario:");

        lblNombreEstablecimiento2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNombreEstablecimiento2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreEstablecimiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clave.png"))); // NOI18N
        lblNombreEstablecimiento2.setText("Contraseña:");

        btnIngresar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aplicar.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lblNombreEstablecimiento3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblNombreEstablecimiento3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreEstablecimiento3.setText(" v1.2.2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreEstablecimiento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfUsuario)
                    .addComponent(lblNombreEstablecimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfClave, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreEstablecimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreEstablecimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEstablecimiento)
                    .addComponent(lblNombreEstablecimiento3))
                .addGap(33, 33, 33)
                .addComponent(lblNombreEstablecimiento1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblNombreEstablecimiento2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Cambiar icono de Java por una imagen
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imgMenu/img_login.png"));//Ruta de la imagen en el proyecto
        return retValue;
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            tfUsuario.requestFocus();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
            DataConnection.delInstance();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cerrar la conexión con la BD",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowClosing

    //Funcion para validar usuario y contraseña
    private void funcionIngresar(){
        try{
            if("".equals(tfUsuario.getText().trim())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese su usuario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfUsuario.requestFocus();
            }else if("".equals(tfClave.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese su contraseña</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfClave.requestFocus();
            }else{
                //Comprobar que el usuario se encuentre registrado
                String sqlConsultaRegistrado;
                sqlConsultaRegistrado = "SELECT UsuarioUs FROM usuarios WHERE UsuarioUs = '"+ tfUsuario.getText() +"'";
                Statement stUsuarioR = miConexion.con.createStatement();
                ResultSet rsUsuarioR = stUsuarioR.executeQuery(sqlConsultaRegistrado);
                if(rsUsuarioR.next() == false){
                    JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">El usuario no se encuentra registrado</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    tfClave.setText("");
                    tfUsuario.selectAll();
                    tfUsuario.requestFocus();
                }else{
                    //Consultar a la BD si coincide el usuario y la clave
                    String sqlConsultaUsuario;
                    sqlConsultaUsuario = "SELECT UsuarioUs, ClaveUs FROM usuarios WHERE UsuarioUs = '"+ tfUsuario.getText() +"' AND ClaveUs = '"+ tfClave.getText() +"'";
                    Statement stUsuario = miConexion.con.createStatement();
                    ResultSet rsUsuario = stUsuario.executeQuery(sqlConsultaUsuario);
                    if(rsUsuario.next() == false){
                        JOptionPane.showMessageDialog(this, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">Usuario y/o contraseña incorrectos</div></html>", //Mensaje
                            "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                        tfClave.setText("");
                        tfUsuario.selectAll();
                        tfUsuario.requestFocus();
                    }else{
                        //Consultar a la BD si coincide el usuario y la clave
                        String sqlConsultaUsuarioA;
                        sqlConsultaUsuarioA = "SELECT UsuarioUs, ClaveUs, PerfilUs FROM usuarios WHERE UsuarioUs = '"+ tfUsuario.getText() +"' "
                                + "AND ClaveUs = '"+ tfClave.getText() +"' AND UsuarioUs <> '1'";
                        Statement stUsuarioA = miConexion.con.createStatement();
                        ResultSet rsUsuarioA = stUsuarioA.executeQuery(sqlConsultaUsuarioA);
                        if(rsUsuarioA.next() == false){
                            JOptionPane.showMessageDialog(this, 
                                "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                            +   "font-size:12px}</style>"
                            +   "<div align=\"center\">El usuario con el que intenta acceder al sistema\nfue desactivado, contacte con soporte</div></html>", //Mensaje
                                "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                            tfClave.setText("");
                            tfUsuario.selectAll();
                            tfUsuario.requestFocus();
                        }else{
                            String Perfil = rsUsuarioA.getString("PerfilUs");
                            this.dispose();
                            jfPrincipal miPrincipal = new jfPrincipal();
                            miPrincipal.setLocationRelativeTo(null);
                            miPrincipal.setText(tfUsuario.getText());
                            miPrincipal.setTextPerfil(Perfil);
                            miPrincipal.setVisible(true);
                        }
                    }
                }                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error:\n"+ex.getMessage());
        }
    }
    
    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        funcionIngresar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void tfUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyReleased
        try{
            if(!"".equals(tfUsuario.getText())){
                tfUsuario.setText(tfUsuario.getText().toUpperCase());
                tfUsuario.setText(Rut.formatear(tfUsuario.getText()));
            }else{
                //
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_tfUsuarioKeyReleased

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        try{
            if(!"".equals(tfUsuario.getText())){
                tfClave.requestFocus();
            }else{
                //
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void tfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClaveActionPerformed
        try{
            if(!"".equals(tfClave.getText())){
                funcionIngresar();
            }else{
                //
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tfClaveActionPerformed

    private void tfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyTyped
        try{
            //Limitar el Ingreso de caracteres a 8
            if("".equals(tfUsuario.getText())){
                //
            }else if (tfUsuario.getText().length() > 11) {
                evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            }else if(tfUsuario.getText().length() < 11){
                //
            }
            
            //Validar que solo se ingresen numeros
            int  i = evt.getKeyChar();
            char c = evt.getKeyChar();
            if (((i < '0') || (i > '9')) && ((c != 'k') && (c != 'K')) 
                    && (i != KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
            }
            
            String Personas = tfUsuario.getText();
            // Quitar ceros a la izquierda La expresión a utilizar sería:
            tfUsuario.setText(Personas.replaceFirst ("^0*", ""));
            //Quitar guiones a la izquierda
            tfUsuario.setText(Personas.replaceFirst ("^-*", ""));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tfUsuarioKeyTyped

    private void tfClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClaveKeyTyped
        //Limitar el Ingreso de caracteres a 8
        if("".equals(tfClave.getText())){
            //
        }else if (tfClave.getText().length() > 7) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }else if(tfClave.getText().length() < 7){
            //
        }
    }//GEN-LAST:event_tfClaveKeyTyped

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
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNombreEstablecimiento;
    private javax.swing.JLabel lblNombreEstablecimiento1;
    private javax.swing.JLabel lblNombreEstablecimiento2;
    private javax.swing.JLabel lblNombreEstablecimiento3;
    private javax.swing.JPasswordField tfClave;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
