package logger;

import destination.LogSubject;

public class DebugLogger extends AbstractLogger{
    public DebugLogger(int loggingLevel){
        this.loggingLevel = loggingLevel;
    }
    @Override
    protected void display(String message, LogSubject logSubject) {
        String debug = "DEBUG: "+ message;
        logSubject.notifyAllObservers(3,debug);
    }
}
