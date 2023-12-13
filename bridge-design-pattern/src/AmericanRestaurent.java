public class AmericanRestaurent extends Restaurent {
    
    public AmericanRestaurent(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSause() {
        pizza.setSause("Tomato");
    }

    @Override
    void addToppings() {
        pizza.setToppings("Olives");
    }

    @Override
    void addCrust() {
        pizza.setCrust("Thin");
    }

}
