package ventanasinsumos;

import clases.DataConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import principal.jfPrincipal;
import ventanasmantenimiento.jdMarcas;
import ventanasmantenimiento.jdModelos;
import ventanasmantenimiento.jdTipoInsumo;
import ventanasmantenimiento.jdUbicaciones;

public class jdModificarInsumo extends javax.swing.JDialog {

    DataConnection miConexion;
    
    public jdModificarInsumo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblCodigoTipoInsumo.setVisible(false);
        lblCodigoMarca.setVisible(false);
        lblCodigoModelo.setVisible(false);
        lblCodigoLugar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfCodigoInsumo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbTipoInsumo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbMarca = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcbModelo = new javax.swing.JComboBox<>();
        btnAddTipo = new javax.swing.JButton();
        btnAddMarca = new javax.swing.JButton();
        btnAddModelo = new javax.swing.JButton();
        btnAddInfo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblCodigoTipoInsumo = new javax.swing.JLabel();
        lblCodigoMarca = new javax.swing.JLabel();
        lblCodigoModelo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbLugar = new javax.swing.JComboBox<>();
        btnAddLugar = new javax.swing.JButton();
        lblCodigoLugar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar datos");
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

        jcbTipoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbTipoInsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbTipoInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoInsumoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Marca:");

        jcbMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMarcaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Modelo:");

