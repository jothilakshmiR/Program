package day1.Examples;
import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;



public class ReadFile {

	public static void main(String[] args) {

		
		
		        Properties prop = new Properties();
		 
		        try (InputStream input = new FileInputStream("config.properties")) {
		 
		           
		            prop.load(input);
		 
		          
		            System.out.println("Database - " + prop.getProperty("database"));
		            System.out.println("Username - " + prop.getProperty("Username"));
		            System.out.println("Password - " + prop.getProperty("password"));
		 
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		    }

	}


