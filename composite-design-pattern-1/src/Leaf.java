import java.util.List;
import java.util.Random;

public class Leaf implements IEmployee {

    private String name;
    private String id;
    private String position;

    public Leaf(String name, String position) {
        Random random = new Random();
        this.name = name;
        this.id = String.valueOf(random.nextInt(1000));
        this.position = position;
    }

    @Override
    public void showEmployeeDetails(){
        System.out.print("Employee Details:");
        System.out.print(" Name: " + this.name);
        System.out.print(" ID: " + this.id);
        System.out.println(" Position: " + this.position);
    }

    @Override
    public void addEmployee(IEmployee employee) {
        System.out.println("Cannot add employee to leaf");
    }

    @Override
    public void removeEmployee(IEmployee employee) {
        System.out.println("Cannot remove employee from leaf");
    }

    @Override
    public List<IEmployee> getEmployees() {
        System.out.println("Cannot get employees from leaf");
        return null;
    }
    
}
