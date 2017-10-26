import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

class Validation{
	JFrame frame;
	String buttontext;
	
	public Validation(JFrame frame, String buttontext)
	{
		this.frame=frame;
		this.buttontext=buttontext;
	}
	
	
	public void perform(){
	if(buttontext=="admin"){
		 try{   
			 
			 System.out.println("Validation class : Reached in try block");
			 frame.getContentPane().removeAll();
			 
			 
			
			 frame.setLayout(new GridBagLayout());
			 System.out.println("Validation class : Grid Layout set");	
			 
				JButton submit, Back;
		        JLabel label;
		    //  JTextArea textarea ;
		        JTextField textfield ;
		        JPasswordField passwordfield;
		      
				
				GridBagConstraints c = new GridBagConstraints();
			    
			 
			    label = new JLabel("Welcome to Online Membership Portal ");
			    label.setFont(new Font("Serif", Font.PLAIN, 50));
			    
			    c.ipady = 100; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.gridx = 0;
			    c.gridy = 0;
			    frame.add(label, c);
			    
			    label = new JLabel("Please enter valid Admin credentials");
			    label.setFont(new Font("Serif", Font.PLAIN, 40));
			    
			    c.ipady = 100; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.insets = new Insets(10,90,0,0);
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.gridx = 0;
			    c.gridy = 1;
			    frame.add(label, c);
			   
			   
			    
			    label = new JLabel();
			    label.setText("Admin Username");
			    
			   label.setFont(new Font("Serif", Font.PLAIN, 20));
			    
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 100;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,200,10,10);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			   // adminbutton.addActionListener(new myActionListener(frame));
			    frame.add(label, c);
			    
			    label = new JLabel();
			    label.setText("Admin Password ");
			    label.setFont(new Font("Serif", Font.PLAIN, 20));
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 100;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(100,200,10,10);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			   // adminbutton.addActionListener(new myActionListener(frame));
			    frame.add(label, c);
			    
			    
			    
			    textfield = new JTextField();
			  //  textfield.setText("Admin Username");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 100;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,400,10,10);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			
			    frame.add(textfield, c);
			    
			    passwordfield = new JPasswordField();
			 //   textfield.setText("Admin Password ");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 100;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(100,400,10,10);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			
			    frame.add(passwordfield, c);
			    
		 	    
			    label = new JLabel("Copyright 2017-2018 - Ambuj Singh");
			 
			    label.setFont(new Font("Serif", Font.PLAIN, 20));
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 10;
			    c.ipady = 10;       //reset to default
			    c.weighty = 1.0;   //request any extra vertical space
			    c.anchor = GridBagConstraints.PAGE_END; //bottom of space
			    c.insets = new Insets(10,250,0,0);  //top left bottom right
			    c.gridx = 0;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 3;       //fourth row
			    frame.add(label, c);
			    
			
			 
			    submit = new JButton();
			    submit.setText("Submit");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 0;     // default size + ipadx
			    c.ipady = 10;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(150,300,10,10);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			//    submit.addActionListener(new myClientLatestActionListener(frame));
			    submit.addActionListener(new myValidationActionListener(frame, buttontext, textfield, passwordfield ));
			    
			    frame.add(submit, c);
			    
			    
			    
			    
			    Back = new JButton();
			    Back.setText("Back");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 0;     // default size + ipadx
			    c.ipady = 0;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			    c.anchor = GridBagConstraints.PAGE_END;
			    c.insets = new Insets(500,300,0,0);  //top left bottom right
			    c.gridx = 2;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			//    submit.addActionListener(new myClientLatestActionListener(frame));
			    Back.addActionListener(new myBackValidationActionListener(frame, buttontext, textfield, passwordfield ));
			    
			    frame.add(Back, c);
			 
			    
			 
			 
			 
			 
			 
			
				
			}
			catch(Exception ex){
				System.out.println(ex);
	        	}
	        	
	}	
	
