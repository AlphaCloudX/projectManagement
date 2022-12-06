/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectmanagment;

/**
 *
 * @author miczo4487
 */
public class MainMenu extends javax.swing.JFrame {
    
    //Quiz Window
    private QuizForm quizWindow;
    //Study Note Window
    private StudyNote studyPageWindow;
    
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        this.version.setText("Version 1.0");
    }

    /**
     * Exit Button that exits
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        studyNotePage = new javax.swing.JButton();
        startQuizBtn = new javax.swing.JButton();
        version = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("MAIN MENU");

        studyNotePage.setText("Study Your Notes");
        studyNotePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyNotePageActionPerformed(evt);
            }
        });

        startQuizBtn.setText("Start Quiz");
        startQuizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startQuizBtnActionPerformed(evt);
            }
        });

        version.setText("Version 1.0");

        jButton3.setText("Exit Program");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(studyNotePage))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(134, 134, 134))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(startQuizBtn)
                            .addGap(156, 156, 156)))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(version)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studyNotePage)
                .addGap(25, 25, 25)
                .addComponent(startQuizBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(version))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Exit program when the quit button is pressed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void startQuizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startQuizBtnActionPerformed
        // TODO add your handling code here:
        // Create Quiz Window
        if(quizWindow == null){
            quizWindow = new QuizForm(this);
        }
        //Quiz window frame is now visible
        quizWindow.setVisible(true);
        
        //Set This Window to not be visible
        this.setVisible(false);
    }//GEN-LAST:event_startQuizBtnActionPerformed

    private void studyNotePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyNotePageActionPerformed
        // TODO add your handling code here:
        // Create Quiz Window
        if(studyPageWindow == null){
            studyPageWindow = new StudyNote(this);
        }
        //Quiz window frame is now visible
        studyPageWindow.setVisible(true);
        
        //Set This Window to not be visible
        this.setVisible(false);
    }//GEN-LAST:event_studyNotePageActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton startQuizBtn;
    private javax.swing.JButton studyNotePage;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
