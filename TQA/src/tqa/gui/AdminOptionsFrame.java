/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqa.gui;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tqa.pojo.UserProfile;

/**
 *
 * @author lenovo
 */
public class AdminOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminOptionsFrame
     * @param str
     */
    public AdminOptionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
        jlb1.setText("HELLO "+UserProfile.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlb1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrbSetAPaper = new javax.swing.JRadioButton();
        jrbEditPaper = new javax.swing.JRadioButton();
        jrbRegisterStudent = new javax.swing.JRadioButton();
        jrbViewScore = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        jlb2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("ONLINE QUIZ ADMINISTRATION PANEL");

        jlb1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jlb1.setForeground(new java.awt.Color(240, 240, 240));
        jlb1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jlb1InputMethodTextChanged(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Make A Choice");

        jrbSetAPaper.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbSetAPaper);
        jrbSetAPaper.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jrbSetAPaper.setForeground(new java.awt.Color(240, 240, 240));
        jrbSetAPaper.setText("Set A Paper");
        jrbSetAPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSetAPaperActionPerformed(evt);
            }
        });

        jrbEditPaper.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbEditPaper);
        jrbEditPaper.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jrbEditPaper.setForeground(new java.awt.Color(240, 240, 240));
        jrbEditPaper.setText("Edit Paper");
        jrbEditPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEditPaperActionPerformed(evt);
            }
        });

        jrbRegisterStudent.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbRegisterStudent);
        jrbRegisterStudent.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jrbRegisterStudent.setForeground(new java.awt.Color(240, 240, 240));
        jrbRegisterStudent.setText("Register Student");

        jrbViewScore.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(jrbViewScore);
        jrbViewScore.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jrbViewScore.setForeground(new java.awt.Color(240, 240, 240));
        jrbViewScore.setText("View Score");

        btnDoTask.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        jlb2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jlb2.setForeground(new java.awt.Color(240, 240, 240));
        jlb2.setText("Logout");
        jlb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlb2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlb2MouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\Java Workshop\\Project Notes\\project-images\\admin-icon.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlb2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 147, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbRegisterStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jrbSetAPaper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jrbEditPaper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jrbViewScore, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(btnDoTask)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlb2)
                    .addComponent(jlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jrbSetAPaper)
                        .addGap(18, 18, 18)
                        .addComponent(jrbEditPaper)
                        .addGap(18, 18, 18)
                        .addComponent(jrbRegisterStudent)
                        .addGap(18, 18, 18)
                        .addComponent(jrbViewScore)
                        .addGap(18, 18, 18)
                        .addComponent(btnDoTask))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbSetAPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSetAPaperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSetAPaperActionPerformed

    private void jlb1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jlb1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jlb1InputMethodTextChanged

    private void jlb2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb2MouseEntered
        
        Font f = new Font("Tahoma",Font.BOLD,14);
        jlb2.setFont(f);
    }//GEN-LAST:event_jlb2MouseEntered

    private void jlb2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb2MouseExited
        Font u = new Font("Tahoma",Font.ITALIC,14);
        jlb2.setFont(u);
    }//GEN-LAST:event_jlb2MouseExited

    private void jlb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb2MouseClicked
        LoginScreenFrame loginScreenFrame = new LoginScreenFrame();
        loginScreenFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlb2MouseClicked

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        String task = getAction();
        JFrame jf = null;
        if(task.equals("Set A Paper")){
           jf = new SetPaperFrame();
        }
        else if(task.equals("Edit Paper")){
            jf = new EditPaperFrame();
        }
        else if(task.equals("Register Student")){
            jf = new RegisterStudentFrame();
        }
        else {
            jf = new ViewScoresFrame();
        }
        jf.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void jrbEditPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEditPaperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEditPaperActionPerformed
        private String getAction(){
            if(jrbSetAPaper.isSelected())
                return jrbSetAPaper.getText();
            else if(jrbEditPaper.isSelected())
                    return jrbEditPaper.getText();
            else if(jrbRegisterStudent.isSelected())
                return jrbRegisterStudent.getText();
            else if(jrbViewScore.isSelected())
                return jrbViewScore.getText();
            else
            {
                JOptionPane.showMessageDialog(null,"Please Select An Option","Selection Not Made" ,JOptionPane.ERROR_MESSAGE);
                return null;
            }    
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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlb2;
    private javax.swing.JRadioButton jrbEditPaper;
    private javax.swing.JRadioButton jrbRegisterStudent;
    private javax.swing.JRadioButton jrbSetAPaper;
    private javax.swing.JRadioButton jrbViewScore;
    // End of variables declaration//GEN-END:variables
}
