/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resortbooking;

import java.awt.event.KeyEvent;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;


public class login_page1 extends javax.swing.JFrame {

    /**
     * Creates new form login_page1
     */
    public login_page1() {
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

        userinput = new javax.swing.JTextField();
        passinput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sign_in = new javax.swing.JButton();
        validmsg = new javax.swing.JLabel();
        validmsg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        passinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passinputActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username: ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome to Best Resort Booking System");

        sign_in.setText("Sign In");
        sign_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_inActionPerformed(evt);
            }
        });
        sign_in.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sign_inKeyPressed(evt);
            }
        });

        validmsg1.setForeground(new java.awt.Color(255, 51, 0));
        validmsg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sign_in)
                        .addGap(211, 211, 211))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(validmsg)
                                .addGap(63, 63, 63)
                                .addComponent(validmsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(9, 9, 9)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(userinput, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(passinput))))
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(sign_in)
                .addGap(18, 18, 18)
                .addComponent(validmsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validmsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sign_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_inActionPerformed
        //using try method
        
        try{
            //create new file and scanner for textfile
            File f = new File("adminlogin.txt");
            Scanner s = new Scanner(new File("adminlogin.txt"));
            
            //create a list to store variable
            List<String> info = new ArrayList<>();
            
            //using while loop to load all the data and put into a list
            while(s.hasNext()){
                info.add(s.next());
            }
            
            
            //get the user text
            var input1 = userinput.getText();
            var input2 = passinput.getText();
            
            //if the size of the list is larger or equal to 0  proceed
//            if(info.size() > 0){
                
            //if the info contains the input from user input proceed
            if(info.contains(input1)){
                var indexinput1 = info.indexOf(input1);
                var indexinput2 = indexinput1 + 1;

                //if the input is equal to the info input then close the window and open the main page
                if(info.get(indexinput2).equalsIgnoreCase(input2) && info.get(indexinput1).equalsIgnoreCase(input1)){
                    dispose();
                    main_page mp = new main_page();
                    mp.setVisible(true);
                }
                //if it does not contains any related input it will appear a message "Input Invalid"
                else{
                    JOptionPane.showMessageDialog(this,"Input Invalid!");
                    validmsg1.setText("Wrong passoword or Username!");
                }
            }
                
                
//            }
            if(!info.contains(input1)){

                    JOptionPane.showMessageDialog(this,"Input Invalid!");
                    validmsg1.setText("Wrong passoword or Username!");
                }
            
            



        }catch(Exception e){}
    }//GEN-LAST:event_sign_inActionPerformed

    private void passinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passinputActionPerformed

    private void sign_inKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sign_inKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
            //create new file and scanner for textfile
            File f = new File("adminlogin.txt");
            Scanner s = new Scanner(new File("adminlogin.txt"));
            
            //create a list to store variable
            List<String> info = new ArrayList<>();
            
            //using while loop to load all the data and put into a list
            while(s.hasNext()){
                info.add(s.next());
            }

            //get the user text
            var input1 = userinput.getText();
            var input2 = passinput.getText();
            
            //if the size of the list is larger or equal to 0  proceed
            if(info.size() >= 0){
                
                //if the info contains the input from user input proceed
                if(info.contains(input1)){
                    var indexinput1 = info.indexOf(input1);
                    var indexinput2 = indexinput1 + 1;
                    
                    //if the input is equal to the info input then close the window and open the main page
                    if(info.get(indexinput2).equalsIgnoreCase(input2)){
                        dispose();
                        main_page mp = new main_page();
                        mp.setVisible(true);
                    }
                }
                
                
            }
            
            //if it does not contains any related input it will appear a message "Input Invalid"
            if(!info.contains(input1)){

                    JOptionPane.showMessageDialog(this,"Input Invalid!");
                    validmsg1.setText("Wrong passoword or Username!");
                }




            }catch(Exception e){}
        
        }
    }//GEN-LAST:event_sign_inKeyPressed

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
            java.util.logging.Logger.getLogger(login_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField passinput;
    private javax.swing.JButton sign_in;
    private javax.swing.JTextField userinput;
    private javax.swing.JLabel validmsg;
    private javax.swing.JLabel validmsg1;
    // End of variables declaration//GEN-END:variables
}
