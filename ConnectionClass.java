import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConnectionClass {
	
	 DataObject myObject = new DataObject();
	 DataObject myObjectpass = new DataObject();
	 DataObject myObjectname = new DataObject();
 	DataObject myObjectcontact = new DataObject();
 	DataObject myObjectaddress = new DataObject();
 	DataObjectChild viewtable = new DataObjectChild();
 	
 	JFrame frame;
	 
	 //DataObjectChild childObject = new DataObjectChild();
     
	String username;
	String password;
	String nameofperson;
	String contact;
	String address;
//	String[] packet;
	

	
	public ConnectionClass(JFrame frame ){
		this.frame = frame;
	//	this.password=childObject.getMessage();
		
	}
	
	public ConnectionClass( ){
		
	
		
	}
	


	public DataObject performdelete(DataObject myObjectdelete, DataObject messageObject){
		//public void perform(DataObject myObject,  DataObjectChild childObject){
			 try{ 
				  
				  
			
					
				
					System.out.println("Connection class : myObjectdelete by myObjectdelete.getMessage() : "+myObjectdelete.getMessage());
					System.out.println("Connection class : messageObject by messageObject.getMessage() : "+messageObject.getMessage());
				
			

				//  Socket socketToServer = new Socket("127.0.0.1", 3000);
				  System.out.println("Connection class : Socket done");

					Socket socketToServer = new Socket("osl81.njit.edu", 3000);
			//	  System.out.println("Connection class : Socket done");
					ObjectOutputStream myOutputStream =
						new ObjectOutputStream(socketToServer.getOutputStream());

					ObjectInputStream myInputStream =
						new ObjectInputStream(socketToServer.getInputStream());
		           
					System.out.println("Connection class : Output and input stream ");
					System.out.println("Connection class : writing object of dataobject class :  "+myObjectdelete.getMessage());
			
					myOutputStream.writeObject(messageObject);
					myOutputStream.writeObject(myObjectdelete);
					
					
					
					
                   System.out.println("Connection class : Object Written");
					
                   myObjectdelete = (DataObject)myInputStream.readObject();
					
					System.out.println("Connection class : value of objcount.getmessage is : "+myObjectdelete.getMessage());
					
					
					System.out.println("Connection class : Object Read");
					
				
					
					
					
					
			

					System.out.println("Connection class : Object Read");
		            
					
					
		
					
					
					myOutputStream.close();
					
					myInputStream.close();

					socketToServer.close();
			
					
				  }
				  catch(Exception ex){
						System.out.println(ex);
			        	}
			 
			return myObjectdelete;
		}
	
	
	
	
	public DataObjectChild performupdate(DataObject messageobjectview){
		//public void perform(DataObject myObject,  DataObjectChild childObject){
			 try{ 
				  
				  
			
			

				  Socket socketToServer = new Socket("127.0.0.1", 3000);
				  System.out.println("Connection class : Socket done");

			//	 Socket socketToServer = new Socket("osl81.njit.edu", 3000);
				//  System.out.println("Connection class : Socket done");
				 
				 
				 
				//	Socket socketToServer = new Socket("osl81.njit.edu", 3000);
					ObjectOutputStream myOutputStream =
						new ObjectOutputStream(socketToServer.getOutputStream());

					ObjectInputStream myInputStream =
						new ObjectInputStream(socketToServer.getInputStream());
		           
					System.out.println("Connection class : for view table ");
				
					
					
					myOutputStream.writeObject(messageobjectview);
				
					
					
					
					
		             
					System.out.println("Connection class : Object Written");
					
					viewtable = (DataObjectChild)myInputStream.readObject();
					
					System.out.println("Connection class : value of objcount.getmessage is : ");
					
					
			

					System.out.println("Connection class : Object Read");
		            
					
					
				//	Registration registration = new Registration(frame,buttontext);
					
					
					myOutputStream.close();
					
					myInputStream.close();

					socketToServer.close();
			
					
				  }
				  catch(Exception ex){
						System.out.println(ex);
			        	}
			 
			 return viewtable;
		}
	
	
	
	
	
	
	public DataObject performvalidation(DataObject myObject,  DataObject myObjectpass, DataObject objcount ){
		//public void perform(DataObject myObject,  DataObjectChild childObject){
			 try{ 
				  
				  
			
					
				
					System.out.println("Connection class : Username in Connection class by myobject : "+myObject.getMessage());
					System.out.println("Connection class : Password in Connection class by myobjectpass : "+myObjectpass.getMessage());
					System.out.println("Connection class : Password in Connection class by myobjectpass : "+objcount.getMessage());
					
				

				  Socket socketToServer = new Socket("127.0.0.1", 3000);
				  System.out.println("Connection class : Socket done");

				//	Socket socketToServer = new Socket("osl81.njit.edu", 3000);
				//	  System.out.println("Connection class : Socket done");
					
					
					
				//	Socket socketToServer = new Socket("osl81.njit.edu", 3000);
					ObjectOutputStream myOutputStream =
						new ObjectOutputStream(socketToServer.getOutputStream());

					ObjectInputStream myInputStream =
						new ObjectInputStream(socketToServer.getInputStream());
		           
					System.out.println("Connection class : Output and input stream ");
					System.out.println("Connection class : writing object of dataobject class :  "+myObject.getMessage());
					System.out.println("Connection class : writing object of dataobjectpass class :  "+myObjectpass.getMessage());
					System.out.println("Connection class : writing object of objectcount class :  "+objcount.getMessage());
					
					
					myOutputStream.writeObject(objcount);
					myOutputStream.writeObject(myObject);
					myOutputStream.writeObject(myObjectpass);
					
					
					
					
		             
					System.out.println("Connection class : Object Written");
					
					objcount = (DataObject)myInputStream.readObject();
					
					System.out.println("Connection class : value of objcount.getmessage is : "+objcount.getMessage());
					
			

					System.out.println("Connection class : Object Read");
		            
					
					
				//	Registration registration = new Registration(frame,buttontext);
					
					
					myOutputStream.close();
					
					myInputStream.close();

					socketToServer.close();
			
					
				  }
				  catch(Exception ex){
						System.out.println(ex);
			        	}
			 
			 return objcount;
		}
	
	
	public DataObject performregistration(DataObject messageObject, DataObject myObject,  DataObject myObjectpass, DataObject myObjectname, DataObject myObjectcontact, DataObject myObjectaddress){
	//public void perform(DataObject myObject,  DataObjectChild childObject){
		 try{ 
			  
			  
		
				
			 System.out.println("Connection class : Messageobject in Connection class by myobject : "+messageObject.getMessage());
				System.out.println("Connection class : Username in Connection class by myobject : "+myObject.getMessage());
				System.out.println("Connection class : Password in Connection class by myobjectpass : "+myObjectpass.getMessage());
				System.out.println("Connection class : Username in Connection class by myobjectname : "+myObjectname.getMessage());
				System.out.println("Connection class : Password in Connection class by myobjectcontact : "+myObjectcontact.getMessage());
				System.out.println("Connection class : Username in Connection class by myobjectaddress : "+myObjectaddress.getMessage());
				
				
			//	System.out.println("Connection class : Username in Connection class  : "+username);
			//	System.out.println("Connection class : Password in Connection class : "+password);
				
		

			 Socket socketToServer = new Socket("127.0.0.1", 3000);
			  System.out.println("Connection class : Socket done");

			//	Socket socketToServer = new Socket("osl81.njit.edu", 3000);
			//	  System.out.println("Connection class : Socket done");
				
			//	Socket socketToServer = new Socket("osl81.njit.edu", 3000);
				ObjectOutputStream myOutputStream =
					new ObjectOutputStream(socketToServer.getOutputStream());

				ObjectInputStream myInputStream =
					new ObjectInputStream(socketToServer.getInputStream());
	           
				System.out.println("Connection class : Output and input stream ");
				System.out.println("Connection class : writing object of dataobject class :  "+messageObject.getMessage());
				System.out.println("Connection class : writing object of dataobject class :  "+myObject.getMessage());
				System.out.println("Connection class : writing object of dataobjectpass class :  "+myObjectpass.getMessage());
				System.out.println("Connection class : writing object of dataobjectname class :  "+myObjectname.getMessage());
				System.out.println("Connection class : writing object of dataobjectcontact class :  "+myObjectcontact.getMessage());
				System.out.println("Connection class : writing object of dataobjectaddress class :  "+myObjectaddress.getMessage());
				
				myOutputStream.writeObject(messageObject);
				myOutputStream.writeObject(myObject);
				myOutputStream.writeObject(myObjectpass);
				myOutputStream.writeObject(myObjectname);
				myOutputStream.writeObject(myObjectcontact);
				myOutputStream.writeObject(myObjectaddress);
				
				
	             
				System.out.println("Connection class : Object Written");
				
				messageObject = (DataObject)myInputStream.readObject();
				
			
				
				
				
				
				

				System.out.println("Connection class : Object Read");
	            
				
			//	Registration registration = new Registration(frame,buttontext);
				
				
				myOutputStream.close();
				
				myInputStream.close();

				socketToServer.close();
		
				
			  }
			  catch(Exception ex){
					System.out.println(ex);
		        	}
		 
		 return messageObject;
	}
	
	
	public DataObject performupdation(DataObject messageObject, DataObject myObject,  DataObject myObjectpass, DataObject myObjectname, DataObject myObjectcontact, DataObject myObjectaddress){
		//public void perform(DataObject myObject,  DataObjectChild childObject){
			 try{ 
				  
				  
			
					
				 System.out.println("Connection class : Messageobject in Connection class by myobject : "+messageObject.getMessage());
					System.out.println("Connection class : Username in Connection class by myobject : "+myObject.getMessage());
					System.out.println("Connection class : Password in Connection class by myobjectpass : "+myObjectpass.getMessage());
					System.out.println("Connection class : Username in Connection class by myobjectname : "+myObjectname.getMessage());
					System.out.println("Connection class : Password in Connection class by myobjectcontact : "+myObjectcontact.getMessage());
					System.out.println("Connection class : Username in Connection class by myobjectaddress : "+myObjectaddress.getMessage());
					
					
				//	System.out.println("Connection class : Username in Connection class  : "+username);
				//	System.out.println("Connection class : Password in Connection class : "+password);
					
			

				  Socket socketToServer = new Socket("127.0.0.1", 3000);
				  System.out.println("Connection class : Socket done");

				//	Socket socketToServer = new Socket("osl81.njit.edu", 3000);
				//	  System.out.println("Connection class : Socket done");
					
				//	Socket socketToServer = new Socket("osl81.njit.edu", 3000);
					ObjectOutputStream myOutputStream =
						new ObjectOutputStream(socketToServer.getOutputStream());

					ObjectInputStream myInputStream =
						new ObjectInputStream(socketToServer.getInputStream());
		           
					System.out.println("Connection class : Output and input stream ");
					System.out.println("Connection class : writing object of dataobject class :  "+messageObject.getMessage());
					System.out.println("Connection class : writing object of dataobject class :  "+myObject.getMessage());
					System.out.println("Connection class : writing object of dataobjectpass class :  "+myObjectpass.getMessage());
					System.out.println("Connection class : writing object of dataobjectname class :  "+myObjectname.getMessage());
					System.out.println("Connection class : writing object of dataobjectcontact class :  "+myObjectcontact.getMessage());
					System.out.println("Connection class : writing object of dataobjectaddress class :  "+myObjectaddress.getMessage());
					
					myOutputStream.writeObject(messageObject);
					myOutputStream.writeObject(myObject);
					myOutputStream.writeObject(myObjectpass);
					myOutputStream.writeObject(myObjectname);
					myOutputStream.writeObject(myObjectcontact);
					myOutputStream.writeObject(myObjectaddress);
					
					
		             
					System.out.println("Connection class : Object Written");
					
					messageObject = (DataObject)myInputStream.readObject();
					
				
					
					
					
					
					

					System.out.println("Connection class : Object Read");
		            
					
				//	Registration registration = new Registration(frame,buttontext);
					
					
					myOutputStream.close();
					
					myInputStream.close();

					socketToServer.close();
			
					
				  }
				  catch(Exception ex){
						System.out.println(ex);
			        	}
			 
			 return messageObject;
		}

}
