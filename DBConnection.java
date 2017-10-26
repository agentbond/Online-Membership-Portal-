import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;  

class DBConnection{  
	
	Connection con;
	Statement stmt;
	String username;
	String password;
	ResultSet rs;
	String values[];
	String[][] info;
	DataObjectChild myObjectChild = new DataObjectChild();
	
	ArrayList<String> arraylistusername = new ArrayList<String>();
	ArrayList<String> arraylistpassword = new ArrayList<String>();
	ArrayList<String> arraylistname = new ArrayList<String>();
	ArrayList<String> arraylistcontact = new ArrayList<String>();
	ArrayList<String> arraylistaddress = new ArrayList<String>();
	
	public	DBConnection(){
		//this.username = username;
		//this.password=password;
	}
	
public	DBConnection(String username, String password){
	this.username = username;
	this.password=password;
}
	
	//public DBConnection(){}
//public static void main(String args[]){  

public boolean checkvalidentry(String username, String password) throws SQLException{
	dbcon();
	//ResultSet rs=stmt.executeQuery("    select * from membership where username = "+username+" and pass = "+password+"  ;   ");
	
	System.out.println("DataBase Connection class : Value of username : "+username +"and value of password is : "+password);
	
//	ResultSet rs=stmt.executeQuery("select * from membership  ");
	
	ResultSet rs=stmt.executeQuery("select * from membership where username = '"+username+"' and pass = '"+password+"'  ");
// select * from membership where username = 'adminuser' and pass = 'adminuser' ;	
	boolean hasResult = rs.next();
	if(hasResult == true){
		return true;
	}
	else
	{
		return false;
	}
	
	
	
}



public DataObjectChild getTable() throws SQLException{
	dbcon();
	
	
	System.out.println(" DB Connection  Class : printing values from string " );
	
//	int i=1;
	
	
	
	ResultSet rs=stmt.executeQuery("select * from membership"); 
	while(rs.next())  {
	System.out.println(rs.getString(1)+"     "+rs.getString(2)+"     "+rs.getString(3)+"     "+rs.getString(4)+"     "+ rs.getString(5) ); 
	
	
	
	
	
	arraylistusername.add(rs.getString(1));
	arraylistpassword.add(rs.getString(2));
	arraylistname.add(rs.getString(3));
	arraylistcontact.add(rs.getString(4));
	arraylistaddress.add(rs.getString(5));
	
	 
	
	
} 
	
	ArrayList<ArrayList<String>> group = new ArrayList<ArrayList<String>>(5);
	
	group.add(arraylistusername);
	group.add(arraylistpassword);
	group.add(arraylistname);
	group.add(arraylistcontact);
	group.add(arraylistaddress);
	
	
	System.out.println(" DB Connection Class : arraylist updated " );
	
	System.out.println("DB Class : Printing only usernames : "+Arrays.toString(arraylistusername.toArray()));
	System.out.println("DB Class : Printing only passwords : "+Arrays.toString(arraylistpassword.toArray()));
	System.out.println("DB Class : Printing only names : "+Arrays.toString(arraylistname.toArray()));
	System.out.println("DB Class : Printing only contact : "+Arrays.toString(arraylistcontact.toArray()));
	System.out.println("DB Class : Printing only address : "+Arrays.toString(arraylistaddress.toArray()));
	

	
	
	
	myObjectChild.setMessage(group);
	
	return myObjectChild;
	
}



public boolean updation(String username, String password, String name, String contactnum, String address  ) throws SQLException{
	dbcon();
	//ResultSet rs=stmt.executeQuery("    select * from membership where username = "+username+" and pass = "+password+"  ;   ");
	
	System.out.println("DataBase Connection class : Value of username : "+username);
	System.out.println("DataBase Connection class : Value of password : "+password);
	System.out.println("DataBase Connection class : Value of nameofperson : "+name);
	System.out.println("DataBase Connection class : Value of contact num : "+contactnum);
	System.out.println("DataBase Connection class : Value of address : "+address);
	
	
	//ResultSet rs=stmt.executeQuery("select * from membership where username = '"+username+"'  ");
	// select * from membership where username = 'adminuser' and pass = 'adminuser' ;	
	
	//ResultSet rs=stmt.executeQuery("update membership set pass ='"+password+"', personname='"+name+"',contactnum='"+contactnum+"',address ='"+address+"' where username = '"+username+"'  ");
	
	
	int ps=stmt.executeUpdate("update membership set pass ='"+password+"', personname='"+name+"',contactnum='"+contactnum+"',address ='"+address+"' where username = '"+username+"'  ");
	
	
	stmt.executeQuery(" commit  ");
	
	
	// update membership set pass ='user8', personname='raju',contactnum='53698',address ='nagaland' where username = 'user8';
	
//	boolean hasResult = rs.next();
		if(ps>0){
			System.out.println("DB Class : DB Updated by updation method");
			return true;
		}
		else
		{
					
			return false;
		}
		
		//if(hasResult == false){
		
	
	
	
	
	
	
		//}
	
}






public boolean updateentry(String username, String password, String name, String contactnum, String address  ) throws SQLException{
	dbcon();
	//ResultSet rs=stmt.executeQuery("    select * from membership where username = "+username+" and pass = "+password+"  ;   ");
	
	System.out.println("DataBase Connection class : Value of username : "+username);
	System.out.println("DataBase Connection class : Value of password : "+password);
	System.out.println("DataBase Connection class : Value of nameofperson : "+name);
	System.out.println("DataBase Connection class : Value of contact num : "+contactnum);
	System.out.println("DataBase Connection class : Value of address : "+address);
	
	
	ResultSet rs=stmt.executeQuery("select * from membership where username = '"+username+"'  ");
	// select * from membership where username = 'adminuser' and pass = 'adminuser' ;	
		boolean hasResult = rs.next();
		if(hasResult == true){
			return false;
		}
		else
		{
			int ps=stmt.executeUpdate(" insert into membership values ('"+username+"', '"+password+"', '"+name+"', '"+contactnum+"', '"+address+"' )   ");
			
			
			stmt.executeQuery(" commit  ");
			
			return true;
		}
		
		//if(hasResult == false){
		
	
	
	
	
	
	
		//}
	
}











public boolean deleteentry(String username) throws SQLException{
	dbcon();
	//ResultSet rs=stmt.executeQuery("    select * from membership where username = "+username+" and pass = "+password+"  ;   ");
	
	System.out.println("DataBase Connection class : Value of username : "+username);
	
    
	int rs=stmt.executeUpdate("delete from membership where username = '"+username+"'  ");
	
	if(rs >0){
		return true;
	}
	else
	{
		return false;
	}
	
	
	
}

public void dbcon(){
try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
 con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:orcl","system","agentb");  
  
//step3 create the statement object  
stmt=con.createStatement();  
  
 
  
}catch(Exception e){ System.out.println(e);}  
  
}  


public void closecon() throws SQLException{
	con.close(); 
}


}  