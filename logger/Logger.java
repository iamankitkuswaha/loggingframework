package logger;

import java.io.Serializable;

import static logger.LogManager.buildChainOfLogger;

public class Logger implements Cloneable, Serializable {
    private volatile static Logger logger;
    private volatile static AbstractLogger chaiOfLogger;
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

    private void createLog(int loggingLevel, String message){
        chaiOfLogger.logMessage(loggingLevel, message);
    }
    public void info(String message){
        createLog(1, message);
    }

    public void error(String message){
        createLog(2, message);
    }

    public void debug(String message){
        createLog(3, message);
    }
}
