import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        CoffeeFactory cf = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        String userPrefrence = scanner.nextLine();
        scanner.close();
        if(userPrefrence.equalsIgnoreCase("lattee")){
            cf = new LatteeFactory();
        }else if(userPrefrence.equalsIgnoreCase("espresso")){
            cf= new EspressoFactory();
        }else if(userPrefrence.equalsIgnoreCase("cappuccino")){
            cf = new CappuccinoFactory();
        }else{
            throw new Exception("Invalid Input");
        }
        cf.serve();
    }
}
