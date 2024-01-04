/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import business.AdminDirectory.AdminJPanel;
import business.CafeOrgDirectory.CafeAccountJPanel;
import business.CafeOrgDirectory.CafeteriaManagerJPanel;
import business.ITorgDirectory.DatabaseAnalystJPanel;
import business.ITorgDirectory.ITManagerJPanel;
import business.LibOrgDirectory.CatalogueLibJPanel;
import business.LibOrgDirectory.HeadLibJPanel;
import business.StudentDirectory.StuTranscriptJPanel;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Atharv Joshi
 */
public class OrganisationJFrame extends javax.swing.JFrame {

    /**
     * Creates new form OrganisationJFrame
     */
    public OrganisationJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblbackbutton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/login.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 390, 830));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Organisational Login Form");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hello, Let Get Started !\n");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("_________________________________");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");

        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("________________________________");

        lblbackbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbackbutton.setForeground(new java.awt.Color(255, 255, 255));
        lblbackbutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbackbutton.setText("<< Back to Home Page");
        lblbackbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbackbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(207, 260, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblbackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(78, 78, 78)
                .addComponent(lblbackbutton)
                .addContainerGap(421, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 770, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String enteredUsername = txtusername.getText();
    String enteredPassword = new String(txtpassword.getPassword());
 
    // Fetch access code from the database based on the entered username
    int accessCode = fetchAccessCodeFromDatabase(enteredUsername);
 
    // Use if-else statements for different access codes
    if (accessCode == 1) {
        // Access allowed for users with access code 1
        performAccessCode1Checks(enteredUsername, enteredPassword);
    } else if (accessCode == 0) {
        // Access denied for users with access code 0
        JOptionPane.showMessageDialog(this, "You have no access", "Login Failed", JOptionPane.ERROR_MESSAGE);
    } else {
        // Invalid username
        JOptionPane.showMessageDialog(this, "Invalid username", "Login Failed", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnLoginActionPerformed

private void performAccessCode1Checks(String enteredUsername, String enteredPassword) {
    // Check password for users with access code 1
    switch (enteredUsername) {
        case "Cafeteriaaccountant@university.com":
            if (enteredPassword.equals("123456")) {
                // Allow access
                openCafeteriaAccountJPanel();
            } else {
                // Deny access
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
            break;
        case "Cafeteriamanager@university.com":
            if (enteredPassword.equals("123456")) {
                // Allow access
                openCafeteriaManagerJPanel();
            } else {
                // Deny access
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
            break;
            case "Headlibrarian@university.com":
            if (enteredPassword.equals("123456")) {
                // Allow access
                openHeadLibrarianJPanel();
            } else {
                // Deny access
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
            break;
            case "Cataloguespecialist@university.com":
            if (enteredPassword.equals("123456")) {
                // Allow access
                openCatalogueSpecialistJPanel();
            } else {
                // Deny access
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
            break;
            case "Databaseanalyst@university.com":
            if (enteredPassword.equals("123456")) {
                // Allow access
                openDatabaseAnalystPanel();
            } else {
                // Deny access
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
            break;
            case "Itmanager@university.com":
            if (enteredPassword.equals("123456")) {
                // Allow access
                openITManagerPanel();
            } else {
                // Deny access
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
            break;
            case "Administrator@university.com":
            if (enteredPassword.equals("123456")) {
                // Allow access
                openAdminstratorPanel(); 
            } else {
                // Deny access
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
            break;
            case "Transcriptauthority@university.com":
            if (enteredPassword.equals("123456")) {
                // Allow access
                openTranscriptAuthorityPanel();
            } else {
                // Deny access
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
            break;
        // Add cases for other usernames as needed
        default:
            // Invalid username
            JOptionPane.showMessageDialog(this, "Invalid username", "Login Failed", JOptionPane.ERROR_MESSAGE);
            break;
    }
    }
    private int fetchAccessCodeFromDatabase(String username) {
    int accessCode = 0;
 
    try {
        // Replace the following lines with your actual database connection logic
        Connection connection = DatabaseConnection.getConnection();
 
        String query = "SELECT AccessCode FROM accesscontroller WHERE EnterpriseName = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
 
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    accessCode = resultSet.getInt("AccessCode");
                }
            }
        }
 
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
 
    return accessCode;
}    
    
    
    private void lblbackbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbackbuttonMouseClicked
        // TODO add your handling code here:
        UniversitySelectionJFrame universityFrame = new UniversitySelectionJFrame();
        universityFrame.setLocationRelativeTo(null);
        // Set the new login frame visible and dispose the current frame
        universityFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblbackbuttonMouseClicked

    private void openCafeteriaAccountJPanel() {
        // If the credentials are correct and access is allowed, create a new JFrame
        JFrame frame = new JFrame("Cafeteria Accountant Panel");

        // Set the layout (you can choose a different layout if needed)
        frame.setLayout(new BorderLayout());

        // Add your CafeteriaAccountJPanel to the frame
        CafeAccountJPanel cafeteriaAccountJPanel = new CafeAccountJPanel();
        frame.add(cafeteriaAccountJPanel, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(800, 800);  // Set the size as needed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);

        // Dispose the current frame
        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblbackbutton;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

    private void openCafeteriaManagerJPanel()
   {
      // If the credentials are correct and access is allowed, create a new JFrame
        JFrame frame = new JFrame("Cafeteria Manager Panel");

        // Set the layout (you can choose a different layout if needed)
        frame.setLayout(new BorderLayout());

        // Add your CafeteriaAccountJPanel to the frame
        CafeteriaManagerJPanel cafeteriaAccountJPanel = new CafeteriaManagerJPanel();
        frame.add(cafeteriaAccountJPanel, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(800, 800);  // Set the size as needed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);

        // Dispose the current frame
        dispose();  
   }

    private void openHeadLibrarianJPanel()
    {
        // If the credentials are correct and access is allowed, create a new JFrame
        JFrame frame = new JFrame("Head Librarian Panel");

        // Set the layout (you can choose a different layout if needed)
        frame.setLayout(new BorderLayout());

        // Add your CafeteriaAccountJPanel to the frame
        HeadLibJPanel cafeteriaAccountJPanel = new HeadLibJPanel();
        frame.add(cafeteriaAccountJPanel, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(800, 800);  // Set the size as needed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);

        // Dispose the current frame
        dispose();  
    }

    private void openCatalogueSpecialistJPanel()
   {
               // If the credentials are correct and access is allowed, create a new JFrame
        JFrame frame = new JFrame("Catalogue Specialist Panel");

        // Set the layout (you can choose a different layout if needed)
        frame.setLayout(new BorderLayout());

        // Add your CafeteriaAccountJPanel to the frame
        CatalogueLibJPanel cafeteriaAccountJPanel = new CatalogueLibJPanel();
        frame.add(cafeteriaAccountJPanel, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(800, 800);  // Set the size as needed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);

        // Dispose the current frame
        dispose();
   }

    private void openDatabaseAnalystPanel()
   {
        JFrame frame = new JFrame("Database Anlyst Panel");

        // Set the layout (you can choose a different layout if needed)
        frame.setLayout(new BorderLayout());

        // Add your CafeteriaAccountJPanel to the frame
        DatabaseAnalystJPanel cafeteriaAccountJPanel = new DatabaseAnalystJPanel();
        frame.add(cafeteriaAccountJPanel, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(800, 800);  // Set the size as needed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);

        // Dispose the current frame
        dispose();
   }

    private void openITManagerPanel()
   {
       JFrame frame = new JFrame("IT Manager Panel");

        // Set the layout (you can choose a different layout if needed)
        frame.setLayout(new BorderLayout());

        // Add your CafeteriaAccountJPanel to the frame
        ITManagerJPanel cafeteriaAccountJPanel = new ITManagerJPanel();
        frame.add(cafeteriaAccountJPanel, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(800, 800);  // Set the size as needed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);

        // Dispose the current frame
        dispose();
   }

    private void openAdminstratorPanel() 
   {
        JFrame frame = new JFrame("IT Manager Panel");

        // Set the layout (you can choose a different layout if needed)
        frame.setLayout(new BorderLayout());

        // Add your CafeteriaAccountJPanel to the frame
        AdminJPanel cafeteriaAccountJPanel = new AdminJPanel();
        frame.add(cafeteriaAccountJPanel, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(800, 800);  // Set the size as needed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);

        // Dispose the current frame
        dispose();
   }

    private void openTranscriptAuthorityPanel()
  
  {
      JFrame frame = new JFrame("IT Manager Panel");

        // Set the layout (you can choose a different layout if needed)
        frame.setLayout(new BorderLayout());
        StuTranscriptJPanel transcriptJPanel = new StuTranscriptJPanel();
        frame.add(transcriptJPanel, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(800, 800);  // Set the size as needed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);

        // Dispose the current frame
        dispose();
  }
    
}