package Assignments;

import java.awt.*;

public class Husky extends Critter {
    private final TurnCounter counter = new TurnCounter(4, 4, true);
    private static final Color[] huskyColor = {Color.GRAY, Color.BLACK, Color.DARK_GRAY, Color.LIGHT_GRAY};
    @Override
    public Action getMove(CritterInfo info) {
        counter.countTurn();
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.leftThreat()) {
            return Action.LEFT;
        } else if (info.rightThreat()) {
            return Action.RIGHT;
        } else if (info.getFront() == Neighbor.WALL) {
            return Action.LEFT;
        } return Action.HOP;
        // infect if enemy in front and same is to left right or back
        // if touching same in any direction turn right
        // if wall then turn right
        // hop forward
    }

    @Override
    public Color getColor() {
        int i = counter.getChoice();
        return huskyColor[i];
        // pick 4 popular colors for huskies and randomize a color on creation
    }

    @Override
    public String toString() {
        return "DOG";
    }
}
