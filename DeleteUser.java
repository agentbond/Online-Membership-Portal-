import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.io.*;
import java.net.*;

class DeleteUser{
	JFrame frame;
	String buttontext;
	
	public DeleteUser(JFrame frame)
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
			 
				JButton submit, Back;
		        JLabel label;
		    //  JTextArea textarea ;
		        JTextField username, password, nameofperson, contactnum, address ;
		        JPasswordField passwordfield;
		      
				
				GridBagConstraints c = new GridBagConstraints();
			    
			 System.out.println("DeleteUser class : Changing frame content");
			    label = new JLabel("Welcome to Online Membership Portal");
			    label.setFont(new Font("Serif", Font.PLAIN, 50));
			    
			    c.ipady = 50; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.insets = new Insets(100,200,0,0);
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.gridx = 0;
			    c.gridy = 0;
			    frame.add(label, c);
			    
		    label = new JLabel("Delete User ");
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
			    label.setText("Please enter the username you want to delete :");
			    
			   label.setFont(new Font("Serif", Font.PLAIN, 20));
			    
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 10;     // default size + ipadx
			    c.ipady = 15;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(10,200,10,10);  //top left bottom right
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
				    Back.addActionListener(new myBackDeleteUserActionListener(frame ));
				    
				    frame.add(Back, c);
				    
				    
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
	/*		    
			    Back = new JButton();
			    Back.setText("Back");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 0;     // default size + ipadx
			    c.ipady = 0;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			    c.anchor = GridBagConstraints.PAGE_END;
			    c.insets = new Insets(500,100,0,0);  //top left bottom right
			    c.gridx = 2;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			//    submit.addActionListener(new myClientLatestActionListener(frame));
			    Back.addActionListener(new myBackDeleteUserActionListener(frame ));
			    
			    frame.add(Back, c);
		*/	 
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
			    
		
			    submit.addActionListener(new myDeleteUserActionListener(frame, username ));
			    
			    frame.add(submit, c);
			 
			    
		
			    
			 
			 
			 
			 
			 
			
				
			}
			catch(Exception ex){
				System.out.println(ex);
	        	}
	        	
	//}	
	
	
}
}



class myBackDeleteUserActionListener implements ActionListener {
	 
	JFrame frame;
	JTextField username;

	String buttontext;
 
	public myBackDeleteUserActionListener(JFrame obj){
			this.frame=obj;
		//	this.username=username;
			
		
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	 //   System.out.println(buttonText);
	    
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


class myDeleteUserActionListener implements ActionListener {
	 
	JFrame frame;
	JTextField username;

	String buttontext;
 
	public myDeleteUserActionListener(JFrame obj, JTextField username){
			this.frame=obj;
			this.username=username;
			
		
			
		}

	public void actionPerformed(ActionEvent e) {
	    JButton source = (JButton) e.getSource();
	    String buttonText = source.getText();
	
	    
	 //   System.out.println(buttonText);
	    
	    int n = JOptionPane.showOptionDialog(new JFrame(), "Do you want to proceed ? ", 
	            "Confirmation Required", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
	            null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);

	    
	       
	            if (n == JOptionPane.YES_OPTION) {
	            
	            	
	            	DataObject myObjectdelete = new DataObject(); 
	            	DataObject messageobject = new DataObject();
	          
	 	           
	 	    	    
	 	    	    String user = username.getText();
	 	    	    String message = "delete";
	 	    	    System.out.println("Deleteuser class :  username is : "+user);
	 	    	 //   datachild.packet[0]=user;
	 	    	    myObjectdelete.setMessage(user);
	 	    	   messageobject.setMessage(message);
	 	    	    System.out.println("Deleteuser class :  myObject set message is  : "+myObjectdelete.getMessage());
	 	    	   String admin = "admin";
	 	    	   if((user.equals(admin))){
	                   	 
	                   	 Object[] options = { "OK"};
		                    	int choice = JOptionPane.showOptionDialog(null, 
		                    		      "Can not perform this action!", 
		                    		      "Quit?", 
		                    		      JOptionPane.YES_NO_OPTION, 
		                    		      JOptionPane.QUESTION_MESSAGE, 
		                    		      null, 
		                    		      options, 
		                    		      options[0]); 
	                    }
		        		
	                    else {
	 	    	    ConnectionClass connectionclass = new ConnectionClass();
	 	            messageobject = connectionclass.performdelete(myObjectdelete, messageobject);
	 	            
	 	           System.out.println("Deleteuser class : received objects from connection class ");
	        		System.out.println("Deleteuser class : value of objnum.getmessage is : "+messageobject.getMessage());  
	 	            
	        		
	        		String string = messageobject.getMessage();
	        		

                    String yes = "yes";
                    String no = "no";
                   
	        		
                    
                    if(string.equals(yes)){
	            			
	        			Object[] options = { "OK"};
                    	int choice = JOptionPane.showOptionDialog(null, 
                    		      "User deleted successfully!", 
                    		      " Details", 
                    		      JOptionPane.YES_NO_OPTION, 
                    		      JOptionPane.QUESTION_MESSAGE, 
                    		      null, 
                    		      options, 
                    		      options[0]);
	        	               
                    //	frame.getContentPane().removeAll();       
                    //	AdminOption adminoption = new AdminOption(frame);
                    	
                    //	adminoption.perform(); 
	            			
	            		}
	            		else if (string.equals(no))
	            		{

	                    	Object[] options = { "OK"};
	                    	int choice = JOptionPane.showOptionDialog(null, 
	                    		      "Invalid username provided", 
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