	else if(buttontext=="user"){
		 try{   
			 
			 System.out.println("Validation class :User Block : Reached in try block of user");
			 frame.getContentPane().removeAll();
			 
			 
			
			 frame.setLayout(new GridBagLayout());
			 System.out.println("Validation class: User block : Grid Layout set");	
			 
				JButton submit, Back;
		        JLabel label;
		    //  JTextArea textarea ;
		        JTextField textfield ;
		        JPasswordField passwordfield;
		      
				
				GridBagConstraints c = new GridBagConstraints();
			    
			 
			    label = new JLabel("Welcome to Online Membership Portal : Validation");
			    label.setFont(new Font("Serif", Font.PLAIN, 50));
			    
			    c.ipady = 100; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.gridx = 0;
			    c.gridy = 0;
			    frame.add(label, c);
			    
			    label = new JLabel("Please enter valid User credentials");
			    label.setFont(new Font("Serif", Font.PLAIN, 40));
			    
			    c.ipady = 100; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.insets = new Insets(10,90,0,0);
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.gridx = 0;
			    c.gridy = 1;
			    frame.add(label, c);
			   
			   
			    
			    label = new JLabel();
			    label.setText("User Username");
			    
			   label.setFont(new Font("Serif", Font.PLAIN, 20));
			    
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 100;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,200,10,10);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			   // adminbutton.addActionListener(new myActionListener(frame));
			    frame.add(label, c);
			    
			    label = new JLabel();
			    label.setText("User Password ");
			    label.setFont(new Font("Serif", Font.PLAIN, 20));
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 100;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(100,200,10,10);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			   // adminbutton.addActionListener(new myActionListener(frame));
			    frame.add(label, c);
			    
			    
			    
			    textfield = new JTextField();
			  //  textfield.setText("Admin Username");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 100;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,400,10,10);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			
			    frame.add(textfield, c);
			    
			    passwordfield = new JPasswordField();
			 //   textfield.setText("Admin Password ");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 100;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(100,400,10,10);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			
			    frame.add(passwordfield, c);
			    
		 	    
			    label = new JLabel("Copyright 2017-2018 - Ambuj Singh");
			 
			    label.setFont(new Font("Serif", Font.PLAIN, 20));
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 10;
			    c.ipady = 10;       //reset to default
			    c.weighty = 1.0;   //request any extra vertical space
			    c.anchor = GridBagConstraints.PAGE_END; //bottom of space
			    c.insets = new Insets(10,250,0,0);  //top left bottom right
			    c.gridx = 0;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 3;       //fourth row
			    frame.add(label, c);
			    
			   
			    Back = new JButton();
			    Back.setText("Back");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 0;     // default size + ipadx
			    c.ipady = 0;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			    c.anchor = GridBagConstraints.PAGE_END;
			    c.insets = new Insets(500,300,0,0);  //top left bottom right
			    c.gridx = 2;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			//    submit.addActionListener(new myClientLatestActionListener(frame));
			    Back.addActionListener(new myBackUserValidationActionListener(frame, buttontext, textfield, passwordfield ));
			    
			    frame.add(Back, c);
			 
			    submit = new JButton();
			    submit.setText("Submit");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 0;     // default size + ipadx
			    c.ipady = 10;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(150,300,10,10);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			//    submit.addActionListener(new myClientLatestActionListener(frame));
			    submit.addActionListener(new myValidationUserActionListener(frame, buttontext, textfield, passwordfield ));
			    
			    frame.add(submit, c);
			 
			    
			 
			 
			 
			 
			 
			
				
			}
			catch(Exception ex){
				System.out.println(ex);
	        	}
		 
	 }
}
}



class myValidationActionListener implements ActionListener {
	  
	JFrame frame;
	JTextField textfield;
	JPasswordField passwordfield;
	String buttontext;
    DataObject objectcount;
  //  DataObjectChild childObject;
	public myValidationActionListener(JFrame obj,String buttontext, JTextField textfield, JPasswordField passwordfield){
			this.frame=obj;
			this.textfield=textfield;
			this.passwordfield=passwordfield;
			this.buttontext=buttontext;
			
		}
	
