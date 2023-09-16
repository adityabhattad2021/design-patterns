public class SingletonSubclass extends Singleton {

    private static final SingletonSubclass instance = new SingletonSubclass();

    private SingletonSubclass(){
        super();
    }

    public static SingletonSubclass getInstance(){
        return instance;
    }

    public void sayHello(){
        System.out.println("Hello from SingletonSubclass");
    }
    
}
