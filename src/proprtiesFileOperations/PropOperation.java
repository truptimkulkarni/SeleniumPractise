package proprtiesFileOperations;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;

public class PropOperation {

	public static void main(String[] args) throws IOException{
		
		File file=new File(".//Resources/config.properties");
		//To open and give path of file 
		
		
		InputStream inStream=new FileInputStream(file); 
		//File is selected in read only mode. If want to write then outputStream
		
		
		
		
		Properties prop=new Properties();
		//created object of Properties
		
		prop.load(inStream); 
		//to load file in reading mode to memory
		
		String unm=prop.getProperty("username");
//		System.out.println(unm);
		String pwd=prop.getProperty("password");
		System.out.println(unm+"-->"+pwd);
		
		
		
		
	}
}
