package alpha;

import org.apache.logging.log4j.*;

public class Log4jDemo {
	
	   private static Logger log = LogManager.getLogger(Log4jDemo.class.getName());

	public static void main(String[] args) {
		
		log.debug("I clicked on button");
		log.info("The button is present.");
		log.error("The button is not present.");
		log.fatal("The button is missing.");

	}

}
