public class RandomRobot {
    private Position position;
    private Position previousPosition;
    private Maze maze;

    public RandomRobot(Maze){

    }

    public void move(){

    }
    public Position getPosition(){
        int x = position.getX();
        int y = position.getY();
        return new Position(x, y);
    }

    private void setPosition(Position){


    }

    public boolean hasReachedGoal(){

    }
}
