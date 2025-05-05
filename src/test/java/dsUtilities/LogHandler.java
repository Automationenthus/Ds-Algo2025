package dsUtilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHandler {

    private static final Logger logger = LogManager.getLogger();

    // Log a simple message (String)
    public static void info(String message) {
        logger.info(message);
    }

    // Log a number (int)
    public static void info(int num) {
        logger.info(num);
    }

    // Log a warning message (String)
    public static void warn(String message) {
        logger.warn(message);
    }

    // Log an error message (String)
    public static void error(String message) {
        logger.error(message);
    }

    // Log a debug message (String)
    public static void debug(String message) {
        logger.debug(message);
    }

   // Log an exception along with a message
    public static void error(String message, Throwable throwable) {
        logger.error(message, throwable);
    }

    // Log a warning with an exception
    public static void warn(String message, Throwable throwable) {
        logger.warn(message, throwable);
    }

    // Log info with an exception
    public static void info(String message, Throwable throwable) {
        logger.info(message, throwable);
    }

    // Log debug with an exception
    public static void debug(String message, Throwable throwable) {
        logger.debug(message, throwable);
    }
    
}

