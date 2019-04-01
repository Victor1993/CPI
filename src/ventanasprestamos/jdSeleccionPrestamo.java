package ventanasprestamos;

import javax.swing.JOptionPane;
import principal.jfPrincipal;

public class jdSeleccionPrestamo extends javax.swing.JDialog {    
    
    public jdSeleccionPrestamo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblPerfil.setVisible(false);
        lblUsuario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnPrestamo = new javax.swing.JButton();
        btnAsignacion = new javax.swing.JButton();
        btnDevolucion = new javax.swing.JButton();
        btnRevisar = new javax.swing.JButton();
        lblPerfil = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("¿Que desea hacer?");
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

        btnPrestamo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/prestamo_add.png"))); // NOI18N
        btnPrestamo.setText("Nuevo préstamo");
        btnPrestamo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrestamo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });

        btnAsignacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAsignacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/prestamo_ok.png"))); // NOI18N
        btnAsignacion.setText("Nueva asignación");
        btnAsignacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAsignacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignacionActionPerformed(evt);
            }
        });

        btnDevolucion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/prestamo_reporte.png"))); // NOI18N
        btnDevolucion.setText("Registrar Devolución");
        btnDevolucion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDevolucion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionActionPerformed(evt);
            }
        });

        btnRevisar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRevisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/prestamo_ver.png"))); // NOI18N
        btnRevisar.setText("Visualizar préstamos");
        btnRevisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRevisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRevisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAsignacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRevisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRevisar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblUsuario.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
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

    //Recoger parametro "Perfil" del usuario logueado
    public void setTextPerfil(String Perfil){
        lblPerfil.setText(Perfil);
    }
    
    //Recoger parametro "RUT" del usuario logueado
    public void setText(String Usuario){
        lblUsuario.setText(Usuario);
    }
    
    private void funcionPerfil(){
        try{
            //Administrador
            if("1".equals(lblPerfil.getText())){
                btnPrestamo.setEnabled(true);
                btnAsignacion.setEnabled(true);
                btnDevolucion.setEnabled(true);
                btnRevisar.setEnabled(true);
            }
            //Estandar
            else{
                btnPrestamo.setEnabled(false);
                btnAsignacion.setEnabled(false);
                btnDevolucion.setEnabled(false);
                btnRevisar.setEnabled(true);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        funcionPerfil();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed
        jdPrestamos miPrestamo = new jdPrestamos(new jfPrincipal(),true);
        miPrestamo.setLocationRelativeTo(null);
        miPrestamo.setVisible(true);
    }//GEN-LAST:event_btnPrestamoActionPerformed

    private void btnAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignacionActionPerformed
        jdAsignacion miAsignacion = new jdAsignacion(new jfPrincipal(),true);
        miAsignacion.setLocationRelativeTo(null);
        miAsignacion.setVisible(true);
    }//GEN-LAST:event_btnAsignacionActionPerformed

    private void btnDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionActionPerformed
        jdDevoluciones miDevolucion = new jdDevoluciones(new jfPrincipal(), true);
        miDevolucion.setLocationRelativeTo(null);
        miDevolucion.setVisible(true);
    }//GEN-LAST:event_btnDevolucionActionPerformed

    private void btnRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarActionPerformed
        try{
            if("1".equals(lblPerfil.getText())){
                jdVisualizarPrestamo miVisualizar = new jdVisualizarPrestamo(new jfPrincipal(), true);
                miVisualizar.setLocationRelativeTo(null);
                miVisualizar.setVisible(true);
            }else{
                jdMisPrestamos misPrestamos = new jdMisPrestamos(new jfPrincipal(), true);
                misPrestamos.setText(lblUsuario.getText());
                misPrestamos.setLocationRelativeTo(null);
                misPrestamos.setVisible(true);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        }        
    }//GEN-LAST:event_btnRevisarActionPerformed

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
            java.util.logging.Logger.getLogger(jdSeleccionPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdSeleccionPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdSeleccionPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdSeleccionPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdSeleccionPrestamo dialog = new jdSeleccionPrestamo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAsignacion;
    private javax.swing.JButton btnDevolucion;
    private javax.swing.JButton btnPrestamo;
    private javax.swing.JButton btnRevisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables

    private jdAsignacion jdAsignacion(jfPrincipal jfPrincipal, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
