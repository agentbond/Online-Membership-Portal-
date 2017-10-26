import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.IOException;
import java.io.*;
import java.net.*;
import java.util.Vector;

class ViewUserDetails{
	JFrame frame;
	String buttontext;
	String[] username;
	String[] password;
	String[] name;
	String[] contact;
	String[] address;
	int range;
	String[][] values;
	
	TableColumn Username     = new TableColumn();
	TableColumn Password     = new TableColumn();
	TableColumn PersonName   = new TableColumn();
	TableColumn ContactNum   = new TableColumn();
	TableColumn Address   = new TableColumn();
	
	
	JTable table = new JTable();
	DefaultTableModel dtm = new DefaultTableModel(0, 0);
	
	
	
	
	
	public ViewUserDetails(JFrame frame, String[] username, String[] password, String[] name, String[] contact, String[] address, int range)
	{
		this.frame=frame;
	    this.username=username;
	    this.password=password;
	    this.name=name;
	    this.contact = contact;
	    this.address=address;
	    this.range=range;
	    
		
		//	this.buttontext=buttontext;
	}
	
	
	public void perform(){
		
	//if(buttontext=="admin"){
		 try{   
			 
			 System.out.println("ViewUserDetails class : Reached in try block");
			 frame.getContentPane().removeAll();
			 
			 
			 
			 
			 GridBagConstraints c = new GridBagConstraints();
			 
			
			 frame.setLayout(new GridBagLayout());
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 System.out.println("ViewUserDetails class : Grid Layout set");	
			 
			 for(int i=0;i<range;i++){
					
					System.out.println("View user class : Username is : "+username[i]);
					System.out.println("View user class : Password is : "+password[i]);
					System.out.println("View user class : Name is : "+name[i]);
					System.out.println("View user class :  Contact is : "+contact[i]);
					System.out.println("View user class : Address is : "+address[i]);
					
				
					
				
			 }
			 
			 String header[] = new String[] { "Username", "Password", "Name of Person",
			            "Contact", "Address" };
			 
			 dtm.setColumnIdentifiers(header);
			 
			 table.setModel(dtm); 
			 
			 dtm.addRow(new Object[] { "Username", "Password", "Name",
		        		"Phone", "Address" });
			 
			 for (int i = 0; i <range; i++) {
			        dtm.addRow(new Object[] { username[i],password[i], name[i],
			        		contact[i], address[i] });
			 }
			 
	

		           
		       table.setShowVerticalLines(true);
		       table.setShowHorizontalLines(true);
		       table.setRowHeight(20);
		     //  table.setJTableColumnsWidth(table, 480, 10, 30, 30, 30);
		     //  table.setPreferedSize(new Dimension(800,600));
		       table.setLocation(600,800);
		       table.setSize(1000,500);
		      // table.setBounds(00, 00, 600, 500); 
		       c.insets = new Insets(450,200,10,10);
		     //  c.insets = new Insets(500,400,10,100);
		     //   scrollPane.getContentPane().add(jp);
		       
		      //  frame.add(new JScrollPane(table));
		       
		       frame.add(table, c);
		 
			    
			    JButton Back, ok;
		        JLabel label;
				
				
			    
			 
			    label = new JLabel("Welcome to Online Membership Portal");
			    label.setFont(new Font("Serif", Font.PLAIN, 50));
			    
			    c.ipady = 10; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.insets = new Insets(10,100,10,10);
			    c.gridx = 0;
			    c.gridy = 0;
			    frame.add(label,c);
			    
			    label = new JLabel("Users Details");
			    label.setFont(new Font("Serif", Font.PLAIN, 40));
			    
			    c.ipady = 10; 
			    c.weightx = 0.0;
			    c.weighty = 0.0;
			    c.gridwidth = 3;
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.insets = new Insets(200,300,40,10);
			    c.gridx = 0;
			    c.gridy = 0;
			    frame.add(label,c);
			    
		    
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
			    Back.addActionListener(new myBackViewUserActionListener(frame ));
			    
			    frame.add(Back, c);
			   
			    ok = new JButton();
			    ok.setText("OK");
			    c.fill = GridBagConstraints.HORIZONTAL;
			    c.ipadx = 0;     // default size + ipadx
			    c.ipady = 10;       //default size + ipady
			    c.weighty = 1.0;   //request any extra vertical space
			 
			    c.insets = new Insets(150,300,10,100);  //top left bottom right
			    c.gridx = 0;       //aligned with button 1
			    c.gridwidth = 1;   //1 columns wide
			    c.gridy = 2;       //third row
			    
			//    submit.addActionListener(new myClientLatestActionListener(frame));
			    ok.addActionListener(new myViewUserActionListener(frame, ok ));
			    
			    frame.add(ok,c);
			 	    
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
						    
				    
				  		
			}
			catch(Exception ex){
				System.out.println(ex);
	        	}
	        	

}
	
	
	public void performuserdetails(DataObject myObject){
		 DataObject dataobject = new DataObject();
		 dataobject = myObject;
		 //if(buttontext=="admin"){
			 try{   
				 
				 System.out.println("ViewUserDetails class : Reached in try block");
				 frame.getContentPane().removeAll();
				 
				 
				 
				 
				 GridBagConstraints c = new GridBagConstraints();
				 
				
				 frame.setLayout(new GridBagLayout());
				 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 System.out.println("ViewUserDetails class : Grid Layout set");	
				 
				 for(int i=0;i<range;i++){
						
						System.out.println("View user class : Username is : "+username[i]);
						System.out.println("View user class : Password is : "+password[i]);
						System.out.println("View user class : Name is : "+name[i]);
						System.out.println("View user class :  Contact is : "+contact[i]);
						System.out.println("View user class : Address is : "+address[i]);
						
					
						
					
				 }
				 
				 System.out.println("View USer Class : User Block : MyObject username is : "+dataobject.getMessage()); 
				 
				 
				 
				 String header[] = new String[] {  "Name",
				            "Phone", "Address" };
				 
				 dtm.setColumnIdentifiers(header);
				 
				 table.setModel(dtm); 
				 
				 dtm.addRow(new Object[] {  "Name",
			        		"Phone", "Address" });
				 
				 for (int i = 0; i <range; i++) {
					 
					 if(dataobject.getMessage().equals(username[i])){
						 System.out.println("View User Class : Entered in add block : "+dataobject.getMessage()); 
						 System.out.println("View User Class : User Block : MyObject username is : "+dataobject.getMessage()); 
						 System.out.println("View User Class : User Block : MyObject username is : "+username[i]); 
						 dtm.addRow(new Object[] { name[i],
				        		contact[i], address[i] });
					
						 String invalid = "";
						 if(name[i].equals(invalid)){
							
							 
							 Object[] options = { "OK" };
				            	int choice = JOptionPane.showOptionDialog(null, 
				            		      "Invalid entry", 
				            		      "Quit?", 
				            		      JOptionPane.YES_NO_OPTION, 
				            		      JOptionPane.QUESTION_MESSAGE, 
				            		      null, 
				            		      options, 
				            		      options[0]);
							 
						 }
					 
					 }
				 }
				 
		

			        

			   
			        
			       table.setShowVerticalLines(true);
			       table.setShowHorizontalLines(true);
			       table.setRowHeight(20);
			     //  table.setJTableColumnsWidth(table, 480, 10, 30, 30, 30);
			     //  table.setPreferedSize(new Dimension(800,600));
			       table.setLocation(600,800);
			       table.setSize(1000,500);
			      // table.setBounds(00, 00, 600, 500); 
			       c.insets = new Insets(450,200,10,10);
			     //  c.insets = new Insets(500,400,10,100);
			     //   scrollPane.getContentPane().add(jp);
			       
			      //  frame.add(new JScrollPane(table));
			       
			       frame.add(table, c);
			        
			     //   frame.add(scrollPane, c);
				 
				 
				 
				 
				 
				 
				 
				 
			 
				    
				    JButton Back,ok;
			        JLabel label;
					
					
				    
				 
				    label = new JLabel("Welcome to Online Membership Portal");
				    label.setFont(new Font("Serif", Font.PLAIN, 50));
				    
				    c.ipady = 10; 
				    c.weightx = 0.0;
				    c.weighty = 0.0;
				    c.gridwidth = 3;
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.insets = new Insets(10,100,10,10);
				    c.gridx = 0;
				    c.gridy = 0;
				    frame.add(label,c);
				    
				    label = new JLabel("Users Details");
				    label.setFont(new Font("Serif", Font.PLAIN, 40));
				    
				    c.ipady = 10; 
				    c.weightx = 0.0;
				    c.weighty = 0.0;
				    c.gridwidth = 3;
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.insets = new Insets(200,300,10,10);
				    c.gridx = 0;
				    c.gridy = 0;
				    frame.add(label,c);
				    
				    
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
				    Back.addActionListener(new myBackVUDActionListener(frame ));
				    
				    frame.add(Back, c);
				    
				    ok = new JButton();
				    ok.setText("OK");
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.ipadx = 0;     // default size + ipadx
				    c.ipady = 10;       //default size + ipady
				    c.weighty = 1.0;   //request any extra vertical space
				 
				    c.insets = new Insets(150,300,10,100);  //top left bottom right
				    c.gridx = 0;       //aligned with button 1
				    c.gridwidth = 1;   //1 columns wide
				    c.gridy = 2;       //third row
				    
				//    submit.addActionListener(new myClientLatestActionListener(frame));
				    ok.addActionListener(new myViewUserForUserActionListener(frame, ok ));
				    
				    frame.add(ok,c);
				 	    
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
							    
					    
					  		
				}
				catch(Exception ex){
					System.out.println(ex);
		        	}
		        	
		
	}
	
	
	
	
	public void performuser(DataObject myObject){
		 DataObject dataobject = new DataObject();
		 dataobject = myObject;
		 //if(buttontext=="admin"){
			 try{   
				 
				 System.out.println("ViewUserDetails class : Reached in try block");
				 frame.getContentPane().removeAll();
				 
				 
				 
				 
				 GridBagConstraints c = new GridBagConstraints();
				 
				
				 frame.setLayout(new GridBagLayout());
				 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 System.out.println("ViewUserDetails class : Grid Layout set");	
				 
				 for(int i=0;i<range;i++){
						
						System.out.println("View user class : Username is : "+username[i]);
						System.out.println("View user class : Password is : "+password[i]);
						System.out.println("View user class : Name is : "+name[i]);
						System.out.println("View user class :  Contact is : "+contact[i]);
						System.out.println("View user class : Address is : "+address[i]);
						
					
						
					
				 }
				 
				 System.out.println("View USer Class : User Block : MyObject username is : "+dataobject.getMessage()); 
				 
				 
				 
				 String header[] = new String[] { "Username", "Password", "Name",
				            "Phone", "Address" };
				 
				 dtm.setColumnIdentifiers(header);
				 
				 table.setModel(dtm); 
				 
				 dtm.addRow(new Object[] { "Username", "Password", "Name",
			        		"Phone", "Address" });
				 
				 for (int i = 0; i <range; i++) {
					 
					 if(dataobject.getMessage().equals(username[i])){
						 System.out.println("View USer Class : Entered in add block : "+dataobject.getMessage()); 
						 System.out.println("View USer Class : User Block : MyObject username is : "+dataobject.getMessage()); 
						 System.out.println("View USer Class : User Block : MyObject username is : "+username[i]); 
						 dtm.addRow(new Object[] { username[i],password[i], name[i],
				        		contact[i], address[i] });}
				 }
				 
		

			        

			   
			        
			       table.setShowVerticalLines(true);
			       table.setShowHorizontalLines(true);
			       table.setRowHeight(20);
			     //  table.setJTableColumnsWidth(table, 480, 10, 30, 30, 30);
			     //  table.setPreferedSize(new Dimension(800,600));
			       table.setLocation(600,800);
			       table.setSize(1000,500);
			      // table.setBounds(00, 00, 600, 500); 
			       c.insets = new Insets(450,200,10,10);
			     //  c.insets = new Insets(500,400,10,100);
			     //   scrollPane.getContentPane().add(jp);
			       
			      //  frame.add(new JScrollPane(table));
			       
			       frame.add(table, c);
			        
			     //   frame.add(scrollPane, c);
				 
				 
				 
				 
				 
				 
				 
				 
			 
				    
				    JButton Back,ok;
			        JLabel label;
					
					
				    
				 
				    label = new JLabel("Welcome to Online Membership Portal");
				    label.setFont(new Font("Serif", Font.PLAIN, 50));
				    
				    c.ipady = 10; 
				    c.weightx = 0.0;
				    c.weighty = 0.0;
				    c.gridwidth = 3;
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.insets = new Insets(10,100,10,10);
				    c.gridx = 0;
				    c.gridy = 0;
				    frame.add(label,c);
				    
				    label = new JLabel("Users Details");
				    label.setFont(new Font("Serif", Font.PLAIN, 40));
				    
				    c.ipady = 10; 
				    c.weightx = 0.0;
				    c.weighty = 0.0;
				    c.gridwidth = 3;
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.insets = new Insets(200,300,10,10);
				    c.gridx = 0;
				    c.gridy = 0;
				    frame.add(label,c);
				    
				    
				    ok = new JButton();
				    ok.setText("OK");
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.ipadx = 0;     // default size + ipadx
				    c.ipady = 10;       //default size + ipady
				    c.weighty = 1.0;   //request any extra vertical space
				 
				    c.insets = new Insets(150,300,10,100);  //top left bottom right
				    c.gridx = 0;       //aligned with button 1
				    c.gridwidth = 1;   //1 columns wide
				    c.gridy = 2;       //third row
				    
				//    submit.addActionListener(new myClientLatestActionListener(frame));
				    ok.addActionListener(new myViewUserForUserActionListener(frame, ok ));
				    
				    frame.add(ok,c);
				 	    
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
				    Back.addActionListener(new myBackViewUserDetailsLatestActionListener(frame ));
				    
				    frame.add(Back, c);
				    
				    
				    
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
							    
					    
					  		
				}
				catch(Exception ex){
					System.out.println(ex);
		        	}
		        	
		
	}


