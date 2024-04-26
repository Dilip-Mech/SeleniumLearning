package log4JExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {
	
	static Logger logger = Logger.getLogger(BasicConfiguratorExample.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		logger.debug("This is a Debug Message");
		logger.error("This is a Error Message");
		logger.fatal("This is a Fatal Message");
		logger.info("This is a Info Message");
		logger.warn("This ia a Warning Message");
		

	}

}