	public myValidationActionListener(){
		
		
	}
	
	public void getinfo(DataObject obj){
		objectcount.setMessage(obj.getMessage());
	}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	//    String buttonText = source.getText();
	
	    
	 //   System.out.println(buttonText);
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);

	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	               
	            	String username = textfield.getText();
	       		 
	            	
	        	    System.out.println("Validation class :  username by name is : "+username);
	        	    
	        	    
	        	    char[] password = passwordfield.getPassword();
	        		  
	        		  String getpassword = String.copyValueOf(password);
	        		
	        		   System.out.println("Validation class : password is : "+getpassword);
	        		   
	        		//DBConnection DBobj = new DBConnection(username, getpassword);
	        		
	        		   
	        		   DataObject myObject = new DataObject(); 
	               	DataObject myObjectpass = new DataObject(); 
	            	DataObject validationMessageObject = new DataObject();
	            //	DataObject frameobj = new DataObject();
	            	
	            	
	        		ConnectionClass conobj = new ConnectionClass();
	        		String message = "validation";
	        		myObject.setMessage(username);
	        		myObjectpass.setMessage(getpassword);
	        		validationMessageObject.setMessage(message);
	        	//	frameobj.setFrame(frame);
	        		
	        		
	        		System.out.println("Validation class : sending objects to connection class ");
	        		validationMessageObject = conobj.performvalidation(myObject, myObjectpass, validationMessageObject);
	        	
	        		//conobj.performvalidation(myObject, myObjectpass, objnum, frameobj);
	        		
	        		System.out.println("Validation class : received objects from connection class ");
	        		System.out.println("Validation class : value of objnum.getmessage is : "+validationMessageObject.getMessage()); 
	        	//	System.out.println("Validation class : value of objectcount.getMessage is : "+objectcount.getMessage()); 
	        		
	        	 //   ConnectionClass passframe = new ConnectionClass();
	        	//	passframe.process(frame);
	        	  
	        		
	        		String string = validationMessageObject.getMessage();
	        	//	myValidationActionListener validationobj = new myValidationActionListener();
	        	//	validationobj.performregistration(string); 
	        		
	        		
                     String yes = "yes";
                     String no = "no";
                     String admin = "admin";
                     
                     if(!(username.equals(admin))){
                    	 
                    	 Object[] options = { "OK"};
	                    	int choice = JOptionPane.showOptionDialog(null, 
	                    		      "Invalid credentials provided", 
	                    		      "Quit?", 
	                    		      JOptionPane.YES_NO_OPTION, 
	                    		      JOptionPane.QUESTION_MESSAGE, 
	                    		      null, 
	                    		      options, 
	                    		      options[0]); 
                     }
	        		
                     else {
                     if(string.equals(yes)){
	            			
	            		//	System.out.println("About to create Registration object");
	        	               
	        	        //       String str = "About to create Registration object";
	        	        //       Client cl = new Client();
	        	        //       cl.confirmation(str);
	        	             //  Registration registration = new Registration(frame);
	        	            	
	        	               
	        	             // registration.perform();
	        	               
	        	             AdminOption adminoption = new AdminOption(frame);
	        	            	
	        	               
	        	             adminoption.perform();
	        	               
	        	               
	        	               
	        	          //    String strin =" Registration Perform method done";
	        	       //       cl.confirmation(strin);
	        	              
	        	       //       System.out.println("Registration object created and perform method called");
	            			
	            		}
	            		else if (string.equals(no))
	            		{

	                    	Object[] options = { "OK"};
	                    	int choice = JOptionPane.showOptionDialog(null, 
	                    		      "Invalid credentials provided", 
	                    		      "Quit?", 
	                    		      JOptionPane.YES_NO_OPTION, 
	                    		      JOptionPane.QUESTION_MESSAGE, 
	                    		      null, 
	                    		      options, 
	                    		      options[0]);

	                    		
	                    		//  if (choice == JOptionPane.YES_OPTION)
	                    		//  {
	                    		//    System.exit(0);
	                    		//  }
	                    		
	                    	
	            		}
	                	
	                	
	            		else{
	            			Object[] options = { "OK"};
	                    	int choice = JOptionPane.showOptionDialog(null, 
	                    		      "NULL values passed", 
	                    		      "Quit?", 
	                    		      JOptionPane.YES_NO_OPTION, 
	                    		      JOptionPane.QUESTION_MESSAGE, 
	                    		      null, 
	                    		      options, 
	                    		      options[0]);
	            		}
	        			
	        		// TODO Auto-generated method stub
	        		
	            }
	        		
	        		
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

	            		
	            		  if (choice == JOptionPane.YES_OPTION)
	            		  {
	            		    System.exit(0);
	            		  }
	            		
	            } else if (n == JOptionPane.CLOSED_OPTION) {
	                System.out.println("Closed by hitting the cross");
	            }
	    
	    
		   
		 
	}

	//private void performregistration(String string) {}
}












