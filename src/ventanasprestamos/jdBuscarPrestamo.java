package ventanasprestamos;

import ventanasprestamos.jdDevoluciones;
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
public class jdBuscarPrestamo extends javax.swing.JDialog {

    DataConnection miConexion;
    
    public jdBuscarPrestamo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblCodigoInsumo.setText("");
        lblCodigoInsumo.setVisible(false);
        lblCodigoPrestamo.setText("");
        lblCodigoPrestamo.setVisible(false);
        tfFiltro.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFiltroPrestamo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jrbtnFiltroRut = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        tfFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        lblCodigoInsumo = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jrbtnFiltroCodigo = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblCodigoPrestamo = new javax.swing.JLabel();
        jchbMostrar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar préstamo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jrbtnFiltroRut.setBackground(new java.awt.Color(255, 255, 255));
        btnFiltroPrestamo.add(jrbtnFiltroRut);
        jrbtnFiltroRut.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnFiltroRut.setSelected(true);
        jrbtnFiltroRut.setText("Filtrar por el nombre del funcionario");
        jrbtnFiltroRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnFiltroRutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Buscar:");

        tfFiltro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltroKeyReleased(evt);
            }
        });

        jtDatos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nombre"
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

        lblCodigoInsumo.setText("jLabel1");

        btnAceptar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aplicar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jrbtnFiltroCodigo.setBackground(new java.awt.Color(255, 255, 255));
        btnFiltroPrestamo.add(jrbtnFiltroCodigo);
        jrbtnFiltroCodigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnFiltroCodigo.setText("Filtrar por el código del insumo");
        jrbtnFiltroCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnFiltroCodigoActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        lblCodigoPrestamo.setText("jLabel1");

        jchbMostrar.setBackground(new java.awt.Color(255, 255, 255));
        jchbMostrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jchbMostrar.setText("Mostrar los insumos asignados");
        jchbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchbMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbtnFiltroRut)
                            .addComponent(jchbMostrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCodigoInsumo)
                                .addGap(18, 18, 18)
                                .addComponent(lblCodigoPrestamo)
                                .addGap(18, 18, 18)
                                .addComponent(btnAceptar))
                            .addComponent(jrbtnFiltroCodigo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfFiltro)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtnFiltroRut)
                    .addComponent(jrbtnFiltroCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(lblCodigoInsumo)
                    .addComponent(lblCodigoPrestamo)
                    .addComponent(jchbMostrar))
                .addContainerGap())
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

    public void funcionRecibirCodigo(String Codigo){
        try{
            tfFiltro.setText(Codigo);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    //Private void centrar datos
    private void funcionCentrarDatos(){ 
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        jtDatos.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);//CAMPO1
        jtDatos.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);//CAMPO2
        jtDatos.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);//CAMPO3
        jtDatos.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);//CAMPO4
    }
    
    private void funcionCrearModeloTabla(){
        try{
            DefaultTableModel Tabla = new DefaultTableModel();
            jtDatos.setModel(Tabla);
            Tabla.addColumn("Cod. Prestamo");
            Tabla.addColumn("Cod. Insumo");
            Tabla.addColumn("Funcionario");            
            Tabla.addColumn("Detalle insumo");
            if(jchbMostrar.isSelected()){
                funcionLlenarTabla2();
            }else{
                funcionLlenarTabla();
            }
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
            jtDatos.getColumnModel().getColumn(3).setHeaderRenderer(new CellRenderer(new Color(0,0,102),new Color(255,255,255)));//CAMPO4
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void funcionAnchoColumnasTablaDatos(){
        try{
            //Ancho de la tabla 700 - 846
            //Se asigna el ancho que tendra cada columna
            int[] 
            anchos = {
                136, //CAMPO1
                180, //CAMPO2
                180, //CAMPO3
                350, //CAMPO4
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
            Tabla.addColumn("Cod. Prestamo");
            Tabla.addColumn("Cod. Insumo");
            Tabla.addColumn("Funcionario");            
            Tabla.addColumn("Detalle insumo"); 
                String sSQL = "SELECT det.CodigoPrestamoDe, det.InsumoDe, CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                                  + "FROM insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo, detalleprestamos AS det, prestamos AS pre, funcionarios AS fun "
                                  + "WHERE (det.InsumoDe=ins.CodigoIn) AND (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND "
                                  + "(pre.CodigoPr=det.CodigoPrestamoDe) AND (pre.FuncionarioPr=fun.RutFu) AND det.EntregadoDe = '2' AND pre.TipoPrestamo = '2' ORDER BY det.CodigoPrestamoDe ASC";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sSQL);
                while(rs.next()){
                    Object[] fila = new Object[4];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
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
    
    //Llenar tabla
    private void funcionLlenarTabla2(){
       try{
            DefaultTableModel Tabla = new DefaultTableModel();
            this.jtDatos.setModel(Tabla);
            Tabla.addColumn("Cod. Prestamo");
            Tabla.addColumn("Cod. Insumo");
            Tabla.addColumn("Funcionario");            
            Tabla.addColumn("Detalle insumo"); 
                String sSQL = "SELECT det.CodigoPrestamoDe, det.InsumoDe, CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                                  + "FROM insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo, detalleprestamos AS det, prestamos AS pre, funcionarios AS fun "
                                  + "WHERE (det.InsumoDe=ins.CodigoIn) AND (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND "
                                  + "(pre.CodigoPr=det.CodigoPrestamoDe) AND (pre.FuncionarioPr=fun.RutFu) AND det.EntregadoDe = '2' AND pre.TipoPrestamo = '1' ORDER BY det.CodigoPrestamoDe ASC";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sSQL);
                while(rs.next()){
                    Object[] fila = new Object[4];
                    fila[0] = rs.getString(1);
                    fila[1] = rs.getString(2);
                    fila[2] = rs.getString(3);
                    fila[3] = rs.getString(4);
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

    private void jrbtnFiltroRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnFiltroRutActionPerformed
        tfFiltro.setText("");
        lblCodigoInsumo.setText("");
        tfFiltro.requestFocus();
    }//GEN-LAST:event_jrbtnFiltroRutActionPerformed

    private void jrbtnFiltroCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnFiltroCodigoActionPerformed
        tfFiltro.setText("");
        lblCodigoInsumo.setText("");
        tfFiltro.requestFocus();
    }//GEN-LAST:event_jrbtnFiltroCodigoActionPerformed

    private void funcionRescatarCodigo(){
        try{
            //Cargar codigo del insumo
            String CodInsumo = jtDatos.getValueAt(jtDatos.getSelectedRow(), 1).toString();
            lblCodigoInsumo.setText(CodInsumo);
            //Cargar codigo del prestamo
            String CodPrestamo = jtDatos.getValueAt(jtDatos.getSelectedRow(), 0).toString();
            lblCodigoPrestamo.setText(CodPrestamo);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private void jtDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosMouseClicked
        try{
            if(jtDatos.getRowCount() == 0 && jtDatos.getSelectedRow() == -1){
                System.out.println("No has seleccionado nada");
            }else if(jtDatos.getRowCount() != 0 && jtDatos.getSelectedRow() != -1){
                funcionRescatarCodigo();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jtDatosMouseClicked

    //Buscar por RUT
    private void funcionBuscarRUT(){
        try{
            if(!"".equals(tfFiltro.getText())){
                DefaultTableModel Tabla = new DefaultTableModel();
                this.jtDatos.setModel(Tabla);
                 Tabla.addColumn("Cod. Prestamo");
                 Tabla.addColumn("Cod. Insumo");
                 Tabla.addColumn("Funcionario");            
                 Tabla.addColumn("Detalle insumo");    
                    String sSQL =  "SELECT det.CodigoPrestamoDe, det.InsumoDe, CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                                  + "FROM insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo, detalleprestamos AS det, prestamos AS pre, funcionarios AS fun "
                                  + "WHERE (det.InsumoDe=ins.CodigoIn) AND (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND "
                                  + "(pre.CodigoPr=det.CodigoPrestamoDe) AND (pre.FuncionarioPr=fun.RutFu) AND det.EntregadoDe = '2' AND pre.TipoPrestamo = '1' AND "
                                  + "CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu) LIKE '%"+ tfFiltro.getText() +"%' ORDER BY det.CodigoPrestamoDe ASC ";
                    Statement st = miConexion.con.createStatement();
                    ResultSet rs = st.executeQuery(sSQL);
                    while(rs.next()){
                        Object[] fila = new Object[4];
                        fila[0] = rs.getString(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getString(4);
                        Tabla.addRow(fila);
                        funcionAnchoColumnasTablaDatos();
                        funcionCentrarDatos();
                    }            
                    funcionAnchoColumnasTablaDatos();
                    funcionCentrarDatos();
                    funcionColorearTabla();
            }else{
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    //Buscar por RUT
    private void funcionBuscarRUT2(){
        try{
            if(!"".equals(tfFiltro.getText())){
                DefaultTableModel Tabla = new DefaultTableModel();
                this.jtDatos.setModel(Tabla);
                 Tabla.addColumn("Cod. Prestamo");
                 Tabla.addColumn("Cod. Insumo");
                 Tabla.addColumn("Funcionario");            
                 Tabla.addColumn("Detalle insumo");    
                    String sSQL =  "SELECT det.CodigoPrestamoDe, det.InsumoDe, CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                                  + "FROM insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo, detalleprestamos AS det, prestamos AS pre, funcionarios AS fun "
                                  + "WHERE (det.InsumoDe=ins.CodigoIn) AND (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND "
                                  + "(pre.CodigoPr=det.CodigoPrestamoDe) AND (pre.FuncionarioPr=fun.RutFu) AND det.EntregadoDe = '2' AND pre.TipoPrestamo = '2' AND "
                                  + "CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu) LIKE '%"+ tfFiltro.getText() +"%' ORDER BY det.CodigoPrestamoDe ASC ";
                    Statement st = miConexion.con.createStatement();
                    ResultSet rs = st.executeQuery(sSQL);
                    while(rs.next()){
                        Object[] fila = new Object[4];
                        fila[0] = rs.getString(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getString(4);
                        Tabla.addRow(fila);
                        funcionAnchoColumnasTablaDatos();
                        funcionCentrarDatos();
                    }            
                    funcionAnchoColumnasTablaDatos();
                    funcionCentrarDatos();
                    funcionColorearTabla();
            }else{
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    //Buscar por codigo
    private void funcionBuscarCodigo(){
        try{
            if(!"".equals(tfFiltro.getText())){
                DefaultTableModel Tabla = new DefaultTableModel();
                this.jtDatos.setModel(Tabla);
                Tabla.addColumn("Cod. Prestamo"); 
                Tabla.addColumn("Cod. Insumo");
                Tabla.addColumn("Funcionario");            
                Tabla.addColumn("Detalle insumo");    
                    String sSQL = "SELECT det.CodigoPrestamoDe, det.InsumoDe, CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                                  + "FROM insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo, detalleprestamos AS det, prestamos AS pre, funcionarios AS fun "
                                  + "WHERE (det.InsumoDe=ins.CodigoIn) AND (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND pre.TipoPrestamo = '1' AND "
                                  + "(pre.CodigoPr=det.CodigoPrestamoDe) AND (pre.FuncionarioPr=fun.RutFu) AND det.EntregadoDe = '2' AND det.InsumoDe LIKE '%"+ tfFiltro.getText() +"%' ORDER BY det.CodigoPrestamoDe ASC ";
                    Statement st = miConexion.con.createStatement();
                    ResultSet rs = st.executeQuery(sSQL);
                    while(rs.next()){
                        Object[] fila = new Object[4];
                        fila[0] = rs.getString(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getString(4);
                        Tabla.addRow(fila);
                        funcionAnchoColumnasTablaDatos();
                        funcionCentrarDatos();
                    }            
                    funcionAnchoColumnasTablaDatos();
                    funcionCentrarDatos();
                    funcionColorearTabla();
            }else{
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
        
    //Buscar por codigo
    private void funcionBuscarCodigo2(){
        try{
            if(!"".equals(tfFiltro.getText())){
                DefaultTableModel Tabla = new DefaultTableModel();
                this.jtDatos.setModel(Tabla);
                Tabla.addColumn("Cod. Prestamo"); 
                Tabla.addColumn("Cod. Insumo");
                Tabla.addColumn("Funcionario");            
                Tabla.addColumn("Detalle insumo");    
                    String sSQL = "SELECT det.CodigoPrestamoDe, det.InsumoDe, CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                                  + "FROM insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo, detalleprestamos AS det, prestamos AS pre, funcionarios AS fun "
                                  + "WHERE (det.InsumoDe=ins.CodigoIn) AND (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND pre.TipoPrestamo = '2' AND "
                                  + "(pre.CodigoPr=det.CodigoPrestamoDe) AND (pre.FuncionarioPr=fun.RutFu) AND det.EntregadoDe = '2' AND det.InsumoDe LIKE '%"+ tfFiltro.getText() +"%' ORDER BY det.CodigoPrestamoDe ASC ";
                    Statement st = miConexion.con.createStatement();
                    ResultSet rs = st.executeQuery(sSQL);
                    while(rs.next()){
                        Object[] fila = new Object[4];
                        fila[0] = rs.getString(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getString(4);
                        Tabla.addRow(fila);
                        funcionAnchoColumnasTablaDatos();
                        funcionCentrarDatos();
                    }            
                    funcionAnchoColumnasTablaDatos();
                    funcionCentrarDatos();
                    funcionColorearTabla();
            }else{
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void funcionBuscar(){
        try{
            if(!"".equals(tfFiltro.getText())){
                if(jrbtnFiltroRut.isSelected()){
                    if(jchbMostrar.isSelected()){
                        funcionBuscarRUT();
                    }else{
                        funcionBuscarRUT2();
                    }
                }else if(jrbtnFiltroCodigo.isSelected()){
                    if(jchbMostrar.isSelected()){
                        funcionBuscarCodigo();
                    }else{
                        funcionBuscarCodigo2();
                    }
                }else{
                    funcionCrearModeloTabla();
                }
            }else{
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void tfFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltroKeyReleased
        funcionBuscar();
    }//GEN-LAST:event_tfFiltroKeyReleased
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        jdDevoluciones miDevolucion = new jdDevoluciones(new jfPrincipal(),true);        
        miDevolucion.setLocationRelativeTo(null);
        this.dispose();
        miDevolucion.setText(lblCodigoInsumo.getText(), lblCodigoPrestamo.getText());
        miDevolucion.setVisible(true);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jchbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchbMostrarActionPerformed
        funcionCrearModeloTabla();
    }//GEN-LAST:event_jchbMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(jdBuscarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdBuscarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdBuscarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdBuscarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdBuscarPrestamo dialog = new jdBuscarPrestamo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.ButtonGroup btnFiltroPrestamo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox jchbMostrar;
    public javax.swing.JRadioButton jrbtnFiltroCodigo;
    public javax.swing.JRadioButton jrbtnFiltroRut;
    private javax.swing.JTable jtDatos;
    private javax.swing.JLabel lblCodigoInsumo;
    private javax.swing.JLabel lblCodigoPrestamo;
    public javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
