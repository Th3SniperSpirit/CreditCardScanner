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

public class RandomArt extends JApplet{

int width, height;
Image backbuffer;
Graphics backg;

public void init(){
        width = getSize().width*2;
      height = getSize().height*2;
      
           
      backbuffer = createImage( width, height );
      backg = backbuffer.getGraphics();
      setSize(width,height);
      backg.setColor( Color.black );
      backg.fillRect( 0, 0, width, height );
      backg.setColor( Color.white );
   }
   
   public void point(int x, int y){
   }
   b

   
   public void update( Graphics g ) {
      g.drawImage( backbuffer, 0, 0, this ); 
      
   }
   
   public void paint( Graphics g ) {
      
      update( g );
      	
          
      
   }
   

}