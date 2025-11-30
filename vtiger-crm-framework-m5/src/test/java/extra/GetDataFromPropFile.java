package extra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropFile {
	public static void main(String[] args) throws IOException {
//		step 1> Create a java representation object of the physical file
//		/vtiger-crm-framework-m5/src/test/resources/commondata.properties
//		modified to 
//		./src/test/resources/commondata.properties
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");

//		Properties class
//		step 2> by using load(), load all the keys
		Properties pObj = new Properties();
		pObj.load(fis);

//		step 3> by using getProperty(key), get the value
		String URL = pObj.getProperty("url");		
		String BROWSER = pObj.getProperty("browser");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");

		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

//		ResourceBundle resource = ResourceBundle.getBundle("commondata");
//		String URL = resource.getString("url");
//		System.out.println(URL);
	}
}
