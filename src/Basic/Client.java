package Basic;

public class Client {
    public static void main(String[] args) {
        LoggerService logger = LoggerService.getLogger();

        logger.log("Hello World!");
    }
}
