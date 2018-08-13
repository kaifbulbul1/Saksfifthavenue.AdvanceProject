package dataprovider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	private Properties properties;
	public ConfigDataProvider()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			try {
					properties = new Properties();
					properties.load(fis);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public String getUrl()
	{
		String url = properties.getProperty("url");
		return url;
	}
	
	public String getChromePath()
	{
		String chromePath = properties.getProperty("chromepath");
		return chromePath;
	}
	
	public String getIEPath()
	{
		String iePath = properties.getProperty("IEpath");
		return iePath;
	}
}
