/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krasimir
 */
public class License extends javax.swing.JFrame {

    /**
     * Creates new form License
     */
    public License() {
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

        bg = new javax.swing.ButtonGroup();
        licenseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textTextArea = new javax.swing.JTextArea();
        agreeRB = new javax.swing.JRadioButton();
        declineRB = new javax.swing.JRadioButton();
        instalButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("License Agreement");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        licenseLabel.setText("License Agreement");

        textTextArea.setEditable(false);
        textTextArea.setColumns(20);
        textTextArea.setRows(5);
        textTextArea.setText("nqkakav tekst tuka\nnqkakav tekst tuka\nnqkakav tekst tuka\nnqkakav tekst tuka\nnqkakav tekst tuka\nnqkakav tekst tuka");
        jScrollPane1.setViewportView(textTextArea);

        agreeRB.setText("Agree");
        agreeRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeRBActionPerformed(evt);
            }
        });

        declineRB.setText("Decline");
        declineRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineRBActionPerformed(evt);
            }
        });

        instalButton.setText("Install");
        instalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(licenseLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instalButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(agreeRB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(declineRB)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(licenseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agreeRB)
                    .addComponent(declineRB))
                .addGap(11, 11, 11)
                .addComponent(instalButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void instalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instalButtonActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_instalButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        bg.add(agreeRB);
        bg.add(declineRB);
    }//GEN-LAST:event_formWindowOpened

    private void agreeRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeRBActionPerformed
        // TODO add your handling code here:
        instalButton.setEnabled(true);
    }//GEN-LAST:event_agreeRBActionPerformed

    private void declineRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineRBActionPerformed
        // TODO add your handling code here:
        instalButton.setEnabled(false);
    }//GEN-LAST:event_declineRBActionPerformed

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
            java.util.logging.Logger.getLogger(License.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(License.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(License.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(License.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new License().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton agreeRB;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JRadioButton declineRB;
    private javax.swing.JButton instalButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel licenseLabel;
    private javax.swing.JTextArea textTextArea;
    // End of variables declaration//GEN-END:variables
}