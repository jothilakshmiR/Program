package day1.Examples;
import java.util.Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class properties {

	public static void main(String[] args) {
		
		        try (OutputStream output = new FileOutputStream("config.properties")) {
		 
		            Properties prop = new Properties();
		 
		            
		            prop.setProperty("database", "localhost");
		            prop.setProperty("username", "Codingeek");
		            prop.setProperty("password", "Codingeek");
		 
		          
		            prop.store(output, null);
		 
		        } catch (IOException exception) {
		            exception.printStackTrace();
		        } 
	}
		    }