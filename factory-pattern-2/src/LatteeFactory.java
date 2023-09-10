public class LatteeFactory extends CoffeeFactory {

    public Coffee createCoffee(){
        return new Lattee();
    }

}
