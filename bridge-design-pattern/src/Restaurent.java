public abstract class Restaurent {
    protected Pizza pizza;

    protected Restaurent(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSause();
    abstract void addToppings();
    abstract void addCrust();

    public void deliverPizza(){
        addCrust();
        addSause();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println(pizza);
        System.out.println("has been delivered.");
    }
}
