/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetablemanagementsystem;


import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Hasitha
 */
public class ResourceModule extends javax.swing.JFrame {

    /**
     * Creates new form ResourceModule
     */
    public ResourceModule() {
         this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hasitha\\Documents\\NetBeansProjects\\TimeTableManagementSystem\\src\\timetablemanagementsystem\\hasi.png"));
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Classname = new javax.swing.JTextField();
        createnew = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        background7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("RESOURCE MODULE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 50, 420, 60);

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Class Name     :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 230, 100, 16);
        jPanel1.add(Classname);
        Classname.setBounds(160, 220, 150, 30);

        createnew.setText("Create New");
        createnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createnewActionPerformed(evt);
            }
        });
        jPanel1.add(createnew);
        createnew.setBounds(200, 540, 110, 25);

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(330, 540, 73, 25);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(420, 540, 59, 25);

        cancel.setText("Clear");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(500, 540, 79, 25);

        background7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetablemanagementsystem/background2.jpg"))); // NOI18N
        jPanel1.add(background7);
        background7.setBounds(0, -20, 610, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createnewActionPerformed
        // TODO add your handling code here:
        CreateNewResources update = new  CreateNewResources();
        update.className.setText(Classname.getText());
        this.setVisible(false);
        update.setVisible(true);
        
        
        
    }//GEN-LAST:event_createnewActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        CreateNewResources update = new  CreateNewResources();
        update.className.setText(Classname.getText());
        this.setVisible(false);
        update.setVisible(true);
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Dashboard back = new Dashboard();
        this.setVisible(false);
        back.setVisible(true);
        
    }//GEN-LAST:event_backActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        Classname.setText("");
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(ResourceModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResourceModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResourceModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResourceModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResourceModule l = new ResourceModule();
//                l.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hasitha\\Documents\\NetBeansProjects\\TimeTableManagementSystem\\src\\timetablemanagementsystem\\hasi.png"));
                l.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Classname;
    private javax.swing.JButton Update;
    private javax.swing.JButton back;
    private javax.swing.JLabel background7;
    private javax.swing.JButton cancel;
    private javax.swing.JButton createnew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}