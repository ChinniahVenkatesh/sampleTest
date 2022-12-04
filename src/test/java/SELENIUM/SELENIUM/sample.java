package SELENIUM.SELENIUM;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import base.test1;

public class sample {
	
	public static Logger log = LogManager.getLogger(sample.class);
	
	public static void main(String [] args) throws IOException
	{
		log.info("This is information message");
		System.out.println("This is information message");
		log.error("This is error message");
		System.out.println(test1.browserSetup());
		log.debug("This is a debug message");
	}

}
