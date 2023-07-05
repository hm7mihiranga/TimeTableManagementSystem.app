/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetablemanagementsystem;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;


/**
 *
 * @author Hasitha
 */
public class CreateNewResources extends javax.swing.JFrame {
    
    private static Font medium = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 18,com.itextpdf.text.Font.NORMAL);
    private static Font large = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 22,com.itextpdf.text.Font.NORMAL);

    /**
     * Creates new form CreateNewResources
     */
    
     public void ClearFields(){
        whiteboards.setText(null);
        projectors.setText(null);
        chairs.setText(null);
        other.setText(null);
        className.setText(null);

    }
     
     public void showDB(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/timetablemanagement","root","");
            Statement st = con.createStatement();
            String sql = "select * from resourcetable";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String Class_Name = rs.getString("Class_Name");
                String No_Of_Whiteboards = rs.getString("No_Of_Whiteboards");
                String No_Of_Projectors = rs.getString("No_Of_Projectors");
                String No_Of_Chairs = rs.getString("No_Of_Chairs");
                String Other_Resorces = rs.getString("Other_Resources");
                
                String tableData[] = {Class_Name,No_Of_Whiteboards,No_Of_Projectors,No_Of_Chairs,Other_Resorces};
                DefaultTableModel tableModel = (DefaultTableModel) resourcesclasstable.getModel();
                
                tableModel.addRow(tableData);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
     }
    
     public void updateDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/timetablemanagement","root","");
            Statement st = con.createStatement();
            String sql = "select * from resourcetable";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            
            ResultSetMetaData stData = rs.getMetaData();
            int q = stData.getColumnCount();
            
            //second database for backup
            Connection con_backup = DriverManager.getConnection("jdbc:mysql://localhost:3310/timetablemanagementbackup","root","");
            Statement st_backup = con_backup.createStatement();
            String sql_backup = "select * from resourcetable";
            PreparedStatement pst_backup = con_backup.prepareStatement(sql);
            ResultSet rs_backup = pst_backup.executeQuery(sql);
            
            ResultSetMetaData stData_backup = rs_backup.getMetaData();
            int q_backup = stData_backup.getColumnCount();
            
             while(rs_backup.next()){
                Vector ColumnData = new Vector();
                for(int i=1;i<=q;i++){
                    ColumnData.add(rs_backup.getString("Class_Name"));
                    ColumnData.add(rs_backup.getString("No_Of_Whiteboards"));
                    ColumnData.add(rs_backup.getString("No_Of_Projectors"));
                    ColumnData.add(rs_backup.getString("No_Of_Chairs"));
                    ColumnData.add(rs_backup.getString("Other_Resources"));

                }
//                RecordTable.addRow(ColumnData);
            }
            // databse backup is over
            
            DefaultTableModel RecordTable = (DefaultTableModel) resourcesclasstable.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector ColumnData = new Vector();
                for(int i=1;i<=q;i++){
                    ColumnData.add(rs.getString("Class_Name"));
                    ColumnData.add(rs.getString("No_Of_Whiteboards"));
                    ColumnData.add(rs.getString("No_Of_Projectors"));
                    ColumnData.add(rs.getString("No_Of_Chairs"));
                    ColumnData.add(rs.getString("Other_Resources"));

                }
                RecordTable.addRow(ColumnData);
            }
            con.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
    public CreateNewResources() {
         this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hasitha\\Documents\\NetBeansProjects\\TimeTableManagementSystem\\src\\timetablemanagementsystem\\hasi.png"));
//        showDB();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        whiteboards = new javax.swing.JTextField();
        projectors = new javax.swing.JTextField();
        chairs = new javax.swing.JTextField();
        other = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        show = new javax.swing.JButton();
        created = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        className = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resourcesclasstable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("No of Whiteboards      :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 110, 140, 16);

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("No of Projectors         :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 150, 140, 16);

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("No of Chairs               :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 190, 140, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Other Resorces      :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 230, 140, 17);
        jPanel1.add(whiteboards);
        whiteboards.setBounds(240, 110, 50, 22);
        jPanel1.add(projectors);
        projectors.setBounds(240, 150, 50, 22);

        chairs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chairsActionPerformed(evt);
            }
        });
        jPanel1.add(chairs);
        chairs.setBounds(240, 190, 50, 22);
        jPanel1.add(other);
        other.setBounds(80, 290, 420, 160);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(400, 530, 63, 25);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(580, 530, 59, 25);

        show.setText("Show_Data");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show);
        show.setBounds(90, 530, 100, 25);

        created.setText("Created");
        created.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createdActionPerformed(evt);
            }
        });
        jPanel1.add(created);
        created.setBounds(300, 530, 77, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Create New/Update");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 40, 440, 40);

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(210, 530, 73, 25);

        jButton3.setText("Get_PDF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(480, 530, 81, 25);

        className.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        className.setForeground(new java.awt.Color(255, 255, 255));
        className.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        className.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                classNameAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(className);
        className.setBounds(620, 100, 130, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timetablemanagementsystem/background2.jpg"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(-10, 0, 810, 580);

        resourcesclasstable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resourcesclasstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class_Name", "No_Of_Whiteboard", "No_Of_Projectors", "No_Of_Chairs", "Other_Resources"
            }
        ));
        resourcesclasstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resourcesclasstableMouseClicked(evt);
            }
        });
        resourcesclasstable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resourcesclasstableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(resourcesclasstable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 610, 800, 210);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createdActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/timetablemanagement","root","");
            String sql = "insert into resourcetable (Class_Name,No_Of_Whiteboards,No_Of_Projectors,No_Of_Chairs,Other_Resources) values (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, className.getText());
            pst.setString(2, whiteboards.getText());
            pst.setString(3, projectors.getText());
            pst.setString(4, chairs.getText());
            pst.setString(5, other.getText());
            pst.executeUpdate();
            
            
            // save data into the second database for backup purposes
            Connection con_backup = DriverManager.getConnection("jdbc:mysql://localhost:3310/timetablemanagementbackup","root","");
            Statement st_backup = con_backup.createStatement();
            String sql_backup = "insert into resourcetable (Class_Name,No_Of_Whiteboards,No_Of_Projectors,No_Of_Chairs,Other_Resources) values (?,?,?,?,?)";
            PreparedStatement pst_backup = con_backup.prepareStatement(sql_backup);
            pst_backup.setString(1, className.getText());
            pst_backup.setString(2, whiteboards.getText());
            pst_backup.setString(3, projectors.getText());
            pst_backup.setString(4, chairs.getText());
            pst_backup.setString(5, other.getText());
            pst_backup.executeUpdate();
