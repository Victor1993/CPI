package ventanasinsumos;

import ventanasmantenimiento.jdTipoInsumo;
import ventanasmantenimiento.jdModelos;
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
import java.text.DecimalFormat;

/**
 * @author "Víctor Sandoval Millar"
 */
public class jdInsumos extends javax.swing.JDialog {
    
    DataConnection miConexion;
    
    public jdInsumos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnAddInfo.setVisible(false);
        lblCodigoTipoInsumo.setVisible(false);
        lblCodigoTipoInsumo.setText("");
        lblCodigoMarca.setVisible(false);
        lblCodigoMarca.setText("");
        lblCodigoModelo.setVisible(false);
        lblCodigoModelo.setText("");
        lblCodigoTipoInsumo_Filtro.setVisible(false);
        lblCodigoTipoInsumo_Filtro.setText("");
        jrbtnEstadoActivo.setSelected(true);
        lblCodigoEstadoInsumo.setVisible(false);
        lblCodigoEstadoInsumo.setText("1");
        jrbtnFiltroEstadoActivo.setSelected(true);
        lblCodigoFiltroEstadoInsumo.setText("1");
        lblCodigoFiltroEstadoInsumo.setVisible(false);
        lblIndiqueEstado.setVisible(false);
        jrbtnEstadoActivo.setVisible(false);
        jrbtnEstadoInactivo.setVisible(false);
        funcionCargarTipo();
        funcionCargarMarca();
        funcionCargarModelo();
        funcionCargarTipo_Filtro();
        jtDatos.setEnabled(false);
        tfCodigoInsumo.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupInsumos = new javax.swing.ButtonGroup();
        btnGroupFiltro = new javax.swing.ButtonGroup();
        btnGroupEstadoInsumo = new javax.swing.ButtonGroup();
        btnGroupFiltroEstado = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfCodigoInsumo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jrbtnAgregar = new javax.swing.JRadioButton();
        jrbtnEliminar = new javax.swing.JRadioButton();
        jrbtnModificar = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcbMarca = new javax.swing.JComboBox<>();
        btnAddMarca = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jcbTipoInsumo = new javax.swing.JComboBox<>();
        btnAddTipoInsumo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jcbModelo = new javax.swing.JComboBox<>();
        btnAddModelo = new javax.swing.JButton();
        lblCodigoTipoInsumo = new javax.swing.JLabel();
        lblCodigoModelo = new javax.swing.JLabel();
        lblCodigoMarca = new javax.swing.JLabel();
        jrbtnFiltroTipo = new javax.swing.JRadioButton();
        jcbFiltroTipoInsumo = new javax.swing.JComboBox<>();
        jrbtnFiltroCodigo = new javax.swing.JRadioButton();
        jrbtnFiltroEstadoActivo = new javax.swing.JRadioButton();
        jrbtnFiltroEstadoInactivo = new javax.swing.JRadioButton();
        tfFiltroCodigoInsumo = new javax.swing.JTextField();
        lblTotalInsumos = new javax.swing.JLabel();
        lblCodigoTipoInsumo_Filtro = new javax.swing.JLabel();
        lblInformacion1 = new javax.swing.JLabel();
        lblInformacion2 = new javax.swing.JLabel();
        lblCoincidencias = new javax.swing.JLabel();
        lblInformacion4 = new javax.swing.JLabel();
        btnAddInfo = new javax.swing.JButton();
        lblIndiqueEstado = new javax.swing.JLabel();
        jrbtnEstadoActivo = new javax.swing.JRadioButton();
        jrbtnEstadoInactivo = new javax.swing.JRadioButton();
        lblCodigoEstadoInsumo = new javax.swing.JLabel();
        lblCodigoFiltroEstadoInsumo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenedor de la tabla insumos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tfCodigoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfCodigoInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoInsumoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese el código del insumo:");

        jrbtnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupInsumos.add(jrbtnAgregar);
        jrbtnAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnAgregar.setSelected(true);
        jrbtnAgregar.setText("Agregar insumo");
        jrbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnAgregarActionPerformed(evt);
            }
        });

        jrbtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupInsumos.add(jrbtnEliminar);
        jrbtnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnEliminar.setText("Dar de baja un insumo");
        jrbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnEliminarActionPerformed(evt);
            }
        });

        jrbtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupInsumos.add(jrbtnModificar);
        jrbtnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnModificar.setText("Modificar insumo");
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

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Seleccione el nombre de la marca:");

        jcbMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMarcaActionPerformed(evt);
            }
        });

        btnAddMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMarcaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Seleccione el tipo de insumo:");

        jcbTipoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbTipoInsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbTipoInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoInsumoActionPerformed(evt);
            }
        });

        btnAddTipoInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddTipoInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTipoInsumoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Seleccione el modelo del insumo:");

        jcbModelo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbModeloActionPerformed(evt);
            }
        });

        btnAddModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddModeloActionPerformed(evt);
            }
        });

        lblCodigoTipoInsumo.setText("la");

        lblCodigoModelo.setText("la");

        lblCodigoMarca.setText("la");

        jrbtnFiltroTipo.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFiltro.add(jrbtnFiltroTipo);
        jrbtnFiltroTipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnFiltroTipo.setSelected(true);
        jrbtnFiltroTipo.setText("Filtrar por tipo:");
        jrbtnFiltroTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnFiltroTipoActionPerformed(evt);
            }
        });

        jcbFiltroTipoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbFiltroTipoInsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Mostrar todo --" }));
        jcbFiltroTipoInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltroTipoInsumoActionPerformed(evt);
            }
        });

        jrbtnFiltroCodigo.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFiltro.add(jrbtnFiltroCodigo);
        jrbtnFiltroCodigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnFiltroCodigo.setText("Filtrar por código:");
        jrbtnFiltroCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnFiltroCodigoActionPerformed(evt);
            }
        });

        jrbtnFiltroEstadoActivo.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFiltroEstado.add(jrbtnFiltroEstadoActivo);
        jrbtnFiltroEstadoActivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnFiltroEstadoActivo.setSelected(true);
        jrbtnFiltroEstadoActivo.setText("Activo");
        jrbtnFiltroEstadoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnFiltroEstadoActivoActionPerformed(evt);
            }
        });

        jrbtnFiltroEstadoInactivo.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFiltroEstado.add(jrbtnFiltroEstadoInactivo);
        jrbtnFiltroEstadoInactivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnFiltroEstadoInactivo.setText("Inactivo");
        jrbtnFiltroEstadoInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnFiltroEstadoInactivoActionPerformed(evt);
            }
        });

        tfFiltroCodigoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfFiltroCodigoInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltroCodigoInsumoKeyReleased(evt);
            }
        });

        lblTotalInsumos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTotalInsumos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalInsumos.setText("0000");

        lblCodigoTipoInsumo_Filtro.setText("la");

        lblInformacion1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblInformacion1.setText("Se han encontrado");

        lblInformacion2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblInformacion2.setText("insumos.");

        lblCoincidencias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCoincidencias.setText("0000");

        lblInformacion4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblInformacion4.setText("coincidencias de un total de");

        btnAddInfo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAddInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddInfo.setText("Información");
        btnAddInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInfoActionPerformed(evt);
            }
        });

        lblIndiqueEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblIndiqueEstado.setText("Estado del insumo:");

        jrbtnEstadoActivo.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupEstadoInsumo.add(jrbtnEstadoActivo);
        jrbtnEstadoActivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnEstadoActivo.setSelected(true);
        jrbtnEstadoActivo.setText("Activo");
        jrbtnEstadoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnEstadoActivoActionPerformed(evt);
            }
        });

        jrbtnEstadoInactivo.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupEstadoInsumo.add(jrbtnEstadoInactivo);
        jrbtnEstadoInactivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jrbtnEstadoInactivo.setText("Inactivo");
        jrbtnEstadoInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnEstadoInactivoActionPerformed(evt);
            }
        });

        lblCodigoEstadoInsumo.setText("la");

        lblCodigoFiltroEstadoInsumo.setText("la");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnAddInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jrbtnEstadoActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbtnEstadoInactivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblIndiqueEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jcbModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAddModelo))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jcbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAddMarca))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jcbTipoInsumo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAddTipoInsumo))
                                    .addComponent(tfCodigoInsumo)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbtnFiltroTipo)
                                    .addComponent(jcbFiltroTipoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfFiltroCodigoInsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbtnFiltroCodigo))
                                .addGap(40, 40, 40)
                                .addComponent(jrbtnFiltroEstadoActivo)
                                .addGap(18, 18, 18)
                                .addComponent(jrbtnFiltroEstadoInactivo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCodigoTipoInsumo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigoModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigoTipoInsumo_Filtro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigoMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigoEstadoInsumo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigoFiltroEstadoInsumo)
                                .addGap(108, 108, 108)
                                .addComponent(lblInformacion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCoincidencias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblInformacion4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalInsumos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblInformacion2)))
                        .addGap(1351, 1351, 1351))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jrbtnAgregar)
                        .addGap(262, 262, 262)
                        .addComponent(jrbtnModificar)
                        .addGap(211, 211, 211)
                        .addComponent(jrbtnEliminar)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jSeparator1)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jrbtnFiltroTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCodigoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbFiltroTipoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbtnFiltroEstadoActivo)
                            .addComponent(jrbtnFiltroEstadoInactivo)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jrbtnFiltroCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFiltroCodigoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddTipoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTipoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblIndiqueEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbtnEstadoActivo)
                            .addComponent(jrbtnEstadoInactivo))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(lblTotalInsumos)
                    .addComponent(lblInformacion1)
                    .addComponent(lblInformacion2)
                    .addComponent(lblCoincidencias)
                    .addComponent(lblInformacion4)
                    .addComponent(btnAddInfo)
                    .addComponent(lblCodigoTipoInsumo)
                    .addComponent(lblCodigoModelo)
                    .addComponent(lblCodigoTipoInsumo_Filtro)
                    .addComponent(lblCodigoMarca)
                    .addComponent(lblCodigoEstadoInsumo)
                    .addComponent(lblCodigoFiltroEstadoInsumo))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            Tabla.addColumn("Código");
            Tabla.addColumn("Tipo");
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
            jtDatos.getColumnModel().getColumn(3).setHeaderRenderer(new CellRenderer(new Color(0,0,102),new Color(255,255,255)));//CAMPO4
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void funcionAnchoColumnasTablaDatos(){
        try{
            //Ancho de la tabla 700
            //Se asigna el ancho que tendra cada columna
            int[] 
            anchos = {
                200, //CAMPO1 
                180, //CAMPO2
                150, //CAMPO3
                170, //CAMPO4
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
            Tabla.addColumn("Código");
            Tabla.addColumn("Tipo");
            Tabla.addColumn("Marca");
            Tabla.addColumn("Modelo");      
                String sSQL = "SELECT ins.CodigoIn, ti.TipoInsumoTi, ma.MarcaMa, mo.ModeloMo "
                        + "FROM insumos as ins, marcasinsumos as ma, modelosinsumos as mo, tiposinsumos as ti "
                        + "WHERE (ins.TipoInsumoIn=ti.CodigoTi) AND (ins.MarcaIn=ma.CodigoMa) "
                        + "AND (ins.ModeloIn=mo.CodigoMo) AND ins.EstadoIn = '"+ lblCodigoFiltroEstadoInsumo.getText() +"' ORDER BY ins.CodigoIn ASC";
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
    
    //Funcion cargar tipos de productos
    private void funcionCargarTipo_Filtro(){
        try{
            String TipoFiltro;//Se declara una variable tipo String
            TipoFiltro = "SELECT TipoInsumoTi FROM tiposinsumos ORDER BY TipoInsumoTi ASC";//Crear consulta SQL
            Statement stTipoFiltro = miConexion.con.createStatement();
            ResultSet rsTipoFiltro = stTipoFiltro.executeQuery(TipoFiltro);
            while(rsTipoFiltro.next()){
                jcbFiltroTipoInsumo.addItem(rsTipoFiltro.getString("TipoInsumoTi"));
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
    
    //Contar registros
    private void funcionContarRegistros(){
        try{
            String sqlContar;
            sqlContar = "SELECT COUNT(*) FROM insumos";
            Statement stContar = miConexion.con.createStatement();
            ResultSet rsContar = stContar.executeQuery(sqlContar);
            if(rsContar.next() == true){
                DecimalFormat dfTipo = new DecimalFormat("0000");
                int Contador = Integer.parseInt(rsContar.getString("COUNT(*)"));
                lblTotalInsumos.setText(dfTipo.format(Contador));
            }else{
                lblTotalInsumos.setText("0000");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        funcionCrearModeloTabla();
        funcionAccionFiltro();
        funcionContarRegistros();
        funcionContarCoincidencias();
    }//GEN-LAST:event_formWindowOpened

    //Agregar
    private void funcionAgregar(){
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
                String Agregar;
                Agregar = "INSERT INTO insumos VALUES("
                        + "'"+ tfCodigoInsumo.getText() +"', "
                        + "'"+ lblCodigoTipoInsumo.getText() +"', "
                        + "'"+ lblCodigoMarca.getText() +"', "
                        + "'"+ lblCodigoModelo.getText() +"', "
                        + "'1')";
                Statement stAdd = miConexion.con.createStatement();
                stAdd.executeUpdate(Agregar);
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">El insumo fue ingresado exitosamente</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                funcionContarRegistros();
                tfCodigoInsumo.selectAll();                
                tfCodigoInsumo.requestFocus();
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al agregar el insumo",JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
            }else{                
                String Modificar;
                Modificar = "UPDATE insumos SET "
                        + "TipoInsumoIn = '"+ lblCodigoTipoInsumo.getText() +"', "
                        + "MarcaIn = '"+ lblCodigoMarca.getText() +"', "
                        + "ModeloIn = '"+ lblCodigoModelo.getText() +"' "
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
                jcbTipoInsumo.setSelectedItem("-- Seleccione --");
                jcbMarca.setSelectedItem("-- Seleccione --");
                jcbModelo.setSelectedItem("-- Seleccione --");
                tfCodigoInsumo.setText("");
                tfCodigoInsumo.requestFocus();
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage(),"Error al modificar el insmumo",JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
                //Comprobar que no este en estado de prestamo
                String Consulta;
                Consulta = "SELECT InsumoDe, EntregadoDe FROM detalleprestamos WHERE InsumoDe = '"+ tfCodigoInsumo.getText() +"' AND EntregadoDe = '2'";
                Statement stConsulta = miConexion.con.createStatement();
                ResultSet rsConsulta = stConsulta.executeQuery(Consulta);
                if(rsConsulta.next() == false){
                    String DarBaja;
                    DarBaja = "UPDATE insumos SET EstadoIn = '2' "
                            + "WHERE CodigoIn = '"+ tfCodigoInsumo.getText() +"'";
                    Statement stBaja = miConexion.con.createStatement();
                    stBaja.executeUpdate(DarBaja);
                    JOptionPane.showMessageDialog(this, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">El insumo fue dado de baja exitosamente</div></html>", //Mensaje
                            "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    funcionContarRegistros();
                    lblCodigoModelo.setText("");
                    lblCodigoMarca.setText("");
                    lblCodigoTipoInsumo.setText("");
                    jcbTipoInsumo.setSelectedItem("-- Seleccione --");
                    jcbMarca.setSelectedItem("-- Seleccione --");
                    jcbModelo.setSelectedItem("-- Seleccione --");
                    tfCodigoInsumo.setText("");
                    tfCodigoInsumo.requestFocus();
                    funcionCrearModeloTabla();
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
    
    private void funcionGuardar(){
        try{
            if(jrbtnAgregar.isSelected()){
                funcionAgregar();
            }else if(jrbtnModificar.isSelected()){
                funcionModificar();
            }else if(jrbtnEliminar.isSelected()){
                funcionDardeBaja();
            }else{
                //Nada
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(), "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void tfCodigoInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoInsumoActionPerformed
        funcionGuardar();
    }//GEN-LAST:event_tfCodigoInsumoActionPerformed

    private void jrbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnAgregarActionPerformed
        try{
            jtDatos.setEnabled(false);
            tfCodigoInsumo.setEditable(true);
            tfCodigoInsumo.setText("");
            lblCodigoTipoInsumo.setText("");
            jcbTipoInsumo.setSelectedItem("-- Seleccione --");
            jcbTipoInsumo.setEnabled(true);
            lblCodigoMarca.setText("");
            jcbMarca.setSelectedItem("-- Seleccione --");
            jcbMarca.setEnabled(true);
            lblCodigoModelo.setText("");
            jcbModelo.setSelectedItem("-- Seleccione --");
            jcbModelo.setEnabled(true);
            btnAddTipoInsumo.setEnabled(true);
            btnAddMarca.setEnabled(true);
            btnAddModelo.setEnabled(true);
            btnAddInfo.setEnabled(true);
            //Botones estado visibilidad
            lblIndiqueEstado.setVisible(false);
            jrbtnEstadoActivo.setVisible(false);
            jrbtnEstadoInactivo.setVisible(false);
            //Comportamiento de los botones
            jrbtnEstadoActivo.setSelected(true);
            jrbtnEstadoInactivo.setSelected(false);            
            jrbtnEstadoActivo.setEnabled(true);
            jrbtnEstadoInactivo.setEnabled(true);
            jrbtnFiltroEstadoActivo.setSelected(true);
            jrbtnFiltroEstadoInactivo.setSelected(false);
            jrbtnFiltroEstadoActivo.setEnabled(true);
            jrbtnFiltroEstadoInactivo.setEnabled(true);
            lblCodigoEstadoInsumo.setText("1");
            lblCodigoFiltroEstadoInsumo.setText("1");
            funcionCrearModeloTabla();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnAgregarActionPerformed

    private void jrbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnEliminarActionPerformed
        try{
            jtDatos.setEnabled(true);
            tfCodigoInsumo.setEditable(false);
            tfCodigoInsumo.setText("");
            lblCodigoTipoInsumo.setText("");
            jcbTipoInsumo.setSelectedItem("-- Seleccione --");
            jcbTipoInsumo.setEnabled(false);
            lblCodigoMarca.setText("");
            jcbMarca.setSelectedItem("-- Seleccione --");
            jcbMarca.setEnabled(false);
            lblCodigoModelo.setText("");
            jcbModelo.setSelectedItem("-- Seleccione --");
            jcbModelo.setEnabled(false);
            btnAddTipoInsumo.setEnabled(false);
            btnAddMarca.setEnabled(false);
            btnAddModelo.setEnabled(false);
            btnAddInfo.setVisible(false);
            btnAddInfo.setEnabled(false);
            //Botones estado visibilidad
            lblIndiqueEstado.setVisible(true);
            jrbtnEstadoActivo.setVisible(true);
            jrbtnEstadoInactivo.setVisible(true);
            //Comportamiento de los botones
            jrbtnEstadoActivo.setSelected(false);
            jrbtnEstadoInactivo.setSelected(true);            
            jrbtnEstadoActivo.setEnabled(false);
            jrbtnEstadoInactivo.setEnabled(false);
            jrbtnFiltroEstadoActivo.setSelected(false);
            jrbtnFiltroEstadoInactivo.setSelected(true);
            jrbtnFiltroEstadoActivo.setEnabled(true);
            jrbtnFiltroEstadoInactivo.setEnabled(true);
            lblCodigoEstadoInsumo.setText("2");
            lblCodigoFiltroEstadoInsumo.setText("2");
            funcionCrearModeloTabla();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnEliminarActionPerformed

    private void jrbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnModificarActionPerformed
        try{
            jtDatos.setEnabled(true);
            tfCodigoInsumo.setEditable(false);
            tfCodigoInsumo.setText("");
            lblCodigoTipoInsumo.setText("");
            jcbTipoInsumo.setSelectedItem("-- Seleccione --");
            jcbTipoInsumo.setEnabled(true);
            lblCodigoMarca.setText("");
            jcbMarca.setSelectedItem("-- Seleccione --");
            jcbMarca.setEnabled(true);
            lblCodigoModelo.setText("");
            jcbModelo.setSelectedItem("-- Seleccione --");
            jcbModelo.setEnabled(true);
            btnAddTipoInsumo.setEnabled(true);
            btnAddMarca.setEnabled(true);
            btnAddModelo.setEnabled(true);
            btnAddInfo.setEnabled(true);
            //Botones estado visibilidad
            lblIndiqueEstado.setVisible(false);
            jrbtnEstadoActivo.setVisible(false);
            jrbtnEstadoInactivo.setVisible(false);
            //Comportamiento de los botones
            jrbtnEstadoActivo.setSelected(true);
            jrbtnEstadoInactivo.setSelected(false);            
            jrbtnEstadoActivo.setEnabled(true);
            jrbtnEstadoInactivo.setEnabled(true);
            jrbtnFiltroEstadoActivo.setSelected(true);
            jrbtnFiltroEstadoInactivo.setSelected(false);
            jrbtnFiltroEstadoActivo.setEnabled(true);
            jrbtnFiltroEstadoInactivo.setEnabled(true);
            lblCodigoEstadoInsumo.setText("1");
            lblCodigoFiltroEstadoInsumo.setText("1");
            funcionCrearModeloTabla();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jrbtnModificarActionPerformed

    private void jtDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosMouseClicked
        try{
            if(jtDatos.getRowCount() == 0 && jtDatos.getSelectedRow() == -1){
                System.out.println("No has seleccionado nada");
            }else if(jtDatos.getRowCount() != 0 && jtDatos.getSelectedRow() != -1){
                String CodigoIn = jtDatos.getValueAt(jtDatos.getSelectedRow(), 0).toString();
                tfCodigoInsumo.setText(CodigoIn);
                String TipoIn = jtDatos.getValueAt(jtDatos.getSelectedRow(), 1).toString();
                jcbTipoInsumo.setSelectedItem(TipoIn);
                String NombreMa = jtDatos.getValueAt(jtDatos.getSelectedRow(), 2).toString();
                jcbMarca.setSelectedItem(NombreMa);
                String NombreMo = jtDatos.getValueAt(jtDatos.getSelectedRow(), 3).toString();
                jcbModelo.setSelectedItem(NombreMo);
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
        jcbModelo.removeAllItems();;
        jcbModelo.addItem("-- Seleccione --");
        funcionCargarModelo();
        jcbModelo.requestFocus();
    }//GEN-LAST:event_jcbMarcaActionPerformed

    private void btnAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcaActionPerformed
        jdMarcas miMarca = new jdMarcas(new jfPrincipal(), true);
        miMarca.setLocationRelativeTo(this);
        miMarca.setVisible(true);
        jcbMarca.removeAllItems();
        jcbMarca.addItem("-- Seleccione --");
        funcionCargarMarca();
    }//GEN-LAST:event_btnAddMarcaActionPerformed

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

    private void btnAddTipoInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTipoInsumoActionPerformed
        jdTipoInsumo miTipoInsumo = new jdTipoInsumo(new jfPrincipal(), true);
        miTipoInsumo.setLocationRelativeTo(this);
        miTipoInsumo.setVisible(true);
        jcbTipoInsumo.removeAllItems();
        jcbTipoInsumo.addItem("-- Seleccione --");
        funcionCargarTipo();
    }//GEN-LAST:event_btnAddTipoInsumoActionPerformed
    
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
        btnGuardar.requestFocus();
    }//GEN-LAST:event_jcbModeloActionPerformed

    private void btnAddModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddModeloActionPerformed
        jdModelos miModelo = new jdModelos(new jfPrincipal(), true);
        miModelo.setLocationRelativeTo(this);
        miModelo.setVisible(true);
        jcbModelo.removeAllItems();
        jcbModelo.addItem("-- Seleccione --");
        funcionCargarModelo();
    }//GEN-LAST:event_btnAddModeloActionPerformed

    private void funcionAccionFiltro(){
        try{
            if(jrbtnFiltroTipo.isSelected()){
                jcbFiltroTipoInsumo.setEnabled(true);
                tfFiltroCodigoInsumo.setEditable(false);
                tfFiltroCodigoInsumo.setText("");
                lblCodigoTipoInsumo_Filtro.setText("");
                jcbFiltroTipoInsumo.requestFocus();
            }else if(jrbtnFiltroCodigo.isSelected()){
                jcbFiltroTipoInsumo.setEnabled(false);
                tfFiltroCodigoInsumo.setEditable(true);
                lblCodigoTipoInsumo_Filtro.setText("");
                jcbFiltroTipoInsumo.setSelectedItem("-- Mostrar todo --");
                tfFiltroCodigoInsumo.requestFocus();
            }else{
                //
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void jrbtnFiltroTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnFiltroTipoActionPerformed
        funcionAccionFiltro();
    }//GEN-LAST:event_jrbtnFiltroTipoActionPerformed

    private void funcionCargarCodigoTipo_Filtro(){
        try{
            if(!"-- Mostrar todo --".equals(jcbFiltroTipoInsumo.getSelectedItem())){
                String sql = "SELECT CodigoTi FROM tiposinsumos "
                        + "WHERE TipoInsumoTi = '"+ jcbFiltroTipoInsumo.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoTipoInsumo_Filtro.setText(rs.getString("CodigoTi"));
                }else{
                    //
                } 
            }else{
                lblCodigoTipoInsumo_Filtro.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    //Llenar tabla
    private void funcionFiltroInsumo(){
       try{
            //Cuando selecciono filtro por tipo de insumo
            if(jrbtnFiltroTipo.isSelected()){
                if(!"-- Mostrar todo --".equals(jcbFiltroTipoInsumo.getSelectedItem())){
                    DefaultTableModel Tabla = new DefaultTableModel();
                    this.jtDatos.setModel(Tabla);
                    Tabla.addColumn("Código");
                    Tabla.addColumn("Tipo");
                    Tabla.addColumn("Marca");
                    Tabla.addColumn("Modelo");      
                        String sSQL = "SELECT ins.CodigoIn, ti.TipoInsumoTi, ma.MarcaMa, mo.ModeloMo "
                                + "FROM insumos as ins, marcasinsumos as ma, modelosinsumos as mo, tiposinsumos as ti "
                                + "WHERE (ins.TipoInsumoIn=ti.CodigoTi) AND (ins.MarcaIn=ma.CodigoMa) "
                                + "AND (ins.ModeloIn=mo.CodigoMo) AND ti.CodigoTi = '"+ lblCodigoTipoInsumo_Filtro.getText() +"' "
                                + "AND EstadoIn = '"+ lblCodigoFiltroEstadoInsumo.getText() +"' ORDER BY ins.CodigoIn ASC";
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
                    lblCoincidencias.setText(lblTotalInsumos.getText());
                    funcionCrearModeloTabla();
                }
            //Cuando selecciono filtro por codigo de insumo
            }else if(jrbtnFiltroCodigo.isSelected()){
                if(!"".equals(tfFiltroCodigoInsumo.getText())){
                    DefaultTableModel Tabla = new DefaultTableModel();
                    this.jtDatos.setModel(Tabla);
                    Tabla.addColumn("Código");
                    Tabla.addColumn("Tipo");
                    Tabla.addColumn("Marca");
                    Tabla.addColumn("Modelo");      
                        String sSQL = "SELECT ins.CodigoIn, ti.TipoInsumoTi, ma.MarcaMa, mo.ModeloMo "
                                + "FROM insumos as ins, marcasinsumos as ma, modelosinsumos as mo, tiposinsumos as ti "
                                + "WHERE (ins.TipoInsumoIn=ti.CodigoTi) AND (ins.MarcaIn=ma.CodigoMa) "
                                + "AND (ins.ModeloIn=mo.CodigoMo) AND ins.CodigoIn LIKE '%"+ tfFiltroCodigoInsumo.getText() +"%' "
                                + "AND EstadoIn = '"+ lblCodigoFiltroEstadoInsumo.getText() +"' ORDER BY ti.TipoInsumoTi ASC";
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
                    lblCoincidencias.setText(lblTotalInsumos.getText());
                    funcionCrearModeloTabla();
                }
            }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
    }
    
    private void funcionContarCoincidencias(){
        try{
            //Cuando selecciono filtro por tipo de insumo
            if(jrbtnFiltroTipo.isSelected()){
                if(!"-- Mostrar todo --".equals(jcbFiltroTipoInsumo.getSelectedItem())){
                    String sqlContarTipo = "SELECT COUNT(*) FROM insumos WHERE TipoInsumoIn = '"+ lblCodigoTipoInsumo_Filtro.getText() +"' AND EstadoIn = '"+ lblCodigoFiltroEstadoInsumo.getText() +"'";
                    Statement stContarTipo = miConexion.con.createStatement();
                    ResultSet rsContarTipo = stContarTipo.executeQuery(sqlContarTipo);
                    if(rsContarTipo.next() == true){
                        DecimalFormat dfTipo = new DecimalFormat("0000");
                        int contador = Integer.parseInt(rsContarTipo.getString("COUNT(*)"));
                        lblCoincidencias.setText(dfTipo.format(contador));
                    }else{
                        lblCoincidencias.setText("0000");
                    }
                }else{
                    if("1".equals(lblCodigoFiltroEstadoInsumo.getText())){
                        lblCoincidencias.setText(lblTotalInsumos.getText());
                    }else{
                        lblCoincidencias.setText("0000");
                    }
                }
            }
            //Cuando selecciono filtro por codigo de insumo
            else if(jrbtnFiltroCodigo.isSelected()){
                if(!"".equals(tfFiltroCodigoInsumo.getText())){
                    String sqlContarTipo = "SELECT COUNT(*) FROM insumos WHERE CodigoIn LIKE '%"+ tfFiltroCodigoInsumo.getText() +"%' AND EstadoIn = '"+ lblCodigoFiltroEstadoInsumo.getText() +"'";
                    Statement stContarTipo = miConexion.con.createStatement();
                    ResultSet rsContarTipo = stContarTipo.executeQuery(sqlContarTipo);
                    if(rsContarTipo.next() == true){
                        DecimalFormat dfTipo = new DecimalFormat("0000");
                        int contador = Integer.parseInt(rsContarTipo.getString("COUNT(*)"));
                        lblCoincidencias.setText(dfTipo.format(contador));
                    }else{
                        lblCoincidencias.setText("0000");
                    }
                }else{
                    if("1".equals(lblCodigoFiltroEstadoInsumo.getText())){
                        lblCoincidencias.setText(lblTotalInsumos.getText());
                    }else{
                        lblCoincidencias.setText("0000");
                    }
                }
            }            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void jcbFiltroTipoInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltroTipoInsumoActionPerformed
        funcionCargarCodigoTipo_Filtro();
        funcionContarCoincidencias();
        funcionFiltroInsumo();
    }//GEN-LAST:event_jcbFiltroTipoInsumoActionPerformed

    private void jrbtnFiltroCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnFiltroCodigoActionPerformed
        funcionAccionFiltro();
    }//GEN-LAST:event_jrbtnFiltroCodigoActionPerformed

    private void tfFiltroCodigoInsumoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltroCodigoInsumoKeyReleased
        funcionContarCoincidencias();
        funcionFiltroInsumo();
    }//GEN-LAST:event_tfFiltroCodigoInsumoKeyReleased

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
    
    private void jrbtnEstadoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnEstadoActivoActionPerformed
        try{
            lblCodigoEstadoInsumo.setText("1");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jrbtnEstadoActivoActionPerformed

    private void jrbtnEstadoInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnEstadoInactivoActionPerformed
        try{
            lblCodigoEstadoInsumo.setText("2");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jrbtnEstadoInactivoActionPerformed

    private void jrbtnFiltroEstadoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnFiltroEstadoActivoActionPerformed
        try{
            lblCodigoFiltroEstadoInsumo.setText("1");
            funcionCrearModeloTabla();
            funcionContarCoincidencias();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jrbtnFiltroEstadoActivoActionPerformed

    private void jrbtnFiltroEstadoInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnFiltroEstadoInactivoActionPerformed
        try{
            lblCodigoFiltroEstadoInsumo.setText("2");
            funcionCrearModeloTabla();
            funcionContarCoincidencias();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jrbtnFiltroEstadoInactivoActionPerformed

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
            java.util.logging.Logger.getLogger(jdInsumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdInsumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdInsumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdInsumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdInsumos dialog = new jdInsumos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddMarca;
    private javax.swing.JButton btnAddModelo;
    private javax.swing.JButton btnAddTipoInsumo;
    private javax.swing.ButtonGroup btnGroupEstadoInsumo;
    private javax.swing.ButtonGroup btnGroupFiltro;
    private javax.swing.ButtonGroup btnGroupFiltroEstado;
    private javax.swing.ButtonGroup btnGroupInsumos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcbFiltroTipoInsumo;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JComboBox<String> jcbModelo;
    private javax.swing.JComboBox<String> jcbTipoInsumo;
    private javax.swing.JRadioButton jrbtnAgregar;
    private javax.swing.JRadioButton jrbtnEliminar;
    private javax.swing.JRadioButton jrbtnEstadoActivo;
    private javax.swing.JRadioButton jrbtnEstadoInactivo;
    private javax.swing.JRadioButton jrbtnFiltroCodigo;
    private javax.swing.JRadioButton jrbtnFiltroEstadoActivo;
    private javax.swing.JRadioButton jrbtnFiltroEstadoInactivo;
    private javax.swing.JRadioButton jrbtnFiltroTipo;
    private javax.swing.JRadioButton jrbtnModificar;
    private javax.swing.JTable jtDatos;
    private javax.swing.JLabel lblCodigoEstadoInsumo;
    private javax.swing.JLabel lblCodigoFiltroEstadoInsumo;
    private javax.swing.JLabel lblCodigoMarca;
    private javax.swing.JLabel lblCodigoModelo;
    private javax.swing.JLabel lblCodigoTipoInsumo;
    private javax.swing.JLabel lblCodigoTipoInsumo_Filtro;
    private javax.swing.JLabel lblCoincidencias;
    private javax.swing.JLabel lblIndiqueEstado;
    private javax.swing.JLabel lblInformacion1;
    private javax.swing.JLabel lblInformacion2;
    private javax.swing.JLabel lblInformacion4;
    private javax.swing.JLabel lblTotalInsumos;
    private javax.swing.JTextField tfCodigoInsumo;
    private javax.swing.JTextField tfFiltroCodigoInsumo;
    // End of variables declaration//GEN-END:variables
}
