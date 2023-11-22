
package Modelo;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection; // Importa la clase correcta
import conexion.conexionSQL;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;//importa statemen para agregar
import java.sql.ResultSet;

/**
 *
 * @author JUANV0719
 */
public class login extends javax.swing.JFrame {
 conexionSQL cc = new conexionSQL();
    Connection con = cc.conexion();
    public login() {
        initComponents();
          this.setLocationRelativeTo(this);
        setimagelabel(jLabel1,"src/Image/vereda.png");
        setimagelabel(jLabel3,"src/Image/icono.jpg");
        setimagelabel(jLabel6,"src/Image/card.png");
        setimagelabel(jLabel8,"src/Image/image.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        UsuarioLb2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUsu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jsUsu = new javax.swing.JSeparator();
        ContraseñaLb = new javax.swing.JLabel();
        btnOcultar = new javax.swing.JLabel();
        jtbnver = new javax.swing.JLabel();
        jpsContra = new javax.swing.JPasswordField();
        jsConta = new javax.swing.JSeparator();
        jbtnEntrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        UsuarioLb1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsuarioLb2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        UsuarioLb2.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioLb2.setText("ACCESO");
        jPanel2.add(UsuarioLb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 101, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¿Olvidaste tu contraseña?");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 18, -1, 171));

        jtxtUsu.setBackground(new java.awt.Color(0, 102, 102));
        jtxtUsu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jtxtUsu.setForeground(new java.awt.Color(255, 255, 255));
        jtxtUsu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtUsu.setBorder(null);
        jtxtUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtUsuMousePressed(evt);
            }
        });
        jPanel2.add(jtxtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 270, 48));

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 280, 180));

        jsUsu.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jsUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 251, 1, 10));

        ContraseñaLb.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        ContraseñaLb.setForeground(new java.awt.Color(255, 255, 255));
        ContraseñaLb.setText("CONTRASEÑA :");
        jPanel2.add(ContraseñaLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hide_20.png"))); // NOI18N
        btnOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOcultarMouseClicked(evt);
            }
        });
        jPanel2.add(btnOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 60, 30));

        jtbnver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Eye_20.png"))); // NOI18N
        jtbnver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbnverMouseClicked(evt);
            }
        });
        jPanel2.add(jtbnver, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 60, 30));

        jpsContra.setBackground(new java.awt.Color(0, 102, 102));
        jpsContra.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jpsContra.setForeground(new java.awt.Color(255, 255, 255));
        jpsContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpsContra.setBorder(null);
        jpsContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpsContraMousePressed(evt);
            }
        });
        jPanel2.add(jpsContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 270, 40));

        jsConta.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jsConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 260, 10));

        jbtnEntrar.setBackground(new java.awt.Color(102, 204, 255));
        jbtnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnEntrar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnEntrar.setText("INGRESAR");
        jbtnEntrar.setBorder(null);
        jbtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEntrarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 124, 38));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALIR");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 50, 30));

        UsuarioLb1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        UsuarioLb1.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioLb1.setText("USUARIO :");
        jPanel2.add(UsuarioLb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 101, 30));

        btnRegistrar.setBackground(new java.awt.Color(153, 255, 204));
        btnRegistrar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrarse");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 120, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/key.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 40, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/usuario (3) (1).png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 40, 50));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 350, 340));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, 0, 740, 570));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 370, 570));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 450, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//para la imagen
   private void setimagelabel(JLabel labelName,String root){
       ImageIcon image = new ImageIcon (root);
       Icon icon = new ImageIcon(
       image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
       labelName.setIcon(icon);
       this.repaint();
   } 
// para login usando base de datos
     public void validarusuario() {
    int resultado = 0;
    String pass = String.valueOf(jpsContra.getPassword());
    String usuario = jtxtUsu.getText();  // Agrega esta línea para obtener el usuario del campo de texto
    String SQL = "select * from usuarios where usuario='"+usuario+"' and pass='"+pass+"'";

    try {
        java.sql.Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(SQL);
        if (rs.next()) { //  "rs.next()" para llamar al método
            resultado = 1;
            if (resultado == 1) {
                // ventana de sistema que se abrira despues de logearse
                
              //  Sistema form = new Sistema();
              //  form.setVisible(true);
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error de acceso usuario no registrado");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
    }
}
    
    private void jtxtUsuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUsuMousePressed

    }//GEN-LAST:event_jtxtUsuMousePressed

    private void jpsContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsContraMousePressed

    }//GEN-LAST:event_jpsContraMousePressed

    private void jbtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEntrarActionPerformed
  validarusuario();     
    }//GEN-LAST:event_jbtnEntrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        this.setVisible(false);
        Registrar form = new Registrar();
        form.setVisible(true);
             
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jtbnverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbnverMouseClicked
       if(MouseEvent.BUTTON1 == evt.getButton()){
            jpsContra.setEchoChar((char)0);
            btnOcultar.setVisible(true);
            jtbnver.setVisible(false);
        }
    }//GEN-LAST:event_jtbnverMouseClicked

    private void btnOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOcultarMouseClicked
   if(MouseEvent.BUTTON1 == evt.getButton()){
            jpsContra.setEchoChar('•');
            btnOcultar.setVisible(false);
            jtbnver.setVisible(true);
        }
    }//GEN-LAST:event_btnOcultarMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContraseñaLb;
    private javax.swing.JLabel UsuarioLb1;
    private javax.swing.JLabel UsuarioLb2;
    private javax.swing.JLabel btnOcultar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEntrar;
    private javax.swing.JPasswordField jpsContra;
    private javax.swing.JSeparator jsConta;
    private javax.swing.JSeparator jsUsu;
    private javax.swing.JLabel jtbnver;
    private javax.swing.JTextField jtxtUsu;
    // End of variables declaration//GEN-END:variables
}
