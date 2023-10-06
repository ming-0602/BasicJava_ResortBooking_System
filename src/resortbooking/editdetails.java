/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resortbooking;

/**
 *
 * @author Leong
 */

import com.google.common.collect.Lists;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.io.FileWriter;


public class editdetails extends javax.swing.JFrame {

    /**
     * Creates new form editdetails
     */
    public editdetails(int rowmouseevent) {
        initComponents();
        
        //get variable from another jframe and set the variable in a hiddden text box

        hideindex.setText(String.valueOf(rowmouseevent));

        //set the minimum and the maximum date for the calendar
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,1);//minmum is the date
        Date mindate = cal.getTime();
        cal.add(Calendar.YEAR,1);// maximum is by 1 year
        Date maxdate = cal.getTime();
        jDateChooser1.setSelectableDateRange(mindate,maxdate); 
        jDateChooser2.setSelectableDateRange(mindate,maxdate);
        
        //change the integer into a string
        String changetostring = String.valueOf(rowmouseevent);
        hideindex.setText(changetostring);
        hideindex.setVisible(false);// make is not visible
        
        try{
            // create a file reader and scanner
            File f = new File("booking.txt");
            Scanner s = new Scanner(new File("booking.txt"));
            
            // make a list to store element
            List<String> info = new ArrayList<>();
            
            //while the text file have next value in next line it will add into the list
            while(s.hasNext()){
                info.add(s.next());
            }
            
            // declare the list as size 8 and seperate the list by making 8 element each pieces
            int listsize = 8;
            List<List<String>> list2 = Lists.partition(info, listsize);
            // find the size of the list
            int size = list2.size();

            //get the specific element by using the integer from another jframe
            list2.get(rowmouseevent);
            
            //declare element as a string
            String checkindate = list2.get(rowmouseevent).get(1);
            String checkoutdate = list2.get(rowmouseevent).get(2);

            //format the string into a date with a specific format
            Date formatlistitem = new SimpleDateFormat("yyyy/MM/dd").parse(checkindate);
            Date formatlistitem2 = new SimpleDateFormat("yyyy/MM/dd").parse(checkoutdate);

            //set the date of jdatechooser
            jDateChooser1.setDate(formatlistitem);
            jDateChooser2.setDate(formatlistitem2);
            
            //makaing a temporary list
            List<String> tem3 = new ArrayList<>();
            
            //create lists to store a check in date and check out date
            List<String> starting = new ArrayList<>();
            List<String> ending = new ArrayList<>();
            
            //declare variable as integer and using for loop to get check in date and check out date to add into it own list
            int index;
            for(index =0;index <size;index++){
                starting.add(list2.get(index).get(1));
                ending.add(list2.get(index).get(2));
            }
            

            //creating a scanner for the text file and using while loop to add the item into a list
            Scanner a = new Scanner(new File("Room.txt"));
            while(a.hasNext()){
                tem3.add(a.next());
            }
            
            //declare the size of the list and seperate in to parts
            int listsize2 = 4;
            List<List<String>> tem2 = Lists.partition(tem3, listsize2);
            //find the size of the list
            int size4 = tem2.size();
            
            //creating a new list
            List<String> room_only = new ArrayList<>();
            
            //declare variable
            int i,e;
            
            //using for loop to add the zero element into the list
            for(i=0;i<size4;i++){
                room_only.add(tem2.get(i).get(0));
            }
            

            //set all the textfield data
            nameinput.setText(list2.get(rowmouseevent).get(4));
            emailinput.setText(list2.get(rowmouseevent).get(5));
            phoneinput.setText(list2.get(rowmouseevent).get(6));
            icinput.setText(list2.get(rowmouseevent).get(7));
            priceinput.setText(list2.get(rowmouseevent).get(3));
            jComboBox1.getModel().setSelectedItem(list2.get(rowmouseevent).get(0));
            

        }catch(Exception e){}
        
        
        
        
        
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        indate = new javax.swing.JLabel();
        outdate = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        Save = new javax.swing.JButton();
        Cancelbutt = new javax.swing.JButton();
        nameinput = new javax.swing.JTextField();
        emailinput = new javax.swing.JTextField();
        phoneinput = new javax.swing.JTextField();
        icinput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        priceinput = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        hideindex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Check in Date :");

        jLabel2.setText("Check Out Date :");

        jLabel3.setText("Name :");

        jLabel4.setText("Email :");

        jLabel5.setText("Phone No :");

