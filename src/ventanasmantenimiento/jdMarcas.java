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
 * @author "Víctor Sandoval Millar"
 */
public class jdMarcas extends javax.swing.JDialog {

    DataConnection miConexion;
    
    public jdMarcas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblCodigoMarca.setVisible(false);
        jtDatos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupMarca = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tfNombreMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jrbtnAgregar = new javax.swing.JRadioButton();
        jrbtnEliminar = new javax.swing.JRadioButton();
        jrbtnModificar = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        lblCodigoMarca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de la tabla marca");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tfNombreMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfNombreMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreMarcaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese el nombre de la marca del insumo:");

        jrbtnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupMarca.add(jrbtnAgregar);
        jrbtnAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnAgregar.setSelected(true);
        jrbtnAgregar.setText("Agregar marca");
        jrbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnAgregarActionPerformed(evt);
            }
        });

        jrbtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupMarca.add(jrbtnEliminar);
        jrbtnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnEliminar.setText("Eliminar marca");
        jrbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnEliminarActionPerformed(evt);
            }
        });

        jrbtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupMarca.add(jrbtnModificar);
        jrbtnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnModificar.setText("Modificar marca");
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

        lblCodigoMarca.setText("   ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCodigoMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbtnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbtnModificar)
                        .addGap(45, 45, 45)
                        .addComponent(jrbtnEliminar))
                    .addComponent(tfNombreMarca)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(tfNombreMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(lblCodigoMarca))
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
            Tabla.addColumn("Nombre de la marca");
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
            //Ancho de la tabla 500
            //Se asigna el ancho que tendra cada columna
            int[] 
            anchos = {
                150, //CAMPO1 
                350, //CAMPO2                                   
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
            Tabla.addColumn("Nombre de la marca");      
                String sSQL = "SELECT CodigoMa, MarcaMa FROM marcasinsumos";
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

    private void tfNombreMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreMarcaActionPerformed
        funcionGuardar();
    }//GEN-LAST:event_tfNombreMarcaActionPerformed

    private void jrbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnAgregarActionPerformed
        try{
            jtDatos.setEnabled(false);
            lblCodigoMarca.setText("");
            tfNombreMarca.setText("");
            tfNombreMarca.setEditable(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnAgregarActionPerformed

    private void jrbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnEliminarActionPerformed
        try{
            jtDatos.setEnabled(true);
            lblCodigoMarca.setText("");
            tfNombreMarca.setText("");
            tfNombreMarca.setEditable(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnEliminarActionPerformed

    private void jrbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnModificarActionPerformed
        try{
            jtDatos.setEnabled(true);
            lblCodigoMarca.setText("");
            tfNombreMarca.setText("");
            tfNombreMarca.setEditable(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnModificarActionPerformed

    private void jtDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosMouseClicked
        try{
            if(jtDatos.getRowCount() == 0 && jtDatos.getSelectedRow() == -1){
                System.out.println("No has seleccionado nada");
            }else if(jtDatos.getRowCount() != 0 && jtDatos.getSelectedRow() != -1){
                String CodigoCu = jtDatos.getValueAt(jtDatos.getSelectedRow(), 0).toString();
                lblCodigoMarca.setText(CodigoCu);
                String NombreCu = jtDatos.getValueAt(jtDatos.getSelectedRow(), 1).toString();
                tfNombreMarca.setText(NombreCu);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jtDatosMouseClicked

    //Agregar
    private void funcionAgregar(){
        try{
            if("".equals(tfNombreMarca.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el nombre de la marca</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfNombreMarca.requestFocus();
            }else{
                String Agregar;
                Agregar = "INSERT INTO marcasinsumos VALUES("
                        + "null, "
                        + "'"+ tfNombreMarca.getText() +"')";
                Statement stAdd = miConexion.con.createStatement();
                stAdd.executeUpdate(Agregar);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">La marca fue ingresada exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                lblCodigoMarca.setText("");
                tfNombreMarca.setText("");
                tfNombreMarca.requestFocus();
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al agregar la marca",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Modificar
    private void funcionModificar(){
        try{
            if("".equals(tfNombreMarca.getText().trim())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el nombre de la marca del insumo desde la tabla</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfNombreMarca.requestFocus();
            }else{                
                String Modificar;
                Modificar = "UPDATE marcasinsumos SET "
                        + "MarcaMa = '"+ tfNombreMarca.getText() +"' "
                        + "WHERE CodigoMa = '"+ lblCodigoMarca.getText() +"'";
                Statement stUpdate = miConexion.con.createStatement();
                stUpdate.executeUpdate(Modificar);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">El nombre de la marca fue modificado exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                lblCodigoMarca.setText("");
                tfNombreMarca.setText("");
                tfNombreMarca.requestFocus();
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al modificar la marca",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Eliminar
    private void funcionEliminar(){
        try{
            if("".equals(tfNombreMarca.getText().trim())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el nombre de la marca del insumo desde la tabla</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfNombreMarca.requestFocus();
            }else{
                String Eliminar;
                Eliminar = "DELETE FROM marcasinsumos "
                        + "WHERE CodigoMa = '"+ lblCodigoMarca.getText() +"'";
                Statement stDelete = miConexion.con.createStatement();
                stDelete.executeUpdate(Eliminar);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">La marca fue eliminada exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                lblCodigoMarca.setText("");
                tfNombreMarca.setText("");
                tfNombreMarca.requestFocus();
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al eliminar la marca",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(jdMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdMarcas dialog = new jdMarcas(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup btnGroupMarca;
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
    private javax.swing.JLabel lblCodigoMarca;
    private javax.swing.JTextField tfNombreMarca;
    // End of variables declaration//GEN-END:variables
}
