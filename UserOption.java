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

class UserOption{
	JFrame frame;
	String buttontext;
	DataObject myObject=null;
	
	public UserOption(JFrame frame)
	{
		this.frame=frame;
	//	this.buttontext=buttontext;
	}
	
	
	public void perform(){
		
		 
		 try{   
			// this.myObject=dataobject;
			 
			 System.out.println("UserOption class : Reached in try block");
			 frame.getContentPane().removeAll();
			 
			 
			
			 frame.setLayout(new GridBagLayout());
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 System.out.println("UserOption class : Grid Layout set");	
			 
			
			    
			    JButton ViewDetails, Update, ViewOthers, Search, Home;
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
			    
			    label = new JLabel("Please select the appropriate option : User option ");
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
			   
			    ViewDetails = new JButton();
			    ViewDetails.setText("View Details");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx =10;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,300,50,100);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			   
				ViewDetails.addActionListener(new myUserOptionViewDetailsActionListener(frame,ViewDetails,myObject));
			    frame.add(ViewDetails, c);
			    
			    
			    Update = new JButton();
			    Update.setText("Update");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx =150;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,100,50,100);  //top left bottom right
			    c.gridx = 1;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			  //  Update.addActionListener(new myUserUpdateActionListener(frame,Update));
			    Update.addActionListener(new myAdminOptionUpdateActionListener(frame,Update));
			//    Update.addActionListener(new myUserOptionUpdateActionListener(frame,Update,myObject));
			    frame.add(Update, c);
			    
			    ViewOthers = new JButton("View Others");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 10;    // default size + ipadx
			    c.ipady = 15;     //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,100,50,100);  //top left bottom right
			    c.gridx = 2;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			   
			    ViewOthers.addActionListener(new myUserOptionViewOthersActionListener(frame,ViewOthers));
			    frame.add(ViewOthers, c);
			    
			    Search = new JButton("Search");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 150;    // default size + ipadx
			    c.ipady = 15;     //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,100,50,200);  //top left bottom right
			    c.gridx = 3;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			   
			    Search.addActionListener(new myUserOptionSearchActionListener(frame,Search));
			    frame.add(Search, c);
			 	    
			    
			    
			    Home = new JButton();
			    Home.setText("Home");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx =150;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(500,0,50,100);  //top left bottom right
			    c.gridx = 2;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			    Home.addActionListener(new myUserOptionActionListener(frame,Home));
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
	
	
	
	
	public void perform(DataObject dataobject){
		
	 
		 try{   
			 this.myObject=dataobject;
			 
			 System.out.println("USEROPTION CLASS : VALUE OF USER REACHED IS : "+myObject.getMessage());
			 System.out.println("UserOption class : Reached in try block");
			 frame.getContentPane().removeAll();
			 
			 
			
			 frame.setLayout(new GridBagLayout());
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 System.out.println("UserOption class : Grid Layout set");	
			 
			
			    
			    JButton ViewDetails, Update, ViewOthers, Search, Home;
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
			    
			    label = new JLabel("Please select the appropriate option : User option ");
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
			   
			    ViewDetails = new JButton();
			    ViewDetails.setText("View Details");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx =10;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,300,50,100);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			   
		//		ViewDetails.addActionListener(new myUserOptionViewDetailsActionListener(frame,ViewDetails,myObject));
			    
			    ViewDetails.addActionListener(new myUserOptionViewDetailsActionListener(frame,ViewDetails,myObject));
			    frame.add(ViewDetails, c);
			    
			    
			    Update = new JButton();
			    Update.setText("Update");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx =150;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,100,50,100);  //top left bottom right
			    c.gridx = 1;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			    
			    System.out.println("USEROPTION CLASS LINE 267 : BEFORE PERFORMING UPDATE : " + myObject.getMessage());
			    Update.addActionListener(new myUserOptionUpdateActionListener(frame,Update,myObject));
			    frame.add(Update, c);
			    // myUserOptionUpdateActionListener
	
			    
			    
			    ViewOthers = new JButton("View Others");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 10;    // default size + ipadx
			    c.ipady = 15;     //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,100,50,100);  //top left bottom right
			    c.gridx = 2;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			   
			    ViewOthers.addActionListener(new myUserOptionViewOthersActionListener(frame,ViewOthers));
			    frame.add(ViewOthers, c);
			    
			    Search = new JButton("Search");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 150;    // default size + ipadx
			    c.ipady = 15;     //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,100,50,200);  //top left bottom right
			    c.gridx = 3;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			   
			    Search.addActionListener(new myUserOptionSearchActionListener(frame,Search));
			    frame.add(Search, c);
			 	    
			    
			    
