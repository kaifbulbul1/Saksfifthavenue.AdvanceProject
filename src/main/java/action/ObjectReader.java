package action;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

	public class ObjectReader {
		
		static Properties properties;
		private String filePath;
		public ObjectReader(String filePath )
		{
			this.filePath = filePath;
			File src = new File(this.filePath);
			try{
				FileInputStream fis = new FileInputStream(src);
				properties = new Properties();
				properties.load(fis);
				
			}catch(Exception e){
				System.out.println("The exception is : " + e);
			}
		}
		
		public  String getObject(String webElement)
		{
			String Obj = properties.getProperty(webElement);
			return Obj;
		}

		
		}	
	

