import java.io.*;
import java.util.*;

public class DataObjectChild implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	ArrayList<String> arraylistusername = new ArrayList<String>();
	ArrayList<String> arraylistpassword = new ArrayList<String>();
	ArrayList<String> arraylistname = new ArrayList<String>();
	ArrayList<String> arraylistcontact = new ArrayList<String>();
	ArrayList<String> arraylistaddress = new ArrayList<String>();
	
	protected ArrayList<ArrayList<String>> group ;
    
	DataObjectChild(){
		
		 
	}
 
	public ArrayList<ArrayList<String>> getMessage(){
		return group;
	}

	public void setMessage(ArrayList<ArrayList<String>> inTable){
		group = inTable;
	}
	
	
	
}