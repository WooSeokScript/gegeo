/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Seok17
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public SignUp() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        IdField = new javax.swing.JTextField();
        PwCheckField = new javax.swing.JPasswordField();
        PwField = new javax.swing.JPasswordField();
        checkID = new javax.swing.JButton();
        goBack = new javax.swing.JButton();
        LoginBtn = new javax.swing.JButton();
        checkPw = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GGeTalk - MakeID");
        setBackground(new java.awt.Color(54, 57, 63));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(54, 57, 63));

        jLabel2.setFont(new java.awt.Font("휴먼엑스포", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("이름");

        jLabel1.setFont(new java.awt.Font("휴먼엑스포", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("아이디");

        jLabel3.setFont(new java.awt.Font("휴먼엑스포", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("비밀번호");

        jLabel4.setFont(new java.awt.Font("휴먼엑스포", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("비밀번호 재입력");

        nameField.setBackground(new java.awt.Color(64, 68, 75));
        nameField.setFont(new java.awt.Font("휴먼엑스포", 0, 20)); // NOI18N
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        IdField.setBackground(new java.awt.Color(64, 68, 75));
        IdField.setFont(new java.awt.Font("휴먼엑스포", 0, 20)); // NOI18N
        IdField.setForeground(new java.awt.Color(255, 255, 255));
        IdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdFieldActionPerformed(evt);
            }
        });

        PwCheckField.setBackground(new java.awt.Color(64, 68, 75));
        PwCheckField.setFont(new java.awt.Font("휴먼엑스포", 0, 20)); // NOI18N
        PwCheckField.setForeground(new java.awt.Color(255, 255, 255));
        PwCheckField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwCheckFieldActionPerformed(evt);
            }
        });
        PwCheckField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PwCheckFieldKeyReleased(evt);
            }
        });

        PwField.setBackground(new java.awt.Color(64, 68, 75));
        PwField.setFont(new java.awt.Font("휴먼엑스포", 0, 20)); // NOI18N
        PwField.setForeground(new java.awt.Color(255, 255, 255));
        PwField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwFieldActionPerformed(evt);
            }
        });
        PwField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PwFieldKeyReleased(evt);
            }
        });

        checkID.setBackground(new java.awt.Color(64, 68, 75));
        checkID.setFont(new java.awt.Font("휴먼엑스포", 0, 20)); // NOI18N
        checkID.setForeground(new java.awt.Color(255, 255, 255));
        checkID.setText("중복확인");
        checkID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIDActionPerformed(evt);
            }
        });

        goBack.setBackground(new java.awt.Color(64, 68, 75));
        goBack.setFont(new java.awt.Font("휴먼엑스포", 0, 20)); // NOI18N
        goBack.setForeground(new java.awt.Color(255, 255, 255));
        goBack.setText("뒤로가기");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        LoginBtn.setBackground(new java.awt.Color(64, 68, 75));
        LoginBtn.setFont(new java.awt.Font("휴먼엑스포", 0, 20)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("회원가입");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        checkPw.setFont(new java.awt.Font("휴먼엑스포", 0, 20)); // NOI18N
        checkPw.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IdField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkID))
                    .addComponent(jLabel3)
                    .addComponent(PwField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(PwCheckField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LoginBtn)
                        .addGap(50, 50, 50)
                        .addComponent(goBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(checkPw, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(PwField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PwCheckField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(479, 479, 479)
                    .addComponent(checkPw, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
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

    private void IdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdFieldActionPerformed
        login.setId(IdField.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_IdFieldActionPerformed

    private void checkIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIDActionPerformed
       boolean chk;
       boolean idNullChk = true;
       chk = UserDao.getInstance().check(IdField.getText());
       if(IdField.getText().equals("")){
           JOptionPane.showMessageDialog(null, "공백문자는 사용할 수 없습니다!");
           idchk = true;
           idNullChk = true;
       }else{
           idNullChk = false;
       }
       if(chk == true && idNullChk==false){
           JOptionPane.showMessageDialog(null, "이미 사용중인 아이디입니다.");
           IdField.setText("");
           idchk = false;
           return;
       }else if(idNullChk == false){
           JOptionPane.showMessageDialog(null, "사용 가능한 아이디입니다.");
           idchk = true;
       }
// TODO add your handling code here:
    }//GEN-LAST:event_checkIDActionPerformed

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_goBackActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        int loginOk;
        
        if((new String(PwField.getPassword()).equals("") || IdField.getText().equals("") || nameField.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "공백문자는 사용할 수 없습니다!");
            isNull=true;
        }
        
        if(!new String(PwField.getPassword()).equals(new String(PwCheckField.getPassword()))){
            checkPw.setText("비밀번호가 일치하지 않습니다!!");
            pwchk = false;
        }else if(new String(PwField.getPassword()).equals(new String(PwCheckField.getPassword()))){
            pwchk = true;
            checkPw.setText(" ");
          
        }  
        if(pwchk==true && idchk == true && isNull==false){
            loginOk = UserDao.getInstance().insert(IdField.getText(), new String(PwField.getPassword()), nameField.getText());
            // TODO add your handling code here:
            if(loginOk !=0 && idchk == true){
                JOptionPane.showMessageDialog(null, "회원가입성공");
                dispose();
            }
        }else if(pwchk==true && idchk == false && isNull==false){
            JOptionPane.showMessageDialog(null, "아이디 중복 확인을 해주세요!");
        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
          
     // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void PwFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PwFieldActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_PwFieldActionPerformed

    private void PwCheckFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PwCheckFieldActionPerformed
              // TODO add your handling code here:
    }//GEN-LAST:event_PwCheckFieldActionPerformed

    private void PwFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PwFieldKeyReleased
        
    }//GEN-LAST:event_PwFieldKeyReleased

    private void PwCheckFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PwCheckFieldKeyReleased

    }//GEN-LAST:event_PwCheckFieldKeyReleased

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }
    
    boolean isNull = false;
    boolean idchk = false;
    boolean pwchk = true;
    public UserAccount login = new UserAccount();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdField;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField PwCheckField;
    private javax.swing.JPasswordField PwField;
    private javax.swing.JButton checkID;
    private javax.swing.JLabel checkPw;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
