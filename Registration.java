import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.io.*;
import java.net.*;

class Registration{
	JFrame frame;
	String buttontext;
	
	public Registration(JFrame frame)
	{
		this.frame=frame;
	//	this.buttontext=buttontext;
	}
	
	
	public void perform(){
		
	//if(buttontext=="admin"){
		 try{   
			 
			 System.out.println("Registration class : Reached in try block");
			 frame.getContentPane().removeAll();
			 
			 
			
			 frame.setLayout(new GridBagLayout());
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 System.out.println("Registration class : Grid Layout set");	
			 
				JButton submit, Back;
		        JLabel label;
		    //  JTextArea textarea ;
		        JTextField username, password, nameofperson, contactnum, address ;
		        JPasswordField passwordfield;
		      
				
				GridBagConstraints c = new GridBagConstraints();
			    
			 System.out.println("Registration class : Changing frame content");
			    label = new JLabel("Welcome to Online Membership Portal ");
			    label.setFont(new Font("Serif", Font.PLAIN, 50));
			    
			    c.ipady = 50; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.gridx = 0;
			    c.gridy = 0;
			    frame.add(label, c);
			    
			    label = new JLabel("Please enter the details of user ");
			    label.setFont(new Font("Serif", Font.PLAIN, 40));
			    
			    c.ipady = 50; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.insets = new Insets(0,200,0,0);
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.gridx = 0;
			    c.gridy = 1;
			    frame.add(label, c);
			   
			   
			    
			    label = new JLabel();
			    label.setText("Username ");
			    
			   label.setFont(new Font("Serif", Font.PLAIN, 20));
			    
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 100;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(0,200,0,0);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			   // adminbutton.addActionListener(new myActionListener(frame));
			    frame.add(label, c);
			    
			    username = new JTextField();
				  //  textfield.setText("Admin Username");
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.ipadx = 100;     // default size + ipadx
				    c.ipady = 15;       //default size + ipady
				    c.weighty = 1.0;   //request any extra vertical space
				 
				    c.insets = new Insets(0,400,00,00);  //top left bottom right
				    c.gridx = 0;       //aligned with button 1
				    c.gridwidth = 1;   //1 columns wide
				    c.gridy = 2;       //third row
				
				    frame.add(username, c);
				    
			     
				    
				    label = new JLabel();
				    label.setText("Password  ");
				    
				   label.setFont(new Font("Serif", Font.PLAIN, 20));
				    
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.ipadx = 100;     // default size + ipadx
				    c.ipady = 15;       //default size + ipady
				    c.weighty = 1.0;   //request any extra vertical space
				 
				    c.insets = new Insets(100,200,0,0);  //top left bottom right
				    c.gridx = 0;       //aligned with button 1
				    c.gridwidth = 1;   //1 columns wide
				    c.gridy = 2;       //third row
				    
				   // adminbutton.addActionListener(new myActionListener(frame));
				    frame.add(label, c);
				    
				    password = new JTextField();
					  //  textfield.setText("Admin Username");
					    c.fill = GridBagConstraints.HORIZONTAL;
					    c.ipadx = 100;     // default size + ipadx
					    c.ipady = 15;       //default size + ipady
					    c.weighty = 1.0;   //request any extra vertical space
					 
					    c.insets = new Insets(100,400,0,0);  //top left bottom right
					    c.gridx = 0;       //aligned with button 1
					    c.gridwidth = 1;   //1 columns wide
					    c.gridy = 2;       //third row
					
					    frame.add(password, c);
					  
				    
					    label = new JLabel();
					    label.setText("Name of person  ");
					    
					   label.setFont(new Font("Serif", Font.PLAIN, 20));
					    
					    c.fill = GridBagConstraints.HORIZONTAL;
					    c.ipadx = 100;     // default size + ipadx
					    c.ipady = 15;       //default size + ipady
					    c.weighty = 1.0;   //request any extra vertical space
					 
					    c.insets = new Insets(200,200,0,0);  //top left bottom right
					    c.gridx = 0;       //aligned with button 1
					    c.gridwidth = 1;   //1 columns wide
					    c.gridy = 2;       //third row
					    
					   // adminbutton.addActionListener(new myActionListener(frame));
					    frame.add(label, c);
					    
					    nameofperson = new JTextField();
						  //  textfield.setText("Admin Username");
						    c.fill = GridBagConstraints.HORIZONTAL;
						    c.ipadx = 100;     // default size + ipadx
						    c.ipady = 15;       //default size + ipady
						    c.weighty = 1.0;   //request any extra vertical space
						 
						    c.insets = new Insets(200,400,0,0);  //top left bottom right
						    c.gridx = 0;       //aligned with button 1
						    c.gridwidth = 1;   //1 columns wide
						    c.gridy = 2;       //third row
						
						    frame.add(nameofperson, c);
				    
				    
						    label = new JLabel();
						    label.setText("Contact no  ");
						    
						   label.setFont(new Font("Serif", Font.PLAIN, 20));
						    
						    c.fill = GridBagConstraints.HORIZONTAL;
						    c.ipadx = 100;     // default size + ipadx
						    c.ipady = 15;       //default size + ipady
						    c.weighty = 1.0;   //request any extra vertical space
						 
						    c.insets = new Insets(300,200,0,0);  //top left bottom right
						    c.gridx = 0;       //aligned with button 1
						    c.gridwidth = 1;   //1 columns wide
						    c.gridy = 2;       //third row
						    
						   // adminbutton.addActionListener(new myActionListener(frame));
						    frame.add(label, c);
						    
						    contactnum = new JTextField();
							  //  textfield.setText("Admin Username");
							    c.fill = GridBagConstraints.HORIZONTAL;
							    c.ipadx = 100;     // default size + ipadx
							    c.ipady = 15;       //default size + ipady
							    c.weighty = 1.0;   //request any extra vertical space
							 
							    c.insets = new Insets(300,400,0,0);  //top left bottom right
							    c.gridx = 0;       //aligned with button 1
							    c.gridwidth = 1;   //1 columns wide
							    c.gridy = 2;       //third row
							
							    frame.add(contactnum, c);
					    
				    
				    
							    label = new JLabel();
							    label.setText("Address ");
							    
							   label.setFont(new Font("Serif", Font.PLAIN, 20));
							    
							    c.fill = GridBagConstraints.HORIZONTAL;
							    c.ipadx = 100;     // default size + ipadx
							    c.ipady = 15;       //default size + ipady
							    c.weighty = 1.0;   //request any extra vertical space
							 
							    c.insets = new Insets(400,200,0,0);  //top left bottom right
							    c.gridx = 0;       //aligned with button 1
							    c.gridwidth = 1;   //columns wide
							    c.gridy = 2;       //third row
							    
							   // adminbutton.addActionListener(new myActionListener(frame));
							    frame.add(label, c);
							    
							    address = new JTextField();
								  //  textfield.setText("Admin Username");
								    c.fill = GridBagConstraints.HORIZONTAL;
								    c.ipadx = 100;     // default size + ipadx
								    c.ipady = 15;       //default size + ipady
								    c.weighty = 1.0;   //request any extra vertical space
								 
								    c.insets = new Insets(400,400,0,0);  //top left bottom right
								    c.gridx = 0;       //aligned with button 1
								    c.gridwidth = 1;   //1 columns wide
								    c.gridy = 2;       //third row
								
								    frame.add(address, c);
						    
				    
				    
				    
				    
				    
				    
	   
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
			    Back.addActionListener(new myBackRegistrationActionListener(frame ));
			    
			    frame.add(Back, c);
			    
			    
			 
			    submit = new JButton();
			    submit.setText("Submit");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 0;     // default size + ipadx
			    c.ipady = 10;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(500,300,10,10);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
		
			    submit.addActionListener(new myRegistrationActionListener(frame, username, password, nameofperson, contactnum, address ));
			    
			    frame.add(submit, c);
			 
			    
		
			    
			 
			 
			 
			 
			 
			
				
			}
			catch(Exception ex){
				System.out.println(ex);
	        	}
	        	
	//}	
	
	
}
}


