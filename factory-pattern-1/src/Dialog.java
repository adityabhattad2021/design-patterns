public abstract class Dialog {
    
    public abstract Button createButton();

    public void render(){
        Button okButton = createButton();
        okButton.click();
        okButton.render();
    }

}
