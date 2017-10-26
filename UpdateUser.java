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

class UpdateUser{
	JFrame frame;
	String buttontext;
	
	
	
	String[] username;
	String[] password;
	String[] name;
	String[] contact;
	String[] address;
	DataObject dataobject = new DataObject();
	String validuser;
	
	public UpdateUser(JFrame frame, String[] username, String[] password, String[] name, String[] contact, String[] address, int range)
	{
		this.frame=frame;
	//	this.buttontext=buttontext;
	}
	
	
	public void perform(DataObject myobject){
		
		
	
		 try{  
			// frame.getContentPane().removeAll();
			 this.dataobject=myobject;
			 
			 System.out.println("Update User class : Reached in try block : with myObject");
			// frame.getContentPane().removeAll();
			 
			 System.out.println("USER REACHED IN UPDATEUSERCLASS : "+dataobject.getMessage());
			
			 frame.setLayout(new GridBagLayout());
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 System.out.println("Update User class : Grid Layout set");	
			 
				JButton submit;
		        JLabel label;
		    //  JTextArea textarea ;
		        JTextField username, password, nameofperson, contactnum, address ;
		        JPasswordField passwordfield;
		      
				
				GridBagConstraints c = new GridBagConstraints();
			    
			 System.out.println("Update user class : Changing frame content");
			    label = new JLabel("Welcome to Online Membership Portal : Update User");
			    label.setFont(new Font("Serif", Font.PLAIN, 50));
			    
			    c.ipady = 50; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.gridx = 0;
			    c.gridy = 0;
			    frame.add(label, c);
			    
			    label = new JLabel("User Update ");
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
			    
			
			 
			    
			 
			    
		
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    DataObject messageobjectview = new DataObject();
	            	DataObjectChild viewTable = new DataObjectChild();
	            	
	            	String view = "view";
	            	messageobjectview.setMessage(view);
	            	ConnectionClass connectionclass = new ConnectionClass();
	            	viewTable = connectionclass.performupdate(messageobjectview);
	            	
	         //   	String [][] table = viewTable.getMessage();
	        	
	            	
	            	ArrayList<ArrayList<String>> group = new ArrayList<ArrayList<String>>(5);
	            	
	            	
	            	group = viewTable.getMessage();
	            	
	            	int count = 0;
	            	int range =0;
	            	int limit =0;
	            	
	            	
	            	
	            	for(ArrayList<String> arraylistusername : group) {
	            		for(String number : arraylistusername) {
	            			count++;
	            			System.out.println("Useroption class : printing from group object : "+number);
	            	    }
	                }
	            	
	            	System.out.println("Useroption class : value of total objects is  : "+count);
	            	
	            	range = count/5;
	            	
	            	System.out.println("Useroption class : value of range is  : "+range);
	            	
	     
	            	
	            		            	
	            	ArrayList<String> arraylistusername = new ArrayList<String>();
	            	ArrayList<String> arraylistpassword = new ArrayList<String>();
	            	ArrayList<String> arraylistname = new ArrayList<String>();
	            	ArrayList<String> arraylistcontact = new ArrayList<String>();
	            	ArrayList<String> arraylistaddress = new ArrayList<String>();      	
	            	
	            	for(ArrayList<String> arraylist : group) {
	            		for(String number : arraylist) {
	            			if((limit==0) || (limit <range)){System.out.println("If loop : value of limit is : "+limit);
	            			arraylistusername.add(number);
	            			
	            			}
	            			else if((limit==range) || (limit <(range+range))){System.out.println("First else If loop : value of limit is : "+limit);
	            			arraylistpassword.add(number);
	            			}
	            			else if((limit==(range+range)) || (limit <(range+range+range))){System.out.println("Second else If loop : value of limit is : "+limit);
	            			arraylistname.add(number);
	            			}
	            			else if((limit==(range+range+range)) || (limit <(range+range+range+range))){System.out.println("third else If loop : value of is : "+limit);
	            			arraylistcontact.add(number);
	            			
	            			}
	            			else if((limit==(range+range+range+range)) || (limit <(range+range+range+range+range))){System.out.println("fourth else If loop : value of is : "+limit);
	            			arraylistaddress.add(number);
	            			}
	            			
	            			limit++;
	            	    }
	                }
	            	
	            	
	            	String[] user = arraylistusername.toArray( new String[arraylistusername.size()] );
	        		
	        		for(String s : user){
	        			System.out.println("Username : "+s);
	        		}
	        		
                 
	        		
	        		String[] pass = arraylistpassword.toArray( new String[arraylistpassword.size()] );
	        		
	        		for(String s : pass){
	        			System.out.println("password : "+s);
	        		}
	        		
	        		
                 String[] name = arraylistname.toArray( new String[arraylistname.size()] );
	        		
	        		for(String s : name){
	        			System.out.println("name : "+s);
	        		}
	        		
               String[] contact = arraylistcontact.toArray( new String[arraylistcontact.size()] );
	        		
	        		for(String s : contact){
	        			System.out.println("contact : "+s);
	        		}
	        		
                   String[] add = arraylistaddress.toArray( new String[arraylistaddress.size()] );
	        		
	        		for(String s : add){
	        			System.out.println("address : "+s);
	        		}
	            	
	        	
	        		
	        		
	        		
	        		
	        		 for (int i = 0; i <range; i++) {
						 
						 if(dataobject.getMessage().equals(user[i])){
							 
                              username.setText(user[i]);
                              validuser=username.getText();
                              password.setText(pass[i]);
                              nameofperson.setText(name[i]);
                              contactnum.setText(contact[i]);
                              address.setText(add[i]);
                           }
						 
					 }
	        		
	        		
	        		
	        		System.out.println("Value of validuser is : "+validuser);
	        		System.out.println("Value of username.getText() is : "+username.getText());
	        		
	        	//	ViewUserDetails viewuser = new ViewUserDetails(frame, user, pass, name, contact, address,range);
	               	
	                  
	        	//	viewuser.performuser(myObject); 
			    
	        		
			    
			    
	        		submit = new JButton();
				    submit.setText("Update");
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.ipadx = 0;     // default size + ipadx
				    c.ipady = 10;       //default size + ipady
				    c.weighty = 1.0;   //request any extra vertical space
				 
				    c.insets = new Insets(500,300,10,10);  //top left bottom right
				    c.gridx = 0;       //aligned with button 1
				    c.gridwidth = 1;   //1 columns wide
				    c.gridy = 2;       //third row
				    
			    
				    String invaliduser ="";
				    if(username.getText().equals(invaliduser)){
				    	 Object[] options = { "OK"};
	 	                 	int choice = JOptionPane.showOptionDialog(null, 
	 	                 		      "Can't find this user!", 
	 	                 		      "Details", 
	 	                 		      JOptionPane.YES_NO_OPTION, 
	 	                 		      JOptionPane.QUESTION_MESSAGE, 
	 	                 		      null, 
	 	                 		      options, 
	 	                 		      options[0]);
	 	                 	
	 	                 	
				    	
				    }
				    
				    else
				    
				    {
				    submit.addActionListener(new myUpdateUserActionListener(frame, username, password, nameofperson, contactnum, address, validuser ));
				    
				    frame.add(submit, c);
			    
				    }
			    
			    
			    
			    
			    
			    
			    
			    
			 
			 
			 
			 
			 
			
				
			}
			catch(Exception ex){
				System.out.println(ex);
	        	}
	        	
	//}	
	
	
}
}


