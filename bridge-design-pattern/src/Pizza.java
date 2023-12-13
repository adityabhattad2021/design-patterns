public abstract class Pizza {

    protected String sause;
    protected String toppings;
    protected String crust;

    public void setSause(String sause) {
        this.sause = sause;
    }
    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
    public void setCrust(String crust) {
        this.crust = crust;
    }
    public abstract void assemble();
    public abstract void qualityCheck();

    final public String toString(){
        return "Pizza:\n\tSause: "+this.sause+"\n\tToppings: "+this.toppings+"\n\tCrust: "+this.crust;
    }  

}
