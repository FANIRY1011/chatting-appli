
package chatting.aplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Server extends JFrame implements ActionListener {
    
     Server(){
         
         setLayout(null);
         JPanel pl= new JPanel();
         pl.setBackground(new Color(7 ,94 ,84));
         pl.setBounds(0, 0, 450, 70);
         pl.setLayout(null);
         add(pl);
         
         ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("Icons/6.png"));
         Image i4 = il.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
         ImageIcon i7 = new ImageIcon (i7);
         JLabel profile = new JLabel(i7);
        profile.setBounds(5, 20, 50, 50);
         pl.add(profile);
         
         
        profile.addMouseListener(new MouseAdapter(){
            public void mouseclicked(MouseEvent ae){
                System.exit(0);
            }
            
        });
                 
                 
                 
         
         setSize(450,700);
         setLocation(200,50);
        getContentPane().setBackground(Color.WHITE);
         
         
          setVisible(true);
    }
    
  public static void main(String[]arg){
      new Server();
  }
    
}
