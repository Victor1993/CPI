package ventanas;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

/**
 * @author "Víctor Sandoval Millar"
 */
public class jdAcerca extends javax.swing.JDialog {

    public jdAcerca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblSigla = new javax.swing.JLabel();
        lblVersionSistema = new javax.swing.JLabel();
        lblDesarrollo1 = new javax.swing.JLabel();
        lblDesarrollo2 = new javax.swing.JLabel();
        lblCorreoSoporte = new javax.swing.JLabel();
        lblDesarrollador = new javax.swing.JLabel();
        lblNombreSistema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de...");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblSigla.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        lblSigla.setForeground(new java.awt.Color(0, 0, 102));
        lblSigla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSigla.setText("CPI");

        lblVersionSistema.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblVersionSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersionSistema.setText("versión 1.2.2");
        lblVersionSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblVersionSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVersionSistemaMouseClicked(evt);
            }
        });

        lblDesarrollo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDesarrollo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesarrollo1.setText("Desarrollado en Netbeans 8.2, usando el JDK 8u152");

        lblDesarrollo2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDesarrollo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesarrollo2.setText("como motor de base de datos se usó MySQL");

        lblCorreoSoporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCorreoSoporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoSoporte.setText("correo de soporte: soporte@visantec.cl");

        lblDesarrollador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDesarrollador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesarrollador.setText("Desarrollado por ViSanTEC");
        lblDesarrollador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDesarrollador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDesarrolladorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDesarrolladorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDesarrolladorMouseExited(evt);
            }
        });

        lblNombreSistema.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNombreSistema.setForeground(new java.awt.Color(0, 0, 102));
        lblNombreSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreSistema.setText("Control de Préstamos de Insumos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVersionSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDesarrollo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreSistema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDesarrollo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCorreoSoporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDesarrollador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSigla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVersionSistema)
                .addGap(57, 57, 57)
                .addComponent(lblDesarrollo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDesarrollo2)
                .addGap(54, 54, 54)
                .addComponent(lblCorreoSoporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDesarrollador)
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void lblDesarrolladorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDesarrolladorMouseClicked
        //Permite direccionar hacia una pagina web
	try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                    if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI("http://www.visantec.cl"));
                    }
            }
	}catch(Exception e) {
		e.printStackTrace();
	}
    }//GEN-LAST:event_lblDesarrolladorMouseClicked

    private void lblDesarrolladorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDesarrolladorMouseEntered
        try{
            lblDesarrollador.setForeground(new Color(0,0,102));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_lblDesarrolladorMouseEntered

    private void lblDesarrolladorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDesarrolladorMouseExited
        try{
            lblDesarrollador.setForeground(Color.BLACK);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_lblDesarrolladorMouseExited

   
    private void lblVersionSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVersionSistemaMouseClicked
        
    }//GEN-LAST:event_lblVersionSistemaMouseClicked

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
            java.util.logging.Logger.getLogger(jdAcerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdAcerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdAcerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdAcerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdAcerca dialog = new jdAcerca(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCorreoSoporte;
    private javax.swing.JLabel lblDesarrollador;
    private javax.swing.JLabel lblDesarrollo1;
    private javax.swing.JLabel lblDesarrollo2;
    private javax.swing.JLabel lblNombreSistema;
    private javax.swing.JLabel lblSigla;
    private javax.swing.JLabel lblVersionSistema;
    // End of variables declaration//GEN-END:variables
}
