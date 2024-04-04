package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 @author PARAS* 
 */
public class PropertyFileUtility {

	
	public String readDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties property = new Properties();
		property.load(fis);
		String value = property.getProperty(key);
		return value;
	}
	
	
}
