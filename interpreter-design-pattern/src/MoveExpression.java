public class MoveExpression implements IExpression {
    
    private int distance;
    
    public MoveExpression(int distance) {
        this.distance = distance;
    }

    @Override
    public Coordinates interpret(Coordinates coordinates) {
        if (coordinates.currentDirection.equals("N")) {
            coordinates.y += distance;
        } else if (coordinates.currentDirection.equals("S")) {
            coordinates.y -= distance;
        } else if (coordinates.currentDirection.equals("E")) {
            coordinates.x += distance;
        } else if (coordinates.currentDirection.equals("W")) {
            coordinates.x -= distance;
        }
        return coordinates;
    }
}
