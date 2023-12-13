public class App {
    public static void main(String[] args) throws Exception {
        Coordinates coordinates = new Coordinates(0, 0, "N");
        System.out.println("Initial position: " + coordinates.x + ", " + coordinates.y + ", " + coordinates.currentDirection);

        IExpression moveExpression = new MoveExpression(5);
        coordinates = moveExpression.interpret(coordinates);
        System.out.println("After move: " + coordinates.x + ", " + coordinates.y + ", " + coordinates.currentDirection);
        IExpression turnExpression = new TurnExpression("RIGHT");
        coordinates = turnExpression.interpret(coordinates);
        System.out.println("After turn: " + coordinates.x + ", " + coordinates.y + ", " + coordinates.currentDirection);
        IExpression moveExpression2 = new MoveExpression(2);
        coordinates = moveExpression2.interpret(coordinates);
        System.out.println("After move: " + coordinates.x + ", " + coordinates.y + ", " + coordinates.currentDirection);
    }
}
