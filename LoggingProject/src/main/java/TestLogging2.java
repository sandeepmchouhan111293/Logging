import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class TestLogging2 {

	// Logger object created
	private static Logger log = Logger.getLogger(TestLogging2.class);

	public static void main(String args[]) {
/*
		// 1) Create Simple Layout
		// Layout layout = new SimpleLayout();
		
		// 2) Create HTML Layout
		//Layout layout = new HTMLLayout();

		//3) Create HTML Layout
		//Layout layout = new XMLLayout();
		
		//4) Create HTML Layout
		Layout layout = new PatternLayout("%d %c %p %M %m %n");
		
		// Create Appender + Link Layout
		Appender appender = new ConsoleAppender(layout);

		// Add appender to logger object
		log.addAppender(appender);

		// Print Message
		log.info("Info method");
		log.debug("Debug method");
		log.warn("Warn method");
		log.error("Error method");
		log.fatal("Fatal method");
*/	}
}
