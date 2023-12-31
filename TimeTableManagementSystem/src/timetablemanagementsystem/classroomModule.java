/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetablemanagementsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hasitha
 */
public class classroomModule extends javax.swing.JFrame {
    String Class_Name;

    /**
     * Creates new form classroomModule
     */
    public classroomModule() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        seats = new javax.swing.JTextField();
        whiteboards = new javax.swing.JTextField();
        projectors = new javax.swing.JTextField();
        book = new javax.swing.JButton();
        availableclasses = new javax.swing.JButton();
        back = new javax.swing.JButton();
        background5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        classRoomModule = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("CLASSROOM MODULE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 30, 400, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Enter Seating Capacity   :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 190, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("No of WhiteBoards         :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 250, 190, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("No of Projectors             :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 310, 180, 17);
        jPanel1.add(seats);
        seats.setBounds(240, 192, 240, 30);
        jPanel1.add(whiteboards);
        whiteboards.setBounds(240, 240, 240, 30);

        projectors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectorsActionPerformed(evt);
            }
        });
        jPanel1.add(projectors);
        projectors.setBounds(240, 300, 240, 30);

        book.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        book.setText("Book");
        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookMouseClicked(evt);
            }
        });
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        jPanel1.add(book);
        book.setBounds(190, 510, 90, 25);

        availableclasses.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        availableclasses.setText("Available Classes");
        availableclasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableclassesActionPerformed(evt);
            }
        });
        jPanel1.add(availableclasses);
        availableclasses.setBounds(290, 510, 150, 25);

        back.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(450, 510, 70, 25);

        background5.setForeground(new java.awt.Color(240, 240, 240));
        background5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetablemanagementsystem/background2.jpg"))); // NOI18N
        jPanel1.add(background5);
        background5.setBounds(0, 0, 570, 570);

        classRoomModule.setBackground(new java.awt.Color(255, 51, 51));
        classRoomModule.setForeground(new java.awt.Color(240, 240, 240));
        classRoomModule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class_Name", "No_Of_Whiteboards", "No_Of_Projectors", "No_Of_Chairs", "Other_Resources"
            }
        ));
        classRoomModule.setSelectionForeground(new java.awt.Color(240, 240, 240));
        jScrollPane2.setViewportView(classRoomModule);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(590, 0, 630, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
//        String value = JOptionPane.showInputDialog(this,"Enter Class name");
        SchedulingModule book = new SchedulingModule();
        this.setVisible(false);
        book.setVisible(true);
        
    }//GEN-LAST:event_bookActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Dashboard dash3 = new Dashboard();
        this.setVisible(false);
        dash3.setVisible(true);
        
    }//GEN-LAST:event_backActionPerformed

    private void availableclassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableclassesActionPerformed
        // TODO add your handling code here:
        try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/timetablemanagement","root","");
            Statement st = con.createStatement();
            String sql = "select * from resourcetable where No_Of_Whiteboards=? and No_Of_Chairs=? and No_Of_Projectors=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,whiteboards.getText());
            pst.setString(2,seats.getText());
            pst.setString(3,projectors.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Class_Name = rs.getString("Class_Name");
                
                String No_Of_Whiteboards = rs.getString("No_Of_Whiteboards");
                
                String No_Of_Projectors = rs.getString("No_Of_Projectors");
                
                String No_Of_Chairs = rs.getString("No_Of_Chairs");
                
                String Other_Resorces = rs.getString("Other_Resources");
               
                
                String tableData[] = {Class_Name,No_Of_Whiteboards,No_Of_Projectors,No_Of_Chairs,Other_Resorces};
                DefaultTableModel tableModel = (DefaultTableModel) classRoomModule.getModel();
                
                tableModel.addRow(tableData);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_availableclassesActionPerformed

    private void projectorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectorsActionPerformed

    private void bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseClicked
        // TODO add your handling code here:
        SchedulingModule passthevalue = new SchedulingModule();
        passthevalue.classname.setText(Class_Name);
        this.setVisible(false);
        passthevalue.setVisible(true);
        
    }//GEN-LAST:event_bookMouseClicked

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
            java.util.logging.Logger.getLogger(classroomModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(classroomModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(classroomModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(classroomModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                classroomModule l = new classroomModule();
//                l.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hasitha\\Documents\\NetBeansProjects\\TimeTableManagementSystem\\src\\timetablemanagementsystem\\hasi.png"));
                l.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton availableclasses;
    private javax.swing.JButton back;
    private javax.swing.JLabel background5;
    private javax.swing.JButton book;
    private javax.swing.JTable classRoomModule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField projectors;
    private javax.swing.JTextField seats;
    private javax.swing.JTextField whiteboards;
    // End of variables declaration//GEN-END:variables
}
