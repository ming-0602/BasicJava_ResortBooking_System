/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resortbooking;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedWriter;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;


/**
 *
 * @author Leong
 */
public class newRoomBooking extends javax.swing.JFrame {

    /**
     * Creates new form newRoomBooking
     */
    public newRoomBooking() {
        initComponents();
        
        //Disable Past Date
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,1);
        Date mindate = cal.getTime();
        cal.add(Calendar.YEAR,1);
        Date maxdate = cal.getTime();
        jDateChooser1.setSelectableDateRange(mindate,maxdate); 
        jDateChooser2.setSelectableDateRange(mindate,maxdate);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        RoomList = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameInput = new javax.swing.JTextField();
        EmailInput = new javax.swing.JTextField();
        ContactNumInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ICinput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Bookingbutton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        notiprice = new javax.swing.JLabel();
        taxprice = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        totaldisplay = new javax.swing.JLabel();
        total2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Check In Date :");

        jLabel2.setText("Check Out Date :");

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });

        RoomList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel3.setText("Room Available :");

        jLabel4.setText("Customer Name :");

        jLabel5.setText("Email :");

        jLabel6.setText("Contact Number :");

        NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInputActionPerformed(evt);
            }
        });

        EmailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailInputActionPerformed(evt);
            }
        });

        ContactNumInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNumInputActionPerformed(evt);
            }
        });

        jLabel7.setText("IC/Passport No :");

        ICinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICinputActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Room Start with J is Jungle View; S is sea View");

        Bookingbutton.setText("Book");
        Bookingbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingbuttonActionPerformed(evt);
            }
        });

        jLabel9.setText("Price :");

        jLabel10.setText("Tax + Extra Fee:");

        jLabel11.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContactNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ICinput, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(Bookingbutton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totaldisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(taxprice, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(notiprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(total2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RoomList, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RoomList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ICinput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ContactNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(18, 18, 18)
                        .addComponent(totaldisplay)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notiprice, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taxprice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(Bookingbutton)
                        .addGap(37, 37, 37))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameInputActionPerformed

    private void EmailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailInputActionPerformed

    private void ContactNumInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNumInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNumInputActionPerformed

    private void ICinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ICinputActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange

        //using try and catch method to handle exception
        try{
            //create file and scanner to read data
            File f = new File("booking.txt");
            Scanner s = new Scanner(new File("booking.txt"));
            
            //create a list and using while loop to add date into it
            List<String> info = new ArrayList<>();
            while(s.hasNext()){
            info.add(s.next());
            }
            
            //declare the size of partition and saparete into 8 element a part
            int listsize = 8;
            List<List<String>> list2 = Lists.partition(info, listsize); 
            
            //declare the size of the list
            int size = list2.size();

            //creating new list to store checkin date and checkout date
            List<String> starting = new ArrayList<>();
            List<String> ending = new ArrayList<>();
            
            //declare varable and use for loop to get all the data wanted
            int index,index2,index3;
            for(index =0;index <size;index++){
                starting.add(list2.get(index).get(1));
                ending.add(list2.get(index).get(2));
            }
            
            
            //create new list
            List<String> indexonly = new ArrayList<>();
            
            //get date from jdatechooser
            Date date1 = jDateChooser1.getDate();
            Date date2 = jDateChooser2.getDate();

            //declare a formate for the date
            SimpleDateFormat change = new SimpleDateFormat("yyyy/MM/dd");
            
            //declare the size of the starting list
            int size2 = starting.size();
            
            //change the format for date
            String formatdate = change.format(date1);
            String formatdate2 = change.format(date2);

            //change the format for date for computer
            Date formatlistitem = new SimpleDateFormat("yyyy/MM/dd").parse(formatdate);
            Date formatlistitem2 = new SimpleDateFormat("yyyy/MM/dd").parse(formatdate2);
            
            
            
            //declare variable as 0 and using while loop to proceed
            index2 = 0;
            while(index2 < size2){
                
                //declare date as null
                Date something = null;
                Date something2 = null;

                //change the date format
                something = change.parse(starting.get(index2));
                something2 = change.parse(ending.get(index2));

                //if both date result in TRUE do nothing; if one of it is FALSE then add the value in to a list
                if(formatlistitem.after(something2) || formatlistitem2.before(something)){


                }else{
                    indexonly.add(String.valueOf(index2));//get the occupied room
                }
                index2++;
            }

            
            




            //declare size of list
            int size3 = indexonly.size();

            //creating new list
            List<String> tem = new ArrayList<>();
            
            //using for loop to get item from list and add to another list
            for(index3 = 0;index3 <size3;index3++){
                String some = indexonly.get(index3);
                int changetoint = Integer.valueOf(some);
                tem.add(list2.get(changetoint).get(0));
                
            }

            //creating new list 
            List<String> tem3 = new ArrayList<>();
            
            //declare integer
            int i,i2;
            
            //making a scanner to read file and using while loop to loop through data and add to list
            Scanner a = new Scanner(new File("Room.txt"));
            while(a.hasNext()){
                tem3.add(a.next());
            }
            
            //declare part of list size
            int listsize2 = 4;
            
            //separate list into 4 element in each part
            List<List<String>> tem2 = Lists.partition(tem3, listsize2);
            
            //declare size of list
            int size4 = tem2.size();
            
            //creating new list to store room only
            List<String> room_only = new ArrayList<>();
            
            
            int one = 1;

            //using for loop to add room data into a list
            for(i=0;i<size4;i++){
                room_only.add(tem2.get(i).get(0));
            }



            //if the size of list is larger then 0 then use for loop to remove specific item
            if(size3 > 0){
            for(i2 = 0;i2 <size3;i2++){ 
                room_only.remove(tem.get(i2));
            }}
            
            //find size of list
            int newsize = room_only.size();
            
            //declare variable and use for loop to add item into combobox
            int e;
            for(e=0;e<newsize;e++){
                RoomList.addItem(room_only.get(e));
            }
            
            //if the size of list is 0 add all room
            if(size4 == 0){
                for(e=0;e<newsize;e++){
                RoomList.addItem(room_only.get(e));
               }
            }
            
            
            //using checkout date minus checkindate find the time difference
            long difference = formatlistitem2.getTime() - formatlistitem.getTime();
            
            //using the time get from above divide by 86400000 to get the days instead of milisecond
            long day = difference/86400000;
            
            //if the day is larger than 0 proceed and calulate the price / tax / extra cost
            if(day > 0){
                long price1 = 350 * day;
                this.notiprice.setText("$" + price1);
                int CHANGETYPE = (int)price1;
                int CHNAGETYPE2 = (int)day;
                int perday = 10*CHNAGETYPE2;
                double percent = CHANGETYPE * 0.1;
                int change3 = (int)percent;
                int addup = change3 + perday;
                this.taxprice.setText("$"+ addup);
                int total = addup + CHANGETYPE;
                this.total2.setText("$"+total);
            }
            //if the day is zero then display message that user can not book on the same day
            if(day==0){
                JOptionPane.showMessageDialog(this,"You can not Book the same Day!");
                  
            }
            
            
        }catch(Exception e){  
        }
        
       
        
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void BookingbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingbuttonActionPerformed
        
        //get date from jframe
        String x = String.valueOf(RoomList.getSelectedItem());
        Date checkindate = jDateChooser1.getDate();
        Date checkoutdate = jDateChooser2.getDate();
        
        //decalare a formt for date
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        
        //formate the date
        String formatindate = format.format(checkindate);
        String formatoutdate = format.format(checkoutdate);

        //get date from jframe textfield
        String name = NameInput.getText();
        String email = EmailInput.getText();
        String contactno = ContactNumInput.getText();
        String ic = ICinput.getText();
        String total = total2.getText();

        //if all is not empty of meet the requiremnet
        if(x !=""){
            if(formatindate != ""){

                if(formatoutdate !=""){

                    if(name != ""){

                        if(email != ""){

                            if(contactno.length() == 10){

                                if(ic.length() == 12){
                                    
                                    // display booking success
                                    JOptionPane.showMessageDialog(this,"Booking Success!");
                                    
                                    //using try and catch to handle exception
                                    try{
                                        //using printwriter, buffered writter and filewriter to write data into the text file without overwriting
                                        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("booking.txt",true)));
                                        pw.println(x);
                                        pw.println(formatindate);
                                        pw.println(formatoutdate);
                                        pw.println(total);
                                        pw.println(name);
                                        pw.println(email);
                                        pw.println(contactno);
                                        pw.println(ic);
                                        pw.close();

                                    }catch(Exception e){

                                    }
                                    
                                    //when done writing into file close this window and open main page
                                    dispose();
                                    main_page mp = new main_page();
                                    mp.setVisible(true);
                                }
                            }
                        }
                    }
                }
            }
        }
        
        //if it does not meet the requiremnet above send message to user that Booking is invalid
        else{
            JOptionPane.showMessageDialog(this,"Invalid Booking!");
        }
        
        
        
    }//GEN-LAST:event_BookingbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(newRoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newRoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newRoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newRoomBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newRoomBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bookingbutton;
    private javax.swing.JTextField ContactNumInput;
    private javax.swing.JTextField EmailInput;
    private javax.swing.JTextField ICinput;
    private javax.swing.JTextField NameInput;
    private javax.swing.JComboBox<String> RoomList;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel notiprice;
    private javax.swing.JLabel taxprice;
    private javax.swing.JLabel total2;
    private javax.swing.JLabel totaldisplay;
    // End of variables declaration//GEN-END:variables
}