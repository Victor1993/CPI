package ventanasmantenimiento;

import clases.CellRenderer;
import clases.DataConnection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * @author Víctor Sandoval Millar
 */
public class jdProcesadores extends javax.swing.JDialog {

    DataConnection miConexion;
    
    public jdProcesadores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblCodigoProcesador.setVisible(false);
        jtDatos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnGroupControl = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tfNombreProcesador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jrbtnAgregar = new javax.swing.JRadioButton();
        jrbtnEliminar = new javax.swing.JRadioButton();
        jrbtnModificar = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        lblCodigoProcesador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenedor de la tabla procesadores");
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

        tfNombreProcesador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfNombreProcesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreProcesadorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese el nombre del procesador:");

        jrbtnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        rbtnGroupControl.add(jrbtnAgregar);
        jrbtnAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnAgregar.setSelected(true);
        jrbtnAgregar.setText("Agregar procesador");
        jrbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnAgregarActionPerformed(evt);
            }
        });

        jrbtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        rbtnGroupControl.add(jrbtnEliminar);
        jrbtnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnEliminar.setText("Eliminar procesador");
        jrbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnEliminarActionPerformed(evt);
            }
        });

        jrbtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        rbtnGroupControl.add(jrbtnModificar);
        jrbtnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnModificar.setText("Modificar procesador");
        jrbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnModificarActionPerformed(evt);
            }
        });

        jtDatos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre del cargo"
            }
        ));
        jtDatos.setRowHeight(25);
        jtDatos.setRowSelectionAllowed(false);
        jtDatos.getTableHeader().setResizingAllowed(false);
        jtDatos.getTableHeader().setReorderingAllowed(false);
        jtDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtDatos);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar2.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblCodigoProcesador.setText("   ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCodigoProcesador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbtnAgregar)
                                .addGap(31, 31, 31)
                                .addComponent(jrbtnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jrbtnEliminar))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNombreProcesador, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtnAgregar)
                    .addComponent(jrbtnEliminar)
                    .addComponent(jrbtnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombreProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(lblCodigoProcesador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    //Private void centrar datos
    private void funcionCentrarDatos(){ 
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        jtDatos.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);//CAMPO1
        jtDatos.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);//CAMPO2
    }
    
    private void funcionCrearModeloTabla(){
        try{
            DefaultTableModel Tabla = new DefaultTableModel();
            jtDatos.setModel(Tabla);
            Tabla.addColumn("Codigo");
            Tabla.addColumn("Nombre del procesador");
            funcionLlenarTabla();
            funcionColorearTabla();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void funcionColorearTabla(){
        try{
            jtDatos.getColumnModel().getColumn(0).setHeaderRenderer(new CellRenderer(new Color(0,0,102),new Color(255,255,255)));//CAMPO1
            jtDatos.getColumnModel().getColumn(1).setHeaderRenderer(new CellRenderer(new Color(0,0,102),new Color(255,255,255)));//CAMPO2
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void funcionAnchoColumnasTablaDatos(){
        try{
            //Ancho de la tabla 636
            //Se asigna el ancho que tendra cada columna
            int[] 
            anchos = {
                100, //CAMPO1 
                536, //CAMPO2                                   
            };
            //Se crea un bucle FOR desde cero hata la cantidad de columnas de la tabla
            for(int i = 0; i < jtDatos.getColumnCount(); i++) {
                //Sacamos el modelo de columnas de nuestra tabla
                //luego obtenemos la columna en la posicion "i"
                //invocamos el metodo setPreferrefWidth para ajustar el ancho
                //y le damos el valor del entero que esta en el arreglo en la posicion "i"
                jtDatos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
     }
    
    //Llenar tabla
    private void funcionLlenarTabla(){
       try{
            DefaultTableModel Tabla = new DefaultTableModel();
            this.jtDatos.setModel(Tabla);
            Tabla.addColumn("Codigo");
            Tabla.addColumn("Nombre del procesador");      
                String sSQL = "SELECT CodigoPro, ProcesadorPro FROM procesadores";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sSQL);
                while(rs.next()){
                    Object[] fila = new Object[2];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    Tabla.addRow(fila);
                    funcionAnchoColumnasTablaDatos();
                    funcionCentrarDatos();
                }            
                funcionAnchoColumnasTablaDatos();
                funcionCentrarDatos();
                funcionColorearTabla();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        funcionCrearModeloTabla();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void tfNombreProcesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreProcesadorActionPerformed
        funcionGuardar();
    }//GEN-LAST:event_tfNombreProcesadorActionPerformed

    private void jrbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnAgregarActionPerformed
        try{
            jtDatos.setEnabled(false);
            lblCodigoProcesador.setText("");
            tfNombreProcesador.setText("");
            tfNombreProcesador.setEditable(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnAgregarActionPerformed

    private void jrbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnEliminarActionPerformed
        try{
            jtDatos.setEnabled(true);
            lblCodigoProcesador.setText("");
            tfNombreProcesador.setText("");
            tfNombreProcesador.setEditable(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnEliminarActionPerformed

    private void jrbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnModificarActionPerformed
        try{
            jtDatos.setEnabled(true);
            lblCodigoProcesador.setText("");
            tfNombreProcesador.setText("");
            tfNombreProcesador.setEditable(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnModificarActionPerformed

    private void jtDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosMouseClicked
        try{
            if(jtDatos.getRowCount() == 0 && jtDatos.getSelectedRow() == -1){
                System.out.println("No has seleccionado nada");
            }else if(jtDatos.getRowCount() != 0 && jtDatos.getSelectedRow() != -1){
                String CodigoPro = jtDatos.getValueAt(jtDatos.getSelectedRow(), 0).toString();
                lblCodigoProcesador.setText(CodigoPro);
                String NombrePro = jtDatos.getValueAt(jtDatos.getSelectedRow(), 1).toString();
                tfNombreProcesador.setText(NombrePro);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jtDatosMouseClicked

    //Agregar
    private void funcionAgregar(){
        try{
            if("".equals(tfNombreProcesador.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el nombre del procesador</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfNombreProcesador.requestFocus();
            }else{
                String Agregar;
                Agregar = "INSERT INTO procesadores VALUES("
                        + "null, "
                        + "'"+ tfNombreProcesador.getText() +"')";
                Statement stAdd = miConexion.con.createStatement();
                stAdd.executeUpdate(Agregar);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">El procesador fue ingresado exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                lblCodigoProcesador.setText("");
                tfNombreProcesador.setText("");
                tfNombreProcesador.requestFocus();
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al agregar el procesador",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Modificar
    private void funcionModificar(){
        try{
            if("".equals(tfNombreProcesador.getText().trim())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el nombre del procesador desde la tabla</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfNombreProcesador.requestFocus();
            }else{                
                String Modificar;
                Modificar = "UPDATE procesadores SET "
                        + "ProcesadorPro = '"+ tfNombreProcesador.getText() +"' "
                        + "WHERE CodigoPro = '"+ lblCodigoProcesador.getText() +"'";
                Statement stUpdate = miConexion.con.createStatement();
                stUpdate.executeUpdate(Modificar);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">El nombre del procesador fue modificado exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                lblCodigoProcesador.setText("");
                tfNombreProcesador.setText("");
                tfNombreProcesador.requestFocus();
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al modificar el nombre del procesador",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Eliminar
    private void funcionEliminar(){
        try{
            if("".equals(tfNombreProcesador.getText().trim())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el nombre del procesador desde la tabla</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfNombreProcesador.requestFocus();
            }else{
                //Comprobar que no hayan funcionarios que tengan el cargo
                String Consulta;
                Consulta = "SELECT ProcesadorInf FROM infocomputadores "
                        + "WHERE ProcesadorInf = '"+ lblCodigoProcesador.getText() +"' LIMIT 1";
                Statement stSearch = miConexion.con.createStatement();
                ResultSet rsSearch = stSearch.executeQuery(Consulta);
                if(rsSearch.next() == true){
                    JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">No es posible eliminar el procesador, hay equipos asignados a él</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    tfNombreProcesador.selectAll();
                    tfNombreProcesador.requestFocus();
                }else{
                    String Eliminar;
                    Eliminar = "DELETE FROM procesadores "
                            + "WHERE CodigoPro = '"+ lblCodigoProcesador.getText() +"'";
                    Statement stDelete = miConexion.con.createStatement();
                    stDelete.executeUpdate(Eliminar);
                    JOptionPane.showMessageDialog(this, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">El procesador fue eliminado exitosamente</div></html>", //Mensaje
                            "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    lblCodigoProcesador.setText("");
                    tfNombreProcesador.setText("");
                    tfNombreProcesador.requestFocus();
                    funcionCrearModeloTabla();
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al eliminar el procesador",JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    private void funcionGuardar(){
        try{
            if(jrbtnAgregar.isSelected()){
                funcionAgregar();
            }else if(jrbtnModificar.isSelected()){
                funcionModificar();
            }else if(jrbtnEliminar.isSelected()){
                funcionEliminar();
            }else{
                //Nada
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(), "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        funcionGuardar();
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
            java.util.logging.Logger.getLogger(jdProcesadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdProcesadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdProcesadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdProcesadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdProcesadores dialog = new jdProcesadores(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton jrbtnAgregar;
    private javax.swing.JRadioButton jrbtnEliminar;
    private javax.swing.JRadioButton jrbtnModificar;
    private javax.swing.JTable jtDatos;
    private javax.swing.JLabel lblCodigoProcesador;
    private javax.swing.ButtonGroup rbtnGroupControl;
    private javax.swing.JTextField tfNombreProcesador;
    // End of variables declaration//GEN-END:variables
}
