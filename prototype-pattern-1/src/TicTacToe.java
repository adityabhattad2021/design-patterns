
public class TicTacToe extends Prototype {

    private String name;
    private int x;
    private int y;

    public TicTacToe(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public Object clone() {
        try {
            return new TicTacToe(name, x, y);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "TicTacToe: " + name + " (" + x + ", " + y + ")";
    }
    
}
