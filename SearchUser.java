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

class SearchUser{
	JFrame frame;
	String buttontext;
	
	public SearchUser(JFrame frame)
	{
		this.frame=frame;
	//	this.buttontext=buttontext;
	}
	
	
	public void perform(){
		
	//if(buttontext=="admin"){
		 try{   
			 
			 System.out.println("DeleteUser class : Reached in try block");
			 frame.getContentPane().removeAll();
			 
			 
			
			 frame.setLayout(new GridBagLayout());
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 System.out.println("DeleteUser class : Grid Layout set");	
			 
				JButton Back,submit;
		        JLabel label;
		    //  JTextArea textarea ;
		        JTextField username, password, nameofperson, contactnum, address ;
		        JPasswordField passwordfield;
		      
				
				GridBagConstraints c = new GridBagConstraints();
			    
			 System.out.println("DeleteUser class : Changing frame content");
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
			    
		    label = new JLabel("Search User ");
			    label.setFont(new Font("Serif", Font.PLAIN, 40));
			    
			    c.ipady = 50; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.insets = new Insets(10,200,0,0);
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.gridx = 0;
			    c.gridy = 1;
			    frame.add(label, c);
			   
			   
		    
			    
			    label = new JLabel();
			    label.setText("Please enter the username of user you want to search :");
			    
			   label.setFont(new Font("Serif", Font.PLAIN, 20));
			    
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 100;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,100,10,10);  //top left bottom right
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
				 
				    c.insets = new Insets(10,600,10,10);  //top left bottom right
				    c.gridx = 0;       //aligned with button 1
				    c.gridwidth = 1;   //1 columns wide
				    c.gridy = 2;       //third row
				
				    frame.add(username, c);
			
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
			    c.insets = new Insets(0,00,0,0);  //top left bottom right
			    c.gridx = 3;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			//    submit.addActionListener(new myClientLatestActionListener(frame));
			    Back.addActionListener(new myBackSearchUserActionListener(frame ));
			    
			    frame.add(Back, c);
			    
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
			    
		
			    submit.addActionListener(new mySearchUserActionListener(frame, username ));
			    
			    frame.add(submit, c);
			 
			    
		
			    
			 
			 
			 
			 
			 
			
				
			}
			catch(Exception ex){
				System.out.println(ex);
	        	}
	        	
	//}	
	
	
}
}


class mySearchUserActionListener implements ActionListener {
	 
	JFrame frame;
	JTextField username;
	DataObject dataobject = new DataObject();

	String buttontext;
 
	public mySearchUserActionListener(JFrame obj, JTextField username){
			this.frame=obj;
			this.username=username;
			
		
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    String nameofuser = username.getText();
	    
	    dataobject.setMessage(nameofuser);
	 //   System.out.println(buttonText);
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);

	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	            
	            	
	            	
	        		// TODO Auto-generated method stub
	        		
	        	
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
   	        		
                       String[] address = arraylistaddress.toArray( new String[arraylistaddress.size()] );
   	        		
   	        		for(String s : address){
   	        			System.out.println("address : "+s);
   	        		}
   	            	
   	        		System.out.println("SEARCH USER CLASS : dataobject.getMessage is :  : "+dataobject.getMessage());
   	        		
   	        		String admin = "admin";
   	        		String invalid = "";
   	        		if(dataobject.getMessage().equals(admin)){
   	        			
   	        			Object[] options = { "OK"  };
   	        			int choice = JOptionPane.showOptionDialog(null, 
  	            		      "Can't perform this operation!", 
  	            		      "Details", 
  	            		      JOptionPane.YES_NO_OPTION, 
  	            		      JOptionPane.QUESTION_MESSAGE, 
  	            		      null, 
  	            		      options, 
  	            		      options[0]);
   	        			
   	        		}
   	        		
                 
   	        		
   	        		else if (name.equals(invalid)){
   	   	        		
   	        			Object[] options = { "OK"  };
   	        			int choice = JOptionPane.showOptionDialog(null, 
  	            		      "User Doesn't exist!", 
  	            		      "Details", 
  	            		      JOptionPane.YES_NO_OPTION, 
  	            		      JOptionPane.QUESTION_MESSAGE, 
  	            		      null, 
  	            		      options, 
  	            		      options[0]);
   		        		
   	   	        		}
	        		
   	        		
   	        		
   	        		
   	        		
   	        		
   	        		else{
   	        		
   	        		ViewUserDetails viewuser = new ViewUserDetails(frame, user, pass, name, contact, address,range);
   	               	
   	                  
   	        		viewuser.performuserdetails(dataobject);
	        		 
   	        		
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





class myBackSearchUserActionListener implements ActionListener {
	 
	JFrame frame;
	
	String buttontext;
  
	public myBackSearchUserActionListener(JFrame obj){
			this.frame=obj;
			
		
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	    System.out.println("ViewUserDetails Class : Button clicked is : "+buttonText);
	    
	   
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);

	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	            	
	            	
	            	UserOption useroption = new UserOption(frame);
	            	frame.getContentPane().removeAll();
	            	useroption.perform();
	            	
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