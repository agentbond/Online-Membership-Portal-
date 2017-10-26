

import java.io.*;
import java.net.*;
import java.sql.SQLException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class ThreadedServer implements Serializable
{  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


private static ServerSocket s;


DataObjectChild dataobjectchild;
DataObject dataobject;


public ThreadedServer(){
	
}


	public void perform(DataObject dataobject, DataObject dataobjectpass, DataObject dataobjectname, DataObject dataobjectcontact, DataObject dataobjectaddress) throws SQLException{
	System.out.println("Server : String passed and printing from server: username :  " + dataobject.getMessage());
	System.out.println("Server : : String passed and printing from server with dataobjectpass: password : " + dataobjectpass.getMessage());
	System.out.println("Server : String passed and printing from server: name of person : " + dataobjectname.getMessage());
	System.out.println("Server : : String passed and printing from server with dataobjectpass: contact :  " + dataobjectcontact.getMessage());
	System.out.println("Server : String passed and printing from server: address : " + dataobjectaddress.getMessage());
	
	
	
	
	
//	DBConnection dbobject = new DBConnection(dataobject.getMessage(),dataobjectchild.getMessage() );
//	dbobject.getinfofromdb(dataobject.getMessage(), dataobjectchild.getMessage());
//	dbobject.updatedb(dataobject.getMessage(), dataobjectchild.getMessage());
		
	}
	

	
	public boolean checkvalidentry(DataObject myObject,DataObject myObjectpass) throws SQLException{
		
		DBConnection dbcon = new DBConnection();
		System.out.println(" ThreadedServer Class : Username passed to database : " + myObject.getMessage());
		System.out.println("ThreadedServer Class : Password passed to database : " + myObjectpass.getMessage());
		
		boolean check = dbcon.checkvalidentry(myObject.getMessage(), myObjectpass.getMessage());
		
		return check;
	}
	

public boolean updation(DataObject myObject,DataObject myObjectpass, DataObject myObjectname, DataObject myObjectcontact, DataObject myObjectaddress) throws SQLException{
		
		DBConnection dbcon = new DBConnection();
		System.out.println(" ThreadedServer Class : Username passed to database : " + myObject.getMessage());
		System.out.println("ThreadedServer Class : Password passed to database : " + myObjectpass.getMessage());
		System.out.println(" ThreadedServer Class : Username passed to database : " + myObjectname.getMessage());
		System.out.println("ThreadedServer Class : Password passed to database : " + myObjectcontact.getMessage());
		System.out.println(" ThreadedServer Class : Username passed to database : " + myObjectaddress.getMessage());
	
		
		
		
		boolean check=	dbcon.updation(myObject.getMessage(), myObjectpass.getMessage(), myObjectname.getMessage(),myObjectcontact.getMessage(), myObjectaddress.getMessage()  );
		
		return check;
	}	
	
	
	
	
	
public boolean updateentry(DataObject myObject,DataObject myObjectpass, DataObject myObjectname, DataObject myObjectcontact, DataObject myObjectaddress) throws SQLException{
		
		DBConnection dbcon = new DBConnection();
		System.out.println(" ThreadedServer Class : Username passed to database : " + myObject.getMessage());
		System.out.println("ThreadedServer Class : Password passed to database : " + myObjectpass.getMessage());
		System.out.println(" ThreadedServer Class : Username passed to database : " + myObjectname.getMessage());
		System.out.println("ThreadedServer Class : Password passed to database : " + myObjectcontact.getMessage());
		System.out.println(" ThreadedServer Class : Username passed to database : " + myObjectaddress.getMessage());
	
		
		
		
		boolean check=	dbcon.updateentry(myObject.getMessage(), myObjectpass.getMessage(), myObjectname.getMessage(),myObjectcontact.getMessage(), myObjectaddress.getMessage()  );
		
		return check;
	}
	
	
public DataObjectChild fetchtable() throws SQLException{
	
	DBConnection dbcon = new DBConnection();
	System.out.println(" ThreadedServer Class : DB fetchtable function called  " );
//	System.out.println("ThreadedServer Class : Password passed to database : " + myObjectpass.getMessage());
//	System.out.println(" ThreadedServer Class : Username passed to database : " + myObjectname.getMessage());
//	System.out.println("ThreadedServer Class : Password passed to database : " + myObjectcontact.getMessage());
//	System.out.println(" ThreadedServer Class : Username passed to database : " + myObjectaddress.getMessage());

	
	
	System.out.println(" ThreadedServer Class : fetching table  " );
	//dataobjectchild =	dbcon.getTable();
	
	dataobjectchild =dbcon.getTable();
	System.out.println(" ThreadedServer Class : table fetched.. returning object.. " );
	return dataobjectchild;
}


	
public boolean deleteentry(DataObject myObjectdelete) throws SQLException{
		
		DBConnection dbcon = new DBConnection();
		System.out.println(" ThreadedServer Class : Username passed to database : " + myObjectdelete.getMessage());
	//	System.out.println("ThreadedServer Class : Password passed to database : " + myObjectpass.getMessage());
		boolean check=	dbcon.deleteentry(myObjectdelete.getMessage());
		
		return check;
	}
	


public static void main(String[] args ) 
   { 
      try 
      {  s = new ServerSocket(3000);
         
         for (;;)
         {  	Socket incoming = s.accept( );
               	new ThreadedHandler(incoming).start();
               	System.out.println("ThreadedServer class : Starting Start() method ");
	   }   
      }
      catch (Exception e) 
      {  System.out.println(e);
      } 
      
  
   } 
}

