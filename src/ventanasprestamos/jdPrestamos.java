package ventanasprestamos;

import ventanasprestamos.jdBuscarPrestamo;
import ventanasmantenimiento.jdFuncionarios;
import ventanasmantenimiento.jdCursos;
import clases.CellRenderer;
import clases.DataConnection;
import clases.Rut;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import correos.correoPrestamos;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
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
//libreria JAVAMAIL 1.4.7
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import pdf.pdfPrestamos;
import ventanasinsumos.jdAgregarInsumo;
import ventanasinsumos.jdInsumos;

/**
 *
 * @author "Víctor Sandoval Millar"
 */
public class jdPrestamos extends javax.swing.JDialog {

    DataConnection miConexion;
    pdfPrestamos miPrestamo;
    
    public jdPrestamos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblFecha.setVisible(false);
        lblHora.setVisible(false);
        lblCodigoCurso.setText("");
        lblCodigoCurso.setVisible(false);
        tfRutFuncionarioPr.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcbCurso = new javax.swing.JComboBox<>();
        btnAddCurso = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfCodigoInsumo = new javax.swing.JTextField();
        btnAddInsumo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarFuncionario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObservacionPrestamo = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfDetalleInsumo = new javax.swing.JTextField();
        btnGenerarPdf = new javax.swing.JButton();
        tfRutFuncionarioPr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfNombreFuncionario = new javax.swing.JTextField();
        btnAddFuncionario = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tfCodigoPrestamo = new javax.swing.JTextField();
        lblCodigoCurso = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnEnviarCorreo = new javax.swing.JButton();
        btnBuscarInsumo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Préstamo de Insumos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
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
        jLabel3.setText("Seleccione curso:");

