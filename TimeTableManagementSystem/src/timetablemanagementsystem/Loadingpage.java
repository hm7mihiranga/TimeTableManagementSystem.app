/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetablemanagementsystem;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Hasitha
 */
public class Loadingpage extends javax.swing.JFrame {

    /**
     * Creates new form Loadingpage
     */
    public Loadingpage() {
         this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hasitha\\Documents\\NetBeansProjects\\TimeTableManagementSystem\\src\\timetablemanagementsystem\\hasi.png"));
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

        loadingPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        loadinglable = new javax.swing.JLabel();
        loadingvalue = new javax.swing.JLabel();
        backgroungimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        loadingPanel.setBackground(new java.awt.Color(0, 255, 255));
        loadingPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        loadingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetablemanagementsystem/hasitha.loading.png"))); // NOI18N
        loadingPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 590, 330));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 51));
        jLabel2.setText("WELCOME TO THE TIME  TABLE MANAGEMENT SYSTEM");
        loadingPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 700, 160));
        loadingPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 900, -1));

        loadinglable.setForeground(new java.awt.Color(240, 240, 240));
        loadinglable.setText("Loading...");
        loadingPanel.add(loadinglable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        loadingvalue.setForeground(new java.awt.Color(240, 240, 240));
        loadingvalue.setText("0 %");
        loadingPanel.add(loadingvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, -1, -1));

        backgroungimage.setForeground(new java.awt.Color(240, 240, 240));
        backgroungimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetablemanagementsystem/Assets/background2.jpg"))); // NOI18N
        loadingPanel.add(backgroungimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loadingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loadingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loadingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loadingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loadingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loadingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         Loadingpage sp = new Loadingpage();    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                sp.setVisible(true);
                
            }
        });
        
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(20);
                sp.loadingvalue.setText(i + "%");

                if(i==10){
                    sp.loadinglable.setText("Turning on module.....");
                }
                if(i==20){
                    sp.loadinglable.setText("Loading module.....");
                }
                if(i==50){
                    sp.loadinglable.setText("Connecting to database.....");
                }
                if(i==70){
                    sp.loadinglable.setText("Connection successfull.....");
                }
                if(i==80){
                    sp.loadinglable.setText("Launching application.....");
                }
                
                sp.LoadingBar.setValue(i);
                        
            }
            sp.setVisible(false);
            Login frame = new Login();
            frame.setVisible(true);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel backgroungimage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel loadingPanel;
    private javax.swing.JLabel loadinglable;
    private javax.swing.JLabel loadingvalue;
    // End of variables declaration//GEN-END:variables
}