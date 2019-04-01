package ventanasprestamos;

import clases.CellRenderer;
import clases.DataConnection;
import clases.Rut;
import java.awt.Color;
import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import pdf.pdfInformePrestamoGeneral;
import principal.jfPrincipal;

/**
 * @author Víctor Sandoval
 */
public class jdVisualizarPrestamo extends javax.swing.JDialog {

    DataConnection miConexion;
    
    public jdVisualizarPrestamo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfFechaSolicitud = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarFuncionario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObservacion = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        tfRutFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfNombreFuncionario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfCurso = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jcbCodigoPrestamo = new javax.swing.JComboBox<>();
        tfHoraSolicitud = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfFechaEntrega = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfHoraEntrega = new javax.swing.JTextField();
        btnGenerarPDF = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tfEntregado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Revisar préstamos");
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

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Curso:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Fecha solicitud:");

        tfFechaSolicitud.setEditable(false);
        tfFechaSolicitud.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfFechaSolicitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("RUT del funcionario:");

        btnBuscarFuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBuscarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFuncionarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Observación:");

        txaObservacion.setEditable(false);
        txaObservacion.setBackground(new java.awt.Color(240, 240, 240));
        txaObservacion.setColumns(20);
        txaObservacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txaObservacion.setLineWrap(true);
        txaObservacion.setRows(4);
        txaObservacion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txaObservacion);

        btnLimpiar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tfRutFuncionario.setEditable(false);
        tfRutFuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfRutFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfRutFuncionarioFocusLost(evt);
            }
        });
        tfRutFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRutFuncionarioActionPerformed(evt);
            }
        });
        tfRutFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfRutFuncionarioKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Nombre del funcionario:");

        tfNombreFuncionario.setEditable(false);
        tfNombreFuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfNombreFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Seleccione ID Préstamo:");

        tfCurso.setEditable(false);
        tfCurso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfCurso.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtDatos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Insumo", "Descripcion"
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
        jScrollPane2.setViewportView(jtDatos);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Detalle del préstamo:");

        jcbCodigoPrestamo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbCodigoPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbCodigoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCodigoPrestamoActionPerformed(evt);
            }
        });

        tfHoraSolicitud.setEditable(false);
        tfHoraSolicitud.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfHoraSolicitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Hora solicitud:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Fecha entrega:");

        tfFechaEntrega.setEditable(false);
        tfFechaEntrega.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfFechaEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Hora entrega:");

        tfHoraEntrega.setEditable(false);
        tfHoraEntrega.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfHoraEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnGenerarPDF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btnGenerarPDF.setText("Generar PDF");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Entregado:");

        tfEntregado.setEditable(false);
        tfEntregado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfEntregado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfRutFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarFuncionario))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addComponent(jcbCodigoPrestamo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNombreFuncionario, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfHoraSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGenerarPDF))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(tfEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(tfFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfHoraEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfRutFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNombreFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(tfHoraSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(tfHoraEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnGenerarPDF)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    public void setText(String Rut){
        tfRutFuncionario.setText(Rut);
    }
    
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
            Tabla.addColumn("Insumo");
            Tabla.addColumn("Datos");
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
            //Ancho de la tabla 639
            //Se asigna el ancho que tendra cada columna
            int[] 
            anchos = {
                160, //CAMPO1 
                479, //CAMPO2                                   
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
            Tabla.addColumn("Insumo");
            Tabla.addColumn("Datos");     
                String sSQL = "SELECT ins.CodigoIn, CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                            + "FROM prestamos AS pre, detalleprestamos AS det, insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo "
                            + "WHERE (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND (det.InsumoDe=ins.CodigoIn) "
                            + "AND (pre.CodigoPr=det.CodigoPrestamoDe) AND pre.CodigoPr = '"+ jcbCodigoPrestamo.getSelectedItem() +"'";
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
    
    //Cargar los codigos de los prestamos
    private void funcionCargarPrestamos(){
        try{
            if(!"".equals(tfRutFuncionario.getText())){
                String Curso;//Se declara una variable tipo String
                Curso = "SELECT pre.CodigoPr FROM prestamos AS pre "
                      + "WHERE pre.FuncionarioPr = '"+ tfRutFuncionario.getText() +"' "
                      + "ORDER BY pre.CodigoPr ASC";//Crear consulta SQL
                Statement stCurso = miConexion.con.createStatement();
                ResultSet rsCurso = stCurso.executeQuery(Curso);
                while(rsCurso.next()){
                    jcbCodigoPrestamo.addItem(rsCurso.getString("pre.CodigoPr"));
                }
            }else{
                jcbCodigoPrestamo.removeAllItems();
                jcbCodigoPrestamo.addItem("-- Seleccione --");
            }                
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar los cursos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        funcionCrearModeloTabla();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btnBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFuncionarioActionPerformed
        jdBuscarFuncionario2 miBuscar = new jdBuscarFuncionario2(new jfPrincipal(),true);
        miBuscar.setLocationRelativeTo(this);
        miBuscar.setVisible(true);
        this.tfRutFuncionario.setText(miBuscar.lblRutFuncionario.getText());
        funcionCargarNombre();
        jcbCodigoPrestamo.removeAllItems();
        jcbCodigoPrestamo.addItem("-- Seleccione --");
        funcionCargarPrestamos();
    }//GEN-LAST:event_btnBuscarFuncionarioActionPerformed

    //Cargar nombre del funcionario
    private void funcionCargarNombre(){
        try{
            String Nombre;
            Nombre = "SELECT CONCAT(PrimerNombreFu,' ',SegundoNombreFu,' ',ApellidoPaternoFu,' ',ApellidoMaternoFu) AS Nombre "
                    + "FROM funcionarios WHERE RutFu = '"+ tfRutFuncionario.getText() +"'";
            Statement st = miConexion.con.createStatement();
            ResultSet rs = st.executeQuery(Nombre);
            if(rs.next() == false){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">El funcionario no se encuentra registrado</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbCodigoPrestamo.removeAllItems();
                jcbCodigoPrestamo.addItem("-- Seleccione --");
                tfNombreFuncionario.setText("");
                tfRutFuncionario.requestFocus();
            }else{
                tfNombreFuncionario.setText(rs.getString("Nombre"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar el nombre del funcionario",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void tfRutFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRutFuncionarioActionPerformed
        funcionCargarNombre();
    }//GEN-LAST:event_tfRutFuncionarioActionPerformed

    private void tfRutFuncionarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfRutFuncionarioFocusLost
        try{
            if(!"".equals(tfNombreFuncionario.getText())){
                //
            }else{
                if("".equals(tfRutFuncionario.getText())){
                    //
                }else{
                    funcionCargarNombre();
                }                
            }
        }catch(Exception ex){
           JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE); 
        }       
    }//GEN-LAST:event_tfRutFuncionarioFocusLost

    private void tfRutFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRutFuncionarioKeyReleased
        try{
            if(!"".equals(tfRutFuncionario.getText())){
                tfRutFuncionario.setText(tfRutFuncionario.getText().toUpperCase());
                tfRutFuncionario.setText(Rut.formatear(tfRutFuncionario.getText()));
            }else{
                //
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_tfRutFuncionarioKeyReleased

    private void funcionCargarDatosPrestamo(){
        try{
            if(!"-- Seleccione --".equals(jcbCodigoPrestamo.getSelectedItem())){
                //Cargar datos individuales
                String Datos;
                Datos= "SELECT cur.CursoCu, pre.ObservacionPr, pre.FechaSolicitudPr, pre.HoraSolicitudPr "
                     + "FROM prestamos AS pre, cursos AS cur WHERE (pre.CursoPr=cur.CodigoCu) "
                     + "AND pre.CodigoPr = '"+ jcbCodigoPrestamo.getSelectedItem() +"'";
                Statement stD = miConexion.con.createStatement();
                ResultSet rsD = stD.executeQuery(Datos);
                if(rsD.next() == true){
                    tfCurso.setText(rsD.getString("cur.CursoCu"));
                    txaObservacion.setText(rsD.getString("pre.ObservacionPr"));
                    tfFechaSolicitud.setText(rsD.getString("pre.FechaSolicitudPr"));
                    tfHoraSolicitud.setText(rsD.getString("pre.HoraSolicitudPr"));
               }else{
                    //No se ha seleccionado ningun prestamo.
                }
                //Cargar detalle de los insumos
                DefaultTableModel Tabla = new DefaultTableModel();
                this.jtDatos.setModel(Tabla);
                Tabla.addColumn("Insumo");
                Tabla.addColumn("Datos");     
                    String sSQL = "SELECT ins.CodigoIn, CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                                + "FROM prestamos AS pre, detalleprestamos AS det, insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo "
                                + "WHERE (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND (det.InsumoDe=ins.CodigoIn) "
                                + "AND (pre.CodigoPr=det.CodigoPrestamoDe) AND pre.CodigoPr = '"+ jcbCodigoPrestamo.getSelectedItem() +"'";
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
                tfEntregado.setText("");
                tfFechaEntrega.setText("");
                tfHoraEntrega.setText("");
            }else{
                //Limpiar todos los cammpos
                tfCurso.setText("");
                tfFechaSolicitud.setText("");
                tfHoraSolicitud.setText("");
                txaObservacion.setText("");
                tfEntregado.setText("");
                tfFechaEntrega.setText("");
                tfHoraEntrega.setText("");
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        }
    }
    
    private void jcbCodigoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCodigoPrestamoActionPerformed
        funcionCargarDatosPrestamo();
    }//GEN-LAST:event_jcbCodigoPrestamoActionPerformed

    private void funcionCargarInfo(){
        try{
            //Cargar codigo del insumo
            String Codigo = jtDatos.getValueAt(jtDatos.getSelectedRow(), 0).toString();
            //Cargar datos del insumo prestado
            String sql;
            sql = "SELECT ent.EntregadoEn, det.FechaEntregaDe, det.HoraEntregaDe "
                + "FROM prestamos AS pre, detalleprestamos AS det, entregados AS ent "
                + "WHERE (pre.CodigoPr=det.CodigoPrestamoDe) AND (det.EntregadoDe=ent.CodigoEn) "
                + "AND pre.CodigoPr = '"+ jcbCodigoPrestamo.getSelectedItem() +"' AND "
                + "pre.FuncionarioPr = '"+ tfRutFuncionario.getText() +"' AND "
                + "det.InsumoDe = '"+ Codigo +"'";
            Statement st = miConexion.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next() == true){
                tfEntregado.setText(rs.getString("ent.EntregadoEn"));
                tfFechaEntrega.setText(rs.getString("det.FechaEntregaDe"));
                tfHoraEntrega.setText(rs.getString("det.HoraEntregaDe"));
            }else{
                JOptionPane.showMessageDialog(this, 
                "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
            +   "font-size:12px}</style>"
            +   "<div align=\"center\">No es posible cargar los datos, hay un problema con la base de datos</div></html>", //Mensaje
                "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());            
        }
    }
    
    private void jtDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosMouseClicked
        try{
            if(jtDatos.getRowCount() == 0 && jtDatos.getSelectedRow() == -1){
                System.out.println("No has seleccionado nada");
            }else if(jtDatos.getRowCount() != 0 && jtDatos.getSelectedRow() != -1){
                funcionCargarInfo();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jtDatosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Limpiar todos los cammpos
        tfRutFuncionario.setText("");
        tfNombreFuncionario.setText("");
        jcbCodigoPrestamo.removeAllItems();
        jcbCodigoPrestamo.addItem("-- Seleccione --");
        tfCurso.setText("");
        tfFechaSolicitud.setText("");
        tfHoraSolicitud.setText("");
        txaObservacion.setText("");
        tfEntregado.setText("");
        tfFechaEntrega.setText("");
        tfHoraEntrega.setText("");
        funcionCrearModeloTabla();
        tfRutFuncionario.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        String sFichero = System.getProperty("user.home") + "\\Desktop\\"+ jcbCodigoPrestamo.getSelectedItem().toString() +"_prestamo.pdf";
        File Fichero = new File(sFichero);
        
        if(Fichero.exists() == false){        
            pdfInformePrestamoGeneral miPDF = new pdfInformePrestamoGeneral();
            miPDF.GenerarPDF_PrestamoInsumos(jcbCodigoPrestamo.getSelectedItem().toString());
        }else{
            int seleccion = JOptionPane.showOptionDialog(
            null, // Componente padre
            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
            + "font-size:12px}</style>"
            + "<div align=\"center\">Existe un archivo con el mismo nombre, ¿Desea reemplazarlo?.</div></html>", //Mensaje
            "Cerrar sistema", // Titulo del Mensaje
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,    // null para icono por defecto.
            new Object[] { "Sí", "No"},    // null para YES, NO y CANCEL
            "No");//Boton seleccionado por defecto
                if (seleccion != -1){
                    if((seleccion + 1)==1){
                        //Accion a realizar al precionar "SI"
                        pdfInformePrestamoGeneral miPDF = new pdfInformePrestamoGeneral();
                        miPDF.GenerarPDF_PrestamoInsumos(jcbCodigoPrestamo.getSelectedItem().toString());
                    }else{
                       //Accion a realizar al precionar "NO"
                    }
                }
        }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

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
            java.util.logging.Logger.getLogger(jdVisualizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdVisualizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdVisualizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdVisualizarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdVisualizarPrestamo dialog = new jdVisualizarPrestamo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscarFuncionario;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbCodigoPrestamo;
    private javax.swing.JTable jtDatos;
    public javax.swing.JTextField tfCurso;
    private javax.swing.JTextField tfEntregado;
    private javax.swing.JTextField tfFechaEntrega;
    private javax.swing.JTextField tfFechaSolicitud;
    private javax.swing.JTextField tfHoraEntrega;
    private javax.swing.JTextField tfHoraSolicitud;
    private javax.swing.JTextField tfNombreFuncionario;
    public javax.swing.JTextField tfRutFuncionario;
    private javax.swing.JTextArea txaObservacion;
    // End of variables declaration//GEN-END:variables
}
