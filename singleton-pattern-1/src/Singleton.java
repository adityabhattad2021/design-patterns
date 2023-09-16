public class Singleton {
    private static final Singleton instance = new Singleton();

    protected Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}