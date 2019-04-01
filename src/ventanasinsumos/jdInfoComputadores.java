package ventanasinsumos;

import clases.DataConnection;
import clases.Mensajes;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import principal.jfPrincipal;
import ventanasmantenimiento.jdHDD;
import ventanasmantenimiento.jdMemoriaRam;
import ventanasmantenimiento.jdProcesadores;
import ventanasmantenimiento.jdSistemas;

/**
 * @author Víctor Sandoval Millar
 */

public class jdInfoComputadores extends javax.swing.JDialog {

    DataConnection miConexion;
    //Intanciar mantenedores
    jdProcesadores miProcesador = new jdProcesadores(new jfPrincipal(),true);
    jdMemoriaRam miMemoria = new jdMemoriaRam(new jfPrincipal(),true);
    jdHDD miHDD = new jdHDD(new jfPrincipal(),true);
    jdSistemas miSistema = new jdSistemas(new jfPrincipal(),true);
    
    public jdInfoComputadores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblCodigoProcesador.setVisible(false);
        lblCodigoMemRam.setVisible(false);
        lblCodigoDiscoDuro.setVisible(false);
        lblCodigoSO.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfNumeroSerie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfMacEquipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbProcesador = new javax.swing.JComboBox<>();
        btnAddProcesador = new javax.swing.JButton();
        jcbMemoriaRAM = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnAddMemoriaRam = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jcbDiscoDuro = new javax.swing.JComboBox<>();
        btnAddHDD = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jcbSistemaOperativo = new javax.swing.JComboBox<>();
        btnAddSistema = new javax.swing.JButton();
        lblCodigoProcesador = new javax.swing.JLabel();
        lblCodigoMemRam = new javax.swing.JLabel();
        lblCodigoDiscoDuro = new javax.swing.JLabel();
        lblCodigoSO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar información adicional de los computadores");
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tfNumeroSerie.setEditable(false);
        tfNumeroSerie.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfNumeroSerie.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Número de serie del equipo:");

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar2.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Ingrese la MAC del equipo:");

        tfMacEquipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfMacEquipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Seleccione el procesador:");