//            pst.setString(6, classname.getText());
//            pst.setString(7, noofstudent.getText());
           
            
            
         
            JOptionPane.showMessageDialog(this, "Row Is created Successfully");
            updateDB();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       ClearFields();
        
            
        
        
    }//GEN-LAST:event_createdActionPerformed

    private void chairsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chairsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chairsActionPerformed

    private void resourcesclasstableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resourcesclasstableKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_resourcesclasstableKeyPressed

    private void resourcesclasstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resourcesclasstableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) resourcesclasstable.getModel();
        int SelectedRows =resourcesclasstable.getSelectedRow();
        className.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        whiteboards.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        projectors.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        chairs.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        other.setText(RecordTable.getValueAt(SelectedRows, 4).toString());

    }//GEN-LAST:event_resourcesclasstableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/timetablemanagement","root","");
            String sql ="update resourcetable set No_Of_Whiteboards =?, No_Of_Projectors =?, No_Of_Chairs =?, Other_Resources =? where Class_Name =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(5, className.getText());
            pst.setString(1, whiteboards.getText());
            pst.setString(2, projectors.getText());
            pst.setString(3, chairs.getText());
            pst.setString(4, other.getText());            
            
            pst.executeUpdate();
            
            // second database for backup purpose
            Class.forName("com.mysql.jdbc.Driver");
            Connection con_backup = DriverManager.getConnection("jdbc:mysql://localhost:3310/timetablemanagementbackup","root","");
            String sql_backup ="update resourcetable set No_Of_Whiteboards =?, No_Of_Projectors =?, No_Of_Chairs =?, Other_Resources =? where Class_Name =?";
            PreparedStatement pst_backup = con_backup.prepareStatement(sql_backup);
            pst_backup.setString(5, className.getText());
            pst_backup.setString(1, whiteboards.getText());
            pst_backup.setString(2, projectors.getText());
            pst_backup.setString(3, chairs.getText());
            pst_backup.setString(4, other.getText());            
            
            pst_backup.executeUpdate();
            // backup is over
         
            JOptionPane.showMessageDialog(this, "Row Is updated Successfully");
            updateDB();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        showDB();
    }//GEN-LAST:event_showActionPerformed

    private void classNameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_classNameAncestorAdded
        // TODO add your handling code here:
