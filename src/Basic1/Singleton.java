package Basic1;

public class Singleton {

    private int count=0;

    // Has to be static (referencing from static scope)
    private static Singleton INSTANCE=null;

    // Has to be static,we won't be able to get objects otherwise
    public static Singleton getInstance(){
        if(INSTANCE==null){
            INSTANCE=new Singleton();
        }
        return INSTANCE;
    }

    public void makeConnection(){
        if(count>3) System.out.println("false");
        else{
            System.out.println("true");
            count++;
        }
    }

    //It should have a private constructor so that no instance of it can be created by other classes.
    private Singleton(){}

}
