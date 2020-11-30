package Assignments;

import java.awt.*;

public class Lion extends Critter {
    private final TurnCounter counter = new TurnCounter(3, 3, true);
    private static final Color[] lionColor = {Color.RED, Color.GREEN, Color.BLUE};
@Override
    public Action getMove(CritterInfo info) {
    counter.countTurn();
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        }
        return Action.HOP;
    }

    public Color getColor() {
        int i = counter.getChoice();
        return lionColor[i];
    }

    public String toString() {
        return "L";
    }
}
