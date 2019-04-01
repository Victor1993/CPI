package ventanasinsumos;

import clases.CellRenderer;
import clases.DataConnection;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import pdf.pdfTodosInsumos;
import principal.jfPrincipal;

public class jdBuscarInsumos extends javax.swing.JDialog {

    DataConnection miConexion;
    
    public jdBuscarInsumos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblCodigoInsumo.setVisible(false);
        jchbMostarBajas.setSelected(false);
        tfCodigoInsumo.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfchGuardarPDF = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfCodigoInsumo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        btnSeguimiento = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lblCodigoInsumo = new javax.swing.JLabel();
        jchbMostarBajas = new javax.swing.JCheckBox();
        btnListar = new javax.swing.JButton();

        jfchGuardarPDF.setCurrentDirectory(null);
        jfchGuardarPDF.setDialogTitle("Guardar PDF");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Búsqueda de Insumos");
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
        jLabel3.setText("Ingrese el código del insumo o parte de él:");

        tfCodigoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfCodigoInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCodigoInsumoKeyReleased(evt);
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

        btnSeguimiento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSeguimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_ficha.png"))); // NOI18N
        btnSeguimiento.setText("Seguimiento");
        btnSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguimientoActionPerformed(evt);
            }
        });

        btnBaja.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnBaja.setText("Dar de baja");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lblCodigoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jchbMostarBajas.setBackground(new java.awt.Color(255, 255, 255));
        jchbMostarBajas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jchbMostarBajas.setText("¿Mostrar insumos dados de baja?");
        jchbMostarBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchbMostarBajasActionPerformed(evt);
            }
        });

        btnListar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btnListar.setText("Generar PDF");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBaja)
                        .addGap(18, 18, 18)
                        .addComponent(btnSeguimiento))
                    .addComponent(tfCodigoInsumo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchbMostarBajas))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jchbMostarBajas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodigoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCodigoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSeguimiento)
                        .addComponent(btnBaja)
                        .addComponent(btnModificar))
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            Tabla.addColumn("Detalle");
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
            //Ancho de la tabla 711
            //Se asigna el ancho que tendra cada columna
            int[] 
            anchos = {
                300, //CAMPO1  
                411, //CAMPO2
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
            if(jchbMostarBajas.isSelected() == true){
                DefaultTableModel Tabla = new DefaultTableModel();
                this.jtDatos.setModel(Tabla);
                Tabla.addColumn("Codigo");
                Tabla.addColumn("Detalle");    
                    String sSQL = "SELECT ins.CodigoIn, CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                                + "FROM insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo "
                                + "WHERE (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) "
                                + "AND (ins.ModeloIn=mo.CodigoMo) AND ins.EstadoIn = '2'";
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
            }else{
                DefaultTableModel Tabla = new DefaultTableModel();
                this.jtDatos.setModel(Tabla);
                Tabla.addColumn("Codigo");
                Tabla.addColumn("Detalle");    
                    String sSQL = "SELECT ins.CodigoIn, CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                                + "FROM insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo "
                                + "WHERE (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) "
                                + "AND (ins.ModeloIn=mo.CodigoMo) AND ins.EstadoIn = '1'";
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
            }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
    }                                       

    private void funcionRescatarCodigo(){
        try{
            //Cargar Rut Recepcionista
            String Codigo = jtDatos.getValueAt(jtDatos.getSelectedRow(), 0).toString();
            lblCodigoInsumo.setText(Codigo);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }                                   
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        funcionCrearModeloTabla();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void funcionFiltrarInsumo(){
        try{
            if(jchbMostarBajas.isSelected() == true){
                if(!"".equals(tfCodigoInsumo.getText())){
                    DefaultTableModel Tabla = new DefaultTableModel();
                    this.jtDatos.setModel(Tabla);
                    Tabla.addColumn("Codigo");
                    Tabla.addColumn("Detalle");
                    String sSQL = "SELECT ins.CodigoIn, CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                    + "FROM insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo "
                    + "WHERE (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND ins.EstadoIn = '2' "
                    + "AND ins.CodigoIn LIKE '%"+ tfCodigoInsumo.getText() +"%'";
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
                }else{
                    funcionCrearModeloTabla();
                }                
            }else{
                if(!"".equals(tfCodigoInsumo.getText())){
                    DefaultTableModel Tabla = new DefaultTableModel();
                    this.jtDatos.setModel(Tabla);
                    Tabla.addColumn("Codigo");
                    Tabla.addColumn("Detalle");
                    String sSQL = "SELECT ins.CodigoIn, CONCAT(tip.TipoInsumoTi,' ',mar.MarcaMa,' ',mo.ModeloMo) "
                    + "FROM insumos AS ins, tiposinsumos AS tip, marcasinsumos AS mar, modelosinsumos AS mo "
                    + "WHERE (ins.TipoInsumoIn=tip.CodigoTi) AND (ins.MarcaIn=mar.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) AND ins.EstadoIn = '1' "
                    + "AND ins.CodigoIn LIKE '%"+ tfCodigoInsumo.getText() +"%'";
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
                }else{
                    funcionCrearModeloTabla();
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        }
    }
    
    private void tfCodigoInsumoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoInsumoKeyReleased
        funcionFiltrarInsumo();
    }//GEN-LAST:event_tfCodigoInsumoKeyReleased

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

    private void btnSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguimientoActionPerformed
        if(!"".equals(lblCodigoInsumo.getText())){
            jdSeguimientoInsumo miSeguimiento = new jdSeguimientoInsumo(new jfPrincipal(),true);
            miSeguimiento.setLocationRelativeTo(null);
            miSeguimiento.RecibirCodigo(lblCodigoInsumo.getText());
            miSeguimiento.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Debe seleccionar un insumo desde la tabla.</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSeguimientoActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        if(!"".equals(lblCodigoInsumo.getText())){
            jdDarBaja miBaja = new jdDarBaja(new jfPrincipal(),true);
            miBaja.setLocationRelativeTo(null);
            miBaja.RecibirCodigo(lblCodigoInsumo.getText());
            miBaja.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Debe seleccionar un insumo desde la tabla.</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(!"".equals(lblCodigoInsumo.getText())){
            jdModificarInsumo miModificar = new jdModificarInsumo(new jfPrincipal(),true);
            miModificar.setLocationRelativeTo(null);
            miModificar.RecibirCodigo(lblCodigoInsumo.getText());
            miModificar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Debe seleccionar un insumo desde la tabla.</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void funcionAccionCheck(){
        try{
            if(jchbMostarBajas.isSelected() == true){
                btnModificar.setEnabled(false);
                btnBaja.setEnabled(false);
                funcionCrearModeloTabla();
            }else{
                btnModificar.setEnabled(true);
                btnBaja.setEnabled(true);
                funcionCrearModeloTabla();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        }
    }
    
    private void jchbMostarBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchbMostarBajasActionPerformed
        funcionAccionCheck();
    }//GEN-LAST:event_jchbMostarBajasActionPerformed
    
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        String sFichero = System.getProperty("user.home") + "\\Desktop\\insumos_totales.pdf";
        File Fichero = new File(sFichero);

        if(Fichero.exists() == false){
            pdfTodosInsumos miPDF = new pdfTodosInsumos();
            miPDF.GenerarPDF_TodosLosInsumos();
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
                    pdfTodosInsumos miPDF = new pdfTodosInsumos();
                    miPDF.GenerarPDF_TodosLosInsumos();
                }else{
                    //Accion a realizar al precionar "NO"
                }
            }
        }
    }//GEN-LAST:event_btnListarActionPerformed

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
            java.util.logging.Logger.getLogger(jdBuscarInsumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdBuscarInsumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdBuscarInsumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdBuscarInsumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdBuscarInsumos dialog = new jdBuscarInsumos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSeguimiento;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jchbMostarBajas;
    private javax.swing.JFileChooser jfchGuardarPDF;
    private javax.swing.JTable jtDatos;
    private javax.swing.JLabel lblCodigoInsumo;
    private javax.swing.JTextField tfCodigoInsumo;
    // End of variables declaration//GEN-END:variables
}
