package behavioral.chainOfResponsibility;

public class DebugLogger extends Logger {
    public DebugLogger() {
        this.level = 1;
    }

    protected void displayLogInfo(String msg) {
        System.out.println(msg);
        System.out.println("Logged by DebugLogger");
    }
}
