package behavioral.chainOfResponsibility;

public abstract class Logger {

    private final int DEBUG = 1;
    private final int INFO = 2;
    private final int ERROR = 3;

    protected int level;
    protected Logger nextLevelLogger;

    public void setNextLoggerLevel(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String msg) {
        if (this.level >= levels) {
            displayLogInfo(msg);
        } else if (nextLevelLogger != null) {
            nextLevelLogger.logMessage(levels, msg);
        }
    }

    protected abstract void displayLogInfo(String msg);
}
