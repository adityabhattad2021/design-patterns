import java.util.List;

public interface IEmployee {
    
    public void showEmployeeDetails();

    public void addEmployee(IEmployee employee);

    public void removeEmployee(IEmployee employee);

    public List<IEmployee> getEmployees();

}
