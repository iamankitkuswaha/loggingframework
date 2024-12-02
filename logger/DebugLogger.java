package logger;

public class DebugLogger extends AbstractLogger{
    public DebugLogger(int loggingLevel){
        this.loggingLevel = loggingLevel;
    }
    @Override
    protected void display(String message) {
        System.out.println("DEBUG: "+ message);
    }
}
