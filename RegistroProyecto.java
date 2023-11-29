package programainforme;
import java.awt.Color;

/**
 *
 * @author Ruiz Polo, Ericka Yadira
 */
public class RegistroProyecto extends javax.swing.JFrame {
   
    public RegistroProyecto(InfoGuardado formulario2) {
        initComponents();
        this.setSize(800, 735);
        this.setTitle("Registro de Proyecto");
        this.setLocationRelativeTo(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbEstado = new javax.swing.JComboBox<>();
        cmbGenero = new javax.swing.JComboBox<>();
        txtPresupuesto = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtFin = new javax.swing.JTextField();
        txtInicio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnRegistrar1 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbEstado.setBackground(new java.awt.Color(63, 63, 63));
        cmbEstado.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        cmbEstado.setForeground(new java.awt.Color(255, 255, 255));
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----SELECCIONAR-----", "Pendiente", "En progreso", "Finalizado" }));
        cmbEstado.setBorder(null);
        getContentPane().add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 474, 202, 30));

        cmbGenero.setBackground(new java.awt.Color(63, 63, 63));
        cmbGenero.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        cmbGenero.setForeground(new java.awt.Color(255, 255, 255));
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----SELECCIONAR-----", "Femenino", "Masculino" }));
        cmbGenero.setBorder(null);
        getContentPane().add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 194, 202, 30));

        txtPresupuesto.setBackground(new java.awt.Color(63, 63, 63));
        txtPresupuesto.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtPresupuesto.setForeground(new java.awt.Color(153, 153, 153));
        txtPresupuesto.setText("Ingrese el presupuesto");
        txtPresupuesto.setBorder(null);
        txtPresupuesto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPresupuestoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPresupuestoFocusLost(evt);
            }
        });
        txtPresupuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPresupuestoMousePressed(evt);
            }
        });
        getContentPane().add(txtPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 324, 190, 30));

        txtDNI.setBackground(new java.awt.Color(63, 63, 63));
        txtDNI.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(153, 153, 153));
        txtDNI.setText("Ingrese número de DNI");
        txtDNI.setBorder(null);
        txtDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDNIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDNIFocusLost(evt);
            }
        });
        txtDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDNIMousePressed(evt);
            }
        });
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 124, 190, 30));

        txtFin.setBackground(new java.awt.Color(63, 63, 63));
        txtFin.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtFin.setForeground(new java.awt.Color(153, 153, 153));
        txtFin.setText("Ingrese fecha de fin");
        txtFin.setBorder(null);
        txtFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFinFocusLost(evt);
            }
        });
        txtFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFinMousePressed(evt);
            }
        });
        getContentPane().add(txtFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 404, 190, 30));

        txtInicio.setBackground(new java.awt.Color(63, 63, 63));
        txtInicio.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtInicio.setForeground(new java.awt.Color(153, 153, 153));
        txtInicio.setText("Ingrese fecha de inicio");
        txtInicio.setBorder(null);
        txtInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtInicioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInicioFocusLost(evt);
            }
        });
        txtInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtInicioMousePressed(evt);
            }
        });
        getContentPane().add(txtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 334, 190, 30));

        txtTelefono.setBackground(new java.awt.Color(63, 63, 63));
        txtTelefono.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setText("Ingrese número de teléfono");
        txtTelefono.setBorder(null);
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 264, 190, 30));

        txtApellido.setBackground(new java.awt.Color(63, 63, 63));
        txtApellido.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtApellido.setText("Ingrese los apellidos");
        txtApellido.setBorder(null);
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 194, 190, 30));

        txtNombre.setBackground(new java.awt.Color(63, 63, 63));
        txtNombre.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Ingrese los nombres");
        txtNombre.setBorder(null);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 124, 190, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INFORMACIÓN DEL PROYECTO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 510, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image 6.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 0, 290, 540));

        jLabel4.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel4.setText("Estado de la obra");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel6.setText("Apellidos del Ingeniero");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel5.setText("DNI del Ingeniero");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel7.setText("Teléfono del Ingeniero");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel8.setText("Inicio de la obra");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel9.setText("Fin de la obra");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 5.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 5.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 5.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 5.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 5.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 5.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel16.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel16.setText("Nombre del Ingeniero");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 5.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 5.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jLabel19.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel19.setText("Género");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 5.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        jLabel21.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel21.setText("Presupuesto asignado");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image 5.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabel22.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("sigues avanzando, eventualmente llegarás a la meta”");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 300, -1));

        jLabel23.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("“El progreso es un proyecto a veces puede ser lento pero");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 300, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setDefaultCapable(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir (1).png"))); // NOI18N
        btnSalir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir (1).png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, -1, -1));

        btnRegistrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RI.png"))); // NOI18N
        btnRegistrar1.setBorderPainted(false);
        btnRegistrar1.setContentAreaFilled(false);
        btnRegistrar1.setDefaultCapable(false);
        btnRegistrar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RI (1).png"))); // NOI18N
        btnRegistrar1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RI (1).png"))); // NOI18N
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar.png"))); // NOI18N
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setDefaultCapable(false);
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar (1).png"))); // NOI18N
        btnActualizar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar (1).png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed

    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed

    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInicioMousePressed

    }//GEN-LAST:event_txtInicioMousePressed

    private void txtFinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFinMousePressed

    }//GEN-LAST:event_txtFinMousePressed

    private void txtDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDNIMousePressed

    }//GEN-LAST:event_txtDNIMousePressed

    private void txtPresupuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPresupuestoMousePressed

    }//GEN-LAST:event_txtPresupuestoMousePressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
            
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed

        ConfirmarRegistro CR = new ConfirmarRegistro(this);
        CR.setVisible(true);
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDNIFocusLost
        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("Ingrese número de DNI");
            txtDNI.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtDNIFocusLost

    private void txtDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDNIFocusGained
        if (txtDNI.getText().equals("Ingrese número de DNI")) {
            txtDNI.setText("");
            txtDNI.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtDNIFocusGained

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        if (txtNombre.getText().equals("Ingrese los nombres")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Ingrese los nombres");
            txtNombre.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusGained
        if (txtApellido.getText().equals("Ingrese los apellidos")) {
            txtApellido.setText("");
            txtApellido.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtApellidoFocusGained

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        if (txtApellido.getText().isEmpty()) {
            txtApellido.setText("Ingrese los apellidos");
            txtApellido.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtApellidoFocusLost

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        if (txtTelefono.getText().equals("Ingrese número de teléfono")) {
            txtTelefono.setText("");
            txtTelefono.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if (txtTelefono.getText().isEmpty()) {
            txtTelefono.setText("Ingrese número de teléfono");
            txtTelefono.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtInicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInicioFocusGained
        if (txtInicio.getText().equals("Ingrese fecha de inicio")) {
            txtInicio.setText("");
            txtInicio.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtInicioFocusGained

    private void txtInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInicioFocusLost
        if (txtInicio.getText().isEmpty()) {
            txtInicio.setText("Ingrese fecha de inicio");
            txtInicio.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtInicioFocusLost

    private void txtFinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFinFocusGained
        if (txtFin.getText().equals("Ingrese fecha de fin")) {
            txtFin.setText("");
            txtFin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtFinFocusGained

    private void txtFinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFinFocusLost
        if (txtFin.getText().isEmpty()) {
            txtFin.setText("Ingrese fecha de fin");
            txtFin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtFinFocusLost

    private void txtPresupuestoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPresupuestoFocusGained
        if (txtPresupuesto.getText().equals("Ingrese el presupuesto")) {
            txtPresupuesto.setText("");
            txtPresupuesto.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPresupuestoFocusGained

    private void txtPresupuestoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPresupuestoFocusLost
        if (txtPresupuesto.getText().isEmpty()) {
            txtPresupuesto.setText("Ingrese el presupuesto");
            txtPresupuesto.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPresupuestoFocusLost

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
            java.util.logging.Logger.getLogger(RegistroProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProyecto(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPresupuesto;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
