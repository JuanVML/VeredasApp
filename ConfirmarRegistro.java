package programainforme;
/**
 *
 * @author Ruiz Polo, Ericka Yadira
 */
public class ConfirmarRegistro extends javax.swing.JFrame {
    
    public ConfirmarRegistro(RegistroProyecto registroForm){
        this.setSize(300, 200);
        this.setTitle("Confirmar Registro");
        this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNo = new javax.swing.JButton();
        btnSi1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Desea registrar los datos del proyecto?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, -1));

        btnNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/No.png"))); // NOI18N
        btnNo.setBorderPainted(false);
        btnNo.setContentAreaFilled(false);
        btnNo.setDefaultCapable(false);
        btnNo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/No (1).png"))); // NOI18N
        btnNo.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/No (1).png"))); // NOI18N
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 150, -1));

        btnSi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Si.png"))); // NOI18N
        btnSi1.setBorderPainted(false);
        btnSi1.setContentAreaFilled(false);
        btnSi1.setDefaultCapable(false);
        btnSi1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Si (1).png"))); // NOI18N
        btnSi1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Si (1).png"))); // NOI18N
        btnSi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSi1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        dispose();
        
    }//GEN-LAST:event_btnNoActionPerformed

    private void btnSi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSi1ActionPerformed
        InfoGuardado IG = new InfoGuardado();
        IG.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSi1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmarRegistro(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
