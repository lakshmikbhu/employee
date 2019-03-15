
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.JTextComponent;
public class employees extends employee{
	 employees(String st1, String st2, String st3, String st4, String st7, String st8, String st9) {
	
		JFrame f= new JFrame("Label Example"); 
    JLabel l1=new JLabel("NAME:"+"  "+st1);
	l1.setBounds(50,40,500,40);  
    JLabel l2=new JLabel("Surname:"+"  "+st2.toUpperCase());
   l2.setBounds(50,100, 500,40);  
   JLabel l3=new JLabel("EmployeeID:"+"  "+st3.toUpperCase());
l3.setBounds(50,140,500,40);
JLabel l4=new JLabel("Email Address:"+"  "+st4.toUpperCase());
l4.setBounds(50,180,500, 40);
JLabel l7=new JLabel("Address:"+"  "+st7.toUpperCase());
l7.setBounds(50,300,500,40);
JLabel l8=new JLabel(" phone number:"+"  "+st8.toUpperCase());
l8.setBounds(50,380, 500, 40);
 JLabel l9=new JLabel(" desgnation:"+"  "+st9.toUpperCase());
l9.setBounds(50, 440, 500, 40);
				   					    
f.add(l1); f.add(l2); f.add(l3); f.add(l4);f.add(l7);f.add(l8);f.add(l9);
f.setSize(700,700); 
				   					    

f.setVisible(true);  

}			   				      
				   				      
			public void setVisible(boolean b) {

		}
		}
		    
			 
		




