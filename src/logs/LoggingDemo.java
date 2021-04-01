package logs;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingDemo {

    private static final Logger LOGGER = Logger.getLogger(LoggingDemo.class.getName());

    public static void main(String[] args) {
        LoggingDemo.setUpLogger();
        try {
            throw new StackOverflowError();
        } catch (StackOverflowError e) {
            LOGGER.log(Level.INFO, e.getMessage(), e);
        }

    }

    private static void setUpLogger() {
        LogManager.getLogManager().reset();
        LOGGER.setLevel(Level.ALL);
        try {
            FileHandler fileHandler = new FileHandler("LoggingDemo.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (IOException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
