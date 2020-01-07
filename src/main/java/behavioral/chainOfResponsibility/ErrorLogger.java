package behavioral.chainOfResponsibility;

public class ErrorLogger extends Logger {
    public ErrorLogger() {
        this.level = 3;
    }

    protected void displayLogInfo(String msg) {
        System.out.println(msg);
        System.out.println("Logged by ErrorLogger");
    }
}