        jcbProcesador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbProcesador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbProcesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProcesadorActionPerformed(evt);
            }
        });

        btnAddProcesador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddProcesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProcesadorActionPerformed(evt);
            }
        });

        jcbMemoriaRAM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbMemoriaRAM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbMemoriaRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMemoriaRAMActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Seleccione la capacidad Memoria RAM:");

        btnAddMemoriaRam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddMemoriaRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemoriaRamActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Seleccione la capacidad de HDD:");

        jcbDiscoDuro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbDiscoDuro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbDiscoDuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDiscoDuroActionPerformed(evt);
            }
        });

        btnAddHDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddHDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHDDActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Seleccione el Sistema Operativo:");

        jcbSistemaOperativo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbSistemaOperativo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbSistemaOperativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSistemaOperativoActionPerformed(evt);
            }
        });

        btnAddSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAddSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSistemaActionPerformed(evt);
            }
        });

        lblCodigoProcesador.setText("la");

        lblCodigoMemRam.setText("la");

        lblCodigoDiscoDuro.setText("la");

        lblCodigoSO.setText("la");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNumeroSerie)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbSistemaOperativo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbDiscoDuro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbMemoriaRAM, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbProcesador, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddProcesador, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddMemoriaRam, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddHDD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddSistema, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(tfMacEquipo)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCodigoProcesador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigoMemRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigoDiscoDuro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigoSO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMacEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbMemoriaRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddMemoriaRam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbDiscoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddHDD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jcbSistemaOperativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(lblCodigoProcesador)
                            .addComponent(lblCodigoMemRam)
                            .addComponent(lblCodigoDiscoDuro)
                            .addComponent(lblCodigoSO)))
                    .addComponent(btnAddSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    //Cargar informacion a los combobox
    
    private void funcionCargarProcesadores(){
        try{
            String Tipo;//Se declara una variable tipo String
            Tipo = "SELECT ProcesadorPro FROM procesadores ORDER BY ProcesadorPro ASC";//Crear consulta SQL
            Statement stTipo = miConexion.con.createStatement();
            ResultSet rsTipo = stTipo.executeQuery(Tipo);
            while(rsTipo.next()){
                jcbProcesador.addItem(rsTipo.getString("ProcesadorPro"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar los datos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void funcionCargarMemRAM(){
        try{
            String Tipo;//Se declara una variable tipo String
            Tipo = "SELECT MemoriaRamMem FROM capmemoriasram ORDER BY MemoriaRamMem ASC";//Crear consulta SQL
            Statement stTipo = miConexion.con.createStatement();
            ResultSet rsTipo = stTipo.executeQuery(Tipo);
            while(rsTipo.next()){
                jcbMemoriaRAM.addItem(rsTipo.getString("MemoriaRamMem"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar los datos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void funcionCargarHDD(){
        try{
            String Tipo;//Se declara una variable tipo String
            Tipo = "SELECT DiscoDuroDis FROM capdiscosduros ORDER BY DiscoDuroDis ASC";//Crear consulta SQL
            Statement stTipo = miConexion.con.createStatement();
            ResultSet rsTipo = stTipo.executeQuery(Tipo);
            while(rsTipo.next()){
                jcbDiscoDuro.addItem(rsTipo.getString("DiscoDuroDis"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar los datos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void funcionCargarSO(){
        try{
            String Tipo;//Se declara una variable tipo String
            Tipo = "SELECT SistemaOperativoSis FROM sistemasoperativos ORDER BY SistemaOperativoSis ASC";//Crear consulta SQL
            Statement stTipo = miConexion.con.createStatement();
            ResultSet rsTipo = stTipo.executeQuery(Tipo);
            while(rsTipo.next()){
                jcbSistemaOperativo.addItem(rsTipo.getString("SistemaOperativoSis"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage(),"Error al cargar los datos",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Cargar datos si el equipo existe
    private void funcionCargarDatosEquipo(){
        try{
            if("".equals(tfNumeroSerie.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">No se puede aregar datos en este módulo si no ha seleccionado el número de serie.<br>El módulo se cerrará...</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }else{
                //cargar datos
                String Datos;
                Datos = "SELECT inf.MacInf, pro.ProcesadorPro, mem.MemoriaRamMem, dis.DiscoDuroDis, sis.SistemaOperativoSis "
                    + "FROM infocomputadores AS inf, procesadores AS pro, capmemoriasram AS mem, capdiscosduros AS dis, sistemasoperativos AS sis "
                    + "WHERE (inf.ProcesadorInf=pro.CodigoPro) AND (inf.MemoriaRamInf=mem.CodigoMem) AND (inf.DiscoDuroInf=dis.CodigoDis) AND "
                    + "(inf.SistemaOperativoInf=sis.CodigoSis) AND inf.NumeroSerieInf = '"+ tfNumeroSerie.getText() +"'";
                Statement stDatos = miConexion.con.createStatement();
                ResultSet rsDatos = stDatos.executeQuery(Datos);
                if(rsDatos.next() == true){
                    tfMacEquipo.setText(rsDatos.getString("inf.MacInf"));
                    jcbProcesador.setSelectedItem(rsDatos.getString("pro.ProcesadorPro"));
                    jcbMemoriaRAM.setSelectedItem(rsDatos.getString("mem.MemoriaRamMem"));
                    jcbDiscoDuro.setSelectedItem(rsDatos.getString("dis.DiscoDuroDis"));
                    jcbSistemaOperativo.setSelectedItem(rsDatos.getString("sis.SistemaOperativoSis"));
                }else{
                    //Todo vacío
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex.getMessage());
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        funcionCargarProcesadores();        
        funcionCargarMemRAM();        
        funcionCargarHDD();        
        funcionCargarSO();        
        funcionCargarDatosEquipo();
        funcionCargarCodigoProcesador();
        funcionCargarCodigoMemRam();
        funcionCargarCodigoHDD();
        funcionCargarCodigoSO();
        tfMacEquipo.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btnAddProcesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProcesadorActionPerformed
        miProcesador.setLocationRelativeTo(null);
        miProcesador.setVisible(true);
        jcbProcesador.removeAllItems();
        jcbProcesador.addItem("-- Seleccione --");
        funcionCargarProcesadores();        
    }//GEN-LAST:event_btnAddProcesadorActionPerformed

    private void btnAddMemoriaRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemoriaRamActionPerformed
        miMemoria.setLocationRelativeTo(null);
        miMemoria.setVisible(true);
        jcbMemoriaRAM.removeAllItems();
        jcbMemoriaRAM.addItem("-- Seleccione --");
        funcionCargarMemRAM();
    }//GEN-LAST:event_btnAddMemoriaRamActionPerformed

    private void btnAddHDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHDDActionPerformed
        miHDD.setLocationRelativeTo(null);
        miHDD.setVisible(true);
        jcbDiscoDuro.removeAllItems();
        jcbDiscoDuro.addItem("-- Seleccione --");
        funcionCargarHDD();        
    }//GEN-LAST:event_btnAddHDDActionPerformed

    private void btnAddSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSistemaActionPerformed
        miSistema.setLocationRelativeTo(null);
        miSistema.setVisible(true);
        jcbSistemaOperativo.removeAllItems();
        jcbSistemaOperativo.addItem("-- Seleccione --");
        funcionCargarSO();
    }//GEN-LAST:event_btnAddSistemaActionPerformed

    private void funcionCargarCodigoProcesador(){
        try{
            if(!"-- Seleccione --".equals(jcbProcesador.getSelectedItem())){
                String sql = "SELECT CodigoPro FROM procesadores "
                           + "WHERE ProcesadorPro = '"+ jcbProcesador.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoProcesador.setText(rs.getString("CodigoPro"));
                }else{
                    //
                } 
            }else{
                lblCodigoProcesador.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void jcbProcesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProcesadorActionPerformed
        funcionCargarCodigoProcesador();
    }//GEN-LAST:event_jcbProcesadorActionPerformed

    private void funcionCargarCodigoMemRam(){
        try{
            if(!"-- Seleccione --".equals(jcbMemoriaRAM.getSelectedItem())){
                String sql = "SELECT CodigoMem FROM capmemoriasram "
                           + "WHERE MemoriaRamMem = '"+ jcbMemoriaRAM.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoMemRam.setText(rs.getString("CodigoMem"));
                }else{
                    //
                } 
            }else{
                lblCodigoMemRam.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void jcbMemoriaRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMemoriaRAMActionPerformed
        funcionCargarCodigoMemRam();
    }//GEN-LAST:event_jcbMemoriaRAMActionPerformed

    private void funcionCargarCodigoHDD(){
        try{
            if(!"-- Seleccione --".equals(jcbDiscoDuro.getSelectedItem())){
                String sql = "SELECT CodigoDis FROM capdiscosduros "
                           + "WHERE DiscoDuroDis = '"+ jcbDiscoDuro.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoDiscoDuro.setText(rs.getString("CodigoDis"));
                }else{
                    //
                } 
            }else{
                lblCodigoDiscoDuro.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void jcbDiscoDuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDiscoDuroActionPerformed
        funcionCargarCodigoHDD();
    }//GEN-LAST:event_jcbDiscoDuroActionPerformed

    private void funcionCargarCodigoSO(){
        try{
            if(!"-- Seleccione --".equals(jcbSistemaOperativo.getSelectedItem())){
                String sql = "SELECT CodigoSis FROM sistemasoperativos "
                           + "WHERE SistemaOperativoSis = '"+ jcbSistemaOperativo.getSelectedItem() +"'";
                Statement st = miConexion.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    lblCodigoSO.setText(rs.getString("CodigoSis"));
                }else{
                    //
                } 
            }else{
                lblCodigoSO.setText("");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void jcbSistemaOperativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSistemaOperativoActionPerformed
        funcionCargarCodigoSO();
    }//GEN-LAST:event_jcbSistemaOperativoActionPerformed

    //Lanzar mensaje preguntando si se cerrara la ventana
    private void funcionPreguntaCerrarVentanaInfoEquipos(){
        try{
            int seleccion = JOptionPane.showOptionDialog(
            null, // Componente padre
            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
            + "font-size:12px}</style>"
            + "<div align=\"center\">¿Desea salir de este módulo?.</div></html>", //Mensaje
            "Cerrar ventana", // Titulo del Mensaje
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,    // null para icono por defecto.
            new Object[] { "Sí", "No"},    // null para YES, NO y CANCEL
            "No");//Boton seleccionado por defecto
                if (seleccion != -1){
                    if((seleccion + 1)==1){
                       //Accion a realizar al precionar "SI"
                       this.dispose();
                    }else{
                       //Accion a realizar al precionar "NO"
                    }
                }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private void funcionGuardar(){
        try{
            //Validar los campos de texto
            if("".equals(tfNumeroSerie.getText())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">No se puede aregar datos en este módulo si no ha seleccionado el número de serie.<br>El módulo se cerrará...</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }else if("-- Seleccione --".equals(jcbProcesador.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Seleccione el procesador que posee el equipo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbProcesador.requestFocus();
            }else if("-- Seleccione --".equals(jcbMemoriaRAM.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Seleccione la capacidad de memoria RAM que posee el equipo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbMemoriaRAM.requestFocus();
            }else if("-- Seleccione --".equals(jcbDiscoDuro.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Seleccione la capacidad de disco duro que posee el equipo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbDiscoDuro.requestFocus();
            }else if("-- Seleccione --".equals(jcbSistemaOperativo.getSelectedItem())){
                JOptionPane.showMessageDialog(this, 
                        "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                    +   "font-size:12px}</style>"
                    +   "<div align=\"center\">Seleccione el sistema operativo que posee el equipo</div></html>", //Mensaje
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                jcbSistemaOperativo.requestFocus();
            }else{
                //comprobar que el equipo se encuentre registrado
                String Existe;
                Existe = "SELECT NumeroSerieInf FROM infocomputadores WHERE NumeroSerieInf = '"+ tfNumeroSerie.getText() +"'";
                Statement stExiste = miConexion.con.createStatement();
                ResultSet rsExiste = stExiste.executeQuery(Existe);
                if(rsExiste.next() == true){
                    //Si el equipo se encuentra registrado hay que actualizar la información
                    String Update = "UPDATE infocomputadores SET " 
                            + "MacInf = '"+ tfMacEquipo.getText() +"', "
                            + "ProcesadorInf = '"+ lblCodigoProcesador.getText() +"', "
                            + "MemoriaRamInf = '"+ lblCodigoMemRam.getText() +"', "
                            + "DiscoDuroInf = '"+ lblCodigoDiscoDuro.getText() +"', "
                            + "SistemaOperativoInf = '"+ lblCodigoSO.getText() +"' "
                            + "WHERE NumeroSerieInf = '"+ tfNumeroSerie.getText() +"'";
                    Statement stUp = miConexion.con.createStatement();
                    stUp.executeUpdate(Update);
                    JOptionPane.showMessageDialog(this, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">Los datos del equipo fueron modificados exitosamente</div></html>", //Mensaje
                            "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    funcionPreguntaCerrarVentanaInfoEquipos();
                }else{
                    //Si el equipo no esta registrado hay que agregar la informacion
                    String Add = "INSERT INTO infocomputadores VALUES("
                            + "'"+ tfNumeroSerie.getText() +"', "
                            + "'"+ tfMacEquipo.getText() +"', "
                            + "'"+ lblCodigoProcesador.getText() +"', "
                            + "'"+ lblCodigoMemRam.getText() +"', "
                            + "'"+ lblCodigoDiscoDuro.getText() +"', "
                            + "'"+ lblCodigoSO.getText() +"')";
                    Statement stAdd = miConexion.con.createStatement();
                    stAdd.executeUpdate(Add);
                    JOptionPane.showMessageDialog(this, 
                            "<html><style>body{font-family:Arial, Helvetica, sans-serif;"
                        +   "font-size:12px}</style>"
                        +   "<div align=\"center\">Los datos del equipo fueron agregados exitosamente</div></html>", //Mensaje
                            "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
                    funcionPreguntaCerrarVentanaInfoEquipos();
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
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
            java.util.logging.Logger.getLogger(jdInfoComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdInfoComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdInfoComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdInfoComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdInfoComputadores dialog = new jdInfoComputadores(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddHDD;
    private javax.swing.JButton btnAddMemoriaRam;
    private javax.swing.JButton btnAddProcesador;
    private javax.swing.JButton btnAddSistema;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jcbDiscoDuro;
    private javax.swing.JComboBox<String> jcbMemoriaRAM;
    private javax.swing.JComboBox<String> jcbProcesador;
    private javax.swing.JComboBox<String> jcbSistemaOperativo;
    private javax.swing.JLabel lblCodigoDiscoDuro;
    private javax.swing.JLabel lblCodigoMemRam;
    private javax.swing.JLabel lblCodigoProcesador;
    private javax.swing.JLabel lblCodigoSO;
    private javax.swing.JTextField tfMacEquipo;
    public javax.swing.JTextField tfNumeroSerie;
    // End of variables declaration//GEN-END:variables
}