        jcbModelo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbModeloActionPerformed(evt);
            }
        });

        btnAddTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTipoActionPerformed(evt);
            }
        });

        btnAddMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMarcaActionPerformed(evt);
            }
        });

        btnAddModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddModeloActionPerformed(evt);
            }
        });

        btnAddInfo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAddInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddInfo.setText("Información");
        btnAddInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInfoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar2.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblCodigoTipoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCodigoTipoInsumo.setText("la");

        lblCodigoMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCodigoMarca.setText("la");

        lblCodigoModelo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCodigoModelo.setText("la");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Lugar o ubicación:");

        jcbLugar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbLugarActionPerformed(evt);
            }
        });

        btnAddLugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLugarActionPerformed(evt);
            }
        });

        lblCodigoLugar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCodigoLugar.setText("la");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigoInsumo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigoTipoInsumo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigoMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigoModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCodigoLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbTipoInsumo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbModelo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddModelo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddLugar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodigoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbTipoInsumo)
                    .addComponent(btnAddTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbModelo)
                    .addComponent(btnAddModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbLugar)
                    .addComponent(btnAddLugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigoTipoInsumo)
                    .addComponent(lblCodigoMarca)
                    .addComponent(lblCodigoModelo)
                    .addComponent(lblCodigoLugar))
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

    public void RecibirCodigo(String Codigo){
        tfCodigoInsumo.setText(Codigo);
    }
    
    //Funcion cargar tipos de productos
    private void funcionCargarTipo(){
        try{
            String Tipo;//Se declara una variable tipo String
            Tipo = "SELECT TipoInsumoTi FROM tiposinsumos ORDER BY TipoInsumoTi ASC";//Crear consulta SQL
            Statement stTipo = miConexion.con.createStatement();
            ResultSet rsTipo = stTipo.executeQuery(Tipo);
            while(rsTipo.next()){
                jcbTipoInsumo.addItem(rsTipo.getString("TipoInsumoTi"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar los tipos de insumos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Funcion cargar marcas
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
    
    //Funcion cargar modelos
    private void funcionCargarModelo(){
        try{
            String Modelo;//Se declara una variable tipo String
            Modelo = "SELECT ModeloMo FROM modelosinsumos "
                    + "WHERE MarcaMo = '"+ lblCodigoMarca.getText() +"' ORDER BY ModeloMo ASC";//Crear consulta SQL
            Statement stModelo = miConexion.con.createStatement();
            ResultSet rsModelo = stModelo.executeQuery(Modelo);
            while(rsModelo.next()){
                jcbModelo.addItem(rsModelo.getString("ModeloMo"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar los modelos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Funcion cargar lugar
    private void funcionCargarLugar(){
        try{
            String Lugar;//Se declara una variable tipo String
            Lugar = "SELECT NombreLug FROM lugares "
                   + "ORDER BY NombreLug ASC";//Crear consulta SQL
            Statement stLugar = miConexion.con.createStatement();
            ResultSet rsLugar = stLugar.executeQuery(Lugar);
            while(rsLugar.next()){
                jcbLugar.addItem(rsLugar.getString("NombreLug"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar los modelos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Cargar los datos que correspondientes al insumo
    private void funcionCargarDatos(){
        try{
            //Comprobar que el codigo no este vacío
            if(!"".equals(tfCodigoInsumo.getText())){
                //Hacer la consulta
                String sql = "SELECT tip.TipoInsumoTi, mar.MarcaMa, mo.ModeloMo, lug.NombreLug "
                           + "FROM insumos ins, marcasinsumos mar, tiposinsumos tip, modelosinsumos mo, lugares lug "
                           + "WHERE (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND "
                           + "(ins.ModeloIn=mo.CodigoMo) AND (lug.CodigoLug=ins.LugarIn) AND ins.CodigoIn = '"+ tfCodigoInsumo.getText() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next() == true){
                    jcbTipoInsumo.setSelectedItem(rs.getString("tip.TipoInsumoTi"));
                    jcbMarca.setSelectedItem(rs.getString("mar.MarcaMa"));
                    jcbModelo.setSelectedItem(rs.getString("mo.ModeloMo"));
                    jcbLugar.setSelectedItem(rs.getString("lug.NombreLug"));
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
        funcionCargarTipo();
        funcionCargarMarca();
        funcionCargarModelo();
        funcionCargarLugar();
        funcionCargarDatos();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    //Modificar
    private void funcionModificar(){
        try{
            if("".equals(tfCodigoInsumo.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el código el insumo desde la tabla</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfCodigoInsumo.requestFocus();
            }else if("-- Seleccione --".equals(jcbTipoInsumo.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el tipo de insumo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbTipoInsumo.requestFocus();
            }else if("-- Seleccione --".equals(jcbMarca.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione la marca del insumo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbMarca.requestFocus();
            }else if("-- Seleccione --".equals(jcbModelo.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el modelo del insumo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbModelo.requestFocus();
            }else if("-- Seleccione --".equals(jcbLugar.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el lugar donde se encuentra el insumo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbLugar.requestFocus();
            }else{                
                String Modificar;
                Modificar = "UPDATE insumos SET "
                        + "TipoInsumoIn = '"+ lblCodigoTipoInsumo.getText() +"', "
                        + "MarcaIn = '"+ lblCodigoMarca.getText() +"', "
                        + "ModeloIn = '"+ lblCodigoModelo.getText() +"', "
                        + "LugarIn = '"+ lblCodigoLugar.getText() +"' "
                        + "WHERE CodigoIn = '"+ tfCodigoInsumo.getText() +"'";
                Statement stUpdate = miConexion.con.createStatement();
                stUpdate.executeUpdate(Modificar);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Los datos del insumo fueron modificados exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                lblCodigoModelo.setText("");
                lblCodigoMarca.setText("");
                lblCodigoTipoInsumo.setText("");
                lblCodigoLugar.setText("");
                jcbTipoInsumo.setSelectedItem("-- Seleccione --");
                jcbMarca.setSelectedItem("-- Seleccione --");
                jcbModelo.setSelectedItem("-- Seleccione --");
                jcbLugar.setSelectedItem("-- Seleccione --");
                tfCodigoInsumo.setText("");
                tfCodigoInsumo.requestFocus();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al modificar el insmumo",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        funcionModificar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Comprobar que el computador este regitrado
    //Validar el numero de serie y los Combobox
    private void funcionValidarComputador(){
        try{
            if("".equals(tfCodigoInsumo.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el código del insumo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfCodigoInsumo.requestFocus();
            }else if("-- Seleccione --".equals(jcbTipoInsumo.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el tipo de insumo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbTipoInsumo.requestFocus();
            }else if("-- Seleccione --".equals(jcbMarca.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione la marca del insumo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbMarca.requestFocus();
            }else if("-- Seleccione --".equals(jcbModelo.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el modelo del insumo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbModelo.requestFocus();
            }else{
                //Consultar si el producto esta registrado en la base de datos
                String Existe;
                Existe = "SELECT CodigoIn FROM insumos WHERE CodigoIn = '"+ tfCodigoInsumo.getText() +"'";
                Statement stExiste = miConexion.con.createStatement();
                ResultSet rsExiste = stExiste.executeQuery(Existe);
                if(rsExiste.next() == true){
                    jdInfoComputadores miPC = new jdInfoComputadores(new jfPrincipal(), true);
                    miPC.setLocationRelativeTo(null);
                    miPC.tfNumeroSerie.setText(tfCodigoInsumo.getText());
                    miPC.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Para añadir la información del equipo, primero debe agregarlo en esta ventana</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    tfCodigoInsumo.requestFocus();
                }                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());;
        }
    }
    
    private void btnAddInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInfoActionPerformed
        funcionValidarComputador();
    }//GEN-LAST:event_btnAddInfoActionPerformed

    private void funcionCargarCodigoTipo(){
        try{
            if(!"-- Seleccione --".equals(jcbTipoInsumo.getSelectedItem())){
                String sql = "SELECT CodigoTi FROM tiposinsumos "
                        + "WHERE TipoInsumoTi = '"+ jcbTipoInsumo.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoTipoInsumo.setText(rs.getString("CodigoTi"));
                }else{
                    //
                } 
            }else{
                lblCodigoTipoInsumo.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    //Darle visibilidad al botón para agregar información al equipo
    private void funcionVisibleAddInfo(){
        try{
            if(("Notebook".equals(jcbTipoInsumo.getSelectedItem())) || ("All-in-One".equals(jcbTipoInsumo.getSelectedItem())) || ("Desktop".equals(jcbTipoInsumo.getSelectedItem()))){
                btnAddInfo.setVisible(true);
            }else{
                btnAddInfo.setVisible(false);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void jcbTipoInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoInsumoActionPerformed
        funcionCargarCodigoTipo();
        funcionVisibleAddInfo();
        jcbTipoInsumo.requestFocus();
    }//GEN-LAST:event_jcbTipoInsumoActionPerformed

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
        jcbModelo.removeAllItems();;
        jcbModelo.addItem("-- Seleccione --");
        funcionCargarModelo();
        jcbModelo.requestFocus();
    }//GEN-LAST:event_jcbMarcaActionPerformed

    private void funcionCargarCodigoModelo(){
        try{
            if(!"-- Seleccione --".equals(jcbModelo.getSelectedItem())){
                String sql = "SELECT CodigoMo FROM modelosinsumos "
                        + "WHERE ModeloMo = '"+ jcbModelo.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoModelo.setText(rs.getString("CodigoMo"));
                }else{
                    //
                } 
            }else{
                lblCodigoModelo.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }
    
    private void jcbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbModeloActionPerformed
        funcionCargarCodigoModelo();
    }//GEN-LAST:event_jcbModeloActionPerformed

    private void btnAddTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTipoActionPerformed
        jdTipoInsumo miTipoInsumo = new jdTipoInsumo(new jfPrincipal(), true);
        miTipoInsumo.setLocationRelativeTo(this);
        miTipoInsumo.setVisible(true);
        jcbTipoInsumo.removeAllItems();
        jcbTipoInsumo.addItem("-- Seleccione --");
        funcionCargarTipo();
    }//GEN-LAST:event_btnAddTipoActionPerformed

    private void btnAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcaActionPerformed
        jdMarcas miMarca = new jdMarcas(new jfPrincipal(), true);
        miMarca.setLocationRelativeTo(this);
        miMarca.setVisible(true);
        jcbMarca.removeAllItems();
        jcbMarca.addItem("-- Seleccione --");
        funcionCargarMarca();
    }//GEN-LAST:event_btnAddMarcaActionPerformed

    private void btnAddModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddModeloActionPerformed
        jdModelos miModelo = new jdModelos(new jfPrincipal(), true);
        miModelo.setLocationRelativeTo(this);
        miModelo.setVisible(true);
        jcbModelo.removeAllItems();
        jcbModelo.addItem("-- Seleccione --");
        funcionCargarModelo();
    }//GEN-LAST:event_btnAddModeloActionPerformed

     private void funcionCargarCodigoLugar(){
        try{
            if(!"-- Seleccione --".equals(jcbMarca.getSelectedItem())){
                String sql = "SELECT CodigoLug FROM lugares "
                           + "WHERE NombreLug = '"+ jcbLugar.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoLugar.setText(rs.getString("CodigoLug"));
                }else{
                    //
                } 
            }else{
                lblCodigoLugar.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void jcbLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbLugarActionPerformed
        funcionCargarCodigoLugar();
    }//GEN-LAST:event_jcbLugarActionPerformed

    private void btnAddLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLugarActionPerformed
        jdUbicaciones miUbicacion = new jdUbicaciones(new jfPrincipal(), true);
        miUbicacion.setLocationRelativeTo(this);
        miUbicacion.setVisible(true);
        jcbLugar.removeAllItems();
        jcbLugar.addItem("-- Seleccione --");
        funcionCargarLugar();
    }//GEN-LAST:event_btnAddLugarActionPerformed

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
            java.util.logging.Logger.getLogger(jdModificarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdModificarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdModificarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdModificarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdModificarInsumo dialog = new jdModificarInsumo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddInfo;
    private javax.swing.JButton btnAddLugar;
    private javax.swing.JButton btnAddMarca;
    private javax.swing.JButton btnAddModelo;
    private javax.swing.JButton btnAddTipo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcbLugar;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JComboBox<String> jcbModelo;
    private javax.swing.JComboBox<String> jcbTipoInsumo;
    private javax.swing.JLabel lblCodigoLugar;
    private javax.swing.JLabel lblCodigoMarca;
    private javax.swing.JLabel lblCodigoModelo;
    private javax.swing.JLabel lblCodigoTipoInsumo;
    private javax.swing.JTextField tfCodigoInsumo;
    // End of variables declaration//GEN-END:variables
}
