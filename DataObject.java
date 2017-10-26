import java.io.*;
import java.util.*;

import javax.swing.JFrame;

public class DataObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String message;
	
	DataObject(){
		message = "";
	}

	public String getMessage(){
		return message;
	}

	public void setMessage(String inMessage){
		message = inMessage;
	}
	
	
	
}