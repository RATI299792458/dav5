/**
 * A simple Logger class to log messages with different severity levels.
 * This logger outputs messages to the standard output.
 */
public class Logger {

    /**
     * Logs a general info message.
     *
     * @param message The message to be logged.
     */
    public void logInfo(String message) {
        System.out.println("[INFO] " + message);
    }

    /**
     * Logs a warning message.
     *
     * @param message The warning message to be logged.
     */
    public void logWarning(String message) {
        System.out.println("[WARNING] " + message);
    }

    /**
     * Logs an error message.
     *
     * @param message The error message to be logged.
     */
    public void logError(String message) {
        System.err.println("[ERROR] " + message);
    }

    /**
     * Logs a debug message.
     *
     * @param message The debug message to be logged.
     */
    public void logDebug(String message) {
        System.out.println("[DEBUG] " + message);
    }
}

