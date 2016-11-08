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
      card = scan.nextLine();
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