class myRegistrationActionListener implements ActionListener {
	// username, password, nameofperson, contactnum, address  
	JFrame frame;
	JTextField username, password, nameofperson, contactnum, address;
//	JPasswordField passwordfield;
	String buttontext;
  //  DataObject myObject;
  //  DataObjectChild childObject;
	public myRegistrationActionListener(JFrame obj, JTextField username,JTextField password,JTextField nameofperson, JTextField contactnum,JTextField address){
			this.frame=obj;
			this.username=username;
			this.password=password;
			this.nameofperson=nameofperson;
			this.contactnum=contactnum;
			this.address=address;
		
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	    System.out.println(buttonText);
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);

	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	           
	            	
	            	DataObject myObject = new DataObject(); 
	            	DataObject myObjectpass = new DataObject(); 
	            	DataObject myObjectname = new DataObject();
	            	DataObject myObjectcontact = new DataObject();
	            	DataObject myObjectaddress = new DataObject();
	            	DataObject messageObject = new DataObject();
	           // 	DataObjectChild datachild = new DataObjectChild();
	 	           
	 	    	    String register = "register";
	 	    	   messageObject.setMessage(register);
	 	    	    
	 	    	    String user = username.getText();
	 	    	   
	 	    	    System.out.println("Registration class :  username is : "+user);
	 	    	 //   datachild.packet[0]=user;
	 	    	    myObject.setMessage(user);
	 	    	    System.out.println("Registration class :  myObject set message is  : "+myObject.getMessage());
	 	    	    
	 	    	    
	 	    	    
