/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package business.FacultyDirectory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import ui.DatabaseConnection;
/**
 *
 * @author Atharva
 */
public class CoursesTaughtJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CoursesTaughtJPanel
     */

    public CoursesTaughtJPanel(String username) {
        initComponents();
        loadCourses(username);
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
        tableCourse = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tableCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CourseID", "CourseName", "Description", "Credits", "MaximumStudents", "Schedule"
            }
        ));
        jScrollPane1.setViewportView(tableCourse);

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Courses Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void loadCourses(String username) {
    DefaultTableModel model = (DefaultTableModel) tableCourse.getModel();
    model.setRowCount(0); // Clear the existing table data

    String query = "SELECT c.* FROM courses c " +
                   "JOIN faculty f ON c.EmployeeID = f.EmployeeID " +
                   "WHERE f.Username = ?";
    
    try (Connection connection = DatabaseConnection.getConnection();
     PreparedStatement pst = connection.prepareStatement(query)) {
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();
        
        while (rs.next()) {
            int courseID = rs.getInt("CourseID");
            String courseName = rs.getString("CourseName");
            String description = rs.getString("Description");
            int credits = rs.getInt("Credits");
            int maxStudents = rs.getInt("MaximumStudents");
            String schedule = rs.getString("Schedule");

            model.addRow(new Object[]{courseID, courseName, description, credits, maxStudents, schedule});
        }
    } catch (SQLException ex) {
        // Handle any SQL errors here
        ex.printStackTrace();
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCourse;
    // End of variables declaration//GEN-END:variables
}
