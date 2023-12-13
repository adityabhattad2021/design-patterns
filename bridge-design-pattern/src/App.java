public class App {
    public static void main(String[] args) throws Exception {
        Restaurent restaurent = new AmericanRestaurent(new PepperoniPizza());
        restaurent.deliverPizza();
        restaurent = new ItalianRestaurent(new PepperoniPizza());
        restaurent.deliverPizza();
    }
}
