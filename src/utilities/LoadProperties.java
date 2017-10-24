package utilities;

import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
	
	public static Properties getProperties(File file) {
//	public static void main(String args[]) {
		
//		File file = new File("../Workspace201/src/Data.properties");
		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//to test only
		System.out.println(prop.getProperty("AmazonURL"));
		System.out.println(prop.getProperty("FlipkartUserName"));
		System.out.println(prop.getProperty("FlipkartPassword"));
		
		
		return prop;
		
	}

}
