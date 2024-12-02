import logger.Logger;

public class Application {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.info("This is info message");
    }
}
