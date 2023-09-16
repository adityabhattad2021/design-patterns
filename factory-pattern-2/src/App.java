import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        String userPrefrence = scanner.nextLine();
        scanner.close();
        Coffee coffee = Director.getCoffee(userPrefrence);
        coffee.displayName();
        coffee.displayIngredients();
    }
}
