import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class TestLogging {

	// Logger object created
	private static Logger log = Logger.getLogger(TestLogging.class);

	public static void main(String args[]) {
		
		// Create Pattern Layout
		//Layout layout = new PatternLayout("%d %c %p %M %m %n");
		
		// Create Appender + Link Layout
		/*
		Appender appender;
		try {
			appender = new FileAppender(layout,"E:/Log Testing/data.log");
			
			// Add appender to logger object
			log.addAppender(appender);
		} catch (IOException e) {
			e.printStackTrace();
		}

		*/

		// Print Message
		log.debug("Debug method");
		log.info("Info method");
		log.warn("Warn method");
		log.error("Error method");
		log.fatal("Fatal method");
	}
}
