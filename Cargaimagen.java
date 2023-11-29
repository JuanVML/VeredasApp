/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;

import conection.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author alber
 */
public class CargarImagen extends javax.swing.JFrame {

    private FileInputStream fis;
    private int longitudBytes;
    
    private ImageIcon imagen;
    private Icon icono;
    
    /**
     * Creates new form CargarImagen
     */
    public CargarImagen() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtnSubirImagen = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbtnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("SUBIR IMAGEN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 90, 60));

        jLabel4.setText("REGRESAR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 70, 40));

        jbtnSubirImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/Rectangle 37.png"))); // NOI18N
        jbtnSubirImagen.setText("SUBIR IMAGEN");
        jbtnSubirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubirImagenActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSubirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 197, 63));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 390, 160));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ELIMINAR IMAGEN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 100, 60));

        jLabel5.setText("GUARDAR IMAGEN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 110, 60));

        jbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/Rectangle 37.png"))); // NOI18N
        jbtnGuardar.setText("SUBIR IMAGEN");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 197, 63));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/Rectangle 38.png"))); // NOI18N
        jButton1.setText("ELIMINAR IMAGEN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 180, 60));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/Frame 6 (1).png"))); // NOI18N
        jButton2.setText("REGRESAR");
        jButton2.setBorder(null);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 180, 40));

        jLabel6.setText("NOMBRE DE LA IMAGEN:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 250, -1));
        getContentPane().add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 260, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/subir imagen (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSubirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubirImagenActionPerformed
        String Ruta = "";
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif" );
        jFileChooser.setFileFilter(filtrado);
        
        int respuesta = jFileChooser.showOpenDialog(this);
        
        if(respuesta == jFileChooser.APPROVE_OPTION){
            Ruta = jFileChooser.getSelectedFile().getPath();
            
            Image mImagen = new ImageIcon(Ruta).getImage();
            ImageIcon mIcon = new ImageIcon(mImagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(mIcon);
        }
    }//GEN-LAST:event_jbtnSubirImagenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lblImagen.setIcon(null);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        
        GuardarImagen();
    }//GEN-LAST:event_jbtnGuardarActionPerformed
    
    public void GuardarImagen() {

        if (jtxtNombre.getText().equals("")) {
            jtxtNombre.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        } else {

            String nombre;
            nombre = jtxtNombre.getText().trim();

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into fotos values (?,?,?)");
                
                pst.setInt(1, 0);
                pst.setString(2, nombre);
                pst.setBlob(3, fis, longitudBytes);
                
                pst.executeUpdate();
                cn.close();
                
                jtxtNombre.setBackground(Color.green);
                lblImagen.setText("Foto");
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                
            } catch (SQLException e) {
                System.out.println("Error al guardar foto " + e);
                JOptionPane.showMessageDialog(null, "¡¡Error al guardar foto!!");
            }

        }
    }
    
    private void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(),
                lbl.getHeight(),
                Image.SCALE_AREA_AVERAGING////convirtiendo imagen a un icono
        )
        );lbl.setIcon(this.icono);
        this.repaint();
    }
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
            java.util.logging.Logger.getLogger(CargarImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarImagen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnSubirImagen;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
