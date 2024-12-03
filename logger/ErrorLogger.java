package logger;

import destination.LogSubject;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int loggingLevel){
        this.loggingLevel = loggingLevel;
    }
    @Override
    protected void display(String message, LogSubject logSubject) {
        String error = "Error: "+ message;
        logSubject.notifyAllObservers(2, error);
    }
}
