public class Director {
    private static LatteeFactory lf = new LatteeFactory();
    private static CappuccinoFactory cf = new CappuccinoFactory();
    private static EspressoFactory ef = new EspressoFactory();

    public static Coffee getCoffee(String type) throws Exception {
        if (type.equalsIgnoreCase("lattee")) {
            return lf.createCoffee();
        } else if (type.equalsIgnoreCase("cappuccino")) {
            return cf.createCoffee();
        } else if (type.equalsIgnoreCase("espresso")) {
            return ef.createCoffee();
        } else {
            throw new Exception("Invalid type");
        }
    }

}
