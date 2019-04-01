package ventanasmantenimiento;

import ventanasmantenimiento.jdTipoInsumo;
import ventanasmantenimiento.jdFuncionarios;
import ventanasmantenimiento.jdCursos;
import ventanasmantenimiento.jdCargos;
import ventanasmantenimiento.jdModelos;
import ventanasmantenimiento.jdMarcas;
import principal.jfPrincipal;

/**
 * @author "Víctor Sandoval Millar"
 */
public class jdMantenimiento extends javax.swing.JDialog {
    
    public jdMantenimiento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCargos = new javax.swing.JButton();
        btnCursos = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        btnMarcas = new javax.swing.JButton();
        btnModelos = new javax.swing.JButton();
        btnTipoInsumos = new javax.swing.JButton();
        btnUbicaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento del Sistema");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnCargos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCargos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/cargos.png"))); // NOI18N
        btnCargos.setText("Cargos");
        btnCargos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCargos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargosActionPerformed(evt);
            }
        });

        btnCursos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/cursos.png"))); // NOI18N
        btnCursos.setText("Cursos");
        btnCursos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCursos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursosActionPerformed(evt);
            }
        });

        btnFuncionarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/perfiles.png"))); // NOI18N
        btnFuncionarios.setText("Usuarios");
        btnFuncionarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFuncionarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        btnMarcas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/marcas.png"))); // NOI18N
        btnMarcas.setText("Marcas");
        btnMarcas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMarcas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcasActionPerformed(evt);
            }
        });

        btnModelos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/marcas.png"))); // NOI18N
        btnModelos.setText("Modelos");
        btnModelos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModelos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelosActionPerformed(evt);
            }
        });

        btnTipoInsumos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTipoInsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/tipo_insumo.png"))); // NOI18N
        btnTipoInsumos.setText("Tipos Insumos");
        btnTipoInsumos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTipoInsumos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTipoInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoInsumosActionPerformed(evt);
            }
        });

        btnUbicaciones.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUbicaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgMenu/direccion.png"))); // NOI18N
        btnUbicaciones.setText("Ubicaciones");
        btnUbicaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUbicaciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUbicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbicacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTipoInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTipoInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargosActionPerformed
        jdCargos miCargos = new jdCargos(new jfPrincipal(),true);
        miCargos.setLocationRelativeTo(this);
        miCargos.setVisible(true);
    }//GEN-LAST:event_btnCargosActionPerformed

    private void btnCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosActionPerformed
        jdCursos miCursos = new jdCursos(new jfPrincipal(),true);
        miCursos.setLocationRelativeTo(this);
        miCursos.setVisible(true);
    }//GEN-LAST:event_btnCursosActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        jdFuncionarios miFuncionarios = new jdFuncionarios(new jfPrincipal(),true);
        miFuncionarios.setLocationRelativeTo(null);
        miFuncionarios.setVisible(true);
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcasActionPerformed
        jdMarcas miMarca = new jdMarcas(new jfPrincipal(), true);
        miMarca.setLocationRelativeTo(null);
        miMarca.setVisible(true);
    }//GEN-LAST:event_btnMarcasActionPerformed

    private void btnModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelosActionPerformed
        jdModelos miModelo = new jdModelos(new jfPrincipal(), true);
        miModelo.setLocationRelativeTo(this);
        miModelo.setVisible(true);
    }//GEN-LAST:event_btnModelosActionPerformed

    private void btnTipoInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoInsumosActionPerformed
        jdTipoInsumo miTipo = new jdTipoInsumo(new jfPrincipal(),true);
        miTipo.setLocationRelativeTo(this);
        miTipo.setVisible(true);
    }//GEN-LAST:event_btnTipoInsumosActionPerformed

    private void btnUbicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbicacionesActionPerformed
        jdUbicaciones miUbicacion = new jdUbicaciones(new jfPrincipal(),true);
        miUbicacion.setLocationRelativeTo(this);
        miUbicacion.setVisible(true);
    }//GEN-LAST:event_btnUbicacionesActionPerformed

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
            java.util.logging.Logger.getLogger(jdMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdMantenimiento dialog = new jdMantenimiento(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCargos;
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnMarcas;
    private javax.swing.JButton btnModelos;
    private javax.swing.JButton btnTipoInsumos;
    private javax.swing.JButton btnUbicaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
