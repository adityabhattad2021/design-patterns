import java.util.*;


public class Composite implements IEmployee {

    private List<IEmployee> employees = new ArrayList<IEmployee>();
    
    @Override
    public void showEmployeeDetails(){
        for (IEmployee employee : employees) {
            employee.showEmployeeDetails();
        }
    }

    @Override
    public void addEmployee(IEmployee employee) {
        if(employee instanceof Composite){
            for(IEmployee emp : employee.getEmployees()){
                employees.add(emp);
            }
        }else if(employee instanceof Leaf){
            employees.add(employee);
        }
    }

    @Override
    public void removeEmployee(IEmployee employee) {
        employees.remove(employee);
    }

    public List<IEmployee> getEmployees(){
        return employees;
    }

}
