/*
 * Study Note window
 * for letting user checking and read note
 */
package projectmanagment;

import java.util.ArrayList;

/**
 *
 * @author yuzha3124
 */
public class StudyNote extends javax.swing.JFrame {

    MainMenu mainMenuWindow;

    /**
     * Creates new form StudyNote
     * @param m - main menu of the program
     */
    public StudyNote(MainMenu m) {
        initComponents();
        mainMenuWindow = m;
        
        //Set the text of the notes
        noteBoxText.setText(readNotes());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btmGoback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        noteBox = new javax.swing.JScrollPane();
        noteBoxText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btmGoback.setText("Back To Main Menu");
        btmGoback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmGobackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Study Note");

        noteBoxText.setEditable(false);
        noteBoxText.setColumns(20);
        noteBoxText.setRows(5);
        noteBox.setViewportView(noteBoxText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btmGoback))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(noteBox, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noteBox, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btmGoback)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String readNotes() {
        //Store the message
        String msg = "";
        
        //Read the questions and their notes
        ArrayList<Question> data = DataLoader.readQuestions();
        
        //Add each note
        for(Question q : data){
            msg+=q.getFeedback() + "\n\n";
        }
        
        //Remove the last 2 new lines
        return msg.substring(0, msg.length()-2);
    }
    private void btmGobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmGobackActionPerformed
        // Create main Window
        //Main window frame is now visible
        mainMenuWindow.setVisible(true);
        
        //Set Current Window to not visible
        this.setVisible(false);
    }//GEN-LAST:event_btmGobackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmGoback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane noteBox;
    private javax.swing.JTextArea noteBoxText;
    // End of variables declaration//GEN-END:variables
}
