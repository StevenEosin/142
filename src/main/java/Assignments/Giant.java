package Assignments;

import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class Giant extends Critter{
    private final TurnCounter counter = new TurnCounter(6, 4);
    private static final String[] giantCry = {"fee", "fie", "foe", "fum"};
    @Override
    public Action getMove(CritterInfo info) {
        counter.countTurn();
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }

    @Override
    public String toString() {
        int i = counter.getChoice();
        return giantCry[i];
    }
}