class ThreadedHandler extends Thread
{  
	
	ThreadedServer threadobject = new ThreadedServer();
	
	public ThreadedHandler(Socket i) 
   { incoming = i;  }
   
   public void run()
   {  try 
      { 
	   
	   System.out.println("ThreadedServer class : Starting try ");
	   
	   ObjectInputStream in =
				new ObjectInputStream(incoming.getInputStream());

		ObjectOutputStream out =
				new ObjectOutputStream(incoming.getOutputStream());
		
		System.out.println("ThreadedServer class : New line inserted ");
		
		System.out.println("ThreadedServer class : Output and input stream done ");
              
		
		

            	System.out.println("In Server Run class ");
            	
            	
            	
            	
            	
            	messageobject = (DataObject)in.readObject();
            	
            	String message = messageobject.getMessage();
            	String validation = "validation";
            	String delete = "delete";
            	String register = "register";
            	String view = "view";
            	String update = "update";
            	
            	System.out.println("ThreadedServer class : value of messageobject reached in server is :  "+messageobject.getMessage());
            	
            	if(message.equals(validation)){
        		myObject = (DataObject)in.readObject();
               	myObjectpass = (DataObject)in.readObject();
               	
        		System.out.println("ThreadedServer class : value of objcount reached in server is :  "+messageobject.getMessage());
        		System.out.println("ThreadedServer class : value of myObject reached in server is :  "+myObject.getMessage());
        		System.out.println("ThreadedServer class : value of myObjectpass reached in server is :  "+myObjectpass.getMessage());
            	
            		String objvalue = "";
            		boolean check;
            		check = threadobject.checkvalidentry(myObject, myObjectpass);
            		System.out.println("ThreadedServer class : Value of Check from DB is  "+check);
            		
            		
            		if(check == true){
            			objvalue = "yes";
            			messageobject.setMessage(objvalue);
            			System.out.println("ThreadedServer class : Value of objcount.setMessage from DB for validation is  "+messageobject.getMessage());
            			}
            		else{
            			objvalue = "no";
            			messageobject.setMessage(objvalue);	
            			System.out.println("ThreadedServer class : Value of objcount.setMessage from DB is  "+messageobject.getMessage());}
            		
            		out.writeObject(messageobject);
            	  	
            		System.out.println("ThreadedServer class : objcount is written on stream ");
            //	threadobject.perform(childObject);
            	
            //	 out.writeObject(myObject);
            //	 out.writeObject(childObject);
            	}
            	
            	
            	
            	
            	if(message.equals(view)){
            	//	myObject = (DataObject)in.readObject();
                 //  	myObjectpass = (DataObject)in.readObject();
                   	
            		System.out.println("ThreadedServer class : value of message object in view reached in server is :  "+messageobject.getMessage());
            	//	System.out.println("ThreadedServer class : value of myObject reached in server is :  "+myObject.getMessage());
            	//	System.out.println("ThreadedServer class : value of myObjectpass reached in server is :  "+myObjectpass.getMessage());
                	
                	//	String objvalue = "";
            		DataObjectChild dataobjectchild;
            		dataobjectchild = threadobject.fetchtable();
                		
                	//	 threadobject.fetchtable();
                	//	System.out.println("ThreadedServer class : Value of Check from DB is  "+check);
                		
                		
                	//	if(check == true){
                	//		objvalue = "yes";
                	//		messageobject.setMessage(objvalue);
                	//		System.out.println("ThreadedServer class : Value of objcount.setMessage from DB for validation is  "+messageobject.getMessage());
                	////		}
                	//	else{
                	//		objvalue = "no";
                	//		messageobject.setMessage(objvalue);	
                	//		System.out.println("ThreadedServer class : Value of objcount.setMessage from DB is  "+messageobject.getMessage());}
                		
                		out.writeObject(dataobjectchild);
                	  	
                		System.out.println("ThreadedServer class : dataobjectchild is written on stream ");
                //	threadobject.perform(childObject);
                	
                //	 out.writeObject(myObject);
                //	 out.writeObject(childObject);
                	}
                	
            	
            	
            	
            	
            	if(message.equals(delete)){
            		myObjectdelete = (DataObject)in.readObject();
                 //  	myObjectpass = (DataObject)in.readObject();
                   	
            		System.out.println("ThreadedServer class : value of objcount reached in server is :  "+messageobject.getMessage());
            		System.out.println("ThreadedServer class : value of myObject reached in server is :  "+myObjectdelete.getMessage());
            	//	System.out.println("ThreadedServer class : value of myObjectpass reached in server is :  "+myObjectpass.getMessage());
                	
            			
            		
            		
            		
            		
            		
                		String objvalue = "";
                		boolean check;
                		check = threadobject.deleteentry(myObjectdelete);
                		System.out.println("ThreadedServer class : Value of Check from DB for delete is  "+check);
                		
                		
                		if(check == true){
                			objvalue = "yes";
                			myObjectdelete.setMessage(objvalue);
                			System.out.println("ThreadedServer class : Value of objcount.setMessage from DB is  "+myObjectdelete.getMessage());
                			}
                		else{
                			objvalue = "no";
                			myObjectdelete.setMessage(objvalue);	
                			System.out.println("ThreadedServer class : Value of objcount.setMessage from DB is  "+myObjectdelete.getMessage());}
                		
                		out.writeObject(myObjectdelete);
                	  	
                		System.out.println("ThreadedServer class : myObjectdelete is written on stream ");
                //	threadobject.perform(childObject);
                	
                //	 out.writeObject(myObject);
                //	 out.writeObject(childObject);
                	}
                	
            	
            	
            	
            	if(message.equals(update)){
            		myObject = (DataObject)in.readObject();
                   	myObjectpass = (DataObject)in.readObject();
                   	myObjectname = (DataObject)in.readObject();
                   	myObjectcontact = (DataObject)in.readObject();
                   	myObjectaddress = (DataObject)in.readObject();
                   
                   	
            		System.out.println("ThreadedServer class : value of objcount reached in server is :  "+myObject.getMessage());
            		System.out.println("ThreadedServer class : value of myObject reached in server is :  "+myObjectpass.getMessage());
            		System.out.println("ThreadedServer class : value of objcount reached in server is :  "+myObjectname.getMessage());
            		System.out.println("ThreadedServer class : value of myObject reached in server is :  "+myObjectcontact.getMessage());
            		System.out.println("ThreadedServer class : value of objcount reached in server is :  "+myObjectaddress.getMessage());
            		
            		//System.out.println("ThreadedServer class : value of myObject reached in server is :  "+myObjectpass.getMessage());
            		
            		//	System.out.println("ThreadedServer class : value of myObjectpass reached in server is :  "+myObjectpass.getMessage());
                	
            			
            		
            		
            		
            		
            		
                		String objvalue = "";
                		boolean check;
                		check = threadobject.updation(myObject,myObjectpass, myObjectname, myObjectcontact, myObjectaddress );
                		
                		System.out.println("ThreadedServer class : Value of Check from DB for delete is  "+check);
                		
                		
                		if(check == true){
                			objvalue = "yes";
                			messageobject.setMessage(objvalue);
                			System.out.println("ThreadedServer class : Value of objcount.setMessage from DB for registration  is  "+messageobject.getMessage());
                			}
                		else{
                			objvalue = "no";
                			messageobject.setMessage(objvalue);	
                			System.out.println("ThreadedServer class : Value of objcount.setMessage from DB for registration is  "+messageobject.getMessage());}
                		
                		out.writeObject(messageobject);
                	  	
                		System.out.println("ThreadedServer class : myObjectdelete is written on stream ");
                //	threadobject.perform(childObject);
                	
                //	 out.writeObject(myObject);
                //	 out.writeObject(childObject);
                	}
            	
            	
            	
            	
            	
            	
            	if(message.equals(register)){
            		myObject = (DataObject)in.readObject();
                   	myObjectpass = (DataObject)in.readObject();
                   	myObjectname = (DataObject)in.readObject();
                   	myObjectcontact = (DataObject)in.readObject();
                   	myObjectaddress = (DataObject)in.readObject();
                   
                   	
            		System.out.println("ThreadedServer class : value of objcount reached in server is :  "+myObject.getMessage());
            		System.out.println("ThreadedServer class : value of myObject reached in server is :  "+myObjectpass.getMessage());
            		System.out.println("ThreadedServer class : value of objcount reached in server is :  "+myObjectname.getMessage());
            		System.out.println("ThreadedServer class : value of myObject reached in server is :  "+myObjectcontact.getMessage());
            		System.out.println("ThreadedServer class : value of objcount reached in server is :  "+myObjectaddress.getMessage());
            		
            		//System.out.println("ThreadedServer class : value of myObject reached in server is :  "+myObjectpass.getMessage());
            		
            		//	System.out.println("ThreadedServer class : value of myObjectpass reached in server is :  "+myObjectpass.getMessage());
                	
            			
            		
            		
            		
            		
            		
                		String objvalue = "";
                		boolean check;
                		check = threadobject.updateentry(myObject,myObjectpass, myObjectname, myObjectcontact, myObjectaddress );
                		
                		System.out.println("ThreadedServer class : Value of Check from DB for delete is  "+check);
                		
                		
                		if(check == true){
                			objvalue = "yes";
                			messageobject.setMessage(objvalue);
                			System.out.println("ThreadedServer class : Value of objcount.setMessage from DB for registration  is  "+messageobject.getMessage());
                			}
                		else{
                			objvalue = "no";
                			messageobject.setMessage(objvalue);	
                			System.out.println("ThreadedServer class : Value of objcount.setMessage from DB for registration is  "+messageobject.getMessage());}
                		
                		out.writeObject(messageobject);
                	  	
                		System.out.println("ThreadedServer class : myObjectdelete is written on stream ");
                //	threadobject.perform(childObject);
                	
                //	 out.writeObject(myObject);
                //	 out.writeObject(childObject);
                	}
            	
            	
            	
		in.close();
			
		out.close();
		
		incoming.close(); 

	//	System.out.println("String passed: " + myObject.getMessage());

	
            
         	    
         
      }
      catch (Exception e) 
      {  System.out.println(e);
      } 
   
   
   }
   
DataObject myObject = null, myObjectpass=null, myObjectname=null, myObjectcontact=null, myObjectaddress=null, messageobject=null, myObjectdelete = null;
  // DataObjectChild childObject = null;
 
   private Socket incoming;
 
}


