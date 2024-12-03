package logger;

import destination.LogSubject;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int logginLevel){
        this.loggingLevel = logginLevel;
    }

    @Override
    protected void display(String message, LogSubject logSubject) {
        String info = "INFO: "+ message;
        logSubject.notifyAllObservers(1, info);
    }
}
