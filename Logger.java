public class Logger {

    public void logInfo(String message) {
        System.out.println("[INFO] " + message);
    }

    public void logWarning(String message) {
        System.out.println("[WARNING] " + message);
    }

    public void logError(String message) {
        System.err.println("[ERROR] " + message);
    }

    public void logDebug(String message) {
        System.out.println("[DEBUG] " + message);
    }
}
