package logger;

public abstract class AbstractLogger {
    int loggingLevel;
    AbstractLogger nextLoggingLevel;
    public void setNextLoggingLevel(AbstractLogger nextLoggingLevel){
        this.nextLoggingLevel = nextLoggingLevel;
    }

    void logMessage(int loggingLevel, String message){
        if(this.loggingLevel<=loggingLevel)
            display(message);

        if(this.nextLoggingLevel!=null)
            this.nextLoggingLevel.logMessage(loggingLevel, message);
    }
    protected abstract void display(String message);

}
