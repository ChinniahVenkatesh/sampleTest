package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class test1 {
	
	public static String browserSetup() throws IOException
	{
		Properties prop = new Properties();
		String path = "C:\\Users\\chinn\\sep_2022\\SELENIUM\\src\\test\\java\\testData\\testdata.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		String name = prop.getProperty("browser1");
		return name;
	}

}