			    Home = new JButton();
			    Home.setText("Home");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx =150;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(500,0,50,100);  //top left bottom right
			    c.gridx = 2;       //aligned with button 2
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			    Home.addActionListener(new myUserOptionActionListener(frame,Home));
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







class myUserOptionUpdateActionListener implements ActionListener {

	JFrame frame;
	DataObject dataobject;
	
	String buttontext;

	public myUserOptionUpdateActionListener(JFrame obj, JButton button, DataObject myobject){
			this.frame=obj;
			this.dataobject=myobject;
		
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	    System.out.println("AdminOption Class : Button clicked is : "+buttonText);
	    
	   
	    
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
   	            	
   	        	//	System.out.println("SEARCH USER CLASS : dataobject.getMessage is :  : "+dataobject.getMessage());
   	        		
   	        /*		String admin = "admin";
   	        		
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
   	        			
   	        		}*/
   	        	//	else{
   	        		
   	        		String u=null, p=null, na=null, c=null,a=null;
   	        		String cal = dataobject.getMessage();
   	        		for(int i=0;i<range;i++){
   	        			if(cal.equals(user[i])){
   	        				 u= user[i];
   	        				 p=pass[i];
   	        				 na = name[i];
   	        				 c=contact[i];
   	        				 a=address[i];
   	        			}
   	        		}
   	        		
   	        		//user = dataobject.getMessage();
   	        		
   	        		
   	        		System.out.println("BEFORE SENDING TO UPDATE USER CLASS : ");
   	        		System.out.println("BEFORE SENDING TO UPDATE USER CLASS : USER : "+u);
   	        		System.out.println("BEFORE SENDING TO UPDATE USER CLASS : pass : "+p);
   	        		System.out.println("BEFORE SENDING TO UPDATE USER CLASS : name : "+na);
   	        		System.out.println("BEFORE SENDING TO UPDATE USER CLASS : contact : "+c);
   	        		System.out.println("BEFORE SENDING TO UPDATE USER CLASS : address "+ a);
   	        		System.out.println("BEFORE SENDING TO UPDATE USER CLASS : range "+ range);
   	        		UpdateUser updateuser = new UpdateUser(frame, user, pass, name, contact, address,range);
   	               	
   	                  
   	        		updateuser.perform(dataobject);
	        		
   	        	//	}
	            
	          	          	    	    
	 	    	    
	 	    	    
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


class myUserOptionViewOthersActionListener implements ActionListener {

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
	
	public myUserOptionViewOthersActionListener(JFrame obj, JButton button){
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
	               	
	                  
	        		viewuser.performusers(); 
	 	    	    
	 	    	    
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


class myUserOptionSearchActionListener implements ActionListener {
	  
	JFrame frame;
	
	String buttontext;

	public myUserOptionSearchActionListener(JFrame obj, JButton button){
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
	           
	            	 SearchUser search = new SearchUser(frame);
		               	
	                  
	            	 search.perform();
	            	   
	          	    	    
	 	    	    
	 	    	    
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


class myUserOptionHomeActionListener implements ActionListener {
	 
	JFrame frame;
	
	String buttontext;

	public myUserOptionHomeActionListener(JFrame obj, JButton button){
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





class myUserOptionViewDetailsActionListener implements ActionListener {
	 
	JFrame frame;
	
	String buttontext;
	DataObject myObject;

	public myUserOptionViewDetailsActionListener(JFrame obj, JButton button, DataObject myObject){
			this.frame=obj;
			this.myObject=myObject;
			
		
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	    System.out.println("UserOption Class : Button clicked is : "+buttonText);
	    
	   
	    
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
   	            	
   	        		ViewUserDetails viewuser = new ViewUserDetails(frame, user, pass, name, contact, address,range);
   	               	
   	                  
   	        		viewuser.performuser(myObject); 
   	 	    	    
	          	    	    
	 	    	    
	 	    	    
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


class myUserOptionActionListener implements ActionListener {
	 
	JFrame frame;
	
	String buttontext;

	public myUserOptionActionListener(JFrame obj, JButton button){
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







class myUserUpdateActionListener implements ActionListener {
	  
	JFrame frame;
	
	String buttontext;

	public myUserUpdateActionListener(JFrame obj, JButton button){
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
		               	
	                 String user = "user"; 
	  	           	updatedetails.perform(user);
	            	   
	          	    	    
	 	    	    
	 	    	    
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