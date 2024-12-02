package logger;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int logginLevel){
        this.loggingLevel = logginLevel;
    }

    @Override
    protected void display(String message) {
        System.out.println("INFO: "+ message);
    }
}
