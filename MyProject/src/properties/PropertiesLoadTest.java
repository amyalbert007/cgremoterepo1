package properties;
import java.io.*;
import java.util.Properties;
public class PropertiesLoadTest {
	public static void main(String []args) {
		try(InputStream input = new FileInputStream("C:\\Users\\1 able technology\\Desktop\\JAVA_PROGRAMS\\MyProject\\src\\properties\\abc.properties")){
			Properties prop = new Properties();
			prop.load(input);
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("contact"));
			System.out.println(prop.containsValue("postgres"));
		
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	

}
