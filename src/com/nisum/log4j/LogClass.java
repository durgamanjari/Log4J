

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogClass {
	private static Logger log=Logger.getLogger(LogClass.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.setLevel(Level.TRACE);
		
		  log.trace("Trace Message!");
	      log.debug("Debug Message!");
	      log.info("Info Message!");
	      log.warn("Warn Message!");
	      log.error("Error Message!");
	      log.fatal("Fatal Message!");
	}
}
