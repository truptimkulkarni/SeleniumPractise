package proprtiesFileOperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropWriteOperation {

	public static void main(String[] args) throws IOException {
		//Instantiating the properties file
	      Properties prop = new Properties();
	      
	      //Populating the properties file
	      prop.put("Device_name", "OnePlus7");
	      prop.put("Android_version", "9");
	      prop.put("Model", "GM1901");
	      prop.put("CPU", "Snapdragon855");
	      
	      //Instantiating the FileInputStream for output file
	      String path="E:\\ExampleDirectory\\myFirstPrpertiesFile.Properties";
	      OutputStream outputStrem = new FileOutputStream(path);
	      
	      //Storing the properties file
	      prop.store(outputStrem, "This is a sample properties file");
	      System.out.println("Properties file created......");
	      System.out.println("And now check your file....");
	   }

	

}
