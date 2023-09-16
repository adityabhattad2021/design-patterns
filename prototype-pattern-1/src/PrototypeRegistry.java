public class PrototypeRegistry {
    
    Prototype[] prototypes = new Prototype[10];

    public void addPrototype(Prototype prototype) {
        prototypes[prototype.getId()] = prototype;
    }

}