        jLabel6.setText("IC :");

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

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Cancelbutt.setText("Cancel");
        Cancelbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbuttActionPerformed(evt);
            }
        });

        nameinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameinputActionPerformed(evt);
            }
        });

        icinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icinputActionPerformed(evt);
            }
        });

        jLabel7.setText("Price :");

        priceinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceinputActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel8.setText("Room :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancelbutt)
                .addGap(32, 32, 32)
                .addComponent(Save)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameinput, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(emailinput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneinput, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(icinput)
                            .addComponent(priceinput, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indate, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(hideindex)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(indate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                        .addComponent(outdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nameinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emailinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(icinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Cancelbutt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hideindex)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameinputActionPerformed

    private void icinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icinputActionPerformed

    private void priceinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceinputActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:

        
        
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        //chaniging string into variable
        int hidevalue = Integer.valueOf(hideindex.getText());

        //using try and catch method
        try{
            //creating a file and scanning method of the text file
            File f = new File("booking.txt");
            Scanner s = new Scanner(new File("booking.txt"));
            //creating list to store data
            List<String> info = new ArrayList<>();
            //using while loop to get all the line from each line and add into the list
            while(s.hasNext()){
                info.add(s.next());
            }

            //declare listsize in to 8
            int listsize = 8;
            
            //creating a new list and make it into part with 8 element inside each part
            List<List<String>> list2 = Lists.partition(info, listsize);
            
            //declaring variable
            int index,index2,index3;

            //get all the value from the textfield, combobox and datechooser
            String x = String.valueOf(jComboBox1.getSelectedItem());
            Date checkindate = jDateChooser1.getDate();
            Date checkoutdate = jDateChooser2.getDate();
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            String formatindate = format.format(checkindate);
            String formatoutdate = format.format(checkoutdate);
            

            //declare variable as string and get the value from the textfield 
            
            String name = nameinput.getText();
            String email = emailinput.getText();
            String contactno = phoneinput.getText();
            String ic = icinput.getText();
            String total = priceinput.getText();
            

            //check is the textfield empty to proceed
            if(!nameinput.getText().isEmpty() && !emailinput.getText().isEmpty() && phoneinput.getText().length() == 10 && icinput.getText().length()==12 && !priceinput.getText().isEmpty()){
                //if the hidevalue is 0 then will proceed 
                if(hidevalue == 0){
                    for(index=0;index< 8;index++){
                        index2=0;
                        info.remove(index2);

                    }
                    // add all the value into a list
                    info.add(x);
                    info.add(formatindate);
                    info.add(formatoutdate);
                    info.add(total);
                    info.add(name);
                    info.add(email);
                    info.add(contactno);
                    info.add(ic);
                    
                    //find the size of the list
                    int newsize = info.size();
                    //declare variable
                    int i3;
                    //creating new filewrite to write data
                    FileWriter fw = new FileWriter(f);
                    //using for loop to write the data into the text file
                    for(i3=0;i3<newsize;i3++){
                        fw.write(info.get(i3)+"\n");
                    }
                    //close filewriter
                    fw.close();
                    
                    //display a message when is done
                    JOptionPane.showMessageDialog(this, "Data have been save!");
                    //close the window and open viewbooking jframe
                    dispose();
                    viewBooking vb = new viewBooking(1);
                    vb.setVisible(true);
                   
                    //if the hidden value is not 0 then proceed to here
                }else{
                    //calulating the starting value to remove specific elemnt in list using for loop

                    int startingvalue = (hidevalue * 8);

                    for(index3=0 ;index3 < 8;index3++){

                        index2=startingvalue;
                        info.remove(startingvalue);


                    }

                    //add the new value into the list
                    info.add(x);
                    info.add(formatindate);
                    info.add(formatoutdate);
                    info.add(total);
                    info.add(name);
                    info.add(email);
                    info.add(contactno);
                    info.add(ic);
                    
                    //declare the size of the list and declare the varable as integer
                    int newsize = info.size();
                    int i3,i4;
                    //creating new file writer
                    FileWriter fw = new FileWriter(f);
                    //declare variable as 0
                    i4=0;
                    
                    
                    //for loop to write the data into the text file
                    for(i3=0;i3<newsize;i3++){
                        fw.write(info.get(i4)+"\n");
                        i4+=1;
                    }
                    //close the file writer and display message the have done
                    fw.close();
                    JOptionPane.showMessageDialog(this, "Data have been save!");
                    
                    //close the window and open viewbooking jframe
                    dispose();
                    viewBooking vb = new viewBooking(1);
                    vb.setVisible(true);   
                    
                
                }
                //if the input is invalid it will proceed to here and send a message to user
            }else{
                JOptionPane.showMessageDialog(this, "Invalid Input, Please Check again!");
            }
     
            
        }catch(Exception e) {

        }

    }//GEN-LAST:event_SaveActionPerformed

    private void CancelbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbuttActionPerformed
        // TODO add your handling code here:
        //when the button is press it will close the window and proceed back to previous page
        dispose();
        viewBooking vb = new viewBooking(1);
        vb.setVisible(true);
    }//GEN-LAST:event_CancelbuttActionPerformed

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange

        //using try and catch method
        try{
            //creating file and scanner to read text file
            File f = new File("booking.txt");
            Scanner s = new Scanner(new File("booking.txt"));
            
            //creating new list and use while loop to add text file data into it
            List<String> info = new ArrayList<>();
            while(s.hasNext()){
            info.add(s.next());
            }
            
            //declare the size of parts will be and seperate in to multiple part with 8 in each part
            int listsize = 8;
            List<List<String>> list2 = Lists.partition(info, listsize); 
            int size = list2.size();

            //creating lists to store starting and ending element
            List<String> starting = new ArrayList<>();
            List<String> ending = new ArrayList<>();
            
            //declare the variables
            int index,index2,index3;
            //using for loop to add all check in and checkout element in to it own list
            for(index =0;index <size;index++){
                starting.add(list2.get(index).get(1));
                ending.add(list2.get(index).get(2));
            }
            
            //creating a new list to store index
            List<String> indexonly = new ArrayList<>();

            //get date from datechooser
            Date date1 = jDateChooser1.getDate();
            Date date2 = jDateChooser2.getDate();

            //creating a format for the date
            SimpleDateFormat change = new SimpleDateFormat("yyyy/MM/dd");
            
            //find the size of the starting string
            int size2 = starting.size();
            
            //change the date in to string with specific format
            String formatdate = change.format(date1);
            String formatdate2 = change.format(date2);

            //make the date into a nother format for the computer to read
            Date formatlistitem = new SimpleDateFormat("yyyy/MM/dd").parse(formatdate);
            Date formatlistitem2 = new SimpleDateFormat("yyyy/MM/dd").parse(formatdate2);
            
            //declare variable as 0
            index2 = 0;
            //using while loop to loop through the process
            while(index2 < size2){
                
                //declare date as null
                Date something = null;
                Date something2 = null;

                //convert the value into another value
                something = change.parse(starting.get(index2));
                something2 = change.parse(ending.get(index2));

               //if both of the date is true then do nothing; if either of it is false then it will get the existing value and convert into string and add into list 
                if(formatlistitem.after(something2) || formatlistitem2.before(something)){


                }else{
                    indexonly.add(String.valueOf(index2));//get the occupied room
                }
                index2++;
            }
            
            //find the size of indexonly list
            int size3 = indexonly.size();

            //creating a tem list
            List<String> tem = new ArrayList<>();
            
            //using for loop to convert element into index and using it to find another element and add into list
            for(index3 = 0;index3 <size3;index3++){
                String some = indexonly.get(index3);
                int changetoint = Integer.valueOf(some);
                tem.add(list2.get(changetoint).get(0));
                
            }

            //creating new list
            List<String> tem3 = new ArrayList<>();
            
            //declare variable
            int i,i2;
            
            //making a scanner to scan the text file and using while loop to add into a list
            Scanner a = new Scanner(new File("Room.txt"));
            while(a.hasNext()){
                tem3.add(a.next());
            }
            
            //declare the size part of the list wanted
            int listsize2 = 4;
            //seperate the element in to 4 each
            List<List<String>> tem2 = Lists.partition(tem3, listsize2);
            //find the size of the list
            int size4 = tem2.size();
            
            //creating a new list
            List<String> room_only = new ArrayList<>();
            
            //declare varible as 1
            int one = 1;
            
            //using for loop to add item into list
            for(i=0;i<size4;i++){
                room_only.add(tem2.get(i).get(0));
            }
            
            //if the size is larger than 0 then it will proceeed with for loop below to remove specific element 
            if(size3 > 0){
            for(i2 = 0;i2 <size3;i2++){ 
                room_only.remove(tem.get(i2));
            }}
            
            //find the size of the list
            int newsize = room_only.size();
            //declare variable
            int e;
            //if size4 larger than 0 then proceed with the for loop
            if(size4 > 0){
            for(e=0;e<newsize;e++){
                jComboBox1.addItem(room_only.get(e));
            }}
            
            //if the size is 0 then for proceed to this for loop
            if(size4 == 0){
                for(e=0;e<newsize;e++){
                jComboBox1.addItem(room_only.get(e));
               }
            }
        }catch(Exception e){}
    }//GEN-LAST:event_jDateChooser2PropertyChange

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
            java.util.logging.Logger.getLogger(editdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editdetails(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelbutt;
    private javax.swing.JButton Save;
    private javax.swing.JTextField emailinput;
    private javax.swing.JLabel hideindex;
    private javax.swing.JTextField icinput;
    private javax.swing.JLabel indate;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nameinput;
    private javax.swing.JLabel outdate;
    private javax.swing.JTextField phoneinput;
    private javax.swing.JTextField priceinput;
    // End of variables declaration//GEN-END:variables
}
