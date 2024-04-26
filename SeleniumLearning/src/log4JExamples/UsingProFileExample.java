package log4JExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class UsingProFileExample {
	
	static Logger logger = Logger.getLogger(UsingProFileExample.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is a Debug Message");
		logger.error("This is a Error Message");
		logger.fatal("This is a Fatal Message");
		logger.info("This is a Info Message");
		logger.warn("This ia a Warning Message");

	}

}
