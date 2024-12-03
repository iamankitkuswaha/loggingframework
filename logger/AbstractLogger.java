package logger;

import destination.LogSubject;

public abstract class AbstractLogger {
    int loggingLevel;
    AbstractLogger nextLoggingLevel;
    public void setNextLoggingLevel(AbstractLogger nextLoggingLevel){
        this.nextLoggingLevel = nextLoggingLevel;
    }

    void logMessage(int loggingLevel, String message, LogSubject logSubject){
        if(this.loggingLevel<=loggingLevel)
            display(message, logSubject);

        if(this.nextLoggingLevel!=null)
            this.nextLoggingLevel.logMessage(loggingLevel, message, logSubject);
    }
    protected abstract void display(String message, LogSubject logSubject);

}