class myValidationUserActionListener implements ActionListener {
	  
	JFrame frame;
	JTextField textfield;
	JPasswordField passwordfield;
	String buttontext;
    DataObject objectcount;
  //  DataObjectChild childObject;
	public myValidationUserActionListener(JFrame obj,String buttontext, JTextField textfield, JPasswordField passwordfield){
			this.frame=obj;
			this.textfield=textfield;
			this.passwordfield=passwordfield;
			this.buttontext=buttontext;
			
		}
	
	public myValidationUserActionListener(){
		
		
	}
	
	public void getinfo(DataObject obj){
		objectcount.setMessage(obj.getMessage());
	}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	//    String buttonText = source.getText();
	
	    
	 //   System.out.println(buttonText);
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);

	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	               
	            	String username = textfield.getText();
	       		 
	            	
	        	    System.out.println("Validation class :  username by name is : "+username);
	        	    
	        	    
	        	    char[] password = passwordfield.getPassword();
	        		  
	        		  String getpassword = String.copyValueOf(password);
	        		
	        		   System.out.println("Validation class : password is : "+getpassword);
	        		   
	        		//DBConnection DBobj = new DBConnection(username, getpassword);
	        		
	        		   
	        		   DataObject myObject = new DataObject(); 
	               	DataObject myObjectpass = new DataObject(); 
	            	DataObject validationMessageObject = new DataObject();
	            //	DataObject frameobj = new DataObject();
	            	
	            	
	        		ConnectionClass conobj = new ConnectionClass();
	        		String message = "validation";
	        		myObject.setMessage(username);
	        		myObjectpass.setMessage(getpassword);
	        		validationMessageObject.setMessage(message);
	        	//	frameobj.setFrame(frame);
	        		
	        		
	        		System.out.println("Validation class : sending objects to connection class ");
	        		validationMessageObject = conobj.performvalidation(myObject, myObjectpass, validationMessageObject);
	        	
	        		//conobj.performvalidation(myObject, myObjectpass, objnum, frameobj);
	        		
	        		System.out.println("Validation class : received objects from connection class ");
	        		System.out.println("Validation class : value of objnum.getmessage is : "+validationMessageObject.getMessage()); 
	        	//	System.out.println("Validation class : value of objectcount.getMessage is : "+objectcount.getMessage()); 
	        		
	        	 //   ConnectionClass passframe = new ConnectionClass();
	        	//	passframe.process(frame);
	        	  
	        		String string = validationMessageObject.getMessage();
	        	//	myValidationUserActionListener validationobj = new myValidationUserActionListener();
	        	//	validationobj.performregistration(string); 
	        		
                     String yes = "yes";
                     String no = "no";

	        		if(string.equals(yes)){
	        			
	        			 UserOption useroption = new UserOption(frame);
     	            	
      	                System.out.println("VALIDATION CLASS OF USER : USER IS "+myObject.getMessage());
	        			 useroption.perform(myObject);
	        		}
	            		else if (string.equals(no))
	            		{

	                    	Object[] options = { "OK"};
	                    	int choice = JOptionPane.showOptionDialog(null, 
	                    		      "Invalid credentials provided", 
	                    		      "Quit?", 
	                    		      JOptionPane.YES_NO_OPTION, 
	                    		      JOptionPane.QUESTION_MESSAGE, 
	                    		      null, 
	                    		      options, 
	                    		      options[0]);

	                    		
	                    		//  if (choice == JOptionPane.YES_OPTION)
	                    		//  {
	                    		//    System.exit(0);
	                    		//  }
	                    		
	                    	
	            		}
	                	
	                	
	            		else{
	            			Object[] options = { "OK"};
	                    	int choice = JOptionPane.showOptionDialog(null, 
	                    		      "NULL values passed", 
	                    		      "Quit?", 
	                    		      JOptionPane.YES_NO_OPTION, 
	                    		      JOptionPane.QUESTION_MESSAGE, 
	                    		      null, 
	                    		      options, 
	                    		      options[0]);
	            		}
	        			
	        		// TODO Auto-generated method stub
	        		
	        	
	        		
	        		
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

	            		
	            		  if (choice == JOptionPane.YES_OPTION)
	            		  {
	            		    System.exit(0);
	            		  }
	            		
	            } else if (n == JOptionPane.CLOSED_OPTION) {
	                System.out.println("Closed by hitting the cross");
	            }
	    
	    
		   
		 
	}

	//private void performregistration(String string) {}
}





