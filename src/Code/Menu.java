package Code;

import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblEjercicio3 = new javax.swing.JLabel();
        lblEjercicio2 = new javax.swing.JLabel();
        lblEjercicio1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        lblMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblMenu.setText("Menu Trabajo#2");

        lblEjercicio3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEjercicio3.setText("    Ejercicio 3");
        lblEjercicio3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEjercicio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEjercicio3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEjercicio3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEjercicio3MousePressed(evt);
            }
        });

        lblEjercicio2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEjercicio2.setText("    Ejercicio 2");
        lblEjercicio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEjercicio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEjercicio2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEjercicio2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEjercicio2MousePressed(evt);
            }
        });

        lblEjercicio1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEjercicio1.setText("    Ejercicio 1");
        lblEjercicio1.setToolTipText("");
        lblEjercicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEjercicio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEjercicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEjercicio1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEjercicio1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEjercicio1MousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lblEjercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(lblMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(0, 62, Short.MAX_VALUE)
                        .addComponent(lblEjercicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(lblEjercicio3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblMenu))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEjercicio3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEjercicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEjercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEjercicio1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEjercicio1MouseEntered
        lblEjercicio1.setBorder(new BevelBorder(1, Color.black, Color.black));
    }//GEN-LAST:event_lblEjercicio1MouseEntered

    private void lblEjercicio1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEjercicio1MouseExited
        lblEjercicio1.setBorder(new BevelBorder(0, Color.WHITE, Color.white));
    }//GEN-LAST:event_lblEjercicio1MouseExited

    private void lblEjercicio2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEjercicio2MouseEntered
        lblEjercicio2.setBorder(new BevelBorder(1, Color.black, Color.black));
    }//GEN-LAST:event_lblEjercicio2MouseEntered

    private void lblEjercicio2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEjercicio2MouseExited
        lblEjercicio2.setBorder(new BevelBorder(0, Color.WHITE, Color.white));
    }//GEN-LAST:event_lblEjercicio2MouseExited

    private void lblEjercicio3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEjercicio3MouseEntered
        lblEjercicio3.setBorder(new BevelBorder(1, Color.black, Color.black));
    }//GEN-LAST:event_lblEjercicio3MouseEntered

    private void lblEjercicio3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEjercicio3MouseExited
        lblEjercicio3.setBorder(new BevelBorder(0, Color.WHITE, Color.white));
    }//GEN-LAST:event_lblEjercicio3MouseExited

    private void lblEjercicio3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEjercicio3MousePressed
        FrmNotas abrir = new FrmNotas();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblEjercicio3MousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblEjercicio1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEjercicio1MousePressed
        FrmEmpleados abrir = new FrmEmpleados();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblEjercicio1MousePressed

    private void lblEjercicio2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEjercicio2MousePressed
        FrmEmpleados2 abrir = new FrmEmpleados2();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblEjercicio2MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEjercicio1;
    private javax.swing.JLabel lblEjercicio2;
    private javax.swing.JLabel lblEjercicio3;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables

}