//        String name = className.getText();
//         DefaultTableModel RecordTable = (DefaultTableModel) resourcesclasstable.getModel();
//        TableRowSorter<DefaultTableModel> RecordTable1 = new TableRowSorter<>(RecordTable);
//        resourcesclasstable.setRowSorter(RecordTable1);
//        RecordTable1.setRowFilter(RowFilter.regexFilter(name));
try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/timetablemanagement","root","");
            Statement st = con.createStatement();
            String sql = "select * from resourcetable where Class_Name=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,className.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String Class_Name = rs.getString("Class_Name");
                className.setText(Class_Name);
                String No_Of_Whiteboards = rs.getString("No_Of_Whiteboards");
                whiteboards.setText(No_Of_Whiteboards);
                String No_Of_Projectors = rs.getString("No_Of_Projectors");
                projectors.setText(No_Of_Projectors);
                String No_Of_Chairs = rs.getString("No_Of_Chairs");
                chairs.setText(No_Of_Chairs);
                String Other_Resorces = rs.getString("Other_Resources");
                other.setText(Other_Resorces);
                
                String tableData[] = {Class_Name,No_Of_Whiteboards,No_Of_Projectors,No_Of_Chairs,Other_Resorces};
                DefaultTableModel tableModel = (DefaultTableModel) resourcesclasstable.getModel();
                
                tableModel.addRow(tableData);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
            
    }//GEN-LAST:event_classNameAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ClearFields();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ResourceModule back = new ResourceModule();
        this.setVisible(false);
        back.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String path ="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        
        if(x ==JFileChooser.APPROVE_OPTION){
            path = j.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter writer = PdfWriter.getInstance(doc,new FileOutputStream(path+"\\ClassField.pdf"));
            doc.open();
            Paragraph p = new Paragraph("RESOURCES TABLE",large);
            p.setAlignment(Paragraph.ALIGN_CENTER);
            doc.add(p);
            
            Paragraph p1 = new Paragraph(" ");
            p1.setAlignment(Paragraph.ALIGN_CENTER);
            doc.add(p1);
            PdfPTable tbl = new PdfPTable(5);
            tbl.addCell("Class_Name");
            tbl.addCell("No_Of_Whiteboards");
            tbl.addCell("No_Of_Projectors");
            tbl.addCell("No_Of_Chairs");
            tbl.addCell("Other_Resources");

             
             for(int i=0; i<resourcesclasstable.getRowCount(); i++){
                 String ClassName = resourcesclasstable.getValueAt(i, 0).toString();
                 String No_Of_whiteboards = resourcesclasstable.getValueAt(i, 1).toString();
                 String No_Of_projectors = resourcesclasstable.getValueAt(i, 2).toString();
                 String No_Of_chairs = resourcesclasstable.getValueAt(i, 3).toString();
                 String Other_resources = resourcesclasstable.getValueAt(i, 4).toString();
                
                 
                 tbl.addCell(ClassName);
                 tbl.addCell(No_Of_whiteboards);
                 tbl.addCell(No_Of_projectors);
                 tbl.addCell(No_Of_chairs);
                 tbl.addCell(Other_resources);
//                 tbl.addCell(Class);
//                 tbl.addCell(Sstudent);
                            
             }
             
             doc.add(tbl);
             JOptionPane.showMessageDialog(null, "Download PDF file", "Alert Msg", JOptionPane.WARNING_MESSAGE);
             doc.close();
             writer.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportingModule.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ReportingModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateNewResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewResources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateNewResources l = new CreateNewResources();
//                l.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hasitha\\Documents\\NetBeansProjects\\TimeTableManagementSystem\\src\\timetablemanagementsystem\\hasi.png"));
                l.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField chairs;
    public javax.swing.JLabel className;
    private javax.swing.JButton created;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField other;
    private javax.swing.JTextField projectors;
    private javax.swing.JTable resourcesclasstable;
    private javax.swing.JButton show;
    private javax.swing.JButton update;
    private javax.swing.JTextField whiteboards;
    // End of variables declaration//GEN-END:variables
}
