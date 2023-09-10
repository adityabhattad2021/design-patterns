public abstract class CoffeeFactory {

    public abstract Coffee createCoffee();

    public void serve(){
        Coffee coffee = createCoffee();
        coffee.displayName();
        coffee.displayIngredients();
    }

}
