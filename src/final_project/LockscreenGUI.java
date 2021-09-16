package final_project;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LockscreenGUI extends javax.swing.JFrame
{ 
    String masterCode="8900";
    int code1;
    int code2;
    int code3;
    int code4;
    
    int buttonClick;
    int count;
    
    ImageIcon filled =new ImageIcon(getClass().getResource("/images/circle_filled.png"));
    ImageIcon unfilled =new ImageIcon(getClass().getResource("/images/circle_unfilled.png"));
    
    public LockscreenGUI()
    {
        initComponents();
    }
    public void circleControl()
    {
     count++;
     switch(count)
     {
         case 1:
            Code1.setIcon(filled);
            code1 = buttonClick;
             break;
        case 2:
            Code2.setIcon(filled);
            code2 = buttonClick;
             break;
            
        case 3:
            Code3.setIcon(filled);
            code3 = buttonClick;
             break;
        case 4:
            Code4.setIcon(filled);
            code4 = buttonClick;
            
            String masterTest =code1+""+code2+""+code3+""+code4;
            
            if (masterTest.equals(masterCode)) 
            {
            JOptionPane.showMessageDialog(this,"Logged In Successfully");
            new admin_panel_login().setVisible(true);
            this.setVisible(false);
            }
            else 
            {
             JOptionPane.showMessageDialog(this,"Password Incorrect");
            }    
        
            Code1.setIcon(unfilled);
            Code2.setIcon(unfilled);
            Code3.setIcon(unfilled);
            Code4.setIcon(unfilled);
            
            count=0;
            break;
     }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button0 = new javax.swing.JLabel();
        Button9 = new javax.swing.JLabel();
        Button8 = new javax.swing.JLabel();
        Button7 = new javax.swing.JLabel();
        Button6 = new javax.swing.JLabel();
        Button5 = new javax.swing.JLabel();
        Button4 = new javax.swing.JLabel();
        Button3 = new javax.swing.JLabel();
        Button2 = new javax.swing.JLabel();
        Button1 = new javax.swing.JLabel();
        Code4 = new javax.swing.JLabel();
        Code3 = new javax.swing.JLabel();
        Code2 = new javax.swing.JLabel();
        Code1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lockscreen");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button0MouseReleased(evt);
            }
        });
        getContentPane().add(Button0, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 342, 60, 60));

        Button9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button9MouseReleased(evt);
            }
        });
        getContentPane().add(Button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 60, 60));

        Button8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button8MouseReleased(evt);
            }
        });
        getContentPane().add(Button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 270, 60, 60));

        Button7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button7MouseReleased(evt);
            }
        });
        getContentPane().add(Button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 270, 60, 60));

        Button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button6MouseReleased(evt);
            }
        });
        getContentPane().add(Button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 199, 60, 60));

        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button5MouseReleased(evt);
            }
        });
        getContentPane().add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 199, 60, 60));

        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button4MouseReleased(evt);
            }
        });
        getContentPane().add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 199, 60, 60));

        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button3MouseReleased(evt);
            }
        });
        getContentPane().add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 60, 60));

        Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button2MouseReleased(evt);
            }
        });
        getContentPane().add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 130, 60, 60));

        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button1MouseReleased(evt);
            }
        });
        getContentPane().add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 130, 60, 60));

        Code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code4, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 70, 15, 15));

        Code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 70, 15, 15));

        Code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 70, 15, 15));

        Code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 70, 15, 15));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/numbers.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 295, 290));

        Heading.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("Enter Passcode");
        getContentPane().add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 120, 30));

        Background.setBackground(new java.awt.Color(103, 65, 114));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 295, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseReleased
        // TODO add your handling code here:
        buttonClick=1;
        circleControl();
    }//GEN-LAST:event_Button1MouseReleased

    private void Button2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseReleased
        // TODO add your handling code here:
         buttonClick=2;
        circleControl();
    }//GEN-LAST:event_Button2MouseReleased

    private void Button3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseReleased
        // TODO add your handling code here:
         buttonClick=3;
        circleControl();
    }//GEN-LAST:event_Button3MouseReleased

    private void Button4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseReleased
        // TODO add your handling code here:
         buttonClick=4;
        circleControl();
    }//GEN-LAST:event_Button4MouseReleased

    private void Button5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseReleased
        // TODO add your handling code here:
         buttonClick=5;
        circleControl();
    }//GEN-LAST:event_Button5MouseReleased

    private void Button6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button6MouseReleased
        // TODO add your handling code here:
         buttonClick=6;
        circleControl();
    }//GEN-LAST:event_Button6MouseReleased

    private void Button7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseReleased
        // TODO add your handling code here:
         buttonClick=7;
        circleControl();
    }//GEN-LAST:event_Button7MouseReleased

    private void Button8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseReleased
        // TODO add your handling code here:
         buttonClick=8;
        circleControl();
    }//GEN-LAST:event_Button8MouseReleased

    private void Button9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseReleased
        // TODO add your handling code here:
         buttonClick=9;
        circleControl();
    }//GEN-LAST:event_Button9MouseReleased

    private void Button0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button0MouseReleased
        // TODO add your handling code here:
         buttonClick=0;
        circleControl();
    }//GEN-LAST:event_Button0MouseReleased

    public static void main(String args[])
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LockscreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LockscreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LockscreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LockscreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LockscreenGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Button0;
    private javax.swing.JLabel Button1;
    private javax.swing.JLabel Button2;
    private javax.swing.JLabel Button3;
    private javax.swing.JLabel Button4;
    private javax.swing.JLabel Button5;
    private javax.swing.JLabel Button6;
    private javax.swing.JLabel Button7;
    private javax.swing.JLabel Button8;
    private javax.swing.JLabel Button9;
    private javax.swing.JLabel Code1;
    private javax.swing.JLabel Code2;
    private javax.swing.JLabel Code3;
    private javax.swing.JLabel Code4;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
