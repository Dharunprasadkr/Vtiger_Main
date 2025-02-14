package GenericUtility;

	import java.io.FileInputStream;
	import java.util.Properties;

	/**
	 * this is a utility class which works with properties file
	 */
	public class PropertiesUtility {
		/**
		 * This is a generic method to fetch data from properties file
		 * @param key
		 * @return
		 * @throws Exception
		 */
	   public String getDataFromPropertiesFile(String key) throws Exception {
		  FileInputStream fis = new FileInputStream(iPathUtility.propertiesPath);
		  Properties prop = new Properties();
		  prop.load(fis);
	      String value = prop.getProperty(key);
	      return value;
	   }
	}


