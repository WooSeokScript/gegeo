/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.net.*;
import java.net.Socket;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Seok17
 */
public class RoomList extends javax.swing.JFrame {
    private Socket socket;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private String name;
    private String id;
    private String[] roomName;
    private int roomID;
    private int[] roomIdArr;
    /**
     * Creates new form RoomList
     */
    public RoomList(){
        this.name = "Unknown";
        this.id= "Unknown";
        try{
            this.init();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    public RoomList(String name, String id) {
        this.name = name;
        this.id = id;
        initComponents();
        try{
            this.init();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getId(){
        return this.id;
    }

     public void init() throws IOException {
      socket = new Socket("localhost", 5000); //주소로 소켓 접속
      System.out.println("connected...");
      oos = new ObjectOutputStream(socket.getOutputStream());
      ois = new ObjectInputStream(socket.getInputStream());
      

   }
    
     public String[] refresh(){
        int roomLen =UserDao.getInstance().getRoomLen();
        roomName = new String[roomLen];
        roomIdArr= new int[roomLen];
        try{
            var dao = UserDao.getInstance().getRoomInfo();
            System.out.print(roomLen);// TODO add your handling code here:
            for(int i =1; i<roomLen; i++){
                roomName[i-1] = new String(i+"번방   "+dao.get(i).getRoomName());
                roomIdArr[i-1] = dao.get(i).getroomId();
            }
            return roomName;
        }catch(Exception e){
            e.printStackTrace();
        }
        return roomName;
     }    
     
    public ObjectInputStream getOis(){
        return ois;
    }
    
    public ObjectOutputStream getOos(){
        return oos;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        makeRoom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JRoomList = new javax.swing.JList(refresh());
        jPanel2 = new javax.swing.JPanel();
        refreshBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GGeTalk - RoomList");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(54, 57, 63));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("휴먼엑스포", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("아이디");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("휴먼엑스포", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("닉네임");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("휴먼엑스포", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");
        jLabel4.setText(id);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("휴먼엑스포", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("name");
        jLabel5.setText(name);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        jPanel4.setBackground(new java.awt.Color(54, 57, 63));

        makeRoom.setBackground(new java.awt.Color(54, 57, 63));
        makeRoom.setFont(new java.awt.Font("휴먼엑스포", 0, 20)); // NOI18N
        makeRoom.setForeground(new java.awt.Color(255, 255, 255));
        makeRoom.setText("방생성");
        makeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkRoomBtnClick(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(makeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(makeRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 260, 90));

        JRoomList.setBackground(new java.awt.Color(64, 68, 75));
        JRoomList.setFont(new java.awt.Font("휴먼엑스포", 0, 16)); // NOI18N
        JRoomList.setForeground(new java.awt.Color(255, 255, 255));
        JRoomList.setSelectionBackground(new java.awt.Color(57, 60, 65));
        JRoomList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JRoomListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JRoomList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 260, 440));

        jPanel2.setBackground(new java.awt.Color(54, 57, 63));

        refreshBtn.setBackground(new java.awt.Color(54, 57, 63));
        refreshBtn.setFont(new java.awt.Font("휴먼엑스포", 0, 20)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("R");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshBtn)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(refreshBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 140, 530));

        jPanel5.setBackground(new java.awt.Color(54, 57, 63));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 300, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   // 방번호리턴 함수 
    private void mkRoomBtnClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkRoomBtnClick
        String roomName = JOptionPane.showInputDialog("방 제목을 입력해주세요!");   // TODO add your handling code here:
        int ok = 0;
        int chk =0;
        if(roomName == null || roomName ==" " || roomName == "" || roomName.length() > 15 ){
                chk =1;
                roomName = JOptionPane.showInputDialog("방 제목을 다시 입력해주세요!");
        }else if(chk==0){
                ok = UserDao.getInstance().insertRoom(roomName);
            }
        
        refresh();
    }//GEN-LAST:event_mkRoomBtnClick

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        JList JRoomRe = new JList(refresh());
        JRoomRe.setBackground(new java.awt.Color(64, 68, 75));
        JRoomRe.setFont(new java.awt.Font("휴먼엑스포", 0, 16)); // NOI18N
        JRoomRe.setForeground(new java.awt.Color(255, 255, 255));
        JRoomRe.setSelectionBackground(new java.awt.Color(57, 60, 65));
        jScrollPane1.setViewportView(JRoomRe);
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void JRoomListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JRoomListMouseClicked
       JList list = (JList)evt.getSource();
       if(evt.getClickCount()==2){
           new ChattingRoom(roomIdArr[list.getSelectedIndex()], roomName[list.getSelectedIndex()], this).setVisible(true);
       }
    }//GEN-LAST:event_JRoomListMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(RoomList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new RoomList().setVisible(true);
               
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JRoomList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeRoom;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
}