	 	    	    String pass = password.getText();
	 	   		 
	 	    	    System.out.println("Registration class : password  is : "+pass);
	 	    	 //   datachild.packet[1]=pass;
	 	    	    
	 	    	   myObjectpass.setMessage(pass);
	 	    	 //   datachild.setMessage(pass);
	 	    	    
	 	    	    String str ="";
	 	    	   System.out.println("Registration class :  mychildObject set message is  : "+myObjectpass.getMessage());
	 	    	    
	 	    //	    System.out.println("Registration class :  mychildObject set message is  : "+datachild.getMessage());
	 	    	    
	 	    	    String name = nameofperson.getText();
	 	   		 
	 	    		
	 	    	    System.out.println(" Registration class :name of person is : "+name);
	 	    	   myObjectname.setMessage(name);
	 	    	    
	 	    	///    datachild.packet[2]=name;
	 	    	    
	 	    	    String contact = contactnum.getText();
	 	   		 
	 	    		
	 	    	    System.out.println("Registration class : contact num is : "+contact);
	 	    	   myObjectcontact.setMessage(contact);
	 	    	    
	 	    	//    datachild.packet[3]=contact;
	 	    	    
	                 String add = address.getText();
	 	   		 
	 	        	
	 	    	    System.out.println("Registration class : Address is : "+add);
	 	    	   myObjectaddress.setMessage(add);
	 	    	    
	 	    	 //   datachild.packet[4]=add;
	 	    	    
	 	          //  ConnectionClass connectionclass = new ConnectionClass(user, pass, name, contact, add);
	 	    	    
	 	    	   if(user.equals(str)||pass.equals(str)||name.equals(str)||contact.equals(str)||address.equals(str)){
	 	    		   
	 	    		  Object[] options = { "OK"};
	                 	int choice = JOptionPane.showOptionDialog(null, 
	                 		      "Insufficient entries provided!", 
	                 		      "Details", 
	                 		      JOptionPane.YES_NO_OPTION, 
	                 		      JOptionPane.QUESTION_MESSAGE, 
	                 		      null, 
	                 		      options, 
	                 		      options[0]);
	 	    		   
	 	    	   }
	 	    	   else{
	 	    	   
	 	    	   
	 	    	   
	 	    	   ConnectionClass connectionclass = new ConnectionClass();
	 	    	  messageObject=  connectionclass.performregistration(messageObject, myObject, myObjectpass,myObjectname,myObjectcontact,myObjectaddress);
	           
	 	    	  
	 	    	  
	 	    	  
	 	    	 System.out.println("Registration class : received objects from connection class ");
	        		System.out.println("Registration class : value of objnum.getmessage is : "+messageObject.getMessage());  
	 	            
	        		
	        		String string = messageObject.getMessage();
	        		

                 String yes = "yes";
                 String no = "no";

	        		if(string.equals(yes)){
	            			
	        			Object[] options = { "OK"};
                 	int choice = JOptionPane.showOptionDialog(null, 
                 		      "User created successfully! ", 
                 		      "Details", 
                 		      JOptionPane.YES_NO_OPTION, 
                 		      JOptionPane.QUESTION_MESSAGE, 
                 		      null, 
                 		      options, 
                 		      options[0]);
	        	               
                // 	frame.getContentPane().removeAll();       
                //	AdminOption adminoption = new AdminOption(frame);
                	
               // 	adminoption.perform(); 
	            			
	            		}
	            		else if (string.equals(no))
	            		{

	                    	Object[] options = { "OK"};
	                    	int choice = JOptionPane.showOptionDialog(null, 
	                    		      "Username already exists! Please select another one", 
	                    		      "Quit?", 
	                    		      JOptionPane.YES_NO_OPTION, 
	                    		      JOptionPane.QUESTION_MESSAGE, 
	                    		      null, 
	                    		      options, 
	                    		      options[0]);

	                    	
	                    	
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





class myBackRegistrationActionListener implements ActionListener {
	// username, password, nameofperson, contactnum, address  
	JFrame frame;
	JTextField username, password, nameofperson, contactnum, address;
//	JPasswordField passwordfield;
	String buttontext;
  //  DataObject myObject;
  //  DataObjectChild childObject;
	public myBackRegistrationActionListener(JFrame obj){
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
	            	
	            	AdminOption adminoption = new AdminOption(frame);
	            	frame.getContentPane().removeAll();
	            	adminoption.perform();
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