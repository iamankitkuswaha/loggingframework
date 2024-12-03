package logger;

import destination.LogSubject;

import java.io.Serializable;

import static logger.LogManager.buildChainOfLogger;
import static logger.LogManager.buildLogSubject;

public class Logger implements Cloneable, Serializable {
    private volatile static Logger logger;
    private volatile static AbstractLogger chaiOfLogger;
    private volatile static LogSubject logSubject;
    private Logger(){
        if(logger!=null)
            throw new IllegalStateException("Logger object already exist...");
    }
    public static Logger getInstance(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    logger = new Logger();
                    chaiOfLogger = buildChainOfLogger();
                    logSubject = buildLogSubject();
                }
            }
        }
        return logger;
    }

    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Logger object does not support cloning");
    }
    protected Object readResolve(){
        return logger;
    }

    private void createLog(int loggingLevel, String message, LogSubject logSubject){
        chaiOfLogger.logMessage(loggingLevel, message, logSubject);
    }
    public void info(String message){
        createLog(1, message, logSubject);
    }

    public void error(String message){
        createLog(2, message, logSubject);
    }

    public void debug(String message){
        createLog(3, message, logSubject);
    }
}
