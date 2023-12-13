public class ItalianRestaurent extends Restaurent {
    
    public ItalianRestaurent(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSause() {
        pizza.setSause("Pesto");
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
