package ventanasinsumos;

import clases.CellRenderer;
import clases.DataConnection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class jdSeguimientoInsumo extends javax.swing.JDialog {

    DataConnection miConexion;
    
    public jdSeguimientoInsumo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblCodigoInsumo = new javax.swing.JLabel();
        lblDetalleInsumo = new javax.swing.JLabel();
        lblVecesPrestado = new javax.swing.JLabel();
        lblEstadoInsumo = new javax.swing.JLabel();
        btnGenerarPDF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seguimiento de insumos");
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

        lblCodigoInsumo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCodigoInsumo.setForeground(new java.awt.Color(0, 0, 102));
        lblCodigoInsumo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoInsumo.setText("00000000");

        lblDetalleInsumo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblDetalleInsumo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetalleInsumo.setText("-");
        lblDetalleInsumo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblVecesPrestado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblVecesPrestado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVecesPrestado.setText("-");
        lblVecesPrestado.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblEstadoInsumo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblEstadoInsumo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstadoInsumo.setText("-");
        lblEstadoInsumo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnGenerarPDF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btnGenerarPDF.setText("Generar PDF");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
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
        jScrollPane1.setViewportView(jtDatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                    .addComponent(lblVecesPrestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigoInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDetalleInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblEstadoInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarPDF)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigoInsumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDetalleInsumo)
                .addGap(18, 18, 18)
                .addComponent(lblVecesPrestado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerarPDF)
                    .addComponent(lblEstadoInsumo))
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

    public void RecibirCodigo(String Codigo){
        lblCodigoInsumo.setText(Codigo);
    }
    
    //Traer datos de insumo
    //Cargar nombre del funcionario
    private void funcionCargarInsumo(){
        try{
            if(!"".equals(lblCodigoInsumo.getText())){
                String Nombre;
                Nombre = "SELECT CONCAT(ti.TipoInsumoTi,' ',ma.MarcaMa,' ', mo.ModeloMo) AS Detalle "
                        + "FROM insumos as ins, tiposinsumos as ti, marcasinsumos as ma, modelosinsumos as mo "
                        + "WHERE (ins.TipoInsumoIn=ti.CodigoTi) AND (ins.MarcaIn=ma.CodigoMa) AND (ins.ModeloIn=mo.CodigoMo) "
                        + "AND ins.CodigoIn = '"+ lblCodigoInsumo.getText() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(Nombre);
                if(rs.next() == false){
                    this.dispose();
                }else{
                    lblDetalleInsumo.setText(rs.getString("Detalle"));
                }
            }else{
                //
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar el nombre del funcionario",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //contar cantidad de veces que se ha prestado
    private void funcionContar(){
        try{
            if(!"".equals(lblCodigoInsumo.getText())){
                String Nombre;
                Nombre = "SELECT COUNT(det.InsumoDe) FROM detalleprestamos det WHERE det.InsumoDe = '"+ lblCodigoInsumo.getText() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(Nombre);
                if(rs.next() == false){
                    this.dispose();
                }else{
                    //Si el insumo fue dado de baja
                    if(lblEstadoInsumo.getText().contains("DADO DE BAJA")){
                        String numero = rs.getString("COUNT(det.InsumoDe)");
                        int inumero = Integer.parseInt(numero);
                        if(inumero <= 0){
                            lblVecesPrestado.setText(" ");
                        }else if(inumero == 1){
                            lblVecesPrestado.setText("<html>"
                                +   "<div align=\"center\">Fue prestado <b>"+ numero +"</b> vez.</div></html>");
                        }else{
                            lblVecesPrestado.setText("<html>"
                                +   "<div align=\"center\">Fue prestado <b>"+ numero +"</b> veces.</div></html>");
                        }
                    }else{
                        String numero = rs.getString("COUNT(det.InsumoDe)");
                        int inumero = Integer.parseInt(numero);
                        if(inumero <= 0){
                            lblVecesPrestado.setText(" ");
                        }else if(inumero == 1){
                            lblVecesPrestado.setText("<html>"
                                +   "<div align=\"center\">Ha sido prestado <b>"+ numero +"</b> vez.</div></html>");
                        }else{
                            lblVecesPrestado.setText("<html>"
                                +   "<div align=\"center\">Ha sido prestado <b>"+ numero +"</b> veces.</div></html>");
                        }
                    }
                }
            }else{
                //
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar la información",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Consultar el estado del insumo
    private void funcionEstadoInsumo(){
        try{
            if(!"".equals(lblCodigoInsumo.getText())){
                //Comprobar que el insumo haya sido prestado a algún funcionario
                String Consulta;
                Consulta = "SELECT COUNT(*) FROM detalleprestamos det WHERE det.InsumoDe = '"+ lblCodigoInsumo.getText() +"'";
                Statement st1 = miConexion.con.createStatement();
                ResultSet rs1 = st1.executeQuery(Consulta);
                if(rs1.next() == true){
                    //Variable
                    int contador = rs1.getInt("COUNT(*)");                    
                    if(contador != 0){
                        String Estados;
                        Estados = "SELECT MAX(det.EntregadoDe), MAX(ins.EstadoIn), MAX(pre.TipoPrestamo) "
                                + "FROM prestamos pre, detalleprestamos det, insumos ins "
                                + "WHERE (det.InsumoDe=ins.CodigoIn) AND (det.CodigoPrestamoDe=pre.CodigoPr) AND "
                                + "det.InsumoDe = '"+ lblCodigoInsumo.getText() +"'";
                        Statement st = miConexion.con.createStatement();
                        ResultSet rs = st.executeQuery(Estados);
                        if(rs.next() == false){
                            lblEstadoInsumo.setText("<html><div align=\"center\"><span style='color:#E80A04'>"
                                    + "<b>Este insumo nunca ha sido préstado o asignado a algún funcionario</b></span></div></html>");
                        }else{            
                            //Recibir Strings
                            String EstadoPrestamo = rs.getString("MAX(det.EntregadoDe)");
                            String EstadoInsumo   = rs.getString("MAX(ins.EstadoIn)");
                            String TipoPrestamo   = rs.getString("MAX(pre.TipoPrestamo)");

                            if("1".equals(EstadoPrestamo)){
                                EstadoPrestamo = "<span style='color:#32A42E'>SÍ</span>";
                            }else{
                                EstadoPrestamo = "<span style='color:#E80A04'>NO</span>";
                            }

                            if("1".equals(EstadoInsumo)){
                                EstadoInsumo = "<span style='color:#32A42E'>ACTIVO</span>";
                            }else{
                                EstadoInsumo = "<span style='color:#E80A04'>DADO DE BAJA</span>";
                            }

                            if("1".equals(TipoPrestamo)){
                                TipoPrestamo = "<span style='color:#1700B6'>ASIGNACIÓN</span>";
                            }else{
                                TipoPrestamo = "<span style='color:#1700B6'>PRÉSTAMO</span>";
                            }

                            lblEstadoInsumo.setText("<html>"
                                    +   "<div align=\"center\">Modalidad (último registro): <b>"+ TipoPrestamo +"</b>&emsp;&emsp;Estado: <b>"+ EstadoInsumo +"</b>"
                                    +   "&emsp;&emsp;Devuelto: <b>"+EstadoPrestamo+"</b></div></html>");
                        }
                    }else{
                        lblEstadoInsumo.setText("<html>"
                        +   "<div align=\"center\"><span style='color:#E80A04'><b>Este insumo nunca ha sido préstado o asignado a algún funcionario</b></span></div></html>");
                    }
                }else{
                    lblEstadoInsumo.setText("<html>"
                    +   "<div align=\"center\"><span style='color:#E80A04'><b>Este insumo nunca ha sido préstado o asignado a algún funcionario</b></span></div></html>");
                }
            }else{
                //
            }
        }catch(Exception ex){
            lblEstadoInsumo.setText("<html>"
            +   "<div align=\"center\"><span style='color:#E80A04'><b>Este insumo nunca ha sido préstado o asignado a algún funcionario</b></span></div></html>");
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
            Tabla.addColumn("Funcionario");
            Tabla.addColumn("ID Préstamo");
            Tabla.addColumn("Fecha de préstamo");
            Tabla.addColumn("Fecha de entrega");            
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
                450, //CAMPO1 
                150, //CAMPO2
                200, //CAMPO3
                200, //CAMPO4
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
            Tabla.addColumn("Funcionario");
            Tabla.addColumn("ID Préstamo");
            Tabla.addColumn("Fecha de préstamo");
            Tabla.addColumn("Fecha de entrega");      
                String sSQL = "SELECT CONCAT(fun.PrimerNombreFu,' ',fun.ApellidoPaternoFu,' ',fun.ApellidoMaternoFu), det.CodigoPrestamoDe, "
                            + "CONCAT(pre.FechaSolicitudPr,' ',pre.HoraSolicitudPr), CONCAT(det.FechaEntregaDe,' ',det.HoraEntregaDe) "
                            + "FROM funcionarios fun, prestamos pre, detalleprestamos det, insumos ins "
                            + "WHERE (pre.CodigoPr=det.CodigoPrestamoDe) AND (det.InsumoDe=ins.CodigoIn) AND (pre.FuncionarioPr=fun.RutFu) "
                            + "AND det.InsumoDe = '"+ lblCodigoInsumo.getText() +"' ORDER BY det.CodigoPrestamoDe ASC";
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
        funcionCargarInsumo();
        funcionEstadoInsumo();
        funcionContar();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Esta función se encuentra en desarrollo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(jdSeguimientoInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdSeguimientoInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdSeguimientoInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdSeguimientoInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdSeguimientoInsumo dialog = new jdSeguimientoInsumo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtDatos;
    private javax.swing.JLabel lblCodigoInsumo;
    private javax.swing.JLabel lblDetalleInsumo;
    private javax.swing.JLabel lblEstadoInsumo;
    private javax.swing.JLabel lblVecesPrestado;
    // End of variables declaration//GEN-END:variables
}
