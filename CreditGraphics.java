//Test number: 4012888888881881
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.*;
import java.io.*;
import javax.mail.*;
import javax.mail.event.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.util.Properties;
import javax.mail.Header;
import java.util.Enumeration;
import java.util.Properties;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JApplet;
import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.URLName;
import java.beans.*;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;
import java.util.Scanner;
import java.awt.image.*;
import java.io.*;
import java.net.URL;
import javax.imageio.*;
import javax.swing.Timer;

public class CreditGraphics {

//first screen variables
   public static String cardNum;
   public JLabel welcome;
   public JLabel loading;
   public JFrame frame;
   public JPanel panel;
   public JLabel label;
   
   //SCREEN 2
   public JFrame frame2;
   public JPanel panel2;
   public JLabel question;
   public JButton yes;
   public JButton no;
   
   
 
   
//SCREEN 3
   public static final Insets DEFAULT_INSETS = new Insets(5, 5, 5, 5);
   public static final double DEFAULT_WEIGHTX = 1.0;
   public static final double DEFAULT_WEIGHTY = 1.0;
   public static JFrame vframe;
   public static JPanel vpanel;
   public static JLabel titlelabel;
   public static JLabel namelabel;
   public static JLabel firstname;
   public static JTextField firstText;
   public static JLabel lastname;
   public static JTextField lastText;
   public static JLabel birthdaylabel;
   public static JLabel dayDD;
   public static String[] daysArray;
   public static JComboBox BDday;
   public static JLabel monthDD;
   public static String[] monthsArray;
   public static JComboBox BDmonth;
   public static JLabel yearDD;
   public static String[] yearsArray;
   public static JComboBox BDyear;
   public static JLabel addressLabel;
   public static JTextField addressText;
   public static JLabel cityLabel;
   public static JTextField cityText;
   public static JLabel stateLabel;
   public static String[] stateArray;
   public static JComboBox stateBox;
   public static JLabel countryLabel;
   public static String[] countryArray;
   public static JComboBox countryBox; 
   public static JLabel zipLabel;
   public static JTextField zipText;
   public static JLabel phoneLabel;
   public static JTextField phoneText;
   public static JButton formDoneButton;
   
   
   public static GridBagConstraints grid;
   
   
   //SECTION FOR STORING INFORMATION FROM FIELDS AND COMBOBOXES FROM FORM
   public static String fname; //holds info from textfields
   public static String lname;
   public static String birthday;
   public static String birthmonth;
   public static String birthyear;
   public static String address;
   public static String city;
   public static String country;
   public static String zipcode;
   public static String state;
   public static String phone;
   //add on next screen
   public static String cardNumber;
   public static String cardBrand;
   
  //creditCardScreen variables
   public static JFrame cframe;
   public static JPanel cpanel;
   public static JLabel ctitle;
   public static JLabel creditcardLabel;
   public static JLabel cardbrandLabel;
   public static JLabel verifylabelBrand;
   public static JLabel verifylabelNumber;
   public static JTextField text;
   public static String cardType = "";
   public static String carddigits;
   public static boolean cardValid;
   public static int length;
   public static String[] cardTypes;
   public static JComboBox cardTypesDD;
   public static ArrayList<Integer> holdDigits = new ArrayList<Integer>();
   public static ArrayList<String> holdDigitsChar = new ArrayList<String>();
   public static int[] checkDigits;
   public static int checkSum = 0;
   public static JButton submit;
   public static JButton nextStep;
   
   
   //saveScreen variables
   public static JFrame sframe;
   public static JPanel spanel;
   public static JLabel stitle;
   public static JButton syes;
   public static JButton sno;
   
   //form print out screen
   public static JFrame fframe;
   public static JPanel fpanel;
   public static JLabel ftitle;
   public static JLabel ffname; //holds info from textfields
   public static JLabel flname;
   public static JLabel fbirthday;
   public static JLabel fbirthmonth;
   public static JLabel fbirthyear;
   public static JLabel faddress;
   public static JLabel fcity;
   public static JLabel fcountry;
   public static JLabel fzipcode;
   public static JLabel fstate;
   public static JLabel fphone;
   
   //email screen
   public static JFrame eframe;
   public static JPanel epanel;
   public static JLabel etitle;
   public static JLabel emaillabel;
   public static JTextField emailtext;
   public static JLabel emailtypechecker;
   public static JLabel sendinglabel;
   public static JLabel sentlabel;
   public static JLabel faillabel;
   public static JButton COMPLETE;
   public static String sender = "protennis95@gmail.com";
   public static String receiver;
   public static String host = "mattspc";
   public static String pw = "California4!";
   public static Properties properties;
   public static Session session;
   public static String cardemail;
   public static String emailType;
   public static JButton sendEmailButton;
   
   public static int formCount = 0;