class myBackValidationActionListener implements ActionListener {
	  
	JFrame frame;
	JTextField textfield;
	JPasswordField passwordfield;
	String buttontext;
    DataObject objectcount;
  //  DataObjectChild childObject;
	public myBackValidationActionListener(JFrame obj,String buttontext, JTextField textfield, JPasswordField passwordfield){
			this.frame=obj;
			this.textfield=textfield;
			this.passwordfield=passwordfield;
			this.buttontext=buttontext;
			
		}
	
	public myBackValidationActionListener(){
		
		
	}
	
	public void getinfo(DataObject obj){
		objectcount.setMessage(obj.getMessage());
	}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	//    String buttonText = source.getText();
	
	    
	 //   System.out.println(buttonText);
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);

	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	               
	            	Client cl = new Client();
	            	frame.getContentPane().removeAll();
	            	cl.perform(frame);
	        		
	        		
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

	            		
	            		  if (choice == JOptionPane.YES_OPTION)
	            		  {
	            		    System.exit(0);
	            		  }
	            		
	            } else if (n == JOptionPane.CLOSED_OPTION) {
	                System.out.println("Closed by hitting the cross");
	            }
	    
	    
		   
		 
	}

	//private void performregistration(String string) {}
}




class myBackUserValidationActionListener implements ActionListener {
	  
	JFrame frame;
	JTextField textfield;
	JPasswordField passwordfield;
	String buttontext;
    DataObject objectcount;
  //  DataObjectChild childObject;
	public myBackUserValidationActionListener(JFrame obj,String buttontext, JTextField textfield, JPasswordField passwordfield){
			this.frame=obj;
			this.textfield=textfield;
			this.passwordfield=passwordfield;
			this.buttontext=buttontext;
			
		}
	
	public myBackUserValidationActionListener(){
		
		
	}
	
	public void getinfo(DataObject obj){
		objectcount.setMessage(obj.getMessage());
	}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	//    String buttonText = source.getText();
	
	    
	 //   System.out.println(buttonText);
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);

	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	            	
	            	Client cl = new Client();
	            	frame.getContentPane().removeAll();
	            	cl.perform(frame);
	            	
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

	            		
	            		  if (choice == JOptionPane.YES_OPTION)
	            		  {
	            		    System.exit(0);
	            		  }
	            		
	            } else if (n == JOptionPane.CLOSED_OPTION) {
	                System.out.println("Closed by hitting the cross");
	            }
	    
	    
		   
		 
	}

	//private void performregistration(String string) {}
}