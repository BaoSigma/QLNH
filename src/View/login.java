/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.ModelController.LoginController;
import DAO.ModelDAO.LoginDAO;
import DAO.impl.Loginimpl;
import Model.NhanVien;
import Util.UAuth;
import Util.UDialog;
import javax.swing.UIManager;

/**
 *
 * @author User
 */
public class login extends javax.swing.JFrame implements LoginController    {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        chkRemember = new javax.swing.JCheckBox();
        chkShowPass = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 280, 30));

        jButton1.setBackground(new java.awt.Color(170, 120, 70));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đóng");
        jButton1.setBorder(null);
        jButton1.setOpaque(true);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 170, 50));

        chkRemember.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chkRemember.setForeground(new java.awt.Color(255, 255, 255));
        chkRemember.setText("Lưu mật khẩu");
        chkRemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRememberActionPerformed(evt);
            }
        });
        add(chkRemember, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        chkShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPassActionPerformed(evt);
            }
        });
        add(chkShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 90, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đăng Nhập");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 70, 840, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tài khoản");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mật khẩu");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 280, 30));

        jButton2.setBackground(new java.awt.Color(170, 120, 70));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Đăng ký");
        jButton2.setBorder(null);
        jButton2.setOpaque(true);
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 160, 50));

        jButton3.setBackground(new java.awt.Color(170, 120, 70));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Đăng nhập");
        jButton3.setBorder(null);
        jButton3.setOpaque(true);
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background (1).jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 841, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void chkRememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRememberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRememberActionPerformed

    private void chkShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPassActionPerformed
        // TODO add your handling code here:
        if (chkShowPass.isSelected()) {
            txtPass.setEchoChar((char) 0); // Hiện mật khẩu
        } else {
            txtPass.setEchoChar('●'); // Ẩn mật khẩu bằng dấu chấm
        }
    }//GEN-LAST:event_chkShowPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkRemember;
    private javax.swing.JCheckBox chkShowPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void loginn() {
String username = txtUser.getText().trim();
    String password = new String(txtPass.getPassword()).trim();

    if (username.isEmpty()) {
        UDialog.alert("Chưa nhập tài khoản!");
        return;
    }
    if (password.isEmpty()) {
        UDialog.alert("Chưa nhập mật khẩu!");
        return;
    }

        LoginDAO dao = new Loginimpl();
    NhanVien user = dao.findById(username);

    if (user == null) {
        UDialog.alert("Sai tài khoản!");
        return;
    }

    if (!password.equals(user.getMatKhau())) {
        UDialog.alert("Nhập sai mật khẩu!");
        return;
    }
        UAuth.user = user; // Đặt user trước khi save

        if (chkRemember.isSelected()) {
            UAuth.save(); // Lưu thông tin vào Preferences
        } else {
            UAuth.clear(); // Xoá thông tin khỏi Preferences
        }

        UDialog.alert("Đăng nhập thành công!");
        new goimon().setVisible(true);
        exit();

        }

    @Override
    public void exit() {
        LoginController.super.exit(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
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
                try {
                    UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new login().setVisible(true);
            }


        });
}
}
