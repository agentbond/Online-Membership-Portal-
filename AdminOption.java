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
import java.util.Arrays;

class AdminOption{
	JFrame frame;
	String buttontext;
	
	public AdminOption(JFrame frame)
	{
		this.frame=frame;
	//	this.buttontext=buttontext;
	}
	
	
	public void perform(){
		
	
		 try{   
			 
			 System.out.println("AdminOption class : Reached in try block");
			 frame.getContentPane().removeAll();
			 
			 
			
			 frame.setLayout(new GridBagLayout());
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 System.out.println("AdminOption class : Grid Layout set");	
			 
			
			    
			    JButton Register, View, Delete, Update, Home;
		        JLabel label;
				
				GridBagConstraints c = new GridBagConstraints();
			    
			 
			    label = new JLabel("Welcome to Online Membership Portal");
			    label.setFont(new Font("Serif", Font.PLAIN, 50));
			    
			    c.ipady = 100; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.gridwidth = 3;
			    c.insets = new Insets(0,500,10,10);
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.gridx = 0;
			    c.gridy = 0;
			    frame.add(label, c);
			    
			    label = new JLabel("Please select the appropriate option : Admin option ");
			    label.setFont(new Font("Serif", Font.PLAIN, 40));
			    
			    c.ipady = 100; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.insets = new Insets(10,500,10,10);
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.gridx = 0;
			    c.gridy = 1;
			    frame.add(label, c);
			   
			    Register = new JButton();
			    Register.setText("Register");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx =150;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,200,50,50);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			    Register.addActionListener(new myAdminOptionActionListener(frame,Register));
			    frame.add(Register, c);
			    
			    View = new JButton("View");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 150;    // default size + ipadx
			    c.ipady = 15;     //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,10,50,50);  //top left bottom right
			    c.gridx = 1;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			   
			    View.addActionListener(new myAdminOptionViewActionListener(frame,View));
			    frame.add(View, c);
			    
			    Delete = new JButton("Delete");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 150;    // default size + ipadx
			    c.ipady = 15;     //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,10,50,50);  //top left bottom right
			    c.gridx = 2;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			   
			    Delete.addActionListener(new myAdminOptionDeleteActionListener(frame,Delete));
			    frame.add(Delete, c);
			    
			    Update = new JButton("Update");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 150;    // default size + ipadx
			    c.ipady = 15;     //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,10,50,50);  //top left bottom right
			    c.gridx = 3;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			   
			    Update.addActionListener(new myAdminOptionUpdateActionListener(frame,Update));
			    frame.add(Update, c);
			    
			 	    
			    
			    
			    Home = new JButton();
			    Home.setText("Home");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx =150;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(500,50,50,100);  //top left bottom right
			    c.gridx = 1;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			    Home.addActionListener(new myAdminOptionHomeActionListener(frame,Home));
			    frame.add(Home, c);
			    
			    
			    
			    label = new JLabel("Copyright 2017-2018 - Ambuj Singh");
			 
			    label.setFont(new Font("Serif", Font.PLAIN, 20));
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 10;
			    c.ipady = 10;       //reset to default
			    c.weighty = 1.0;   //request any extra vertical space
			    c.anchor = GridBagConstraints.PAGE_END; //bottom of space
			    c.insets = new Insets(0,0,0,0);  //top left bottom right
			    c.gridx = 1;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 3;       //fourth row
			    frame.add(label, c);
						    
				    
				  		
			}
			catch(Exception ex){
				System.out.println(ex);
	        	}
	        	
	//}	
	
	
}
}


class myAdminOptionActionListener implements ActionListener {

	JFrame frame;
	
	String buttontext;

	public myAdminOptionActionListener(JFrame obj, JButton button){
			this.frame=obj;
			
		
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	    System.out.println("AdminOption Class : Button clicked is : "+buttonText);
	    
	   
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);

	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	           
	           
	            	
	            	
	        	
	           	   Registration registration = new Registration(frame);
	               	
	                  
	                  registration.perform();
	          	          	    	    
	 	    	    
	 	    	    
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


class myAdminOptionViewActionListener implements ActionListener {

	JFrame frame;
	
	String buttontext;
  
	
	ArrayList<String> arraylistusername = new ArrayList<String>();
	ArrayList<String> arraylistpassword = new ArrayList<String>();
	ArrayList<String> arraylistname = new ArrayList<String>();
	ArrayList<String> arraylistcontact = new ArrayList<String>();
	ArrayList<String> arraylistaddress = new ArrayList<String>();
	
	String[] username  ;
	String[] password ;
	String[] name ;
	String[] contact  ;
	String[] address ;
	
	public myAdminOptionViewActionListener(JFrame obj, JButton button){
			this.frame=obj;
			
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	    System.out.println("AdminOption Class : Button clicked is : "+buttonText);
	    
	   
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);

	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	           
	           
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
	            			System.out.println("Adminoption class : printing from group object : "+number);
	            	    }
	                }
	            	
	            	System.out.println("Adminoption class : value of total objects is  : "+count);
	            	
	            	range = count/5;
	            	
	            	System.out.println("Adminoption class : value of range is  : "+range);
	            	
	     
	            	
	            		            	
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
	            	
	            	
	            	String[] username = arraylistusername.toArray( new String[arraylistusername.size()] );
	        		
	        		for(String s : username){
	        			System.out.println("Username : "+s);
	        		}
	        		
                  
	        		
	        		String[] password = arraylistpassword.toArray( new String[arraylistpassword.size()] );
	        		
	        		for(String s : password){
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
	        		
                    String[] address = arraylistaddress.toArray( new String[arraylistaddress.size()] );
	        		
	        		for(String s : address){
	        			System.out.println("address : "+s);
	        		}
	            	
	        		ViewUserDetails viewuser = new ViewUserDetails(frame, username, password, name, contact, address,range);
	               	
	                  
	        		viewuser.perform(); 
	 	    	    
	 	    	    
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


class myAdminOptionDeleteActionListener implements ActionListener {
	  
	JFrame frame;
	
	String buttontext;

	public myAdminOptionDeleteActionListener(JFrame obj, JButton button){
			this.frame=obj;
			
		
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	    System.out.println("AdminOption Class : Button clicked is : "+buttonText);
	    
	   
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);
        
	          
	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	           
	            	 DeleteUser deleteuser = new DeleteUser(frame);
		               	
	                  
	            	   deleteuser.perform();
	            	   
	          	    	    
	 	    	    
	 	    	    
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


class myAdminOptionUpdateActionListener implements ActionListener {
	  
	JFrame frame;
	
	String buttontext;

	public myAdminOptionUpdateActionListener(JFrame obj, JButton button){
			this.frame=obj;
			
		
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	    System.out.println("AdminOption Class : Button clicked is : "+buttonText);
	    
	   
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);
        
	          
	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	           
	            	  UpdateDetails updatedetails = new UpdateDetails(frame);
		               	
	                 String admin = "admin"; 
	  	           	updatedetails.perform(admin);
	            	   
	          	    	    
	 	    	    
	 	    	    
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


class myAdminOptionHomeActionListener implements ActionListener {
	 
	JFrame frame;
	
	String buttontext;

	public myAdminOptionHomeActionListener(JFrame obj, JButton button){
			this.frame=obj;
			
		
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	    System.out.println("AdminOption Class : Button clicked is : "+buttonText);
	    
	   
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);
        
	          
	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	           
	            	Client clientobjdelete = new Client();
                	frame.getContentPane().removeAll();
                	clientobjdelete.perform(frame);
	          	    	    
	 	    	    
	 	    	    
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