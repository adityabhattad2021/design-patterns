public class MacFactory implements GUIFactory {

    @Override
    public Button createButton(){
        System.out.println("Created button for macbook GUI");
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox(){
        System.out.println("Created checkbox for macbook GUI");
        return new MacCheckBox();
    }
    
}
