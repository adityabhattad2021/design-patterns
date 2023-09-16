import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Dialog dialog = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("which UI you wanna, create? ");
        String config = scanner.nextLine();
        if (config.compareToIgnoreCase("windows") == 0) {
            dialog = new WindowsDialog();
        } else if (config.compareToIgnoreCase("web") == 0) {
            dialog = new WebDialog();
        } else if (config.compareToIgnoreCase("mac") == 0) {
            dialog = new MacDialog();
        } else {
            scanner.close();
            throw new Exception("Invalid method name!");
        }
        dialog.render();
        scanner.close();
    }

    public static void sayHello(int count) {
        if (count > 5) {
            return;
        }
        System.out.println("Say Hello!");
        // count++;
        sayHello(++count);
    }
}
