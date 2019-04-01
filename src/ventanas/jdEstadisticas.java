package ventanas;

import clases.DataConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class jdEstadisticas extends javax.swing.JDialog {

    DataConnection miConexion;
    
    public jdEstadisticas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotalPrestamos = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblInsumosPrestados = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblInsumosAsignados = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblTotalInsumos = new javax.swing.JLabel();
        lblInsumosDisponibles = new javax.swing.JLabel();
        lblInsumosBajas = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblDevueltos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNoDevueltos = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblTotalUsuarios = new javax.swing.JLabel();
        lblUsuariosActivos = new javax.swing.JLabel();
        lblUsuariosInactivos = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadísticas");
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Préstamos y/o asignaciones", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total");

        lblTotalPrestamos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTotalPrestamos.setForeground(new java.awt.Color(0, 0, 102));
        lblTotalPrestamos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalPrestamos.setText("0000");

        jLabel31.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Prestados");

        lblInsumosPrestados.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblInsumosPrestados.setForeground(new java.awt.Color(0, 0, 102));
        lblInsumosPrestados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsumosPrestados.setText("0000");

        jLabel34.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Asignados");

        lblInsumosAsignados.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblInsumosAsignados.setForeground(new java.awt.Color(0, 0, 102));
        lblInsumosAsignados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsumosAsignados.setText("0000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInsumosPrestados, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInsumosAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblInsumosAsignados))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblInsumosPrestados))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblTotalPrestamos))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insumos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Disponibles");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Bajas");

        lblTotalInsumos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTotalInsumos.setForeground(new java.awt.Color(0, 0, 102));
        lblTotalInsumos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalInsumos.setText("0000");

        lblInsumosDisponibles.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblInsumosDisponibles.setForeground(new java.awt.Color(0, 102, 0));
        lblInsumosDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsumosDisponibles.setText("0000");

        lblInsumosBajas.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblInsumosBajas.setForeground(new java.awt.Color(255, 0, 0));
        lblInsumosBajas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsumosBajas.setText("0000");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Devueltos**");

        lblDevueltos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblDevueltos.setForeground(new java.awt.Color(0, 102, 0));
        lblDevueltos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDevueltos.setText("0000");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("No devueltos**");

        lblNoDevueltos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblNoDevueltos.setForeground(new java.awt.Color(255, 0, 0));
        lblNoDevueltos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoDevueltos.setText("0000");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalInsumos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInsumosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInsumosBajas, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDevueltos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNoDevueltos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalInsumos)
                    .addComponent(lblInsumosBajas)
                    .addComponent(lblInsumosDisponibles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDevueltos))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNoDevueltos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Total");

        jLabel26.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Activos");

        jLabel27.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Inactivos");

        lblTotalUsuarios.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTotalUsuarios.setForeground(new java.awt.Color(0, 0, 102));
        lblTotalUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalUsuarios.setText("0000");

        lblUsuariosActivos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblUsuariosActivos.setForeground(new java.awt.Color(0, 102, 0));
        lblUsuariosActivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuariosActivos.setText("0000");

        lblUsuariosInactivos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblUsuariosInactivos.setForeground(new java.awt.Color(255, 0, 0));
        lblUsuariosInactivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuariosInactivos.setText("0000");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsuariosActivos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsuariosInactivos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalUsuarios)
                    .addComponent(lblUsuariosActivos)
                    .addComponent(lblUsuariosInactivos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnActualizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.gif"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("** Cada préstamo o asignación puede incluir uno o más insumos.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(jLabel4))
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

    //Traer datos de los prestamos
    private void funcionTotalPrestamos(){
        try{
            String SQL = "SELECT COUNT(*) FROM prestamos";
            Statement stSQL = miConexion.con.createStatement();
            ResultSet rsSQL = stSQL.executeQuery(SQL);
            if(rsSQL.next() == true){
                lblTotalPrestamos.setText(rsSQL.getString("COUNT(*)"));
            }else{
                lblTotalPrestamos.setText("0000");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            this.dispose();
        }
    }
    
    private void funcionModalidadAsignacion(){
        try{
            String SQL = "SELECT COUNT(*) FROM prestamos pr WHERE pr.TipoPrestamo = '1'";
            Statement stSQL = miConexion.con.createStatement();
            ResultSet rsSQL = stSQL.executeQuery(SQL);
            if(rsSQL.next() == true){
                lblInsumosAsignados.setText(rsSQL.getString("COUNT(*)"));
            }else{
                lblInsumosAsignados.setText("0000");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            this.dispose();
        }
    }
    
    private void funcionModalidadPrestamos(){
        try{
            String SQL = "SELECT COUNT(*) FROM prestamos pr WHERE pr.TipoPrestamo = '2'";
            Statement stSQL = miConexion.con.createStatement();
            ResultSet rsSQL = stSQL.executeQuery(SQL);
            if(rsSQL.next() == true){
                lblInsumosPrestados.setText(rsSQL.getString("COUNT(*)"));
            }else{
                lblInsumosPrestados.setText("0000");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            this.dispose();
        }
    }   
    
    //Traer datos de los insumos
    private void funcionTotalInsumos(){
        try{
            String SQL = "SELECT COUNT(*) FROM insumos";
            Statement stSQL = miConexion.con.createStatement();
            ResultSet rsSQL = stSQL.executeQuery(SQL);
            if(rsSQL.next() == true){
                lblTotalInsumos.setText(rsSQL.getString("COUNT(*)"));
            }else{
                lblTotalInsumos.setText("0000");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            this.dispose();
        }
    }
    
    private void funcionInsumosDisponibles(){
        try{
            String SQL = "SELECT COUNT(*) FROM insumos ins WHERE ins.EstadoIn = '1'";
            Statement stSQL = miConexion.con.createStatement();
            ResultSet rsSQL = stSQL.executeQuery(SQL);
            if(rsSQL.next() == true){
                lblInsumosDisponibles.setText(rsSQL.getString("COUNT(*)"));
            }else{
                lblInsumosDisponibles.setText("0000");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            this.dispose();
        }
    }
    
    private void funcionInsumosBajas(){
        try{
            String SQL = "SELECT COUNT(*) FROM insumos ins WHERE ins.EstadoIn = '2'";
            Statement stSQL = miConexion.con.createStatement();
            ResultSet rsSQL = stSQL.executeQuery(SQL);
            if(rsSQL.next() == true){
                lblInsumosBajas.setText(rsSQL.getString("COUNT(*)"));
            }else{
                lblInsumosBajas.setText("0000");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            this.dispose();
        }
    }
    
    private void funcionInsumosDevueltos(){
        try{
            String SQL = "SELECT COUNT(*) FROM detalleprestamos det WHERE det.EntregadoDe = '1'";
            Statement stSQL = miConexion.con.createStatement();
            ResultSet rsSQL = stSQL.executeQuery(SQL);
            if(rsSQL.next() == true){
                lblDevueltos.setText(rsSQL.getString("COUNT(*)"));
            }else{
                lblDevueltos.setText("0000");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            this.dispose();
        }
    }
    
    private void funcionInsumosNoDevueltos(){
        try{
            String SQL = "SELECT COUNT(*) FROM detalleprestamos det WHERE det.EntregadoDe = '2'";
            Statement stSQL = miConexion.con.createStatement();
            ResultSet rsSQL = stSQL.executeQuery(SQL);
            if(rsSQL.next() == true){
                lblNoDevueltos.setText(rsSQL.getString("COUNT(*)"));
            }else{
                lblNoDevueltos.setText("0000");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            this.dispose();
        }
    }
       
    //Traer datos de los usuarios
    private void funcionTotalUsuarios(){
        try{
            String SQL = "SELECT COUNT(*) FROM funcionarios";
            Statement stSQL = miConexion.con.createStatement();
            ResultSet rsSQL = stSQL.executeQuery(SQL);
            if(rsSQL.next() == true){
                lblTotalUsuarios.setText(rsSQL.getString("COUNT(*)"));
            }else{
                lblTotalUsuarios.setText("0000");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            this.dispose();
        }
    }
    
    private void funcionUsuariosActivos(){
        try{
            String SQL = "SELECT COUNT(*) FROM usuarios us WHERE us.EstadoUs = '1'";
            Statement stSQL = miConexion.con.createStatement();
            ResultSet rsSQL = stSQL.executeQuery(SQL);
            if(rsSQL.next() == true){
                lblUsuariosActivos.setText(rsSQL.getString("COUNT(*)"));
            }else{
                lblUsuariosActivos.setText("0000");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            this.dispose();
        }
    }
    
    private void funcionUsuariosInactivos(){
        try{
            String SQL = "SELECT COUNT(*) FROM usuarios us WHERE us.EstadoUs = '2'";
            Statement stSQL = miConexion.con.createStatement();
            ResultSet rsSQL = stSQL.executeQuery(SQL);
            if(rsSQL.next() == true){
                lblUsuariosInactivos.setText(rsSQL.getString("COUNT(*)"));
            }else{
                lblUsuariosInactivos.setText("-");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            this.dispose();
        }
    }
        
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        funcionTotalPrestamos();
        funcionModalidadAsignacion();
        funcionModalidadPrestamos();
        funcionTotalInsumos();
        funcionInsumosDisponibles();
        funcionInsumosBajas();
        funcionInsumosDevueltos();
        funcionInsumosNoDevueltos();
        funcionTotalUsuarios();
        funcionUsuariosActivos();
        funcionUsuariosInactivos();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        funcionTotalPrestamos();
        funcionModalidadAsignacion();
        funcionModalidadPrestamos();
        funcionTotalInsumos();
        funcionInsumosDisponibles();
        funcionInsumosBajas();
        funcionInsumosDevueltos();
        funcionInsumosNoDevueltos();
        funcionTotalUsuarios();
        funcionUsuariosActivos();
        funcionUsuariosInactivos();
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(jdEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdEstadisticas dialog = new jdEstadisticas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblDevueltos;
    private javax.swing.JLabel lblInsumosAsignados;
    private javax.swing.JLabel lblInsumosBajas;
    private javax.swing.JLabel lblInsumosDisponibles;
    private javax.swing.JLabel lblInsumosPrestados;
    private javax.swing.JLabel lblNoDevueltos;
    private javax.swing.JLabel lblTotalInsumos;
    private javax.swing.JLabel lblTotalPrestamos;
    private javax.swing.JLabel lblTotalUsuarios;
    private javax.swing.JLabel lblUsuariosActivos;
    private javax.swing.JLabel lblUsuariosInactivos;
    // End of variables declaration//GEN-END:variables
}
