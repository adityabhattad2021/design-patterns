public class TextArea {
    
    private String text;

    public void set(String text){
        this.text = text;
    }

    public Memento takeSanpShot(){
        return new Memento(this.text);
    }

    public void restore(Memento memento){
        this.text = memento.getSavedText();
    }

    public void showText(){
        System.out.println(this.text);
    }

    public static class Memento{

        private final String text;

        private Memento(String textToSave){
            text=textToSave;
        }

        public String getSavedText(){
            return text;
        }

    }


}