	public void performusers() {

		
		//if(buttontext=="admin"){
			 try{   
				 
				 System.out.println("ViewUserDetails class : Reached in try block");
				 frame.getContentPane().removeAll();
				 
				 
				 
				 
				 GridBagConstraints c = new GridBagConstraints();
				 
				
				 frame.setLayout(new GridBagLayout());
				 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 System.out.println("ViewUserDetails class : Grid Layout set");	
				 
				 for(int i=0;i<range;i++){
						
						System.out.println("View user class : Username is : "+username[i]);
						System.out.println("View user class : Password is : "+password[i]);
						System.out.println("View user class : Name is : "+name[i]);
						System.out.println("View user class :  Contact is : "+contact[i]);
						System.out.println("View user class : Address is : "+address[i]);
						
					
						
					
				 }
				 
				 String header[] = new String[] { "Name of Person",
				            "Contact", "Address" };
				 
				 dtm.setColumnIdentifiers(header);
				 
				 table.setModel(dtm); 
				 
				 dtm.addRow(new Object[] { "Name",
			        		"Phone", "Address" });
				 
				 for (int i = 1; i <range; i++) {
				        dtm.addRow(new Object[] {  name[i],
				        		contact[i], address[i] });
				 }
				 
		

			           
			       table.setShowVerticalLines(true);
			       table.setShowHorizontalLines(true);
			       table.setRowHeight(20);
			     //  table.setJTableColumnsWidth(table, 480, 10, 30, 30, 30);
			     //  table.setPreferedSize(new Dimension(800,600));
			       table.setLocation(600,800);
			       table.setSize(1000,500);
			      // table.setBounds(00, 00, 600, 500); 
			       c.insets = new Insets(450,200,10,10);
			     //  c.insets = new Insets(500,400,10,100);
			     //   scrollPane.getContentPane().add(jp);
			       
			      //  frame.add(new JScrollPane(table));
			       
			       frame.add(table, c);
			 
				    
				    JButton Back, ok;
			        JLabel label;
					
					
				    
				 
				    label = new JLabel("Welcome to Online Membership Portal");
				    label.setFont(new Font("Serif", Font.PLAIN, 50));
				    
				    c.ipady = 10; 
				    c.weightx = 0.0;
				    c.weighty = 0.0;
				    c.gridwidth = 3;
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.insets = new Insets(10,100,10,10);
				    c.gridx = 0;
				    c.gridy = 0;
				    frame.add(label,c);
				    
				    label = new JLabel("Users Details");
				    label.setFont(new Font("Serif", Font.PLAIN, 40));
				    
				    c.ipady = 10; 
				    c.weightx = 0.0;
				    c.weighty = 0.0;
				    c.gridwidth = 3;
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.insets = new Insets(200,300,10,10);
				    c.gridx = 0;
				    c.gridy = 0;
				    frame.add(label,c);
				    
				    
				    
				    
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
				    Back.addActionListener(new myBackViewUserdetailsActionListener(frame ));
				    
				    frame.add(Back, c);
				    
				    
				    ok = new JButton();
				    ok.setText("OK");
				    c.fill = GridBagConstraints.HORIZONTAL;
				    c.ipadx = 0;     // default size + ipadx
				    c.ipady = 10;       //default size + ipady
				    c.weighty = 1.0;   //request any extra vertical space
				 
				    c.insets = new Insets(150,300,10,100);  //top left bottom right
				    c.gridx = 0;       //aligned with button 1
				    c.gridwidth = 1;   //1 columns wide
				    c.gridy = 2;       //third row
				    
				//    submit.addActionListener(new myClientLatestActionListener(frame));
				    ok.addActionListener(new myViewUserActionListener(frame, ok ));
				    
				    frame.add(ok,c);
				 	    
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
							    
					    
					  		
				}
				catch(Exception ex){
					System.out.println(ex);
		        	}
		        	


		
	}
	
	
}


