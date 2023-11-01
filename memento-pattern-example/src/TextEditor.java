import java.util.Stack;


public class TextEditor {

    private Stack<TextArea.Memento> stack;
    private TextArea textArea;

    public TextEditor(){
        stack = new Stack<>();
        textArea = new TextArea();
    }

    public void write(String text){
        textArea.set(text);
        stack.push(textArea.takeSanpShot());
    }

    public void undo(){
        stack.pop();
        textArea.restore(stack.peek());
    }

    public void showText(){
        textArea.showText();
    }

    
}
