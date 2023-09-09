public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        System.out.println("Created button for windows GUI");
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        System.out.println("Created checkbox for windows GUI");
        return new WindowsCheckbox();
    }

}
