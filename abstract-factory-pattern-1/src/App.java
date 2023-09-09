public class App {
    
    public static void main(String[] args) throws Exception {
        ApplicationCode ac = new ApplicationCode(new WindowsFactory());

        ac.paint();
        ac.click();
    }

}