   public CreditGraphics() {
   
   
   //screen 1/title screen
      
      frame = new JFrame("MES Banking App");
      panel = new JPanel();
      label = new JLabel();
      welcome = new JLabel("Welcome to MES Banking!");
      loading = new JLabel("Preparing.");
    
     
   
      panel.setLayout(new GridBagLayout());
      
      grid = createGbc(0,0,5,1);
      grid.fill = GridBagConstraints.CENTER;
      welcome.setHorizontalTextPosition(JLabel.CENTER);
      panel.add(welcome,grid);
      
      grid = createGbc(0,3);
      panel.add(loading,grid);
      
      
      
      
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
      frame.getContentPane().add(panel);
      
      frame.pack();
      frame.setVisible(true); 
     
    
      screen2();
      //label.setText("<html>Please enter your credit card <br> 'Master Card' 'Visa' or 'American Express'</html>");
      
     
            
   
     
   }

    

   public static void main(String[] args) {
      SwingUtilities.invokeLater(
            new Runnable() {
               public void run() {
               
               
                  new CreditGraphics();
               
               }
            
            
            
            
            });
   }
   
   
   public static GridBagConstraints createGbc(int x, int y, int width, int height) {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = x;
      gbc.gridy = y;
      gbc.gridwidth = width;
      gbc.gridheight = height;
   
      // default set ups
      gbc.insets = DEFAULT_INSETS;
      gbc.weightx = DEFAULT_WEIGHTX;
      gbc.weighty = DEFAULT_WEIGHTY;
      gbc.fill = GridBagConstraints.HORIZONTAL;
   
      return gbc;
   }
   
   
   public static GridBagConstraints createGbc(int x, int y) {
      return createGbc(x, y, 1, 1);
   }
   
   
   
