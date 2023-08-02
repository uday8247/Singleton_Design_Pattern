package Concurrent;

public class ConcurrentSingleton {

    private static ConcurrentSingleton INSTANCE=null;

    public static ConcurrentSingleton getINSTANCE(){
        if(INSTANCE==null){
            synchronized (ConcurrentSingleton.class){
                if(INSTANCE==null){
                    INSTANCE=new ConcurrentSingleton();
                }
            }
        }
        return INSTANCE;
    }

    private ConcurrentSingleton(){}
}
