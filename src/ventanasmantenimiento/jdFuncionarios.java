package ventanasmantenimiento;

import ventanasmantenimiento.jdCargos;
import clases.CellRenderer;
import clases.DataConnection;
import clases.Rut;
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
public class jdFuncionarios extends javax.swing.JDialog {

    DataConnection miConexion;
    
    public jdFuncionarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tfBuscarNombre.setEditable(false);
        lblCodigoCargo.setText("");
        lblCodigoEstado.setText("");
        lblCodigoCargo.setVisible(false);
        lblCodigoEstado.setVisible(false);
        lblEstadoUsuario.setVisible(false);
        jcbEstado.setVisible(false);
        jcbEstado.setEnabled(true);
        jcbEstado.setSelectedItem("-- Seleccione --");
        jtDatos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupFuncionarios = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfRut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jrbtnAgregar = new javax.swing.JRadioButton();
        jrbtnEliminar = new javax.swing.JRadioButton();
        jrbtnModificar = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        jcbCargo = new javax.swing.JComboBox<>();
        btnAddCargo = new javax.swing.JButton();
        lblCodigoCargo = new javax.swing.JLabel();
        lblCodigoEstado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfPrimerNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfSegundoNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfApellidoPat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfApellidoMat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfBuscarNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblEstadoUsuario = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<>();
        tfClave = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        lblDominio = new javax.swing.JLabel();
        jchbMostrar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar funcionarios");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tfRut.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfRutKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("RUT:");

        jrbtnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFuncionarios.add(jrbtnAgregar);
        jrbtnAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnAgregar.setSelected(true);
        jrbtnAgregar.setText("Agregar");
        jrbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnAgregarActionPerformed(evt);
            }
        });

        jrbtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFuncionarios.add(jrbtnEliminar);
        jrbtnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnEliminar.setText("Desactivar");
        jrbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnEliminarActionPerformed(evt);
            }
        });

        jrbtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFuncionarios.add(jrbtnModificar);
        jrbtnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnModificar.setText("Modificar");
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

        jcbCargo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCargoActionPerformed(evt);
            }
        });

        btnAddCargo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAddCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCargoActionPerformed(evt);
            }
        });

        lblCodigoCargo.setText("jLabel1");

        lblCodigoEstado.setText("jLabel1");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Primer nombre:");

        tfPrimerNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Segundo nombre:");

        tfSegundoNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Apellido paterno:");

        tfApellidoPat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Apellido materno:");

        tfApellidoMat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Teléfono:");

        tfTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Cargo:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Buscar funcionario por nombre:");

        tfBuscarNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscarNombreKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Clave:");

        lblEstadoUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblEstadoUsuario.setText("Estado:");

        jcbEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });

        tfClave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("Correo institucional:");

        tfCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblDominio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDominio.setText("@escuelaartisticaadufey.cl");

        jchbMostrar.setBackground(new java.awt.Color(255, 255, 255));
        jchbMostrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jchbMostrar.setText("Mostrar funcionarios desactivados");
        jchbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchbMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jrbtnModificar)
                            .addGap(80, 80, 80)
                            .addComponent(jrbtnEliminar))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(tfApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(tfApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jrbtnAgregar)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(tfPrimerNombre)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                        .addComponent(tfRut))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(tfSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCodigoCargo)
                                .addGap(18, 18, 18)
                                .addComponent(lblCodigoEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfClave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblEstadoUsuario)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel16)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tfCorreo)
                                .addGap(18, 18, 18)
                                .addComponent(lblDominio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addComponent(tfBuscarNombre)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchbMostrar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtnAgregar)
                    .addComponent(jrbtnEliminar)
                    .addComponent(jrbtnModificar)
                    .addComponent(jLabel13)
                    .addComponent(jchbMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(tfBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tfRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblEstadoUsuario)
                                .addGap(35, 35, 35)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDominio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(lblCodigoCargo)
                            .addComponent(lblCodigoEstado)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
                .addContainerGap())
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
        jtDatos.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);//CAMPO4
    }
    
    private void funcionCrearModeloTabla(){
        try{
            DefaultTableModel Tabla = new DefaultTableModel();
            jtDatos.setModel(Tabla);
            Tabla.addColumn("RUT");
            Tabla.addColumn("Nombre");
            Tabla.addColumn("Correo");
            Tabla.addColumn("Teléfono");
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
            jtDatos.getColumnModel().getColumn(3).setHeaderRenderer(new CellRenderer(new Color(0,0,102),new Color(255,255,255)));//CAMPO4
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void funcionAnchoColumnasTablaDatos(){
        try{
            //Ancho de la tabla 745
            //Se asigna el ancho que tendra cada columna
            int[] 
            anchos = {
                120, //CAMPO1 
                170, //CAMPO2
                345, //CAMPO3
                110, //CAMPO4
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
           if(jchbMostrar.isSelected() == false){
               jrbtnEliminar.setEnabled(true);
                DefaultTableModel Tabla = new DefaultTableModel();
                this.jtDatos.setModel(Tabla);
                Tabla.addColumn("RUT");
                Tabla.addColumn("Nombre");
                Tabla.addColumn("Correo");
                Tabla.addColumn("Teléfono");      
                    String sSQL = "SELECT fun.RutFu, CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), fun.CorreoFu, fun.TelefonoFu "
                            + "FROM funcionarios fun, usuarios usu WHERE (fun.RutFu=usu.UsuarioUs) AND usu.EstadoUs = '1' "
                            + "ORDER BY CONCAT(PrimerNombreFu,' ',ApellidoPaternoFu) ASC LIMIT 90";
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
                jrbtnEliminar.setEnabled(false);
                DefaultTableModel Tabla = new DefaultTableModel();
                this.jtDatos.setModel(Tabla);
                Tabla.addColumn("RUT");
                Tabla.addColumn("Nombre");
                Tabla.addColumn("Correo");
                Tabla.addColumn("Teléfono");      
                    String sSQL = "SELECT fun.RutFu, CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu), fun.CorreoFu, fun.TelefonoFu "
                            + "FROM funcionarios fun, usuarios usu WHERE (fun.RutFu=usu.UsuarioUs) AND usu.EstadoUs = '2' "
                            + "ORDER BY CONCAT(PrimerNombreFu,' ',ApellidoPaternoFu) ASC LIMIT 90";
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
           }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
    }
    
    //Cargar cargos
    private void funcionCargarCargos(){
        try{
            String Cargo;//Se declara una variable tipo String
            Cargo = "SELECT CargoCa FROM cargos ORDER BY CargoCa ASC";//Crear consulta SQL
            Statement stCargo = miConexion.con.createStatement();
            ResultSet rsCargo = stCargo.executeQuery(Cargo);
            while(rsCargo.next()){
                jcbCargo.addItem(rsCargo.getString("CargoCa"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar los cargos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Cargar estados
    private void funcionCargarEstados(){
        try{
            String Estado;//Se declara una variable tipo String
            Estado = "SELECT EstadoEs FROM estadosusuarios ORDER BY EstadoEs ASC";//Crear consulta SQL
            Statement stEstado = miConexion.con.createStatement();
            ResultSet rsEstado = stEstado.executeQuery(Estado);
            while(rsEstado.next()){
                jcbEstado.addItem(rsEstado.getString("EstadoEs"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar los estados",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        funcionCrearModeloTabla();
        funcionCargarCargos();
        funcionCargarEstados();        
        tfRut.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void jrbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnAgregarActionPerformed
        tfRut.setEditable(true);
        tfRut.setText("");
        tfPrimerNombre.setEditable(true);
        tfPrimerNombre.setText("");
        tfSegundoNombre.setEditable(true);
        tfSegundoNombre.setText("");
        tfApellidoPat.setEditable(true);
        tfApellidoPat.setText("");
        tfApellidoMat.setEditable(true);
        tfApellidoMat.setText("");
        tfTelefono.setEditable(true);
        tfTelefono.setText("");
        tfCorreo.setEditable(true);
        tfCorreo.setText("");
        tfClave.setEditable(true);
        tfClave.setText("");
        jcbCargo.setEnabled(true);
        jcbCargo.setSelectedItem("-- Seleccione --");
        btnAddCargo.setEnabled(true);
        lblEstadoUsuario.setVisible(false);
        jcbEstado.setVisible(false);
        jcbEstado.setEnabled(true);
        jcbEstado.setSelectedItem("-- Seleccione --");
        tfBuscarNombre.setEditable(false);
        tfBuscarNombre.setText("");
        jtDatos.setEnabled(false);
        jchbMostrar.setEnabled(true);
        funcionCrearModeloTabla();
        tfRut.requestFocus();
    }//GEN-LAST:event_jrbtnAgregarActionPerformed

    private void jrbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnModificarActionPerformed
        tfRut.setEditable(false);
        tfRut.setText("");
        tfPrimerNombre.setEditable(false);
        tfPrimerNombre.setText("");
        tfSegundoNombre.setEditable(false);
        tfSegundoNombre.setText("");
        tfApellidoPat.setEditable(false);
        tfApellidoPat.setText("");
        tfApellidoMat.setEditable(false);
        tfApellidoMat.setText("");
        tfTelefono.setEditable(true);
        tfTelefono.setText("");
        tfCorreo.setEditable(true);
        tfCorreo.setText("");
        tfClave.setEditable(true);
        tfClave.setText("");
        jcbCargo.setEnabled(true);
        jcbCargo.setSelectedItem("-- Seleccione --");
        btnAddCargo.setEnabled(true);
        lblEstadoUsuario.setVisible(true);
        jcbEstado.setVisible(true);
        jcbEstado.setEnabled(true);
        jcbEstado.setSelectedItem("-- Seleccione --");
        tfBuscarNombre.setEditable(true);
        tfBuscarNombre.setText("");
        jtDatos.setEnabled(true);
        jchbMostrar.setEnabled(true);
        funcionCrearModeloTabla();
        tfBuscarNombre.requestFocus();
    }//GEN-LAST:event_jrbtnModificarActionPerformed

    private void jrbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnEliminarActionPerformed
        tfRut.setEditable(false);
        tfRut.setText("");
        tfPrimerNombre.setEditable(false);
        tfPrimerNombre.setText("");
        tfSegundoNombre.setEditable(false);
        tfSegundoNombre.setText("");
        tfApellidoPat.setEditable(false);
        tfApellidoPat.setText("");
        tfApellidoMat.setEditable(false);
        tfApellidoMat.setText("");
        tfTelefono.setEditable(false);
        tfTelefono.setText("");
        tfCorreo.setEditable(false);
        tfCorreo.setText("");
        tfClave.setEditable(false);
        tfClave.setText("");
        jcbCargo.setEnabled(false);
        jcbCargo.setSelectedItem("-- Seleccione --");
        btnAddCargo.setEnabled(false);
        lblEstadoUsuario.setVisible(false);
        jcbEstado.setVisible(false);
        jcbEstado.setEnabled(false);
        jcbEstado.setSelectedItem("-- Seleccione --");
        tfBuscarNombre.setEditable(true);
        tfBuscarNombre.setText("");
        jtDatos.setEnabled(true);
        jchbMostrar.setEnabled(false);
        funcionCrearModeloTabla();
        tfBuscarNombre.requestFocus();
    }//GEN-LAST:event_jrbtnEliminarActionPerformed

    //cargar codigo cargo
    private void funcionCargarCodigoCargo(){
        try{
            if(!"-- Seleccione --".equals(jcbCargo.getSelectedItem())){
                String sql = "SELECT CodigoCa FROM cargos "
                           + "WHERE CargoCa = '"+ jcbCargo.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoCargo.setText(rs.getString("CodigoCa"));
                }else{
                    //
                } 
            }else{
                lblCodigoCargo.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void jcbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCargoActionPerformed
        funcionCargarCodigoCargo();
    }//GEN-LAST:event_jcbCargoActionPerformed

    //cargar codigo estado
    private void funcionCargarCodigoEstado(){
        try{
            if(!"-- Seleccione --".equals(jcbEstado.getSelectedItem())){
                String sql = "SELECT CodigoEs FROM estadosusuarios "
                           + "WHERE EstadoEs = '"+ jcbEstado.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoEstado.setText(rs.getString("CodigoEs"));
                }else{
                    //
                } 
            }else{
                lblCodigoEstado.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed
        funcionCargarCodigoEstado();
    }//GEN-LAST:event_jcbEstadoActionPerformed

    private void btnAddCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCargoActionPerformed
        jdCargos miCargo = new jdCargos(new jfPrincipal(), true);
        miCargo.setLocationRelativeTo(this);
        miCargo.setVisible(true);
        jcbCargo.removeAllItems();
        jcbCargo.addItem("-- Seleccione --");
        funcionCargarCargos();
    }//GEN-LAST:event_btnAddCargoActionPerformed

    //Cargar datos de funcionarios
    private void funcionCargarFuncionarios(){
        try{
            if("".equals(tfRut.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el RUT del funcionario desde la tabla</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfRut.requestFocus();
            }else{
                String Datos;
                Datos = "SELECT fun.PrimerNombreFu, fun.SegundoNombreFu, fun.ApellidoPaternoFu, fun.ApellidoMaternoFu, "
                        + "fun.TelefonoFu, car.CargoCa, usu.ClaveUs, est.EstadoEs "
                        + "FROM funcionarios fun, usuarios usu, cargos car, estadosusuarios est "
                        + "WHERE (fun.RutFu=usu.UsuarioUs) AND (fun.CargoFu=car.CodigoCa) AND (usu.EstadoUs=est.CodigoEs) AND fun.RutFu = '"+ tfRut.getText() +"'";
                Statement stDatos = miConexion.con.createStatement();
                ResultSet rsDatos = stDatos.executeQuery(Datos);
                if(rsDatos.next() == true){
                    tfPrimerNombre.setText(rsDatos.getString("fun.PrimerNombreFu"));
                    tfSegundoNombre.setText(rsDatos.getString("fun.SegundoNombreFu"));
                    tfApellidoPat.setText(rsDatos.getString("fun.ApellidoPaternoFu"));
                    tfApellidoMat.setText(rsDatos.getString("fun.ApellidoMaternoFu"));
                    tfTelefono.setText(rsDatos.getString("fun.TelefonoFu"));
                    jcbCargo.setSelectedItem(rsDatos.getString("car.CargoCa"));
                    tfClave.setText(rsDatos.getString("usu.ClaveUs"));
                    jcbEstado.setSelectedItem(rsDatos.getString("est.EstadoEs"));
                }else{
                    JOptionPane.showMessageDialog(this,"Error al cargar los datos del funcionario","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al cargar los datos del funcionario",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void jtDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosMouseClicked
        try{
            if(jtDatos.getRowCount() == 0 && jtDatos.getSelectedRow() == -1){
                System.out.println("No has seleccionado nada");
            }else if(jtDatos.getRowCount() != 0 && jtDatos.getSelectedRow() != -1){
                String Rut = jtDatos.getValueAt(jtDatos.getSelectedRow(), 0).toString();
                tfRut.setText(Rut);
                String Correo = jtDatos.getValueAt(jtDatos.getSelectedRow(), 2).toString();
                tfCorreo.setText(Correo.replaceAll(lblDominio.getText(), ""));
                funcionCargarFuncionarios();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jtDatosMouseClicked

    
    //Agregar
    private void funcionAgregar(){
        try{
            if("".equals(tfRut.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el RUT del funcionario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfRut.requestFocus();
            }else if("".equals(tfPrimerNombre.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el primer nombre del funcionario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfPrimerNombre.requestFocus();
            }else if("".equals(tfApellidoPat.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el apellido paterno del funcionario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfApellidoPat.requestFocus();
            }else if("".equals(tfApellidoMat.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el apellido materno del funcionario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfApellidoMat.requestFocus();
            }else if("".equals(tfTelefono.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el teléfono del funcionario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfTelefono.requestFocus();
            }else if("-- Seleccione --".equals(jcbCargo.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el cargo del funcionario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbCargo.requestFocus();
            }else if("".equals(tfClave.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese la contraseña para el ingreso del funcionario al sistema</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfClave.requestFocus();
            }else if("".equals(tfCorreo.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el correo institucional del funcionario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfCorreo.requestFocus();
            }else{
                //Agregar funcionario
                String Correo = tfCorreo.getText()+lblDominio.getText();
                String AgregarFu;
                AgregarFu = "INSERT INTO funcionarios VALUES("
                        + "'"+ tfRut.getText() +"', "
                        + "'"+ tfPrimerNombre.getText() +"', "
                        + "'"+ tfSegundoNombre.getText() +"', "
                        + "'"+ tfApellidoPat.getText() +"', "
                        + "'"+ tfApellidoMat.getText() +"', "
                        + "'"+ Correo +"', "
                        + "'"+ tfTelefono.getText() +"', "
                        + "'"+ lblCodigoCargo.getText() +"')";
                Statement stAddFu = miConexion.con.createStatement();
                stAddFu.executeUpdate(AgregarFu);
                //Agregar usuario
                String AgregarUs;
                AgregarUs = "INSERT INTO usuarios VALUES("
                        + "'"+ tfRut.getText() +"', "
                        + "'"+ tfClave.getText() +"', "
                        + "'1',"
                        + "'2')";
                Statement stAddUs = miConexion.con.createStatement();
                stAddUs.executeUpdate(AgregarUs);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">El funcionario fue ingresado exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfRut.setText("");
                tfPrimerNombre.setText("");
                tfSegundoNombre.setText("");
                tfApellidoPat.setText("");
                tfApellidoMat.setText("");
                tfTelefono.setText("");
                tfCorreo.setText("");
                tfClave.setText("");
                jcbCargo.setSelectedItem("-- Seleccione --");
                jcbEstado.setSelectedItem("-- Seleccione --");
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al agregar el funcionario",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Modificar
    private void funcionModificar(){
        try{
            if("".equals(tfRut.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el RUT del funcionario desde la tabla</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfRut.requestFocus();
            }else if("".equals(tfTelefono.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el teléfono del funcionario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfTelefono.requestFocus();
            }else if("-- Seleccione --".equals(jcbCargo.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el cargo del funcionario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbCargo.requestFocus();
            }else if("".equals(tfClave.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese la contraseña para el ingreso del funcionario al sistema</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfClave.requestFocus();
            }else if("-- Seleccione --".equals(jcbEstado.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el estado del funcionario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbEstado.requestFocus();
            }else if("".equals(tfCorreo.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el correo institucional del funcionario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfCorreo.requestFocus();
            }else{
                //Modificar funcionario
                String ModificarFu;
                String Correo = tfCorreo.getText()+lblDominio.getText();
                ModificarFu = "UPDATE funcionarios SET "
                        + "CorreoFu = '"+ Correo +"', "
                        + "TelefonoFu = '"+ tfTelefono.getText() +"', "
                        + "CargoFu = '"+ lblCodigoCargo.getText() +"' "
                        + "WHERE RutFu = '"+ tfRut.getText() +"'";
                Statement stUpdateFu = miConexion.con.createStatement();
                stUpdateFu.executeUpdate(ModificarFu);
                //Modificar usuario
                String ModificarUs;
                ModificarUs = "UPDATE usuarios SET "
                        + "ClaveUs = '"+ tfClave.getText() +"', "
                        + "EstadoUs = '"+ lblCodigoEstado.getText() +"' "
                        + "WHERE UsuarioUs = '"+ tfRut.getText() +"'";
                Statement stUpdateUs = miConexion.con.createStatement();
                stUpdateUs.executeUpdate(ModificarUs);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Los datos del funcionario fueron modificados exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfRut.setText("");
                tfPrimerNombre.setText("");
                tfSegundoNombre.setText("");
                tfApellidoPat.setText("");
                tfApellidoMat.setText("");
                tfTelefono.setText("");
                tfCorreo.setText("");
                tfClave.setText("");
                jcbCargo.setSelectedItem("-- Seleccione --");
                jcbEstado.setSelectedItem("-- Seleccione --");
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al modificar los datos del funcionario",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Eliminar
    private void funcionEliminar(){
        try{
            if("".equals(tfRut.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el RUT del funcionario desde la tabla</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfRut.requestFocus();
            }else{
                //Desactivar usuario
                String EliminarUs;
                EliminarUs = "UPDATE usuarios SET EstadoUs = '2' "
                        + "WHERE UsuarioUs = '"+ tfRut.getText() +"'";
                Statement stDeleteUs = miConexion.con.createStatement();
                stDeleteUs.executeUpdate(EliminarUs);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">El funcionario fue desactivado correctamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfRut.setText("");
                tfPrimerNombre.setText("");
                tfSegundoNombre.setText("");
                tfApellidoPat.setText("");
                tfApellidoMat.setText("");
                tfTelefono.setText("");
                tfCorreo.setText("");
                tfClave.setText("");
                jcbCargo.setSelectedItem("-- Seleccione --");
                jcbEstado.setSelectedItem("-- Seleccione --");
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al eliminar los datos del funcionario",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //funcion guardar
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

    private void tfRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRutKeyReleased
        try{
            if(!"".equals(tfRut.getText())){
                tfRut.setText(tfRut.getText().toUpperCase());
                tfRut.setText(Rut.formatear(tfRut.getText()));
            }else{
                //
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_tfRutKeyReleased

    private void tfBuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarNombreKeyReleased
        try{
            if(!"".equals(tfBuscarNombre.getText())){
                DefaultTableModel Tabla = new DefaultTableModel();
                this.jtDatos.setModel(Tabla);
                Tabla.addColumn("RUT");
                Tabla.addColumn("Nombre");
                Tabla.addColumn("Correo");
                Tabla.addColumn("Teléfono");       
                    String sSQL = "SELECT RutFu, CONCAT(PrimerNombreFu,' ',ApellidoPaternoFu), CorreoFu, TelefonoFu "
                        + "FROM funcionarios WHERE "
                        + "CONCAT(PrimerNombreFu,' ',SegundoNombreFu,' ',ApellidoPaternoFu,' ',ApellidoMaternoFu) LIKE '%"+ tfBuscarNombre.getText() +"%' "
                        + "ORDER BY CONCAT(PrimerNombreFu,' ',ApellidoPaternoFu) ASC";
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
    }//GEN-LAST:event_tfBuscarNombreKeyReleased

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
            java.util.logging.Logger.getLogger(jdFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdFuncionarios dialog = new jdFuncionarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddCargo;
    private javax.swing.ButtonGroup btnGroupFuncionarios;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JCheckBox jchbMostrar;
    private javax.swing.JRadioButton jrbtnAgregar;
    private javax.swing.JRadioButton jrbtnEliminar;
    private javax.swing.JRadioButton jrbtnModificar;
    private javax.swing.JTable jtDatos;
    private javax.swing.JLabel lblCodigoCargo;
    private javax.swing.JLabel lblCodigoEstado;
    private javax.swing.JLabel lblDominio;
    private javax.swing.JLabel lblEstadoUsuario;
    private javax.swing.JTextField tfApellidoMat;
    private javax.swing.JTextField tfApellidoPat;
    private javax.swing.JTextField tfBuscarNombre;
    private javax.swing.JPasswordField tfClave;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfPrimerNombre;
    private javax.swing.JTextField tfRut;
    private javax.swing.JTextField tfSegundoNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
