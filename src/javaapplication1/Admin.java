/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.Timestamp;
import static javaapplication1.Login.time;
import javax.swing.JFrame;

/**
 *
 * @author Arun
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Files = new javax.swing.JLabel();
        Process = new javax.swing.JLabel();
        Visualize = new javax.swing.JLabel();
        Tickets = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 615));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Admin Dashboard");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(170, 220, 160, 30);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Files");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(530, 220, 130, 30);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Process");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(220, 510, 130, 30);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Visualize");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(510, 510, 130, 30);

        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Actions-user-properties-icon.png"))); // NOI18N
        Dashboard.setToolTipText("");
        Dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dashboard.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DashboardMouseMoved(evt);
            }
        });
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DashboardMouseExited(evt);
            }
        });
        jPanel2.add(Dashboard);
        Dashboard.setBounds(190, 70, 130, 150);

        Files.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Places-document-multiple-icon.png"))); // NOI18N
        Files.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Files.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FilesMouseMoved(evt);
            }
        });
        Files.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FilesMouseExited(evt);
            }
        });
        jPanel2.add(Files);
        Files.setBounds(500, 70, 120, 150);

        Process.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Folder-Tools-icon.png"))); // NOI18N
        Process.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Process.setSize(new java.awt.Dimension(130, 150));
        Process.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ProcessMouseMoved(evt);
            }
        });
        Process.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProcessMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProcessMouseExited(evt);
            }
        });
        jPanel2.add(Process);
        Process.setBounds(190, 360, 130, 150);

        Visualize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/chart-search-icon.png"))); // NOI18N
        Visualize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Visualize.setSize(new java.awt.Dimension(130, 150));
        Visualize.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                VisualizeMouseMoved(evt);
            }
        });
        Visualize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisualizeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VisualizeMouseExited(evt);
            }
        });
        jPanel2.add(Visualize);
        Visualize.setBounds(500, 360, 130, 150);

        Tickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/my-tickets-icon.png"))); // NOI18N
        Tickets.setToolTipText("");
        Tickets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tickets.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TicketsMouseMoved(evt);
            }
        });
        Tickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TicketsMouseExited(evt);
            }
        });
        jPanel2.add(Tickets);
        Tickets.setBounds(350, 220, 130, 150);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("Tickets");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(380, 360, 80, 30);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 80, 22);

        jLabelClose.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseMoved(evt);
            }
        });
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });
        jPanel1.add(jLabelClose);
        jLabelClose.setBounds(760, 10, 12, 22);

        jLabelMin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMin);
        jLabelMin.setBounds(740, 10, 11, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DashboardMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseMoved
        Dashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_DashboardMouseMoved

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        AdminDashboard dash = new AdminDashboard();
        dash.setVisible(true);
        dash.pack();
        dash.setLocationRelativeTo(null);
        dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_DashboardMouseClicked

    private void DashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseExited
        Dashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44,62,80)));
    }//GEN-LAST:event_DashboardMouseExited

    private void FilesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilesMouseMoved
        Files.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_FilesMouseMoved

    private void FilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilesMouseClicked
        Files f = new Files();
        f.setVisible(true);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_FilesMouseClicked

    private void FilesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilesMouseExited
        Files.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44,62,80)));
    }//GEN-LAST:event_FilesMouseExited

    private void ProcessMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProcessMouseMoved
        Process.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_ProcessMouseMoved

    private void ProcessMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProcessMouseExited
        Process.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44,62,80)));
    }//GEN-LAST:event_ProcessMouseExited

    private void VisualizeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizeMouseMoved
        Visualize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_VisualizeMouseMoved

    private void VisualizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizeMouseExited
        Visualize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44,62,80)));
    }//GEN-LAST:event_VisualizeMouseExited

    private void jLabelCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseMoved

    }//GEN-LAST:event_jLabelCloseMouseMoved
    public void addtimestamp(String user) {
            try {
            
            SetConnection conn = new SetConnection();
            Connection connect = SetConnection.conn;
            Statement stm = connect.createStatement();
            
            Timestamp time = new Timestamp(System.currentTimeMillis());
            String sql = "update user SET last_logged_out = '"+time+"' where username = '"+user+"'";
            
            stm.executeUpdate(sql);
            
            connect.close();
        }
        catch (Exception e) {}
    }
    public void addtimestampin(String user) {
            try {
            
            SetConnection conn = new SetConnection();
            Connection connect = SetConnection.conn;
            Statement stm = connect.createStatement();
            
            
            String sql = "update user SET last_logged_in = '"+Login.time+"' where username = '"+user+"'";
            
            stm.executeUpdate(sql);
            
            connect.close();
        }
        catch (Exception e) {}
        }
    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        addtimestampin(Login.user);
        addtimestamp(Login.user);
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited

    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void TicketsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketsMouseMoved
        Tickets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108,122,137)));
    }//GEN-LAST:event_TicketsMouseMoved

    private void TicketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketsMouseClicked
        Tickets tick = new Tickets();
        tick.setVisible(true);
        tick.pack();
        tick.setLocationRelativeTo(null);
        tick.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_TicketsMouseClicked

    private void TicketsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketsMouseExited
        Tickets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44,62,80)));
    }//GEN-LAST:event_TicketsMouseExited

    private void ProcessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProcessMouseClicked
        Process proc = new Process();
        proc.setVisible(true);
        proc.pack();
        proc.setLocationRelativeTo(null);
        proc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ProcessMouseClicked

    private void VisualizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizeMouseClicked
        Visualize vis = new Visualize();
        vis.setVisible(true);
        vis.pack();
        vis.setLocationRelativeTo(null);
        vis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_VisualizeMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Files;
    private javax.swing.JLabel Process;
    private javax.swing.JLabel Tickets;
    private javax.swing.JLabel Visualize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}