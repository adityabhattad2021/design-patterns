public class PepperoniPizza extends Pizza {
    @Override
    public void assemble() {
        System.out.println("Assembling Pepproni Pizza...");
        System.out.println("Adding Sause "+this.sause+
        ".");
        System.out.println("Adding Toppings "+this.toppings+
        ".");
        System.out.println("Adding Crust "+this.crust+
        ".");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Checking Pepproni Pizza");
    }
}