   public void screen2(){
      //dispose of first screen;
        
      frame.dispose();
       
      frame2 = new JFrame("MES Banking App");
      panel2 = new JPanel();
      question = new JLabel("<html>Hello! You are here to enter your CC information, <br> correct?</html>");
      yes = new JButton("Yes");
      no = new JButton("No");
       
      panel2.setLayout(new GridBagLayout());
      grid = createGbc(0,0,5,1);
      panel2.add(question,grid);
       
      grid = createGbc(0,1);
      panel2.add(yes,grid);
       
      grid = createGbc(1,1);
      panel2.add(no,grid);
       
      yes.addActionListener(
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  System.out.println("Next screen");
                  frame2.dispose();
                  verifyScreen();//loads form
               }
            });
            
      no.addActionListener(
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  System.out.println("Exiting");
                  System.exit(0);
               }
            });
       
       
      frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      frame2.getContentPane().add(panel2);
   
      frame2.pack();
      frame2.setVisible(true);  
       
   }
   
   
   
   
   public void verifyScreen(){
   //destroy old frame
   
   
      vframe = new JFrame("MES Banking App");
      vpanel = new JPanel();
      titlelabel = new JLabel("Verification Page");
      namelabel = new JLabel("Name: ");
      firstname = new JLabel("First:");
      firstText = new JTextField(10);
      lastname = new JLabel("Last:");
      lastText = new JTextField(10);
      birthdaylabel = new JLabel("Birth date: ");
      dayDD = new JLabel("Day:");
      daysArray = new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "11", "12", "13", "14", "15", "16", "17", "18" };// 31
      BDday = new JComboBox(daysArray);
      monthDD = new JLabel("Month:");
      monthsArray = new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "11", "12" }; // 12 months
      BDmonth = new JComboBox(monthsArray);
      yearDD = new JLabel("Year:");
      yearsArray = new String[] {"","2014","2013","2012"};//a lot of years, 100ish
      BDyear = new JComboBox(yearsArray);
      addressLabel = new JLabel("Address:");
      addressText = new JTextField(20);
      cityLabel = new JLabel("City:");
      cityText = new JTextField(20);
      stateLabel = new JLabel("State:");
      stateArray = new String[]{"","Virginia"}; //all 50 states...dont want to type :(
      stateBox = new JComboBox(stateArray);
      countryLabel = new JLabel("Country:");
      countryArray = new String[] {"","United States"}; //need many more countries
      countryBox = new JComboBox(countryArray);
      zipLabel = new JLabel("Zip Code:");
      zipText = new JTextField(5);
      phoneLabel = new JLabel("Phone #");
      phoneText = new JTextField(20);
      formDoneButton = new JButton("Next Step ->");
   
      // title section
      vpanel.setLayout(new GridBagLayout());
      grid = createGbc(0, 0, 5, 1);
      grid.fill = GridBagConstraints.CENTER;
      titlelabel.setHorizontalTextPosition(JLabel.CENTER);
      vpanel.add(titlelabel, grid);
   
      // name section
      grid = createGbc(0, 1);
      vpanel.add(namelabel, grid);// adds name label
   
      grid = createGbc(1, 1, 4, 1);
      vpanel.add(firstname, grid);
      grid = createGbc(2,1);
      vpanel.add(firstText,grid);
      grid = createGbc(3,1);
      vpanel.add(lastname,grid);
      grid = createGbc(4,1);
      vpanel.add(lastText,grid);
   
      // birthday section
      grid = createGbc(0, 2);
      vpanel.add(birthdaylabel, grid); // adds bday label
      grid = createGbc(1, 2);
      vpanel.add(dayDD, grid); // add day label
      grid = createGbc(2, 2);
      vpanel.add(BDday, grid);
      grid = createGbc(3, 2);
      vpanel.add(monthDD, grid);
      grid = createGbc(4, 2);
      vpanel.add(BDmonth, grid);
      grid = createGbc(5,2);
      vpanel.add(yearDD,grid);
      grid = createGbc(6,2);
      vpanel.add(BDyear,grid);
      
      //address section
      grid = createGbc(0,3);
      vpanel.add(addressLabel,grid);
      grid = createGbc(1,3,4,1);
      vpanel.add(addressText,grid);
      
      //city section
      grid = createGbc(0,4);
      vpanel.add(cityLabel,grid);
      grid = createGbc(1,4,4,1);
      vpanel.add(cityText,grid);
     
      //state section
      grid = createGbc(0,5);
      vpanel.add(stateLabel,grid);
      grid = createGbc(1,5,2,1);
      vpanel.add(stateBox,grid);
      
      //zip code section, goes next to state section
      grid = createGbc(3,5);
      vpanel.add(zipLabel,grid);
      grid = createGbc(4,5);
      vpanel.add(zipText,grid);
       
      //country section
      grid = createGbc(0,6);
      vpanel.add(countryLabel,grid);
      grid = createGbc(1,6,3,1);
      vpanel.add(countryBox,grid);
      
      //phone number section
      grid = createGbc(0,7);
      vpanel.add(phoneLabel,grid);
      grid = createGbc(1,7,3,1);
      vpanel.add(phoneText,grid);
      
   
       
      grid = createGbc(6,8);
      vpanel.add(formDoneButton,grid);
      
      
      formDoneButton.addActionListener(
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  
                  //stores data from form and checks if form is filled
                  if(firstText.getText().equals("")){
                     System.out.println("Error: Please enter your first name");
                     
                     
                  }
                  else{
                     fname = firstText.getText();
                     formCount++;
                  }
                  
                  if(lastText.getText().equals("")){
                     System.out.println("Error: Please enter your last name");
                    
                  }
                  else{
                     lname = lastText.getText();
                     formCount++;
                  }
                  
                  if(BDday.getSelectedItem().toString().equals("")){
                     System.out.println("Please enter the day of your birthday");
                     
                  }
                  else
                  {
                     birthday = BDday.getSelectedItem().toString();
                     formCount++;
                  }
                  
                  if(BDmonth.getSelectedItem().toString().equals("")){
                     System.out.println("Error: Please enter the month of your birth");
                     
                  }
                  else
                  {
                     birthmonth = BDmonth.getSelectedItem().toString();
                     formCount++;
                  }
                  
                  if(BDyear.getSelectedItem().toString().equals("")){
                     System.out.println("Error: Please enter the year of your birth");
                     
                  }
                  else
                  {
                     birthyear = BDyear.getSelectedItem().toString();
                     formCount++;
                  }
                 
                  if(addressText.getText().equals("")){
                     System.out.println("Error: Please enter your address");
                     
                  }
                  else
                  {
                     address = addressText.getText();
                     formCount++;
                  }
                  //city,state,zip
                  
                  if(cityText.getText().equals("")){
                     System.out.println("Error: Please enter your city");
                     
                  }
                  else
                  {
                     city = cityText.getText();
                     formCount++;
                  }
                  
                  if(stateBox.getSelectedItem().toString().equals("")){
                     System.out.println("Error: Please enter your state");
                     
                  }
                  else
                  {
                     state = stateBox.getSelectedItem().toString();
                     formCount++;
                  }
                  
                  if(zipText.getText().equals("")){
                     System.out.println("Error: Please enter your zip code");
                     
                  }
                  else
                  {
                     zipcode = zipText.getText();
                     formCount++;
                  }
                  
                  if(countryBox.getSelectedItem().toString().equals("")){
                     System.out.println("Error: Please enter your country");
                     
                  }
                  else
                  {
                     country = countryBox.getSelectedItem().toString();
                     formCount++;
                  }
                  
                  if(phoneText.getText().equals("")){
                     System.out.println("Error: Please enter your phone number");
                     
                  }
                  else
                  {
                     phone = phoneText.getText();
                     formCount++;
                  }
                    //so once all things are checked out, move to credit card checker screen
                    if(formCount == 11){//will only go on to next screen if you have filled out the entire form
                  vframe.dispose();
              
                  creditCardScreen();
                  }
               }
            });
      
      
   
      vframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      vframe.setResizable(false);
      vframe.getContentPane().add(vpanel);
   
      vframe.pack();
   
      vframe.setVisible(true);  
   }
   
   
   public static void waits (int k){
      long time0, time1;
      time0 = System.currentTimeMillis();
      do{
         time1 = System.currentTimeMillis();
      }
      while ((time1 - time0) < k * 1000);
   }
   
   public void creditCardScreen(){
   //create screen
      cframe = new JFrame("MES Banking App");
      cpanel = new JPanel();
      ctitle = new JLabel("Credit Card Authorization");
      cardTypes = new String[4];//need to relocate
      cardTypes[0] = "Visa";
      cardTypes[1] = "American Express";
      cardTypes[2] = "Master Card";
      cardTypes[3] = "";
      cardTypesDD = new JComboBox(cardTypes);
      cardTypesDD.setSelectedIndex(3);
      text = new JTextField(16);
      creditcardLabel = new JLabel("Enter Card Number: ");
      cardbrandLabel = new JLabel("Card Brand:         ");
      verifylabelBrand = new JLabel("");
      verifylabelNumber = new JLabel(""); //by default is blank, says whether or not card is valid
      submit = new JButton("Submit");
      nextStep = new JButton("Next step ->");
      nextStep.setEnabled(false);//makes button unclickable until form is filled.
      
   
   
      cpanel.setLayout(new GridBagLayout());
      grid = createGbc(0, 0, 5, 1);
      grid.fill = GridBagConstraints.CENTER;
      ctitle.setHorizontalTextPosition(JLabel.CENTER);
      cpanel.add(ctitle, grid);
      
      grid = createGbc(0,1);
      cpanel.add(cardbrandLabel,grid);
      grid = createGbc(1,1);
      cpanel.add(cardTypesDD,grid);
      
      
      grid = createGbc(0,2);
      cpanel.add(creditcardLabel,grid);
      grid = createGbc(1,2);
      cpanel.add(text,grid);
      
      grid = createGbc(0,4,2,2);
      cpanel.add(verifylabelBrand,grid);
      grid = createGbc(0,5,2,2);
      cpanel.add(verifylabelNumber,grid);
      
      grid = createGbc(1,6);
      cpanel.add(submit,grid);
      
      grid = createGbc(1,7);
      cpanel.add(nextStep,grid);
      
      
      
      
      
      
      text.addActionListener(//need to relocate
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
               //after CC type is entered, prompt user to enter digits
               
               }
            
            });
      
       
   
     
   
   
      cardTypesDD.addActionListener(//relocate
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
               //where program really starts
                  while(cardTypesDD.getSelectedIndex() == 3){
                     label.setText("First, please select a card type from DD list");
                  }
               
                  cardType = (String)cardTypesDD.getSelectedItem();
                  System.out.println(cardType); 
                         
                  if(!cardType.equals("")){
                     label.setText("Thank you, now please enter your card #");
                  }
                //now go to the jtextfield actionlistener  
               }
            
            });
            
            
              
      submit.addActionListener(//relocate
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  carddigits = text.getText();//gets credit card number from jtextfield
                  length = carddigits.length();//sets length of card 
                  validateCard(); //uses credit card number and length to determine if it matches up to brand
                  cardType = (String)cardTypesDD.getSelectedItem();
                  
                  validateCard();
               //below returns if card is valid
                  if(cardValid == true){
                     verifylabelBrand.setText("Card brand is valid");
                  } 
                  
                  waits(1);
                  
                  checkDigits();
                  
                                  
               
                                
               
                
                         
               
               
               
               }
            
            });
      
   
      nextStep.addActionListener(
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
               //goes to next screen once clicked
                  saveDataScreen();
               
               }
            
            });
   
      
      cframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      cframe.getContentPane().add(cpanel);
   
      cframe.pack();
   
      cframe.setVisible(true);
      
   }
   
   //screen to send emails and save data etc
   public void saveDataScreen(){
      cframe.dispose();
      
      sframe = new JFrame("MES Banking App");
      spanel = new JPanel();
      stitle = new JLabel("Would you like us to create and save a form of your data?");
      syes = new JButton("Yes");
      sno = new JButton("No");
      
      spanel.setLayout(new GridBagLayout());
      grid = createGbc(0, 0, 5, 1);
      grid.fill = GridBagConstraints.CENTER;
      stitle.setHorizontalTextPosition(JLabel.CENTER);
      spanel.add(stitle, grid);
      
      grid = createGbc(0,1);
      spanel.add(syes,grid);
      grid = createGbc(1,1);
      spanel.add(sno,grid);
      
         //IF YES IS CLICKED, create FORM and begin next screen showing form
      syes.addActionListener(
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
               //  formScreen();
               
               }
            
            });
            
            //IF NO IS CLICKED GO ON TO EMAIL SCREEN
      sno.addActionListener(
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  emailScreen();
               
               }
            
            });
      
      sframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      sframe.getContentPane().add(spanel);
   
      sframe.pack();
   
      sframe.setVisible(true);
   }
   
   //RUN IF YES IS CLICKED
   /*public void formScreen(){
   sframe.dispose();
   
      fframe = new JFrame("MES Banking App");
      fpanel = new JPanel();
      ftitle = new JLabel("Credit Card Personal Information");
      ffname = new JLabel(fname);
      flname = new JLabel(lname);
      fbirthday = new JLabel(birthday);
      fbirthmonth = new JLabel(birthmonth);
      fbirthyear = new JLabel(birthyear);
      faddress = new JLabel(address);
      fcity = new JLabel(city);
      fcountry = new JLabel(country);
      fstate = new JLabel(state);
      fphone = new JLabel(phone);
      fzipcode = new JLabel(zipcode);
      
      
      
      fpanel.setLayout(new GridBagLayout());
      grid = createGbc(0, 0, 5, 1);
      grid.fill = GridBagConstraints.CENTER;
      ftitle.setHorizontalTextPosition(JLabel.CENTER);
      fpanel.add(ftitle, grid);
      
      grid = createGbc(0,1);
      fpanel.add(namelabel,grid);
      grid = createGbc(1,1);
      fpanel.add(ffname,grid);
      
      
      
         
      
      fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      fframe.getContentPane().add(fpanel);
   
      fframe.pack();
   
      fframe.setVisible(true);
   }*/
   
   public void emailScreen(){
      sframe.dispose();
   
      eframe = new JFrame("MES Banking App");
      epanel = new JPanel();
      etitle = new JLabel("Almost done!");
      emaillabel = new JLabel("We require email comfirmation:");
      emailtext = new JTextField(20);
   
      sendinglabel = new JLabel("Attempting to send email....");
      sentlabel = new JLabel("Email successfully sent!");
      faillabel = new JLabel ("Error, could not send to requested address");
      COMPLETE = new JButton("FINISH!");
      sendEmailButton = new JButton("Send");
   // emailtypechecker.setVisible(false);
   //sendinglabel.setVisible(false);
   //sentlabel.setVisible(false);
   //faillabel.setVisible(false);
      eframe.setPreferredSize(new Dimension(450,250));
   
   
      epanel.setLayout(new GridBagLayout());
      grid = createGbc(0, 0, 4, 1);
      grid.fill = GridBagConstraints.CENTER;
      etitle.setHorizontalTextPosition(JLabel.CENTER);
      epanel.add(etitle, grid);
      
      grid = createGbc(0,1);
      epanel.add(emaillabel,grid);
      grid = createGbc(1,1);
      epanel.add(emailtext,grid);
      grid = createGbc(1,2);
      epanel.add(sendEmailButton,grid);
        
    
      
   
         
    
     
    
      //grid = createGbc(0,5);
      //epanel.add(faillabel,grid);
      
      sendEmailButton.addActionListener(
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  receiver = emailtext.getText();
               //send
                  sendCardMail();
               
               }
            
            });
   
   
      eframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      eframe.getContentPane().add(epanel);
   
      eframe.pack();
   
      eframe.setVisible(true);
   }
   
   
   public void validateCard(){
   //check brand
    
      cardValid = false;
      if((cardType.equals("Visa") && carddigits.substring(0,1).equals("4")) && (length == 13 || length == 16)){
         label.setText("Thank you, next step");
         
         cardValid = true;
      }
      if((cardType.equals("Master Card")) && (carddigits.substring(0,2).equals("51") || carddigits.substring(0,2).equals("52") || carddigits.substring(0,2).equals("53") || carddigits.substring(0,2).equals("54") || carddigits.substring(0,2).equals("55")) && (length == 16)){
         label.setText("Thank you, next step");
         cardValid = true;
      }
      if((cardType.equals("American Express") && carddigits.substring(0,2).equals("37") && length == 15)){
         label.setText("Thank you, next step");
         cardValid = true;
      }
         
      if(cardValid != true){
         System.out.println("ERROR");
         label.setText("ERROR");
         waits(2);
         System.exit(0);
      }
    
   //end check   
   }
   
   
   public void checkDigits(){
      label.setText("Checking digits using Luhn's algorithm...");
      waits(2);
       //check digits
      checkDigits = new int[length];
      for(int i = 0; i < length ; i++){
         checkDigits[i] = Integer.parseInt(carddigits.substring(i,i+1));
       
      //successfully puts digits into array
      }
      for(int e = length-2; e >= 0; e-=2){
         checkDigits[e] = 2*checkDigits[e];
      }
      for(int d = 0; d < length; d++){
         holdDigitsChar.add(String.valueOf(checkDigits[d])); 
      }
      for(int v = 0; v<length;v++){
         if(holdDigitsChar.get(v).length() == 2){
            holdDigits.add(Integer.parseInt(holdDigitsChar.get(v).substring(0,1)));
            holdDigits.add(Integer.parseInt(holdDigitsChar.get(v).substring(1,2)));
         }
         else{
            holdDigits.add(Integer.parseInt(holdDigitsChar.get(v)));
         }
      }
      for(int c = 0; c < holdDigits.size(); c++){
         checkSum += holdDigits.get(c);
      }
      System.out.println("Check sum:" +checkSum);
    
      if(checkSum%10==0){
         verifylabelNumber.setText("Digits valid");
         nextStep.setEnabled(true);
         
         
      }
      else{
         System.out.println("ERROR");
         System.exit(0);
      }
   }
   
    //email function
   public static void sendCardMail(){
      
      properties = System.getProperties();//works
      properties.put("mail.smtp.starttls.enable", "true"); 
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.user", sender); // User name
      properties.put("mail.smtp.password", pw); // password
      properties.put("mail.smtp.port", "587");
      properties.put("mail.smtp.auth", "true");
      session = Session.getInstance (properties, new GMailAuthenticator(sender, pw));;

     
   //create email
      try{
       
         // Create a default MimeMessage object.
      
         MimeMessage message = new MimeMessage(session);
      
         message.setFrom(new InternetAddress(sender));
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
      
         message.setSubject("MES Banking! Delivery!");
         message.setText("Here is your credit card number! : " + cardNumber);
         
         if(receiver.toString().contains("gmail")){
            emailType = "GMail";
           
         }
         if(receiver.toString().contains("cox")){
            
            emailType = "Cox";
            
         }
         if(receiver.toString().contains("yahoo")){
           
            emailType = "Yahoo";
          
         }
         emailtypechecker = new JLabel("This is a " + emailType + " address...");
         grid = createGbc(0,3);
         epanel.add(emailtypechecker,grid);
         epanel.validate();
         epanel.repaint();
         
         grid = createGbc(0,4);
         epanel.add(sendinglabel,grid);
         epanel.validate();
         epanel.repaint();
         
         Transport.send(message);
        
         grid = createGbc(0,5);
         epanel.add(sentlabel,grid);
         epanel.validate();
         epanel.repaint();
           //(message.getMessageID());
        
        grid = createGbc(1,6);
        epanel.add(COMPLETE,grid);
        epanel.validate();
        epanel.repaint();
         
          COMPLETE.addActionListener(
            new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  System.out.println("You are finished, thank you!");
                  System.exit(0);
               
               }
            
            });
         
      }
      
      catch(MessagingException e){
         e.printStackTrace();
      }
   
   
   
   }
   

}


