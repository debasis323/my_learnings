package pages;

import java.io.File;
import java.util.Properties;

import utilities.LoadProperties;

public class PrintProperties {
	
	public static void main(String args []) {
		File file = new File("../Workspace201/src/Data.properties");
		Properties prop = LoadProperties.getProperties(file);
		System.out.println(prop.getProperty("FlipkartUserName"));
		
	}

}
