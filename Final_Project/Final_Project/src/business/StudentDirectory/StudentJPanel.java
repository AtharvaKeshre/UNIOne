/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package business.StudentDirectory;

import business.CafeEndUsers.EndUsers;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Atharva
 */
public class StudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentJPanel
     * @param username
     */
    private String username;
    public StudentJPanel(String username) {
        this.username=username;
        setLayout(new FlowLayout());
        initComponents();
        add(lblusername);
    }
    public void setUsername(String username) {
        lblusername.setText(username);
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
        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnprofile = new javax.swing.JButton();
        btnallcourses = new javax.swing.JButton();
        btnmycourses = new javax.swing.JButton();
        btndegree = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        btnallprofessors = new javax.swing.JButton();
        btnSearchProfessor = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnmyapplication = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        btnIssue = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnLibrary = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        splitPane.setPreferredSize(new java.awt.Dimension(1200, 615));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnprofile.setBackground(new java.awt.Color(51, 51, 255));
        btnprofile.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnprofile.setForeground(new java.awt.Color(255, 255, 255));
        btnprofile.setText("My Profile");
        btnprofile.setBorder(null);
        btnprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofileActionPerformed(evt);
            }
        });

        btnallcourses.setBackground(new java.awt.Color(51, 51, 255));
        btnallcourses.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnallcourses.setForeground(new java.awt.Color(255, 255, 255));
        btnallcourses.setText("All Courses");
        btnallcourses.setBorder(null);
        btnallcourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallcoursesActionPerformed(evt);
            }
        });

        btnmycourses.setBackground(new java.awt.Color(51, 51, 255));
        btnmycourses.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnmycourses.setForeground(new java.awt.Color(255, 255, 255));
        btnmycourses.setText("My Courses");
        btnmycourses.setBorder(null);
        btnmycourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmycoursesActionPerformed(evt);
            }
        });

        btndegree.setBackground(new java.awt.Color(51, 51, 255));
        btndegree.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btndegree.setForeground(new java.awt.Color(255, 255, 255));
        btndegree.setText("Get Degree");
        btndegree.setBorder(null);
        btndegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndegreeActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME");

        lblusername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnallprofessors.setBackground(new java.awt.Color(51, 51, 255));
        btnallprofessors.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnallprofessors.setForeground(new java.awt.Color(255, 255, 255));
        btnallprofessors.setText("View Professors");
        btnallprofessors.setBorder(null);
        btnallprofessors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallprofessorsActionPerformed(evt);
            }
        });

        btnSearchProfessor.setBackground(new java.awt.Color(51, 51, 255));
        btnSearchProfessor.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnSearchProfessor.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchProfessor.setText("Search Professor");
        btnSearchProfessor.setBorder(null);
        btnSearchProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProfessorActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Jobs");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Logout");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnmyapplication.setBackground(new java.awt.Color(51, 51, 255));
        btnmyapplication.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnmyapplication.setForeground(new java.awt.Color(255, 255, 255));
        btnmyapplication.setText("My Applications");
        btnmyapplication.setBorder(null);
        btnmyapplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmyapplicationActionPerformed(evt);
            }
        });

        btnFeedback.setBackground(new java.awt.Color(51, 51, 255));
        btnFeedback.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnFeedback.setForeground(new java.awt.Color(255, 255, 255));
        btnFeedback.setText("Feedback");
        btnFeedback.setBorder(null);
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });

        btnIssue.setBackground(new java.awt.Color(51, 51, 255));
        btnIssue.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnIssue.setForeground(new java.awt.Color(255, 255, 255));
        btnIssue.setText("Raise Issue");
        btnIssue.setBorder(null);
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cafeteria");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnLibrary.setBackground(new java.awt.Color(51, 51, 255));
        btnLibrary.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnLibrary.setForeground(new java.awt.Color(255, 255, 255));
        btnLibrary.setText("Library");
        btnLibrary.setBorder(null);
        btnLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibraryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnprofile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(btnallcourses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnallprofessors, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmycourses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmyapplication, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndegree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLibrary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIssue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFeedback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnallcourses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnallprofessors, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmycourses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmyapplication, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndegree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 615));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT PORTAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofileActionPerformed
        // TODO add your handling code here:
        StuProfileJPanel stuprofile = new StuProfileJPanel(username);
        splitPane.setRightComponent(stuprofile);
    }//GEN-LAST:event_btnprofileActionPerformed

    private void btnallcoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallcoursesActionPerformed
        // TODO add your handling code here:
        ListCoursesJPanel listcourses = new ListCoursesJPanel();
        splitPane.setRightComponent(listcourses);
    }//GEN-LAST:event_btnallcoursesActionPerformed

    private void btnmycoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmycoursesActionPerformed
        // TODO add your handling code here:
        StuMyCoursesJPanel stucourses = new StuMyCoursesJPanel(username);
        splitPane.setRightComponent(stucourses);
    }//GEN-LAST:event_btnmycoursesActionPerformed

    private void btndegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndegreeActionPerformed
        // TODO add your handling code here:
        StuTranscriptJPanel transcriptJPanel = new StuTranscriptJPanel();
        splitPane.setRightComponent(transcriptJPanel);
    }//GEN-LAST:event_btndegreeActionPerformed

    private void btnallprofessorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallprofessorsActionPerformed
        // TODO add your handling code here:
        StuViewAllProfessorsJPanel viewprofessors = new StuViewAllProfessorsJPanel();
        splitPane.setRightComponent(viewprofessors);
    }//GEN-LAST:event_btnallprofessorsActionPerformed

    private void btnSearchProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProfessorActionPerformed
        // TODO add your handling code here:
        StuSearchProfessorJPanel searchprofessors = new StuSearchProfessorJPanel();
        splitPane.setRightComponent(searchprofessors);
    }//GEN-LAST:event_btnSearchProfessorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        StuViewJobsJPanel viewjobs = new StuViewJobsJPanel(username);
        splitPane.setRightComponent(viewjobs);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnmyapplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmyapplicationActionPerformed
        // TODO add your handling code here:
        StuMyApplicationsJPanel myappli = new StuMyApplicationsJPanel(username);
        splitPane.setRightComponent(myappli);
        
    }//GEN-LAST:event_btnmyapplicationActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setSize(new Dimension(1140, 600));
        loginFrame.setLocationRelativeTo(null);
        // Set the new login frame visible and dispose the current frame
        loginFrame.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        // TODO add your handling code here:
        StuFeedBackPanelJPanel stufeedback = new StuFeedBackPanelJPanel(username);
        splitPane.setRightComponent(stufeedback);
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
        // TODO add your handling code here:
        StuIssuesJPanel stuissue= new StuIssuesJPanel(username);
        splitPane.setRightComponent(stuissue);
    }//GEN-LAST:event_btnIssueActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        EndUsers endu= new EndUsers(username);
        splitPane.setRightComponent(endu);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibraryActionPerformed
        // TODO add your handling code here:
        StuBooksJPanel stubooks= new StuBooksJPanel(username);
        splitPane.setRightComponent(stubooks);
    }//GEN-LAST:event_btnLibraryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnIssue;
    private javax.swing.JButton btnLibrary;
    private javax.swing.JButton btnSearchProfessor;
    private javax.swing.JButton btnallcourses;
    private javax.swing.JButton btnallprofessors;
    private javax.swing.JButton btndegree;
    private javax.swing.JButton btnmyapplication;
    private javax.swing.JButton btnmycourses;
    private javax.swing.JButton btnprofile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblusername;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}