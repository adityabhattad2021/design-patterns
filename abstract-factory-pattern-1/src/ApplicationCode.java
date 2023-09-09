public class ApplicationCode {
    private GUIFactory creatorFactory;
    private Button button;
    private Checkbox checkbox;

    public ApplicationCode(GUIFactory creatorFactory){
        this.creatorFactory=creatorFactory;
        createUI();
    }

    public  void createUI(){
        this.button=this.creatorFactory.createButton();
        this.checkbox=this.creatorFactory.createCheckbox();
    }

    public void paint(){
        this.button.paint();
    }

    public void click(){
        this.checkbox.click();
    }
}
