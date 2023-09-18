public class App {
    public static void main(String[] args) throws Exception {
        IEmployee CEO = new Leaf("Rahul Verma", "CEO");
        IEmployee productionManager = new Leaf("Pritik Kale", "Production Manager");
        IEmployee salesManager = new Leaf("Vivek Gandhi", "Sales Manager");

        IEmployee productionExecutive1 = new Leaf("Rahul Singh", "Production Executive");
        IEmployee productionExecutive2 = new Leaf("Samiksha Shukla", "Production Executive");
        IEmployee clerk = new Leaf("Avinash Prabhu", "Clerk");


        IEmployee salesExecutive1 = new Leaf("Vaneet Mishra", "Sales Executive");
        IEmployee salesExecutive2 = new Leaf("Sudeep Bora", "Sales Executive");
        IEmployee clerk1 = new Leaf("Ravikant Chaturvedi", "Clerk");

        Composite productionDepartment = new Composite();
        productionDepartment.addEmployee(productionManager);
        productionDepartment.addEmployee(productionExecutive1);
        productionDepartment.addEmployee(productionExecutive2);
        productionDepartment.addEmployee(clerk);

        Composite salesDepartment = new Composite();
        salesDepartment.addEmployee(salesManager);
        salesDepartment.addEmployee(salesExecutive1);
        salesDepartment.addEmployee(salesExecutive2);
        salesDepartment.addEmployee(clerk1);

        Composite company = new Composite();
        company.addEmployee(CEO);
        company.addEmployee(productionDepartment);
        company.addEmployee(salesDepartment);

        company.showEmployeeDetails();

    }
}