class myUpdateUserActionListener implements ActionListener {
	// username, password, nameofperson, contactnum, address  
	JFrame frame;
	JTextField username, password, nameofperson, contactnum, address;
//	JPasswordField passwordfield;
	String buttontext, validuser;
  //  DataObject myObject;
  //  DataObjectChild childObject;
	public myUpdateUserActionListener(JFrame obj, JTextField username,JTextField password,JTextField nameofperson, JTextField contactnum,JTextField address, String valuser){
			this.frame=obj;
			this.username=username;
			this.password=password;
			this.nameofperson=nameofperson;
			this.contactnum=contactnum;
			this.address=address;
			this.validuser=valuser;
		
			
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
	 	           
	 	    	    String update = "update";
	 	    	   messageObject.setMessage(update);
	 	    	    
	 	    	    String user = username.getText();
	 	    	   
	 	    	    System.out.println("Update user class :  username is : "+user);
	 	    	 //   datachild.packet[0]=user;
	 	    	    myObject.setMessage(user);
	 	    	    System.out.println("Update user class :  myObject set message is  : "+myObject.getMessage());
	 	    	    
	 	    	    
	 	    	    
	 	    	    String pass = password.getText();
	 	   		 
	 	    	    System.out.println("Update user class : password  is : "+pass);
	 	    	 //   datachild.packet[1]=pass;
	 	    	    
	 	    	   myObjectpass.setMessage(pass);
	 	    	 //   datachild.setMessage(pass);
	 	    	    
	 	    	    String str ="";
	 	    	   System.out.println("Update user class :  mychildObject set message is  : "+myObjectpass.getMessage());
	 	    	    
	 	    //	    System.out.println("Registration class :  mychildObject set message is  : "+datachild.getMessage());
	 	    	    
	 	    	    String name = nameofperson.getText();
	 	   		 
	 	    		
	 	    	    System.out.println(" Update user class :name of person is : "+name);
	 	    	   myObjectname.setMessage(name);
	 	    	    
	 	    	///    datachild.packet[2]=name;
	 	    	    
	 	    	    String contact = contactnum.getText();
	 	   		 
	 	    		
	 	    	    System.out.println("Update user class : contact num is : "+contact);
	 	    	   myObjectcontact.setMessage(contact);
	 	    	    
	 	    	//    datachild.packet[3]=contact;
	 	    	    
	                 String add = address.getText();
	 	   		 
	 	        	
	 	    	    System.out.println("Update user class : Address is : "+add);
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
	 	    	   
	 	    	   
	 	    	   
	 	    	//   ConnectionClass connectionclass = new ConnectionClass();
	 	    	//  messageObject=  connectionclass.performregistration(messageObject, myObject, myObjectpass,myObjectname,myObjectcontact,myObjectaddress);
	           
	 	    	       
	 	    		   System.out.println("UPDATE USER CLASS : values of myObject.getMessgae is : "+myObject.getMessage());
	 	    		  System.out.println("UPDATE USER CLASS : value of validuser is : "+validuser);
	 	    		   
	 	    		   if(myObject.getMessage().equals(validuser)){
	 	    			  ConnectionClass connectionclassupdate = new ConnectionClass();
	 		 	    	  messageObject=  connectionclassupdate.performupdation(messageObject, myObject, myObjectpass,myObjectname,myObjectcontact,myObjectaddress);
	 	    		   
	 	    		   }
	 	    		   else{
	 	    		   
	 	    			  Object[] options = { "OK"};
	 	                 	int choice = JOptionPane.showOptionDialog(null, 
	 	                 		      "Can't perform operation for different user!", 
	 	                 		      "Details", 
	 	                 		      JOptionPane.YES_NO_OPTION, 
	 	                 		      JOptionPane.QUESTION_MESSAGE, 
	 	                 		      null, 
	 	                 		      options, 
	 	                 		      options[0]);
	 	    	  
	 	    	  
	 	    		   }
	 	    	 System.out.println("Registration class : received objects from connection class ");
	        		System.out.println("Registration class : value of objnum.getmessage is : "+messageObject.getMessage());  
	 	            
	        		
	        		String string = messageObject.getMessage();
	        		

                 String yes = "yes";
                 String no = "no";

	        		if(string.equals(yes)){
	            			
	        			Object[] options = { "OK"};
                 	int choice = JOptionPane.showOptionDialog(null, 
                 		      "Updated User Details! Routing to Admin Home Page", 
                 		      "Details", 
                 		      JOptionPane.YES_NO_OPTION, 
                 		      JOptionPane.QUESTION_MESSAGE, 
                 		      null, 
                 		      options, 
                 		      options[0]);
	        	               
                 	frame.getContentPane().removeAll();       
                	AdminOption adminoption = new AdminOption(frame);
                	
                	adminoption.perform(); 
	            			
	            		}
	            		else if (string.equals(no))
	            		{

	                    	Object[] options = { "OK"};
	                    	int choice = JOptionPane.showOptionDialog(null, 
	                    		      "Error occured in updating the user details", 
	                    		      "Quit?", 
	                    		      JOptionPane.YES_NO_OPTION, 
	                    		      JOptionPane.QUESTION_MESSAGE, 
	                    		      null, 
	                    		      options, 
	                    		      options[0]);

	                    	
	                    	
	            		}
	                	
	            		else{}
	            		
	        			
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