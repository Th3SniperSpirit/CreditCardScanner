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
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JApplet;
import java.util.concurrent.TimeUnit;
import java.util.Random.*;
import java.beans.*;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;
import java.util.Scanner;
 import java.awt.image.*;
import java.io.*;
import java.net.URL;
import javax.imageio.*;

public class CreditCardApp extends JApplet implements ActionListener{

public static int width, height;
 public static Image backbuffer;
  public static Graphics backg;
  public static JTextField text;
  public static Container c;

  //graphics implementation
   public void init(){
   width = 700;
   height = 700;
    backbuffer = createImage( width, height );
      backg = backbuffer.getGraphics();
      setSize(width,height);  
      c = getContentPane();
      c.setLayout(new BorderLayout());
      
      text = new JTextField(20);
      c.add(text,BorderLayout.NORTH);
      String q = text.getText();
      
      text.addActionListener(this);

   }
   
   public void paint(Graphics g){
   update( g );
   }
   
   public void update(Graphics g){
      g.drawImage( backbuffer, 0, 0, this ); 
  }
  
  public void actionPerformed(ActionEvent e){
  String tef = text.getText();
 
  
  }

}