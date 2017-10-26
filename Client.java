
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.io.*;
import java.net.*;

public class Client implements Serializable{
	
	public void confirmation(String str){
		System.out.println("Reached in : "+str);
	}
	
	public void perform(JFrame frame){
		

		// TODO Auto-generated method stub
		frame.getContentPane().removeAll();
		
		frame.setTitle("Online Membership Portal");
		JButton adminbutton, userbutton;
        JLabel label;
		
		GridBagConstraints c = new GridBagConstraints();
	    
	 
	    label = new JLabel("Welcome to Online Membership Portal");
	    label.setFont(new Font("Serif", Font.PLAIN, 50));
	    
	    c.ipady = 100; 
	    c.weightx = 0.0;
	    c.weighty = 0.0;
	    c.gridwidth = 3;
	    c.fill = GridBagConstraints.CENTER;
	    c.gridx = 0;
	    c.gridy = 0;
	    frame.add(label, c);
	    
	    label = new JLabel("Please select the appropriate option");
	    label.setFont(new Font("Serif", Font.PLAIN, 40));
	    
	    c.ipady = 100; 
	    c.weightx = 0.0;
	    c.weighty = 0.0;
	    c.insets = new Insets(10,90,0,0);
	    c.gridwidth = 3;
	    c.fill = GridBagConstraints.CENTER;
	    c.gridx = 0;
	    c.gridy = 1;
	    frame.add(label, c);
	   
	    adminbutton = new JButton();
	    adminbutton.setText("admin");
	    c.fill = GridBagConstraints.CENTER;
	    c.ipadx = 100;     // default size + ipadx
	    c.ipady = 15;       //default size + ipady
	    c.weighty = 1.0;   //request any extra vertical space
	 
	    c.insets = new Insets(10,10,10,10);  //top left bottom right
	    c.gridx = 0;       //aligned with button 1
	    c.gridwidth = 1;   //1 columns wide
	    c.gridy = 2;       //third row
	    
	    adminbutton.addActionListener(new myClientActionListener(frame));
	    frame.add(adminbutton, c);
	    
	    userbutton = new JButton("user");
	    c.fill = GridBagConstraints.CENTER;
	    c.ipadx = 100;    // default size + ipadx
	    c.ipady = 15;     //default size + ipady
	    c.weighty = 1.0;   //request any extra vertical space
	 
	    c.insets = new Insets(10,500,0,0);  //top left bottom right
	    c.gridx = 1;       //aligned with button 2
	    c.gridwidth = 1;   //1 columns wide
	    c.gridy = 2;       //third row
	   
	    userbutton.addActionListener(new myClientActionListener(frame));
	    frame.add(userbutton, c);
	 	    
	    label = new JLabel("Copyright 2017-2018 - Ambuj Singh");
	 
	    label.setFont(new Font("Serif", Font.PLAIN, 20));
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipadx = 10;
	    c.ipady = 10;       //reset to default
	    c.weighty = 1.0;   //request any extra vertical space
	    c.anchor = GridBagConstraints.PAGE_END; //bottom of space
	    c.insets = new Insets(10,50,0,0);  //top left bottom right
	    c.gridx = 1;       //aligned with button 2
	    c.gridwidth = 1;   //1 columns wide
	    c.gridy = 3;       //fourth row
	    frame.add(label, c);
	    
	    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setVisible(true);
		
		  
		  
		  
	
	}
	
	public static void main(String[] args) throws IOException {
		
		JFrame frame = new JFrame();
		frame.setSize(1980,1000);
		frame.setLayout(new GridBagLayout());
		
		Client clientobj = new Client();
		clientobj.perform(frame);
	}

}

class myClientActionListener implements ActionListener {
	  
	JFrame frame;

	public myClientActionListener(JFrame obj){
			this.frame=obj;
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	    System.out.println(buttonText);
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);

	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	            
	            	Validation valid = new Validation(frame, buttonText);
	            	valid.perform();
	            	
	            }	 
	            	
	             else if (n == JOptionPane.NO_OPTION) {
	            	Object[] options = { "OK", "Cancel" };
	            	int choice = JOptionPane.showOptionDialog(null, 
	            		      "You really want to quit?", 
	            		      "Quit?", 
	            		      JOptionPane.YES_NO_OPTION, 
	            		      JOptionPane.QUESTION_MESSAGE, 
	            		      null, 
	            		      options, 
	            		      options[0]);

	            		  // interpret the user's choice
	            		  if (choice == JOptionPane.YES_OPTION)
	            		  {
	            		    System.exit(0);
	            		  }
	            		
	            } else if (n == JOptionPane.CLOSED_OPTION) {
	                System.out.println("Closed by hitting the cross");
	            }
        
	            }
	
	
}

