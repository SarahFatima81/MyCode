package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import alpha.Log4jDemo;

public class Log4jDemo1 {
	
	 private static Logger log = LogManager.getLogger(Log4jDemo.class.getName());

		public static void main(String[] args) {
			
			log.debug("I clicked on button");
			log.info("The button is present.");
			log.error("The button is not present.");
			log.fatal("The button is missing.");
		}

}
