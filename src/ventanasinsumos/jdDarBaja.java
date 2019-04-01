package ventanasinsumos;

import clases.DataConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.jfPrincipal;

public class jdDarBaja extends javax.swing.JDialog {

    DataConnection miConexion;
    
    public jdDarBaja(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblFecha.setVisible(false);
        lblHora.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfCodigoInsumo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        tfTipoInsumo = new javax.swing.JTextField();
        tfMarca = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMotivoBaja = new javax.swing.JTextArea();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dar de baja");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Tipo:");

        tfCodigoInsumo.setEditable(false);
        tfCodigoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Marca:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Motivo u observación:");

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar2.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tfTipoInsumo.setEditable(false);
        tfTipoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        tfMarca.setEditable(false);
        tfMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        tfModelo.setEditable(false);
        tfModelo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Modelo:");

        txaMotivoBaja.setColumns(20);
        txaMotivoBaja.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txaMotivoBaja.setLineWrap(true);
        txaMotivoBaja.setRows(2);
        txaMotivoBaja.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txaMotivoBaja);

        lblHora.setText("jLabel6");

        lblFecha.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHora)
                        .addGap(18, 18, 18)
                        .addComponent(lblFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(56, 56, 56))
                    .addComponent(tfTipoInsumo)
                    .addComponent(tfMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfModelo)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(tfCodigoInsumo))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodigoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTipoInsumo)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMarca)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfModelo)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHora)
                    .addComponent(lblFecha))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                lblHora.setText(D_Formato.format(date));
                //Mostrar Fecha
                Calendar Cal = Calendar.getInstance();
                DecimalFormat df = new DecimalFormat("00");
                int dia  = Cal.get(Calendar.DATE);
                int mes  = Cal.get((Calendar.MONTH))+1;
                int anio = Cal.get(Calendar.YEAR);
                lblFecha.setText(anio+"-"+df.format(mes)+"-"+df.format(dia));
                try {
                    Thread.sleep(1000);/*El hilo duerme 1000 miliseg, es decir 1 seg*/
                } catch (InterruptedException ex) {/*Excepciones*/
                    Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }/*Fin de Excepciones*/
            }/*Fin del Ciclo*/
        }/*Fin de metodo run*/
    };
    
    public void RecibirCodigo(String Codigo){
        tfCodigoInsumo.setText(Codigo);
    }
    
    //Cargar los datos que correspondientes al insumo
    private void funcionCargarDatos(){
        try{
            //Comprobar que el codigo no este vacío
            if(!"".equals(tfCodigoInsumo.getText())){
                //Hacer la consulta
                String sql = "SELECT tip.TipoInsumoTi, mar.MarcaMa, mo.ModeloMo "
                           + "FROM insumos ins, marcasinsumos mar, tiposinsumos tip, modelosinsumos mo "
                           + "WHERE (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND "
                           + "(ins.ModeloIn=mo.CodigoMo) AND ins.CodigoIn = '"+ tfCodigoInsumo.getText() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next() == true){
                    tfTipoInsumo.setText(rs.getString("tip.TipoInsumoTi"));
                    tfMarca.setText(rs.getString("mar.MarcaMa"));
                    tfModelo.setText(rs.getString("mo.ModeloMo"));
                }else{
                    JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">No hay datos para mostrar.</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.ERROR_MESSAGE);
                    this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">No hay código seleccionado</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.ERROR_MESSAGE);
                this.dispose();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage());
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        hilo.start();
        corriendo = true;
        funcionCargarDatos();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    //Eliminar
    private void funcionDardeBaja(){
        try{
            if("".equals(tfCodigoInsumo.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el código el insumo desde la tabla</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfCodigoInsumo.requestFocus();
            }else{
                //Comprobar que no este en estado de prestamo
                String Consulta;
                Consulta = "SELECT InsumoDe, EntregadoDe FROM detalleprestamos WHERE InsumoDe = '"+ tfCodigoInsumo.getText() +"' AND EntregadoDe = '2'";
                Statement stConsulta = miConexion.con.createStatement();
                ResultSet rsConsulta = stConsulta.executeQuery(Consulta);
                if(rsConsulta.next() == false){
                    //Ver si está vacío el campo obervación
                    if(!"".equals(txaMotivoBaja.getText())){
                        String DarBaja;
                        DarBaja = "UPDATE insumos SET EstadoIn = '2' "
                                + "WHERE CodigoIn = '"+ tfCodigoInsumo.getText() +"'";
                        Statement stBaja = miConexion.con.createStatement();
                        stBaja.executeUpdate(DarBaja);
                        String IngresarMotivo;
                        IngresarMotivo = "INSERT INTO bajasinsumos VALUES("
                                       + "NULL, "
                                       + "'"+ tfCodigoInsumo.getText() +"', "
                                       + "'"+ txaMotivoBaja.getText() +"', "
                                       + "'"+ lblFecha.getText() +"', "
                                       + "'"+ lblHora.getText() +"')";
                        Statement stMotivo = miConexion.con.createStatement();
                        stMotivo.executeUpdate(IngresarMotivo);
                        JOptionPane.showMessageDialog(this, 
                                "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                            +   "font-size:12px}</style>"
                            +   "<div align=\"center\">El insumo fue dado de baja exitosamente</div></html>", //Mensaje
                                "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                        tfTipoInsumo.setText("");
                        tfMarca.setText("");
                        tfModelo.setText("");
                        tfCodigoInsumo.setText("");
                        txaMotivoBaja.setText("");
                        this.dispose();
                    }else{
                        String DarBaja;
                        DarBaja = "UPDATE insumos SET EstadoIn = '2' "
                                + "WHERE CodigoIn = '"+ tfCodigoInsumo.getText() +"'";
                        Statement stBaja = miConexion.con.createStatement();
                        stBaja.executeUpdate(DarBaja);
                        String IngresarMotivo;
                        IngresarMotivo = "INSERT INTO bajasinsumos VALUES("
                                       + "NULL, "
                                       + "'"+ tfCodigoInsumo.getText() +"', "
                                       + "'Sin observaciones', "
                                       + "'"+ lblFecha.getText() +"', "
                                       + "'"+ lblHora.getText() +"')";
                        Statement stMotivo = miConexion.con.createStatement();
                        stMotivo.executeUpdate(IngresarMotivo);
                        System.out.print(IngresarMotivo);
                        JOptionPane.showMessageDialog(this, 
                                "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                            +   "font-size:12px}</style>"
                            +   "<div align=\"center\">El insumo fue dado de baja exitosamente</div></html>", //Mensaje
                                "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                        tfTipoInsumo.setText("");
                        tfMarca.setText("");
                        tfModelo.setText("");
                        tfCodigoInsumo.setText("");
                        txaMotivoBaja.setText("");
                        this.dispose();
                    }
                }else{
                    JOptionPane.showMessageDialog(this, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">El insumo no puede ser dado de baja ya que está asociado a un préstamo</div></html>", //Mensaje
                            "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al dar de baja el insumo",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        funcionDardeBaja();
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(jdDarBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdDarBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdDarBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdDarBaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdDarBaja dialog = new jdDarBaja(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTextField tfCodigoInsumo;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfTipoInsumo;
    private javax.swing.JTextArea txaMotivoBaja;
    // End of variables declaration//GEN-END:variables
}
