public class TurnExpression implements IExpression{
    
    public String direction;

    public TurnExpression(String direction) {
        this.direction = direction;
    }


    public Coordinates interpret(Coordinates coordinates){
        if(coordinates.currentDirection.equals("N") && direction.equalsIgnoreCase("RIGHT")){
            coordinates.currentDirection = "E";
        }else if(coordinates.currentDirection.equals("N") && direction.equalsIgnoreCase("LEFT")){
            coordinates.currentDirection = "W";
        }else if(coordinates.currentDirection.equals("S") && direction.equalsIgnoreCase("RIGHT")){
            coordinates.currentDirection = "W";
        }else if(coordinates.currentDirection.equals("S") && direction.equalsIgnoreCase("LEFT")){
            coordinates.currentDirection = "E";
        }else if(coordinates.currentDirection.equals("E") && direction.equalsIgnoreCase("RIGHT")){
            coordinates.currentDirection = "S";
        }else if(coordinates.currentDirection.equals("E") && direction.equalsIgnoreCase("LEFT")){
            coordinates.currentDirection = "N";
        }else if(coordinates.currentDirection.equals("W") && direction.equalsIgnoreCase("RIGHT")){
            coordinates.currentDirection = "N";
        }else if(coordinates.currentDirection.equals("W") && direction.equalsIgnoreCase("LEFT")){
            coordinates.currentDirection = "S";
        }
        return coordinates;
    }


}
