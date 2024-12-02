package logger;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int loggingLevel){
        this.loggingLevel = loggingLevel;
    }
    @Override
    protected void display(String message) {
        System.out.println("Error: "+ message);
    }
}
