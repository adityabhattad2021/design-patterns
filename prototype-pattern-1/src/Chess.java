public class Chess extends Prototype {

    private String name;
    private int x;
    private int y;

    public Chess(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public Chess clone() {
        try {
            return new Chess(name, x, y);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "Chess: " + name + " (" + x + ", " + y + ")";
    }
    
}