/*







//to add: printing card and codes onto word document, 3 tries and then code shuts down, unlock method, practicality? 
//to add; make something that actually mathematically decodes
// to add: make it possible to email cards to people, figure out classpath
// to add: make it store receivers email address from IP


//TO FIX: GO TO PATH WHERE MAIL.JAR IS AND ADD TO CLASSPATH



import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.*;
import java.io.*;
import javax.mail.*;
import javax.mail.event.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.util.Properties;
import javax.mail.Header;
import java.util.Enumeration;
import java.util.Properties;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JApplet;
import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.URLName;
import java.beans.*;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;
import java.util.Scanner;
 import java.awt.image.*;
import java.io.*;
import java.net.URL;
import javax.imageio.*;

public class CreditCardEncryption {

   public static String cardstring;
   public static double x;
   public static double y;
   public static double z;
   public static int length;
   public static String[] alphabet = new String[52];
   public static String[] numbers = new String[10];
   public static String[] cardstringholder;
   public static String[] cardEnc;
   public static String Encard;
   public static int tries = 0;
   public static File textfile;
   public static String sender = "protennis95@gmail.com";
   public static String receiver;
   public static String host = "Owner-VAIO";
   public static String pw = "california2";
   public static Properties properties;
   public static Session session;
   public static String cardemail;
   public static String cardType;
   public static String card;
   public static boolean cardValid;
   public static ArrayList<Integer> holdDigits = new ArrayList<Integer>();
   public static ArrayList<String> holdDigitsChar = new ArrayList<String>();
   public static int[] checkDigits;
   public static int checkSum = 0;
   
   
   
    
public static void main(String[] args){
     cardreader();
  }

   public static void cardreader(){
   //enter card
      Scanner scan = new Scanner(System.in);
      System.out.println("Hello, welcome to MES Banking! \n");
      System.out.println("Please enter your card type: Type 'Visa', 'Master Card', or 'American Express'");
      String brand = scan.nextLine();
      if(brand.equals("Visa")){
         cardType = "Visa";
      }
      if(brand.equals("Master Card")){
         cardType = "Master Card";
      }
      if(brand.equals("American Express")){
         cardType = "American Express";
      }
      
     
      System.out.println("Type in your credit card number; please: ");
      //card = scan.nextLine();
      System.out.println("\n");
      length = card.length();
      System.out.println(length);
      System.out.println("Processing...");
      //proccessing for digit errors for company type
       
      validateCard();
      checkDigits();
      
      System.out.println("You typed " + card + "; is that correct?");
   
   //checks if it's your card
      String check = scan.nextLine();
      if(check.equals("Yes") || check.equals("yes")){
         System.out.println("Good; now to the encryption");
            
      }
      else
      {
         System.out.println("Restarting...");
         cardreader();
      }
      cardstringholder = new String[length];
      cardEnc = new String[length];
      cardstring = card;
      cardemail = "Your card ends with:"+cardstring.substring(length-2)+cardstring.substring(length-1)+cardstring.substring(length);
      for(int i = 0; i < length; i++){
         cardstringholder[i] = card.substring(i);
      }
      
      encoder();
      
      System.out.println("Your encryption code is: " +Encard );
      System.out.println("\n");
      System.out.println("Is that okay?");
      String okay = scan.nextLine();
      if(okay.equals("Yes") || okay.equals("yes")){
         decoderHow();
      }
      else{
         System.out.println("Restarting...");
         cardreader();
      }
      
      //paste into textfile:
      System.out.println("Would you like to store this data?");
      String storagecheck = scan.nextLine();
      if(storagecheck.equals("Yes") || storagecheck.equals("yes")){
         storeData();
      }
      if(storagecheck.equals("No") || storagecheck.equals("no")){
         System.out.println("Your information is stored in the current program and will be deleted \n when the program terminates..");
      }
      
      System.out.println("\n");
      System.out.println("Would you like to have MES Banking e-mail your information?");
      //email stuff
      String mailq = scan.nextLine();
      if(mailq.equals("Yes") || mailq.equals("yes")){
         System.out.println(" \n What is your email? \n");
         String rec = scan.nextLine();
         receiver = rec;
         sendCardMail();
      }
      else{
         System.out.println("Thanks again!");
         System.exit(0);
      }
   }
   
   public static void encoder(){
   
   
   //alphabet strings caps and noncaps
      alphabet[0] = "a";alphabet[1] = "b"; alphabet[2] = "c"; alphabet[3] = "d";alphabet[4] = "e";alphabet[5] = "f";alphabet[6] = "g"; alphabet[7] = "h";
      alphabet[8] = "i"; alphabet[9] = "j";alphabet[10] = "k";alphabet[11] = "l";alphabet[12] = "m";alphabet[13] = "n";alphabet[14] = "o"; alphabet[15] = "p";
      alphabet[16] = "q"; alphabet[17] = "r"; alphabet[18] = "s"; alphabet[19] = "t"; alphabet[20] = "u";alphabet[21] = "v"; alphabet[22] = "w"; alphabet[23] = "x";
      alphabet[24] = "y"; alphabet[25] = "z";alphabet[26] = "A";alphabet[27] = "B";alphabet[28] = "C"; alphabet[29] = "D"; alphabet[30] = "E"; alphabet[31] = "F";
      alphabet[32] = "G"; alphabet[33] = "H"; alphabet[34] = "I"; alphabet[35] = "J"; alphabet[36] = "K"; alphabet[37] = "L"; alphabet[38] = "M"; alphabet[39] = "N"; 
      alphabet[40] = "O"; alphabet[41] = "P"; alphabet[42] = "Q"; alphabet[43] = "R"; alphabet[44] = "S"; alphabet[45] = "T"; alphabet[46] = "U";
      alphabet[47] = "V"; alphabet[48] = "W"; alphabet[49] = "X"; alphabet[50] = "Y"; alphabet[51] = "Z";
     
   //numbers
      numbers[0] = "0"; numbers[1] = "1"; numbers[2] = "2"; numbers[3] = "3"; numbers[4] = "4"; numbers[5] = "5"; numbers[6] = "6";
      numbers[7] = "7"; numbers[8] = "8"; numbers[9] = "9";
   
      for(int i = 0; i < length; i++){
         int alphachain = 0 + (int)(Math.random()*((51-0)+1));
         int numberchain = 0 + (int)(Math.random()*((9-0)+1));
         cardEnc[i] = alphabet[alphachain]+numbers[numberchain];
      }
      Encard = "";
      for(int d = 0; d<length; d++){
      Encard += cardEnc[d].toString();
      }
   }

   public static void decoderHow(){
      System.out.println("Thank you for choosing MES Banking!");
      System.out.println("\n Now for the behind the scenes and the decoding of your credit card number!");
   
      System.out.println("\n Here's how it looks:  \n");
      for(int q = 0; q < length; q++){
         System.out.println(cardstring.charAt(q) + "=" + cardEnc[q].toString());
      }
   
      System.out.println("Your credit card has 8 digits, each of which is divided up into its own little space called Strings. \n These strings are each given a random letter, either caps or noncaps, \n then a number, these pairs each represent one of your card numbers \n these are then smooshed back together to \n form your encrypted code!");
   }
   
   
   //storage function
   
   public static void storeData(){
      try{
         textfile = new File("C:/Users/Owner/Documents/College Programming/Encryption/CreditCardInfo.txt");
      
         FileWriter fw = new FileWriter(textfile.getAbsoluteFile(),true);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write("\r\n");
         bw.write("Credit Card Number: " + cardstring);
         bw.write("\r\n");
         bw.write("Encrypted Form: " + Encard);
         bw.write("\r\n");
         bw.close();
      }
      catch(IOException e){
         e.printStackTrace();
      }
   }
   
   //email function
   public static void sendCardMail(){
      properties = System.getProperties();//works
      properties.put("mail.smtp.starttls.enable", "true"); 
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.user", sender); // User name
      properties.put("mail.smtp.password", pw); // password
      properties.put("mail.smtp.port", "587");
      properties.put("mail.smtp.auth", "true");
      session = Session.getInstance(properties, new GMailAuthenticator(sender, pw));;//works
     
   //create email
      try{
      
         MimeMessage message = new MimeMessage(session);
      
         message.setFrom(new InternetAddress(sender));
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
      
         message.setSubject("MES Banking! Delivery!");
         message.setText("THIS IS A TEST EMAIL SENT FROM MATT'S PROGRAM \n Here are the last 3 digits of your card:" + cardemail + "\n Here is your encrypted card: " + Encard);
         
         if(receiver.toString().contains("gmail")){
            System.out.println("This is a gmail address..");
         }
         if(receiver.toString().contains("cox")){
            System.out.println("This is a cox address...");
         }
         if(receiver.toString().contains("yahoo")){
            System.out.println("This is a yahoo address...");
         }
         Transport.send(message);
         System.out.println(message.getMessageID());
           
        
         System.out.println("Sent!");
         
      }
      
      catch(MessagingException e){
         e.printStackTrace();
      }
   
   
   
   }
   
   //make credit card valid:  prefixes: 4 = visa, Master Card = 51,52,53,54. American Express = 37
//rule: take every other digit of the card start, double them and add them together, then add to that the other digits
// that were not doubled, if when divided by 10 the remainder is a whole number the card is valid

   public static void validateCard(){
   //check brand
      cardValid = false;
      if((cardType.equals("Visa") && card.substring(0,1).equals("4")) && (length == 13 || length == 16)){
         System.out.println("");
         cardValid = true;
      }
      if((cardType.equals("Master Card")) && (card.substring(0,2).equals("51") || card.substring(0,2).equals("52") || card.substring(0,2).equals("53") || card.substring(0,2).equals("54") || card.substring(0,2).equals("55")) && (length == 16)){
         System.out.println("Thank you, next step");
         cardValid = true;
      }
      if((cardType.equals("American Express") && card.substring(0,2).equals("37") && length == 15)){
         System.out.println("Thank you, next step");
         cardValid = true;
      }
         
      if(cardValid != true){
         System.out.println("ERROR");
         System.exit(0);
      }
    
   //end check   
   }
   
   //check digits
   public static void checkDigits(){
      System.out.println("Printing out charat card:");
       //check digits
      checkDigits = new int[length];
      for(int i = 0; i < length ; i++){
         checkDigits[i] = Integer.parseInt(card.substring(i,i+1));
       
      //successfully puts digits into array
      }
      for(int e = length-2; e >= 0; e-=2){
         checkDigits[e] = 2*checkDigits[e];
      }
      for(int d = 0; d < length; d++){
         holdDigitsChar.add(String.valueOf(checkDigits[d])); 
      }
      for(int v = 0; v<length;v++){
         if(holdDigitsChar.get(v).length() == 2){
            holdDigits.add(Integer.parseInt(holdDigitsChar.get(v).substring(0,1)));
            holdDigits.add(Integer.parseInt(holdDigitsChar.get(v).substring(1,2)));
         }
         else{
            holdDigits.add(Integer.parseInt(holdDigitsChar.get(v)));
         }
      }
      for(int c = 0; c < holdDigits.size(); c++){
         checkSum += holdDigits.get(c);
      }
      System.out.println("Check sum:" +checkSum);
    
    if(checkSum%10==0){
      System.out.println("SUCCESS");
      }
     else{
     System.out.println("ERROR");
     System.exit(0);
     }
   }
   
   
 
   

}
*/