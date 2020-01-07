package behavioral.chainOfResponsibility;

public class InfoLogger extends Logger {
    public InfoLogger() {
        this.level = 2;
    }

    protected void displayLogInfo(String msg) {
        System.out.println(msg);
        System.out.println("Logged by InfoLogger");
    }
}
