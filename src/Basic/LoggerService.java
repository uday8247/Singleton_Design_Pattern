package Basic;

public class LoggerService {
    private static LoggerService logger=null;

    private LoggerService(){};

    public static LoggerService getLogger(){
        if(logger==null){
            logger=new LoggerService();
        }
        return logger;
    }
    public void log(String message){
        System.out.println(message);
    }
}
