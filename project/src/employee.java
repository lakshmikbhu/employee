		import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.*;
import javax.swing.text.JTextComponent;
		public class employee extends JFrame{
			String s1,s2,s3,s4,s6,s7,s8,s9;
			
			employee(){
		      JFrame f= new JFrame("Label Example"); 
			   
			    JTextField t1,t2,t3,t4,t6,t7,t8;   
			    
			    Button b=new Button("submit");
			    b.setBounds(250,500,80,30);  
			    JLabel l1=new JLabel("NAME:");
			    t1=new JTextField();
			   
			    t1.setBounds(250, 40, 100, 30);
			    l1.setBounds(50,40,100,30);  
			    JLabel l2=new JLabel("Surname:");
			    t2=new JTextField();
			    
			    t2.setBounds(250,100 ,100,30 );
			    l2.setBounds(50,100, 100,30);  
			    JLabel l3=new JLabel("EmployeeID:");
			    t3=new JTextField();
			    
			    t3.setBounds(250, 140, 250, 30);
			    l3.setBounds(50,140,150,30);
			    JLabel l4=new JLabel("Email Address:");
			    t4=new JTextField();
                 		   
			    t4.setBounds(250, 180, 200, 30);
			    l4.setBounds(50,180,150, 30);
			    JLabel l5=new JLabel("Gender:");
			    //t5=new JTextField();
			    
			    l5.setBounds(50,220,70,30);
			    JLabel l6=new JLabel("Start Date:");
			    t6=new JTextField();
			    s6=t6.getText();
			    t6.setBounds(250, 260, 100, 30);
			    l6.setBounds(50,260,150,30);
			    JLabel l7=new JLabel("Address:");
			    t7=new JTextField();
			     
			    t7.setBounds(250, 300, 300,70);
			    l7.setBounds(50,300,100,30);
			    JLabel l8=new JLabel(" phone number:");
			    t8=new JTextField();
			    
			    t8.setBounds(250, 380,250,30);
			    l8.setBounds(50,380, 250, 30);
			    JLabel l9=new JLabel(" desgnation:");
			    String employee[]={"hr","manager","assistant manager","team leader","clerk"};        
			    JComboBox cb=new JComboBox(employee);  
			    
	            l9.setBounds(50, 440, 100, 30);
			    cb.setBounds(250, 440,130,30);
			    ButtonGroup bg=new ButtonGroup();

			    JRadioButton rb1=new JRadioButton("MALE");
			    rb1.setBounds(250,220,70,25);
			    JRadioButton rb2=new JRadioButton("FEMALE");
			    rb2.setBounds(340,220,70,25);
			    bg.add(rb1);
			    bg.add(rb2);
			    
			                 
			           
			         
			    
			    f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5);f.add(l6);f.add(l7);f.add(l8);
			    f.add(l9);
			    f.add(rb1);f.add(rb2);
			    f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t6);f.add(t7);f.add(t8);
			    f.add(cb); 
			    f.add(b); 
			     f.setSize(700,700); 
			    
			    f.setLayout(null);  
			    f.setVisible(true);  
		      //JFrame frame = new JFrame("Simple GUI");
		      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      JLabel textLabel = new JLabel();
		      textLabel.setPreferredSize(new Dimension(100, 100));
		   f.getContentPane().add(textLabel, BorderLayout.CENTER);
		   
		      f.setVisible(true);
		      b.setEnabled(true);
		      b.addActionListener(new ActionListener() {
		    	 
				public void actionPerformed(ActionEvent e) {
					 s1=t1.getText();
			    	  s2=t2.getText();
			    	  s3=t3.getText();
			    	  s4=t4.getText();	
			    	  s7=t7.getText();
			    	  s8=t8.getText();
			    	 s9=(String) cb.getItemAt(cb.getSelectedIndex());
					
					employees obj=new employees(s1,s2,s3,s4,s7,s8,s9);
					obj.setVisible(true);
					f.dispose();
					// TODO Auto-generated method stub
					
				}
				private Object parseint() {
					return null;
				}
		      });
		   
			f.addWindowListener(new WindowAdapter() {
				public void WindowClosing(ActionEvent e)
				{
					System.exit(0);
				}
				});
				}
		   public static void main(String[] args) {
		      new employee();
		    
		}
		
		}        
					   
