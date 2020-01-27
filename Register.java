/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
//import org.apache.commons.lang.StringUtils;

/**
 *
 * @author ASUS
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form form
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Register() {
        initComponents();
        
        conn = DBConnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox<String>();
        submit_button = new javax.swing.JButton();
        mailWarning = new javax.swing.JLabel();
        nameWarning = new javax.swing.JLabel();
        categoryWarning = new javax.swing.JLabel();
        dateWarning = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(22, 255, 22));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setBackground(new java.awt.Color(153, 17, 211));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registration");

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email-Id");

        emailTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Date Of Birth");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gender");

        maleButton.setBackground(new java.awt.Color(255, 102, 102));
        genderButtonGroup.add(maleButton);
        maleButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maleButton.setText("Male");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        femaleButton.setBackground(new java.awt.Color(255, 102, 102));
        genderButtonGroup.add(femaleButton);
        femaleButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        femaleButton.setText("Female");

        otherRadioButton.setBackground(new java.awt.Color(255, 102, 102));
        genderButtonGroup.add(otherRadioButton);
        otherRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        otherRadioButton.setText("Others");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Category");

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Category", "General", "OBC", "SC/ST", "PWD" }));

        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        mailWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mailWarning.setForeground(new java.awt.Color(255, 0, 0));

        nameWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameWarning.setForeground(new java.awt.Color(255, 0, 0));

        categoryWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        categoryWarning.setForeground(new java.awt.Color(255, 0, 0));

        dateWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dateWarning.setForeground(new java.awt.Color(255, 0, 51));

        jButton1.setText("Go back to Home Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(categoryWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(nameTextField)
                                    .addComponent(emailTextField)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(femaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(otherRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mailWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nameWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(dateWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(submit_button))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(dateWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(femaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(otherRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(submit_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleButtonActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed
        int check = 1;
    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        boolean goToLogin = true;
        goToLogin = validateForm(goToLogin); 
        if(goToLogin){
        String roll_new = showme();
        System.out.println(roll_new);
        goToLogin = insertIn(goToLogin,roll_new);
        }
        if(goToLogin && check==1)
        {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new homepage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    String showme()
    {
        String new_roll="";
        try{
        String show = "Select registeration_no from register ORDER BY registeration_no DESC";
        pst = conn.prepareStatement(show);
        rs = pst.executeQuery();
        if(rs.next())
        {
           
           String registeration = rs.getString("registeration_no");
           String code = registeration.substring(0,7);
           String roll = registeration.substring(7);
           int roll2 = Integer.parseInt(roll);
           roll2+=1;
           DecimalFormat df = new DecimalFormat("000");
           new_roll= code + df.format(roll2);
            
            System.out.println(new_roll);
        }
        else
        {
            new_roll = "2018JEE001";
        }
        }
        catch(Exception e1)
        {
            check = 0;
            e1.printStackTrace();
            System.out.println("Naa aaaaaaaaaaaa");
        }
        return new_roll;
     }
    
    boolean insertIn(boolean goToLogin,String registeration_no)
    {
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd");
        String date = sfd.format(dateChooser.getDate());
        
        String gender="";
        if(maleButton.isSelected())
            gender = "male";
        else if(femaleButton.isSelected())
            gender = "female";
        else if(otherRadioButton.isSelected())
            gender = "others";
        
        String category = (String)categoryComboBox.getSelectedItem();
        System.out.println(category);
//        String registeration_no = "001";
        
        
        try{
            
            String ins = "INSERT INTO register"
                    + "(Name, email, dob, gender, category, registeration_no) "
                    + "VALUES (?,?,?,?,?,?)";
            
            System.out.println(category);
            //'"+name+"','"+email+"','"+date+"','"+gender+"','"+category+"','2018REE1001'
            pst = conn.prepareStatement(ins);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, date);
            pst.setString(4, gender);
            pst.setString(5, category);
            pst.setString(6, registeration_no);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(rootPane, "Your Registration No is: "+registeration_no);
            
        }
        catch(Exception e)
        {
            goToLogin = false;
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Registration Unsuccessful", "Alert",JOptionPane.WARNING_MESSAGE);
        }
        return goToLogin;
    }
    
    boolean validateForm(boolean goToLogin)
    {
       String name = nameTextField.getText();
       String email = emailTextField.getText();
       String gender="";
       String category = "";
       //String date = "";
       //String currentDate = "";
       
       // validate name
       if(!Pattern.matches("^[A-Z][a-z]*([ ]{1}[A-Z]{1}[a-z]*){0,1}",name))
       {
            nameWarning.setText("* Check your name");
            goToLogin = false;
            //JOptionPane.showMessageDialog(rootPane, "Check Name", "Alert",JOptionPane.WARNING_MESSAGE);
       }
       // validate mail
       if(!Pattern.matches("[A-Za-z0-9\\._+]+@[A-Za-z]+\\.(com|ac|org){1}(.in){0,1}",email))
       {
           mailWarning.setText("* Check Your Mail Id");
           goToLogin = false;
           //JOptionPane.showMessageDialog(rootPane, "Check Email", "Alert",JOptionPane.WARNING_MESSAGE);
       }
       
       //validate genderbhosri
       if(maleButton.isSelected())
            gender = "male";
        else if(femaleButton.isSelected())
            gender = "female";
        else if(otherRadioButton.isSelected())
            gender = "others";
       
       category = (String)categoryComboBox.getSelectedItem();
       
       
       if(gender.equals(""))
        {
            goToLogin = false;
            JOptionPane.showMessageDialog(rootPane, "Select Your Gender", "Alert",JOptionPane.WARNING_MESSAGE);
        }
        if(category == "Select a Category")
        { 
           categoryWarning.setText("* Enter Your category");
           goToLogin = false;
        }
        
       
        try{

            Date date = dateChooser.getDate();
            Date currentDate = new Date();
            
            long age = 17;
            
            Calendar dateCal = new GregorianCalendar();
            Calendar currentDateCal = new GregorianCalendar();
            
            dateCal.setTime(date);
            currentDateCal.setTime(currentDate);
            
            long dateYr = dateCal.get(Calendar.YEAR);
            long dateMm = dateCal.get(Calendar.MONTH);
            dateMm+=1;
            long dateDay  =dateCal.get(Calendar.DAY_OF_MONTH);
            
            long currentDateYr = currentDateCal.get(Calendar.YEAR);
            long currentDateMm = currentDateCal.get(Calendar.MONTH);
            currentDateMm+=1;
            long currentDateDay  = currentDateCal.get(Calendar.DAY_OF_MONTH);
            
            if((currentDateYr - dateYr) >= age)
            {
                if((currentDateYr - dateYr)==age)
                {
                    if((currentDateMm - dateMm)>=0)
                    {
                        if((currentDateMm - dateMm)==0)
                        {
                            if((currentDateDay - dateDay)>=0)
                            {
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(rootPane, "Age must be greater than or equal to17 yrs", "Alert",JOptionPane.WARNING_MESSAGE);
                                goToLogin = false;
                            }
                        }
                    }
                    else
                    {
                         goToLogin = false;
                         JOptionPane.showMessageDialog(rootPane, "Age must be greater than or equal to 17 yrs", "Alert",JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
            else
            {
                goToLogin = false;
                JOptionPane.showMessageDialog(rootPane, "Age must be greater than or equal to 17 yrs", "Alert",JOptionPane.WARNING_MESSAGE);
            }
            
        }
        catch(Exception e)
        {
            goToLogin = false;
            JOptionPane.showMessageDialog(rootPane, "Select A valid Date", "Alert",JOptionPane.WARNING_MESSAGE);
        }
               
        return goToLogin;
        //validate date

    }
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JLabel categoryWarning;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateWarning;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mailWarning;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nameWarning;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables
}