public class App {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        SingletonSubclass ss1 = SingletonSubclass.getInstance();
        SingletonSubclass ss2 = SingletonSubclass.getInstance();

        s1.sayHello();
        s2.sayHello();
        ss1.sayHello();
        ss2.sayHello();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(ss1);
        System.out.println(ss2);
    }
}
