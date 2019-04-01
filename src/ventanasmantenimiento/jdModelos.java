package ventanasmantenimiento;

import ventanasmantenimiento.jdMarcas;
import clases.CellRenderer;
import clases.DataConnection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import principal.jfPrincipal;

/**
 * @author "Víctor Sandoval Millar"
 */
public class jdModelos extends javax.swing.JDialog {

    DataConnection miConexion;
    
    public jdModelos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblCodigoMarca.setVisible(false);
        lblCodigoModelo.setVisible(false);
        jtDatos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupModelo = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfNombreModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jrbtnAgregar = new javax.swing.JRadioButton();
        jrbtnEliminar = new javax.swing.JRadioButton();
        jrbtnModificar = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        lblCodigoModelo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbMarca = new javax.swing.JComboBox<>();
        lblCodigoMarca = new javax.swing.JLabel();
        btnAgregarMarca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenedor de la tabla modelos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tfNombreModelo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfNombreModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreModeloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese el nombre del modelo del insumo:");

        jrbtnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupModelo.add(jrbtnAgregar);
        jrbtnAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnAgregar.setSelected(true);
        jrbtnAgregar.setText("Agregar modelo");
        jrbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnAgregarActionPerformed(evt);
            }
        });

        jrbtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupModelo.add(jrbtnEliminar);
        jrbtnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnEliminar.setText("Eliminar modelo");
        jrbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnEliminarActionPerformed(evt);
            }
        });

        jrbtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupModelo.add(jrbtnModificar);
        jrbtnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnModificar.setText("Modificar modelo");
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
        jtDatos.setEnabled(false);
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

        lblCodigoModelo.setText("   ");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Seleccione el nombre de la marca del insumo:");

        jcbMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMarcaActionPerformed(evt);
            }
        });

        lblCodigoMarca.setText("   ");

        btnAgregarMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAgregarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jrbtnAgregar)
                        .addGap(64, 64, 64)
                        .addComponent(jrbtnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jrbtnEliminar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfNombreModelo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCodigoModelo)
                                .addGap(18, 18, 18)
                                .addComponent(lblCodigoMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarMarca)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtnAgregar)
                    .addComponent(jrbtnEliminar)
                    .addComponent(jrbtnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbMarca)
                    .addComponent(btnAgregarMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombreModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(lblCodigoModelo)
                    .addComponent(lblCodigoMarca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    //Private void centrar datos
    private void funcionCentrarDatos(){ 
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        jtDatos.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);//CAMPO1
        jtDatos.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);//CAMPO2
        jtDatos.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);//CAMPO3
    }
    
    private void funcionCrearModeloTabla(){
        try{
            DefaultTableModel Tabla = new DefaultTableModel();
            jtDatos.setModel(Tabla);
            Tabla.addColumn("Codigo");
            Tabla.addColumn("Marca");
            Tabla.addColumn("Modelo");
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
            jtDatos.getColumnModel().getColumn(2).setHeaderRenderer(new CellRenderer(new Color(0,0,102),new Color(255,255,255)));//CAMPO3
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
                100, //CAMPO1 
                300, //CAMPO2
                300, //CAMPO3
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
            Tabla.addColumn("Marca");
            Tabla.addColumn("Modelo");      
                String sSQL = "SELECT mo.CodigoMo, ma.MarcaMa, mo.ModeloMo "
                        + "FROM marcasinsumos as ma, modelosinsumos as mo "
                        + "WHERE (ma.CodigoMa=mo.MarcaMo)";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sSQL);
                while(rs.next()){
                    Object[] fila = new Object[3];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
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
    
    //Funcion cargar combobox
    private void funcionCargarMarca(){
        try{
            String Marca;//Se declara una variable tipo String
            Marca = "SELECT MarcaMa FROM marcasinsumos ORDER BY MarcaMa ASC";//Crear consulta SQL
            Statement stMarca = miConexion.con.createStatement();
            ResultSet rsMarca = stMarca.executeQuery(Marca);
            while(rsMarca.next()){
                jcbMarca.addItem(rsMarca.getString("MarcaMa"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar las marcas",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        funcionCrearModeloTabla();
        funcionCargarMarca();
    }//GEN-LAST:event_formWindowOpened

    //Agregar
    private void funcionAgregar(){
        try{
            if("-- Seleccione --".equals(jcbMarca.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el nombre de la marca</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbMarca.requestFocus();
            }else if("".equals(tfNombreModelo.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el nombre del modelo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfNombreModelo.requestFocus();
            }else{
                String Agregar;
                Agregar = "INSERT INTO modelosinsumos VALUES("
                        + "null, "
                        + "'"+ tfNombreModelo.getText() +"', "
                        + "'"+ lblCodigoMarca.getText() +"')";
                Statement stAdd = miConexion.con.createStatement();
                stAdd.executeUpdate(Agregar);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">La modelo fue ingresado exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                lblCodigoModelo.setText("");
                lblCodigoMarca.setText("");
                jcbMarca.setSelectedItem("-- Seleccione --");
                tfNombreModelo.setText("");
                tfNombreModelo.requestFocus();
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al agregar el modelo",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Modificar
    private void funcionModificar(){
        try{
            if("".equals(tfNombreModelo.getText().trim())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el nombre de la marca del insumo desde la tabla</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfNombreModelo.requestFocus();
            }else{                
                String Modificar;
                Modificar = "UPDATE modelosinsumos SET "
                        + "ModeloMo = '"+ tfNombreModelo.getText() +"', "
                        + "MarcaMo = '"+ lblCodigoMarca.getText() +"' "
                        + "WHERE CodigoMo = '"+ lblCodigoModelo.getText() +"'";
                Statement stUpdate = miConexion.con.createStatement();
                stUpdate.executeUpdate(Modificar);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">El nombre del modelo fue modificado exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                lblCodigoModelo.setText("");
                lblCodigoMarca.setText("");
                jcbMarca.setSelectedItem("-- Seleccione --");
                tfNombreModelo.setText("");
                tfNombreModelo.requestFocus();
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al modificar el modelo",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Eliminar
    private void funcionEliminar(){
        try{
            if("".equals(tfNombreModelo.getText().trim())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el nombre del modelo desde la tabla</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfNombreModelo.requestFocus();
            }else{
                String Eliminar;
                Eliminar = "DELETE FROM modelosinsumos "
                        + "WHERE CodigoMo = '"+ lblCodigoModelo.getText() +"'";
                Statement stDelete = miConexion.con.createStatement();
                stDelete.executeUpdate(Eliminar);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">El modelo fue eliminado exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                lblCodigoModelo.setText("");
                lblCodigoMarca.setText("");
                jcbMarca.setSelectedItem("-- Seleccione --");
                tfNombreModelo.setText("");
                tfNombreModelo.requestFocus();
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al eliminar el modelo",JOptionPane.ERROR_MESSAGE);
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
    
    private void tfNombreModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreModeloActionPerformed
        funcionGuardar();
    }//GEN-LAST:event_tfNombreModeloActionPerformed

    private void jrbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnAgregarActionPerformed
        try{
            jtDatos.setEnabled(false);
            lblCodigoModelo.setText("");
            tfNombreModelo.setText("");
            jcbMarca.setEnabled(true);
            jcbMarca.setSelectedItem("-- Seleccione --");
            tfNombreModelo.setEditable(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnAgregarActionPerformed

    private void jrbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnEliminarActionPerformed
        try{
            jtDatos.setEnabled(true);
            lblCodigoModelo.setText("");
            tfNombreModelo.setText("");
            jcbMarca.setEnabled(false);
            jcbMarca.setSelectedItem("-- Seleccione --");
            tfNombreModelo.setEditable(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnEliminarActionPerformed

    private void jrbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnModificarActionPerformed
        try{
            jtDatos.setEnabled(true);
            lblCodigoModelo.setText("");
            tfNombreModelo.setText("");
            jcbMarca.setEnabled(true);
            jcbMarca.setSelectedItem("-- Seleccione --");
            tfNombreModelo.setEditable(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnModificarActionPerformed

    private void jtDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosMouseClicked
        try{
            if(jtDatos.getRowCount() == 0 && jtDatos.getSelectedRow() == -1){
                System.out.println("No has seleccionado nada");
            }else if(jtDatos.getRowCount() != 0 && jtDatos.getSelectedRow() != -1){
                String CodigoMo = jtDatos.getValueAt(jtDatos.getSelectedRow(), 0).toString();
                lblCodigoModelo.setText(CodigoMo);
                String NombreMa = jtDatos.getValueAt(jtDatos.getSelectedRow(), 1).toString();
                jcbMarca.setSelectedItem(NombreMa);
                String NombreMo = jtDatos.getValueAt(jtDatos.getSelectedRow(), 2).toString();
                tfNombreModelo.setText(NombreMo);                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jtDatosMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        funcionGuardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void funcionCargarCodigoMarca(){
        try{
            if(!"-- Seleccione --".equals(jcbMarca.getSelectedItem())){
                String sql = "SELECT CodigoMa FROM marcasinsumos "
                           + "WHERE MarcaMa = '"+ jcbMarca.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoMarca.setText(rs.getString("CodigoMa"));
                }else{
                    //
                } 
            }else{
                lblCodigoMarca.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void jcbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMarcaActionPerformed
        funcionCargarCodigoMarca();
    }//GEN-LAST:event_jcbMarcaActionPerformed

    private void btnAgregarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMarcaActionPerformed
        jdMarcas miMarca = new jdMarcas(new jfPrincipal(), true);
        miMarca.setLocationRelativeTo(this);
        miMarca.setVisible(true);
        jcbMarca.removeAllItems();
        jcbMarca.addItem("-- Seleccione --");
        funcionCargarMarca();
    }//GEN-LAST:event_btnAgregarMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(jdModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdModelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdModelos dialog = new jdModelos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregarMarca;
    private javax.swing.ButtonGroup btnGroupModelo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JRadioButton jrbtnAgregar;
    private javax.swing.JRadioButton jrbtnEliminar;
    private javax.swing.JRadioButton jrbtnModificar;
    private javax.swing.JTable jtDatos;
    private javax.swing.JLabel lblCodigoMarca;
    private javax.swing.JLabel lblCodigoModelo;
    private javax.swing.JTextField tfNombreModelo;
    // End of variables declaration//GEN-END:variables
}
