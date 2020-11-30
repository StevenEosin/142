package Assignments;

import java.util.Random;

public class TurnCounter {
    private final int turnsPerChoice;
    private final int numberOfChoices;
    private int turn;
    private int choice;
    private final boolean random;

    public TurnCounter(int turnsPerChoice, int numberOfChoices) {
        this.turnsPerChoice = turnsPerChoice;
        this.numberOfChoices = numberOfChoices;
        random = false;
    }
    public TurnCounter(int turnsPerChoice, int numberOfChoices, boolean random) {
        this.turnsPerChoice = turnsPerChoice;
        this.numberOfChoices = numberOfChoices;
        this.random = random;
        if (random) {
            choice = (int) (Math.random() * numberOfChoices);
        }
    }

    public void countTurn() {
        turn++;
        if (turn == turnsPerChoice) {
            turn = 0;
            if (random) {
                choice = (int) (Math.random() * numberOfChoices);
            } else {
                choice++;
                if (choice == numberOfChoices) {
                    choice = 0;
                }
            }
        }
    }

    public int getChoice() {
        return choice;
    }
}
