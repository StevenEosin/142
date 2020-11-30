package Assignments;

import java.awt.*;

public class Bear extends Critter {
    private final TurnCounter counter = new TurnCounter(1, 2);
    private final boolean polar;

    public Bear(boolean polar) {
        this.polar = polar;
    }

    /**
     * otherwise hop if possible - if nothing in front
     * always infect if an enemy is in front - must be enemy
     * otherwise turn left - if facing wall or same critter
     */
    @Override
    public Action getMove(CritterInfo info) {
        counter.countTurn();
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }

    @Override
    public Color getColor() {
        if (polar) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    @Override
    public String toString() {
        int i = counter.getChoice();
        if (i == 0) {
            return "/";
        } else {
            return "\\";
        }
    }
}
