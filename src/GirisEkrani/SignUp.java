package GirisEkrani;

import GirisEkrani.Login;
import Database.DBHelper;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import keeptoo.Drag;

public class SignUp extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement preparedStatement;
    DBHelper helper = new DBHelper();

    public SignUp() throws SQLException {

        initComponents();
        connection = helper.getConnection();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        txtCevap = new javax.swing.JTextField();
        txtIsimSoyisim = new javax.swing.JTextField();
        txtTcKimlikNo = new javax.swing.JTextField();
        boxGuvenlikSorusu = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kButton7 = new keeptoo.KButton();
        txtSifre = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kButton9 = new keeptoo.KButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCevap.setBackground(new Color(0,0,0,0));
        txtCevap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCevap.setForeground(new java.awt.Color(255, 255, 255));
        txtCevap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtCevap.setCaretColor(new java.awt.Color(51, 153, 255));
        txtCevap.setOpaque(false);
        kGradientPanel1.add(txtCevap, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 230, 20));

        txtIsimSoyisim.setBackground(new Color(0,0,0,0));
        txtIsimSoyisim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIsimSoyisim.setForeground(new java.awt.Color(255, 255, 255));
        txtIsimSoyisim.setToolTipText("");
        txtIsimSoyisim.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtIsimSoyisim.setCaretColor(new java.awt.Color(51, 153, 255));
        txtIsimSoyisim.setOpaque(false);
        kGradientPanel1.add(txtIsimSoyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 230, 20));

        txtTcKimlikNo.setBackground(new Color(0,0,0,0));
        txtTcKimlikNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTcKimlikNo.setForeground(new java.awt.Color(255, 255, 255));
        txtTcKimlikNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtTcKimlikNo.setCaretColor(new java.awt.Color(51, 153, 255));
        txtTcKimlikNo.setOpaque(false);
        kGradientPanel1.add(txtTcKimlikNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 230, 20));

        boxGuvenlikSorusu.setBackground(new java.awt.Color(204, 204, 255));
        boxGuvenlikSorusu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boxGuvenlikSorusu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doğduğunuz şehir neresidir?", "İlk evcil hayvanınızın adı nedir?", "İlk okul öğretmeninizin adı nedir?", "Çocukluk arkadaşınız kimdir?" }));
        boxGuvenlikSorusu.setToolTipText("");
        kGradientPanel1.add(boxGuvenlikSorusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 230, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Şifre");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("İsim-Soyisim");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tc Kimlik No");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cevap");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Güvenlik Sorusu");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 100, 20));

        kButton7.setText("Geri");
        kButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton7.setkBorderRadius(20);
        kButton7.setkEndColor(new java.awt.Color(0, 153, 255));
        kButton7.setkHoverColor(new java.awt.Color(153, 255, 255));
        kButton7.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton7.setkHoverStartColor(new java.awt.Color(0, 153, 255));
        kButton7.setkIndicatorColor(new java.awt.Color(192, 192, 192));
        kButton7.setkSelectedColor(new java.awt.Color(102, 204, 255));
        kButton7.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 108, 26));

        txtSifre.setBackground(new Color(0,0,0,0));
        txtSifre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSifre.setForeground(new java.awt.Color(255, 255, 255));
        txtSifre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtSifre.setCaretColor(new java.awt.Color(51, 153, 255));
        txtSifre.setOpaque(false);
        kGradientPanel1.add(txtSifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 230, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\2131231-4.png")); // NOI18N
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_add_user_male_96px.png")); // NOI18N
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        kButton9.setText("Kayıt Ol");
        kButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kButton9.setkBorderRadius(20);
        kButton9.setkEndColor(new java.awt.Color(0, 153, 255));
        kButton9.setkHoverColor(new java.awt.Color(153, 255, 255));
        kButton9.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton9.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton9.setkHoverStartColor(new java.awt.Color(0, 153, 255));
        kButton9.setkIndicatorColor(new java.awt.Color(192, 192, 192));
        kButton9.setkSelectedColor(new java.awt.Color(102, 204, 255));
        kButton9.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 108, 26));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_identification_documents_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_fingerprint_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_ask_question_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_true_false_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\memin\\Documents\\NetBeansProjects\\kütüphaneOtomasyonu\\img\\icons8_key_16px.png")); // NOI18N
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 645, 363));

        setSize(new java.awt.Dimension(644, 363));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
        setVisible(false);
        Login ob = null;
        try {
            ob = new Login();
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }//GEN-LAST:event_kButton7ActionPerformed
    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton9ActionPerformed
        try {
            String mysql = "Insert into kullanıcılar(isimSoyisim,TCKİMLİKNO,güvenlikSorusu,cevap,şifre) values(?,?,?,?,?) ";
            preparedStatement = connection.prepareStatement(mysql);
            preparedStatement.setString(1, txtIsimSoyisim.getText());
            preparedStatement.setString(2, txtTcKimlikNo.getText());
            preparedStatement.setString(3, (String) boxGuvenlikSorusu.getSelectedItem());
            preparedStatement.setString(4, txtCevap.getText());
            preparedStatement.setString(5, txtSifre.getText());
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Kayıt oluşturuldu.");
            txtIsimSoyisim.setText(null);
            txtCevap.setText(null);
            txtSifre.setText(null);
            txtTcKimlikNo.setText(null);

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,"Böyle bir kayıt zaten yer almaktadır.");
        }
    }//GEN-LAST:event_kButton9ActionPerformed
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked
    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_kGradientPanel1MouseDragged
    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        new Drag(kGradientPanel1).onPress(evt);
    }//GEN-LAST:event_kGradientPanel1MousePressed
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SignUp().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGuvenlikSorusu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KButton kButton7;
    private keeptoo.KButton kButton9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtCevap;
    private javax.swing.JTextField txtIsimSoyisim;
    private javax.swing.JPasswordField txtSifre;
    private javax.swing.JTextField txtTcKimlikNo;
    // End of variables declaration//GEN-END:variables
}