class myViewUserActionListener implements ActionListener {
	 
	JFrame frame;
	
	String buttontext;
  
	public myViewUserActionListener(JFrame obj, JButton button){
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
	           
	            	DataObject messageobjectview = new DataObject();
	            	DataObjectChild viewTable = new DataObjectChild();
	            	
	            	String view = "view";
	            	messageobjectview.setMessage(view);
	            	ConnectionClass connectionclass = new ConnectionClass();
	            	viewTable = connectionclass.performupdate(messageobjectview);
	            	
	            	Object[] options = { "OK"};
                	int choice = JOptionPane.showOptionDialog(null, 
                		      "User details displayed!", 
                		      "Details", 
                		      JOptionPane.YES_NO_OPTION, 
                		      JOptionPane.QUESTION_MESSAGE, 
                		      null, 
                		      options, 
                		      options[0]);
                	
                	
                //	frame.getContentPane().removeAll();       
                //	AdminOption adminoption = new AdminOption(frame);
                	
              //  	adminoption.perform();
                	
	 	    	    
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

class myBackViewUserActionListener implements ActionListener {
	 
	JFrame frame;
	
	String buttontext;
  
	public myBackViewUserActionListener(JFrame obj){
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



class myViewUserForUserActionListener implements ActionListener {
	 
	JFrame frame;
	
	String buttontext;
  
	public myViewUserForUserActionListener(JFrame obj, JButton button){
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
	           
	            	DataObject messageobjectview = new DataObject();
	            	DataObjectChild viewTable = new DataObjectChild();
	            	
	            	String view = "view";
	            	messageobjectview.setMessage(view);
	            	ConnectionClass connectionclass = new ConnectionClass();
	            	viewTable = connectionclass.performupdate(messageobjectview);
	            	
	            	Object[] options = { "OK"};
                	int choice = JOptionPane.showOptionDialog(null, 
                		      "Details Displayed! Routing to Home Page", 
                		      "Details", 
                		      JOptionPane.YES_NO_OPTION, 
                		      JOptionPane.QUESTION_MESSAGE, 
                		      null, 
                		      options, 
                		      options[0]);
                	
                	
               // 	frame.getContentPane().removeAll();       
               // 	Client clientobjdelete = new Client();
                	
              //  	clientobjdelete.perform(frame);
                	
	 	    	    
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









class myBackViewUserdetailsActionListener implements ActionListener {
	 
	JFrame frame;
	
	String buttontext;
  
	public myBackViewUserdetailsActionListener(JFrame obj){
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



class myBackVUDActionListener implements ActionListener {
	 
	JFrame frame;
	
	String buttontext;
  
	public myBackVUDActionListener(JFrame obj){
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







class myBackViewUserDetailsLatestActionListener implements ActionListener {
	 
	JFrame frame;
	
	String buttontext;
  
	public myBackViewUserDetailsLatestActionListener(JFrame obj){
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