        jcbCurso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCursoActionPerformed(evt);
            }
        });

        btnAddCurso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAddCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCursoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Código del insumo:");

        tfCodigoInsumo.setEditable(false);
        tfCodigoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfCodigoInsumo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodigoInsumoFocusLost(evt);
            }
        });
        tfCodigoInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoInsumoActionPerformed(evt);
            }
        });

        btnAddInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAddInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInsumoActionPerformed(evt);
            }
        });

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

        txaObservacionPrestamo.setColumns(20);
        txaObservacionPrestamo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txaObservacionPrestamo.setLineWrap(true);
        txaObservacionPrestamo.setRows(2);
        txaObservacionPrestamo.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txaObservacionPrestamo);

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar2.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Detalle del insumo:");

        tfDetalleInsumo.setEditable(false);
        tfDetalleInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnGenerarPdf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGenerarPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btnGenerarPdf.setText("PDF");
        btnGenerarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPdfActionPerformed(evt);
            }
        });

        tfRutFuncionarioPr.setEditable(false);
        tfRutFuncionarioPr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfRutFuncionarioPr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfRutFuncionarioPrFocusLost(evt);
            }
        });
        tfRutFuncionarioPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRutFuncionarioPrActionPerformed(evt);
            }
        });
        tfRutFuncionarioPr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfRutFuncionarioPrKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Nombre del funcionario:");

        tfNombreFuncionario.setEditable(false);
        tfNombreFuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnAddFuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAddFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFuncionarioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("ID Préstamo:");

        tfCodigoPrestamo.setEditable(false);
        tfCodigoPrestamo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblCodigoCurso.setText("jLabel1");

        lblHora.setText("00:00:00");

        lblFecha.setText("00-00-0000");

        btnLimpiar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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
                "Insumo", "Descripcion"
            }
        ));
        jtDatos.setRowHeight(25);
        jtDatos.setRowSelectionAllowed(false);
        jtDatos.getTableHeader().setResizingAllowed(false);
        jtDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtDatos);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Detalle del préstamo:");

        btnEnviarCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEnviarCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/email_go.png"))); // NOI18N
        btnEnviarCorreo.setText("Correo");
        btnEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCorreoActionPerformed(evt);
            }
        });

        btnBuscarInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBuscarInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInsumoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDetalleInsumo)
                    .addComponent(tfNombreFuncionario)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnviarCorreo)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfRutFuncionarioPr, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(tfCodigoPrestamo))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(lblCodigoCurso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblHora)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscarFuncionario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddFuncionario))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jcbCurso, 0, 240, Short.MAX_VALUE)
                                    .addComponent(tfCodigoInsumo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddCurso)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnBuscarInsumo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddInsumo)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHora)
                            .addComponent(lblFecha))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfRutFuncionarioPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNombreFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(btnAddCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfCodigoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnBuscarInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(47, 47, 47)))
                                .addComponent(tfDetalleInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(btnAddInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar)
                            .addComponent(btnEnviarCorreo)
                            .addComponent(btnGenerarPdf)))
                    .addComponent(jScrollPane2))
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

    public boolean corriendo = false;
    String formato = "HH:mm:ss";
    Thread hilo = new Thread() {

        @Override
        public void run() {/*Implementamos el metodo abstracto run*/
            while (true) {/*Ciclo infinito para que siempre se actualice la hora*/
                DateFormat D_Formato = new SimpleDateFormat(formato);/*Crear e inicializar variable tipo DateFormat*/
                java.util.Date date = new java.util.Date();/*Crear e inicializar variable tipo Date*/
                //tfHora.setHorizontalAlignment(SwingConstants.CENTER);
                lblHora.setText(D_Formato.format(date)+"  ");
                //Mostrar Fecha
                Calendar Cal = Calendar.getInstance();
                DecimalFormat df = new DecimalFormat("00");
                int dia  = Cal.get(Calendar.DATE);
                int mes  = Cal.get((Calendar.MONTH))+1;
                int anio = Cal.get(Calendar.YEAR);
                lblFecha.setText(anio+"-"+df.format(mes)+"-"+df.format(dia)+"  ");
                try {
                    Thread.sleep(1000);/*El hilo duerme 1000 miliseg, es decir 1 seg*/
                } catch (InterruptedException ex) {/*Excepciones*/
                    Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }/*Fin de Excepciones*/
            }/*Fin del Ciclo*/
        }/*Fin de metodo run*/
    };
    
    //Cargar cursos
    private void funcionCargarCursos(){
        try{
            String Curso;//Se declara una variable tipo String
            Curso = "SELECT CursoCu FROM cursos ORDER BY CursoCu ASC";//Crear consulta SQL
            Statement stCurso = miConexion.con.createStatement();
            ResultSet rsCurso = stCurso.executeQuery(Curso);
            while(rsCurso.next()){
                jcbCurso.addItem(rsCurso.getString("CursoCu"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar los cursos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Recibir rut
    public void setText(String Funcionario){
        tfRutFuncionarioPr.setText(Funcionario);
    }
    
    //Recibir codigo insumo
    public void CodigoInsumo(String Codigo){
        tfCodigoInsumo.setText(Codigo);
    }
    
    //cargar codigo prestamos
    private void funcionCodigoPrestamo(){
        try{
            String Codigo;
            Codigo = "SELECT MAX(CodigoPr) FROM prestamos LIMIT 1";
            Statement st = miConexion.con.createStatement();
            ResultSet rs = st.executeQuery(Codigo);
            if(rs.next() == true){
                String sCodigo = rs.getString("MAX(CodigoPr)");
                int iCodigo = Integer.parseInt(sCodigo);
                int mas_uno_Codigo = iCodigo + 1;
                tfCodigoPrestamo.setText(String.valueOf(mas_uno_Codigo));
            }else{
                tfCodigoPrestamo.setText("20180001");
            }
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar el ID",JOptionPane.ERROR_MESSAGE);
            System.out.println("No hay código para cargar");
            tfCodigoPrestamo.setText("20180001");
        }
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
            //Ancho de la tabla 500
            //Se asigna el ancho que tendra cada columna
            int[] 
            anchos = {
                200, //CAMPO1 
                400, //CAMPO2                                   
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
                            + "AND (pre.CodigoPr=det.CodigoPrestamoDe) AND pre.CodigoPr = '"+ tfCodigoPrestamo.getText() +"'";
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
        hilo.start();
        corriendo = true;
        funcionCrearModeloTabla();
        funcionCodigoPrestamo();
        funcionCargarCursos();        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        funcionCodigoPrestamo();
    }//GEN-LAST:event_formWindowClosing

    private void tfRutFuncionarioPrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRutFuncionarioPrKeyReleased
        try{
            if(!"".equals(tfRutFuncionarioPr.getText())){
                tfRutFuncionarioPr.setText(tfRutFuncionarioPr.getText().toUpperCase());
                tfRutFuncionarioPr.setText(Rut.formatear(tfRutFuncionarioPr.getText()));
            }else{
                //
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_tfRutFuncionarioPrKeyReleased

    private void btnBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFuncionarioActionPerformed
        jdBuscarFuncionario miBuscar = new jdBuscarFuncionario(new jfPrincipal(),true);
        miBuscar.setLocationRelativeTo(this);
        miBuscar.setVisible(true);
        this.tfRutFuncionarioPr.setText(miBuscar.lblRutFuncionario.getText());
        funcionCargarNombre();
        jcbCurso.requestFocus();
    }//GEN-LAST:event_btnBuscarFuncionarioActionPerformed

    private void btnAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFuncionarioActionPerformed
        jdFuncionarios miFuncionario = new jdFuncionarios(new jfPrincipal(),true);
        miFuncionario.setLocationRelativeTo(this);
        miFuncionario.setVisible(true);
    }//GEN-LAST:event_btnAddFuncionarioActionPerformed

    private void btnAddCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCursoActionPerformed
        jdCursos miCurso = new jdCursos(new jfPrincipal(), true);
        miCurso.setLocationRelativeTo(this);
        miCurso.setVisible(true);
        jcbCurso.removeAllItems();
        jcbCurso.addItem("-- Seleccione --");
        funcionCargarCursos();
    }//GEN-LAST:event_btnAddCursoActionPerformed

    private void btnAddInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInsumoActionPerformed
        jdAgregarInsumo miInsumo = new jdAgregarInsumo(new jfPrincipal(),true);
        miInsumo.setLocationRelativeTo(this);
        miInsumo.setVisible(true);
    }//GEN-LAST:event_btnAddInsumoActionPerformed

    //cargar codigo cargo
    private void funcionCargarCodigoCurso(){
        try{
            if(!"-- Seleccione --".equals(jcbCurso.getSelectedItem())){
                String sql = "SELECT CodigoCu FROM cursos "
                           + "WHERE CursoCu = '"+ jcbCurso.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoCurso.setText(rs.getString("CodigoCu"));
                }else{
                    //
                } 
            }else{
                lblCodigoCurso.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void jcbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCursoActionPerformed
        funcionCargarCodigoCurso();
    }//GEN-LAST:event_jcbCursoActionPerformed

    //Cargar nombre del funcionario
    private void funcionCargarNombre(){
        try{
            if(!"".equals(tfRutFuncionarioPr.getText())){
                String Nombre;
                Nombre = "SELECT CONCAT(PrimerNombreFu,' ',SegundoNombreFu,' ',ApellidoPaternoFu,' ',ApellidoMaternoFu) AS Nombre "
                        + "FROM funcionarios WHERE RutFu = '"+ tfRutFuncionarioPr.getText() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(Nombre);
                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">El funcionario no se encuentra registrado</div></html>", //Mensaje
                            "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    tfNombreFuncionario.setText("");
                    tfRutFuncionarioPr.requestFocus();
                }else{
                    tfNombreFuncionario.setText(rs.getString("Nombre"));
                }
            }else{
                //
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar el nombre del funcionario",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void tfRutFuncionarioPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRutFuncionarioPrActionPerformed
        funcionCargarNombre();
    }//GEN-LAST:event_tfRutFuncionarioPrActionPerformed

    private void tfRutFuncionarioPrFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfRutFuncionarioPrFocusLost
        try{
            if(!"".equals(tfNombreFuncionario.getText())){
                //
            }else{
                if("".equals(tfRutFuncionarioPr.getText())){
                    //
                }else{
                    funcionCargarNombre();
                }                
            }
        }catch(Exception ex){
           JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE); 
        }        
    }//GEN-LAST:event_tfRutFuncionarioPrFocusLost

    //Cargar nombre del funcionario
    private void funcionCargarInsumo(){
        try{
            if(!"".equals(tfCodigoInsumo.getText())){
                String Nombre;
                Nombre = "SELECT CONCAT('Tipo: ',ti.TipoInsumoTi,'   Marca: ',ma.MarcaMa,'   Modelo: ', mo.ModeloMo) AS Detalle "
                        + "FROM insumos as ins, tiposinsumos as ti, marcasinsumos as ma, modelosinsumos as mo "
                        + "WHERE (ins.TipoInsumoIn=ti.CodigoTi) AND (ins.MarcaIn=ma.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) "
                        + "AND ins.CodigoIn = '"+ tfCodigoInsumo.getText() +"' AND ins.EstadoIn = '1'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(Nombre);
                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">El insumo no se encuentra registrado o fue dado de baja</div></html>", //Mensaje
                            "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    tfDetalleInsumo.setText("");
                    tfCodigoInsumo.requestFocus();
                }else{
                    tfDetalleInsumo.setText(rs.getString("Detalle"));
                }
            }else{
                //
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar el nombre del funcionario",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void tfCodigoInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoInsumoActionPerformed
        funcionCargarInsumo();
        txaObservacionPrestamo.requestFocus();
    }//GEN-LAST:event_tfCodigoInsumoActionPerformed

    private void tfCodigoInsumoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodigoInsumoFocusLost
        try{
            if(!"".equals(tfDetalleInsumo.getText())){
                //
            }else{
                if("".equals(tfCodigoInsumo.getText())){
                    //
                }else{
                    funcionCargarInsumo();
                }               
            }
        }catch(Exception ex){
           JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_tfCodigoInsumoFocusLost

    //Agregar prestamo
    private void funcionAgregarPrestamo(){
        try{
            if("".equals(tfRutFuncionarioPr.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el RUT del usuario</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                tfRutFuncionarioPr.requestFocus();
            }else if("-- Seleccione --".equals(jcbCurso.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor seleccione el curso</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbCurso.requestFocus();
            }else if("".equals(tfCodigoInsumo.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Por favor ingrese el código del insumo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbCurso.requestFocus();
            }else{
                //Comprobar que exista el funcionario
                String Funcionario;
                Funcionario = "SELECT RutFu FROM funcionarios WHERE RutFu = '"+ tfRutFuncionarioPr.getText() +"' LIMIT 1";
                Statement stFun = miConexion.con.createStatement();
                ResultSet rsFun = stFun.executeQuery(Funcionario);
                //Si existe el funcionario
                if(rsFun.next() == true){
                    //Comprobar que el insumo exista en la base de datos
                    String Insumo;
                    Insumo = "SELECT CodigoIn FROM insumos WHERE CodigoIn = '"+ tfCodigoInsumo.getText() +"' LIMIT 1";
                    Statement stIns = miConexion.con.createStatement();
                    ResultSet rsIns = stIns.executeQuery(Insumo);
                    //Si existe el insumo
                    if(rsIns.next() == true){
                        //Comprobar que el insumo este disponible
                        String InsPrestado;
                        InsPrestado = "SELECT EntregadoDe, InsumoDe FROM detalleprestamos "
                                    + "WHERE InsumoDe = '"+ tfCodigoInsumo.getText() +"' AND EntregadoDe <> '1'";
                        Statement stPre = miConexion.con.createStatement();
                        ResultSet rsPre = stPre.executeQuery(InsPrestado);
                        //Si el insumo esta disponible
                        if(rsPre.next() == false){
                            //Comrobar que el codigo del prestamo exista en la base de datos
                            String ExistePre;
                            ExistePre = "SELECT CodigoPr FROM prestamos WHERE CodigoPr = '"+ tfCodigoPrestamo.getText() +"' LIMIT 1";
                            Statement stExPre = miConexion.con.createStatement();
                            ResultSet rsExPre = stExPre.executeQuery(ExistePre);
                            //Si el codigo del prestamo existe
                            if(rsExPre.next() == true){
                                //Comprobar que el funcionario es el mismo
                                String Mismo;
                                Mismo = "SELECT pre.CodigoPr, pre.FuncionarioPr FROM prestamos AS pre "
                                      + "WHERE pre.FuncionarioPr = '"+ tfRutFuncionarioPr.getText() +"' "
                                      + "AND pre.CodigoPr = '"+ tfCodigoPrestamo.getText() +"' LIMIT 1";
                                Statement stMismo = miConexion.con.createStatement();
                                ResultSet rsMismo = stMismo.executeQuery(Mismo);
                                //Si es el mismo funcionario
                                if(rsMismo.next() == true){                                    
                                    //Agregar más insumos al detalle
                                    String AgregarDetalle;
                                    AgregarDetalle = "INSERT INTO detalleprestamos VALUES("
                                                    + "NULL, "
                                                    + "'"+ tfCodigoPrestamo.getText() +"', "
                                                    + "'"+ tfCodigoInsumo.getText() +"', "
                                                    + "NULL, "
                                                    + "NULL, "
                                                    + "'2')";
                                    Statement stAddDetalle = miConexion.con.createStatement();
                                    stAddDetalle.executeUpdate(AgregarDetalle);
                                    //Actualizar la observacion
                                    if("".equals(txaObservacionPrestamo.getText())){
                                        String UpObservacion1;
                                        UpObservacion1 = "UPDATE prestamos SET "
                                                + "ObservacionPr = 'Sin observaciones.' "
                                                + "WHERE CodigoPr = '"+ tfCodigoPrestamo.getText() +"'";
                                        Statement stUp1 = miConexion.con.createStatement();
                                        stUp1.executeUpdate(UpObservacion1);
                                        txaObservacionPrestamo.setText("Sin observaciones.");
                                    }else{
                                        String UpObservacion2;
                                        UpObservacion2 = "UPDATE prestamos SET "
                                                + "ObservacionPr = '"+ txaObservacionPrestamo.getText() +"' "
                                                + "WHERE CodigoPr = '"+ tfCodigoPrestamo.getText() +"'";
                                        Statement stUp2 = miConexion.con.createStatement();
                                        stUp2.executeUpdate(UpObservacion2);
                                    }
                                    JOptionPane.showMessageDialog(this, 
                                                    "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                                            +   "font-size:12px}</style>"
                                            +   "<div align=\"center\">El insumo fue añadido al préstamo exitosamente</div></html>", //Mensaje
                                                    "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                                    funcionCrearModeloTabla();
                                    tfCodigoInsumo.setText("");
                                    tfDetalleInsumo.setText("");
                                    tfCodigoInsumo.requestFocus();
                                }
                                //Si no es el mismo funcionario
                                else{
                                    //Cargar nuevo codigo de prestamo
                                    funcionCodigoPrestamo();
                                    //Agregar información
                                    String AgregarPrestamo;
                                    AgregarPrestamo = "INSERT INTO prestamos VALUES("
                                                    + "NULL, "
                                                    + "'"+ lblCodigoCurso.getText() +"', "
                                                    + "'"+ tfRutFuncionarioPr.getText() +"', "
                                                    + "'"+ txaObservacionPrestamo.getText() +"', "
                                                    + "'"+ lblFecha.getText() +"', "
                                                    + "'"+ lblHora.getText() +"',"
                                                    + "'2')";
                                    Statement stAddPrestamo = miConexion.con.createStatement();
                                    stAddPrestamo.executeUpdate(AgregarPrestamo);
                                    //Actualizar la observacion
                                    if("".equals(txaObservacionPrestamo.getText())){
                                        String UpObservacion1;
                                        UpObservacion1 = "UPDATE prestamos SET "
                                                + "ObservacionPr = 'Sin observaciones.' "
                                                + "WHERE CodigoPr = '"+ tfCodigoPrestamo.getText() +"'";
                                        Statement stUp1 = miConexion.con.createStatement();
                                        stUp1.executeUpdate(UpObservacion1);
                                        txaObservacionPrestamo.setText("Sin observaciones.");
                                    }else{
                                        String UpObservacion2;
                                        UpObservacion2 = "UPDATE prestamos SET "
                                                + "ObservacionPr = '"+ txaObservacionPrestamo.getText() +"' "
                                                + "WHERE CodigoPr = '"+ tfCodigoPrestamo.getText() +"'";
                                        Statement stUp2 = miConexion.con.createStatement();
                                        stUp2.executeUpdate(UpObservacion2);
                                    }
                                    //Agregar detalle de prestamo
                                    String AgregarDetalle;
                                    AgregarDetalle = "INSERT INTO detalleprestamos VALUES("
                                                    + "NULL, "
                                                    + "'"+ tfCodigoPrestamo.getText() +"', "
                                                    + "'"+ tfCodigoInsumo.getText() +"', "
                                                    + "NULL, "
                                                    + "NULL, "
                                                    + "'2')";
                                    Statement stAddDetalle = miConexion.con.createStatement();
                                    stAddDetalle.executeUpdate(AgregarDetalle);
                                    JOptionPane.showMessageDialog(this, 
                                                    "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                                            +   "font-size:12px}</style>"
                                            +   "<div align=\"center\">El prestamo se registró exitosamente</div></html>", //Mensaje
                                                    "Mensaje de información", JOptionPane.INFORMATION_MESSAGE); 
                                    funcionCrearModeloTabla();
                                    tfCodigoInsumo.setText("");
                                    tfDetalleInsumo.setText("");
                                    tfCodigoInsumo.requestFocus();
                                }
                            }
                            //Si el codigo del prestamo no existe                           
                            else{
                                //Agregar información
                                String AgregarPrestamo;
				AgregarPrestamo = "INSERT INTO prestamos VALUES("
						+ "NULL, "
						+ "'"+ lblCodigoCurso.getText() +"', "
						+ "'"+ tfRutFuncionarioPr.getText() +"', "
						+ "'"+ txaObservacionPrestamo.getText() +"', "
						+ "'"+ lblFecha.getText() +"', "
						+ "'"+ lblHora.getText() +"',"
                                                + "'2')";
				Statement stAddPrestamo = miConexion.con.createStatement();
				stAddPrestamo.executeUpdate(AgregarPrestamo);
                                //Actualizar la observacion
                                if("".equals(txaObservacionPrestamo.getText())){
                                    String UpObservacion1;
                                    UpObservacion1 = "UPDATE prestamos SET "
                                            + "ObservacionPr = 'Sin observaciones.' "
                                            + "WHERE CodigoPr = '"+ tfCodigoPrestamo.getText() +"'";
                                    Statement stUp1 = miConexion.con.createStatement();
                                    stUp1.executeUpdate(UpObservacion1);
                                    txaObservacionPrestamo.setText("Sin observaciones.");
                                }else{
                                    String UpObservacion2;
                                    UpObservacion2 = "UPDATE prestamos SET "
                                            + "ObservacionPr = '"+ txaObservacionPrestamo.getText() +"' "
                                            + "WHERE CodigoPr = '"+ tfCodigoPrestamo.getText() +"'";
                                    Statement stUp2 = miConexion.con.createStatement();
                                    stUp2.executeUpdate(UpObservacion2);
                                }
				//Agregar detalle de prestamo
				String AgregarDetalle;
				AgregarDetalle = "INSERT INTO detalleprestamos VALUES("
						+ "NULL, "
						+ "'"+ tfCodigoPrestamo.getText() +"', "
						+ "'"+ tfCodigoInsumo.getText() +"', "
						+ "NULL, "
						+ "NULL, "
						+ "'2')";
				Statement stAddDetalle = miConexion.con.createStatement();
				stAddDetalle.executeUpdate(AgregarDetalle);
				JOptionPane.showMessageDialog(this, 
						"<html><style>body{font-family:Arial, Helvetica, sans-serif;"
					+   "font-size:12px}</style>"
					+   "<div align=\"center\">El prestamo se registró exitosamente</div></html>", //Mensaje
						"Mensaje de información", JOptionPane.INFORMATION_MESSAGE); 
				funcionCrearModeloTabla();
                                tfCodigoInsumo.setText("");
                                tfDetalleInsumo.setText("");
                                tfCodigoInsumo.requestFocus();
                            }
                        }
                        //Si el insumo no esta disponible
                        else{
                            JOptionPane.showMessageDialog(this, 
					"<html><style>body{font-family:Arial, Helvetica, sans-serif;"
				+   "font-size:12px}</style>"
				+   "<div align=\"center\">No puede préstar este insumo, ya que aún no está registrado como devuelto</div></html>", //Mensaje
					"Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                            //Preguntar si desea devolverlo
                            int seleccion = JOptionPane.showOptionDialog(
                            null, // Componente padre
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                            + "font-size:12px}</style>"
                            + "<div align=\"center\">¿Desea registrar el insumo como devuelto?.</div></html>", //Mensaje
                            "Notificación", // Titulo del Mensaje
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,    // null para icono por defecto.
                            new Object[] { "Sí", "No"},    // null para YES, NO y CANCEL
                            "No");//Boton seleccionado por defecto
                                if (seleccion != -1){
                                    if((seleccion + 1)==1){
                                        //Accion a realizar al precionar "SI"
                                        //Enviar correo informando que el insumo fue devuelto
                                        if(!"".equals(tfCodigoInsumo.getText())){
                                            jdBuscarPrestamo miPrestamo = new jdBuscarPrestamo(new jfPrincipal(), true);
                                            miPrestamo.setLocationRelativeTo(null);
                                            miPrestamo.jrbtnFiltroRut.setSelected(false);
                                            miPrestamo.jrbtnFiltroCodigo.setSelected(true);
                                            miPrestamo.funcionRecibirCodigo(tfCodigoInsumo.getText());
                                            miPrestamo.setVisible(true);
                                        }else{
                                            JOptionPane.showMessageDialog(this, 
                                                    "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                                                +   "font-size:12px}</style>"
                                                +   "<div align=\"center\">No ha ingresado el código del insumo</div></html>", //Mensaje
                                                    "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                                            tfCodigoInsumo.requestFocus();
                                        }
                                    }else{
                                       //Accion a realizar al precionar "NO"
                                    }
                                }
                            tfCodigoInsumo.requestFocus();
                        }
                    }
                    //Si no existe el insumo
                    else{
                        JOptionPane.showMessageDialog(this, 
					"<html><style>body{font-family:Arial, Helvetica, sans-serif;"
				+   "font-size:12px}</style>"
				+   "<div align=\"center\">El insumo no se encuentra registrado en la base de datos</div></html>", //Mensaje
					"Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                        tfCodigoInsumo.selectAll();
                        tfCodigoInsumo.requestFocus();
                    }
                }
                //Si no existe el funcionario
                else{
                    JOptionPane.showMessageDialog(this, 
					"<html><style>body{font-family:Arial, Helvetica, sans-serif;"
				+   "font-size:12px}</style>"
				+   "<div align=\"center\">El funcionario no encuentra registrado en la base de datos</div></html>", //Mensaje
					"Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    tfRutFuncionarioPr.selectAll();
                    tfRutFuncionarioPr.requestFocus();
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al registrar el préstamo",JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        funcionAgregarPrestamo();               
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    private void btnGenerarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPdfActionPerformed
        String sFichero = System.getProperty("user.home") + "\\Desktop\\"+ tfCodigoPrestamo.getText() +"_prestamo.pdf";
        File Fichero = new File(sFichero);
        
        if(Fichero.exists() == false){        
            pdfPrestamos miPDF = new pdfPrestamos();
            miPDF.GenerarPDF_PrestamoInsumos(tfCodigoPrestamo.getText());
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
                        pdfPrestamos miPDF = new pdfPrestamos();
                        miPDF.GenerarPDF_PrestamoInsumos(tfCodigoPrestamo.getText());
                    }else{
                       //Accion a realizar al precionar "NO"
                    }
                }
        }
    }//GEN-LAST:event_btnGenerarPdfActionPerformed

    private void funcionLimpiar(){
        try{
            funcionCodigoPrestamo();
            funcionCrearModeloTabla();
            tfRutFuncionarioPr.setText("");
            tfNombreFuncionario.setText("");
            jcbCurso.setSelectedItem("-- Seleccione --");
            lblCodigoCurso.setText("");
            tfCodigoInsumo.setText("");
            tfDetalleInsumo.setText("");
            txaObservacionPrestamo.setText("");
            tfRutFuncionarioPr.requestFocus();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        funcionLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCorreoActionPerformed
        String sFichero = System.getProperty("user.home") + "\\Desktop\\"+ tfCodigoPrestamo.getText() +"_prestamo.pdf";
        File Fichero = new File(sFichero);
        
        if(Fichero.exists() == true){
            correoPrestamos miCorreo = new correoPrestamos();
            miCorreo.funcionEnviarCorreo(tfCodigoPrestamo.getText());
        }else{
            JOptionPane.showMessageDialog(this, 
                "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
            +   "font-size:12px}</style>"
            +   "<div align=\"center\">El correo no se enviará debido a que el documento no existe o fue removido del escritorio</div></html>", //Mensaje
                "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEnviarCorreoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        funcionCodigoPrestamo();
    }//GEN-LAST:event_formWindowClosed

    private void btnBuscarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInsumoActionPerformed
        jdBuscarInsumo miBuscar = new jdBuscarInsumo(new jfPrincipal(), true);
        miBuscar.setLocationRelativeTo(null);
        miBuscar.setVisible(true);
        this.tfCodigoInsumo.setText(miBuscar.lblCodigoInsumo.getText());
        funcionCargarInsumo();
        txaObservacionPrestamo.requestFocus();
    }//GEN-LAST:event_btnBuscarInsumoActionPerformed

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
            java.util.logging.Logger.getLogger(jdPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdPrestamos dialog = new jdPrestamos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddCurso;
    private javax.swing.JButton btnAddFuncionario;
    private javax.swing.JButton btnAddInsumo;
    private javax.swing.JButton btnBuscarFuncionario;
    private javax.swing.JButton btnBuscarInsumo;
    private javax.swing.JButton btnEnviarCorreo;
    private javax.swing.JButton btnGenerarPdf;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JTable jtDatos;
    private javax.swing.JLabel lblCodigoCurso;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTextField tfCodigoInsumo;
    public javax.swing.JTextField tfCodigoPrestamo;
    private javax.swing.JTextField tfDetalleInsumo;
    private javax.swing.JTextField tfNombreFuncionario;
    public javax.swing.JTextField tfRutFuncionarioPr;
    private javax.swing.JTextArea txaObservacionPrestamo;
    // End of variables declaration//GEN-END:variables
}
