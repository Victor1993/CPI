package principal;

import ventanasprestamos.jdSeleccionPrestamo;
import ventanasmantenimiento.jdMantenimiento;
import ventanasinsumos.jdSeleccionAccionInsumo;
import ventanas.jdAcerca;
import ventanasprestamos.jdVisualizarPrestamo;
import clases.DataConnection;
import clases.Mensajes;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ventanas.jdEstadisticas;

/**
 * @author "Víctor Sandoval Millar"
 */

public class jfPrincipal extends javax.swing.JFrame {

    DataConnection miConexion;
    //Instanciar las ventanas
    jdSeleccionPrestamo miPrestamo = new jdSeleccionPrestamo(this,true);
    jdSeleccionAccionInsumo miSeleccion = new jdSeleccionAccionInsumo(this, true);
    jdMantenimiento miMantenimiento = new jdMantenimiento(this,true);
    jdEstadisticas miEstadistica = new jdEstadisticas(this,true);
    jdAcerca miAcerca = new jdAcerca(this,true);
    
    public jfPrincipal() {
        initComponents();
        lblUsuario.setVisible(false);
        lblPerfil.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnPrestamos = new javax.swing.JButton();
        btnInsumos = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnMantenimiento = new javax.swing.JButton();
        btnAcerca = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblBienvenido = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Control de Préstamos de Insumos");
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

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnPrestamos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/prestamo.png"))); // NOI18N
        btnPrestamos.setText("Préstamos");
        btnPrestamos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrestamos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamosActionPerformed(evt);
            }
        });

        btnInsumos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnInsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/insumos.png"))); // NOI18N
        btnInsumos.setText("Insumos");
        btnInsumos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInsumos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumosActionPerformed(evt);
            }
        });

        btnEstadisticas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/estadisticas.png"))); // NOI18N
        btnEstadisticas.setText("Estadísticas");
        btnEstadisticas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstadisticas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        btnMantenimiento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/mantenimiento.png"))); // NOI18N
        btnMantenimiento.setText("Mantenimiento");
        btnMantenimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMantenimiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActionPerformed(evt);
            }
        });

        btnAcerca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/acerca2.png"))); // NOI18N
        btnAcerca.setText("Acerca de...");
        btnAcerca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcerca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblBienvenido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenido.setText("Bienvenido(a): ");

        lblFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Hoy es:");

        lblUsuario.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAcerca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAcerca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMantenimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    //Cambiar icono de Java por una imagen
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imgMenu/logo_dufey.png"));//Ruta de la imagen en el proyecto
        return retValue;
    }
    
    //Recoger parametro "RUT" del usuario logueado
    public void setText(String Usuario){
        lblUsuario.setText(Usuario);
    }
    
    //Recoger parametro "Perfil" del usuario logueado
    public void setTextPerfil(String Perfil){
        lblPerfil.setText(Perfil);
    }
    
    //cargar datos de usuario
    private void funcionCargarDatosUsuarios(){
        try{
            String Usuario;
            Usuario= "SELECT fun.PrimerNombreFu, fun.SegundoNombreFu, fun.ApellidoPaternoFu, fun.ApellidoMaternoFu "
                    + "FROM funcionarios as fun  "
                    + "WHERE fun.RutFu = '"+ lblUsuario.getText() +"'";
            Statement stUsser = miConexion.con.createStatement();
            ResultSet rsUsser = stUsser.executeQuery(Usuario);
            if(rsUsser.next() == true){
                String Nombre1 = rsUsser.getString("fun.PrimerNombreFu");
                String Nombre2 = rsUsser.getString("fun.SegundoNombreFu");
                String Apellido1 = rsUsser.getString("fun.ApellidoPaternoFu");
                String Apellido2 = rsUsser.getString("fun.ApellidoMaternoFu");
                lblBienvenido.setText("<html><div>Bienvenido: <b>"+Nombre1+" "+Nombre2+" "+Apellido1+" "+Apellido2+"</b></div></html>");
            }else{
                lblBienvenido.setText("No fue posible cargar los datos del usuario");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al cargar datos de usuarios", JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    private void funcionCargarFecha(){
        try{
            SimpleDateFormat formateador = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy", new Locale("ES"));
            Date fechaDate = new Date();
            String fecha = formateador.format(fechaDate);
            lblFecha.setText("<html><div>Hoy es <b>"+fecha+"</b></div></html>");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage());
        }
    }
    
    public void funcionPermiso(){
        try{         
            //Permiso de Usuario Adminsitrador
            if("1".equals(lblPerfil.getText())){
                btnPrestamos.setEnabled(true);
                btnInsumos.setEnabled(true);
                btnEstadisticas.setEnabled(true);
                btnMantenimiento.setEnabled(true);
                btnAcerca.setEnabled(true);
                btnSalir.setEnabled(true);
            }
            //Permiso de Usuario Estandar
            else{
                btnPrestamos.setEnabled(true);
                btnInsumos.setEnabled(false);
                btnEstadisticas.setEnabled(true);
                btnMantenimiento.setEnabled(false);
                btnAcerca.setEnabled(true);
                btnSalir.setEnabled(true);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        }
    }

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        funcionCargarDatosUsuarios();
        funcionCargarFecha();
        funcionPermiso();
    }//GEN-LAST:event_formWindowOpened
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Mensajes miMensaje = new Mensajes();
        miMensaje.funcionPreguntaSalir();
    }//GEN-LAST:event_formWindowClosing

    private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamosActionPerformed
        miPrestamo.setLocationRelativeTo(null);
        miPrestamo.setTextPerfil(lblPerfil.getText());
        miPrestamo.setText(lblUsuario.getText());
        miPrestamo.setVisible(true);
    }//GEN-LAST:event_btnPrestamosActionPerformed

    private void btnInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumosActionPerformed
        miSeleccion.setLocationRelativeTo(null);
        miSeleccion.setVisible(true);
    }//GEN-LAST:event_btnInsumosActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        miEstadistica.setLocationRelativeTo(null);
        miEstadistica.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActionPerformed
        miMantenimiento.setLocationRelativeTo(null);
        miMantenimiento.setVisible(true);
    }//GEN-LAST:event_btnMantenimientoActionPerformed

    private void btnAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaActionPerformed
        miAcerca.setLocationRelativeTo(null);
        miAcerca.setVisible(true);
    }//GEN-LAST:event_btnAcercaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Mensajes miMensaje = new Mensajes();
        miMensaje.funcionPreguntaSalir();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAcerca;
    public static javax.swing.JButton btnEstadisticas;
    public static javax.swing.JButton btnInsumos;
    public static javax.swing.JButton btnMantenimiento;
    public static javax.swing.JButton btnPrestamos;
    public static javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblFecha;
    public static javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
