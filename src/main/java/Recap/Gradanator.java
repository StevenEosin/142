package Recap;

import java.util.Scanner;

public class Gradanator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        intro();
        double midtermScore = midtermData(console);
        double finalScore = finalData(console);
        double homeworkScore = homeworkData(console);

    }

    private static double homeworkData(Scanner console) {
        System.out.println("Weight (0 - 100)?");
        double weight = console.nextDouble();

        System.out.println("Number of assignments?");
        int assignments = console.nextInt();

        for (int i = 1; i < assignments; i++);



    }

    private static double finalData(Scanner console) {
        System.out.println("Weight (0 - 100)?");
        double weight = console.nextDouble();

        System.out.println("Score earned?");
        double score = console.nextDouble();

        System.out.println("Were scores shifted (1 = yes, 2 = no)?");
        double shiftScore = 0;
        int shift = console.nextInt();
        if (shift == 1) {
            System.out.println("Shift amount?");
            shiftScore = console.nextDouble();
        }
        double totalScore = score + shiftScore;
        if (totalScore > 100) {
            System.out.println("Total points = 100/100");
        } else {
            System.out.println("Total points = totalScore");
        }
        double weightedScore = (totalScore / 100) * weight;
        System.out.println("Weighted score = ((totalScore / 100) * weight) / weight");
        return weightedScore;
    }

    private static double midtermData(Scanner console) {
        System.out.println("Weight (0 - 100)?");
        double weight = console.nextDouble();

        System.out.println("Score earned?");
        double score = console.nextDouble();

        System.out.println("Were scores shifted (1 = yes, 2 = no)?");
        double shiftScore = 0;
        int shift = console.nextInt();
        if (shift == 1) {
            System.out.println("Shift amount?");
            shiftScore = console.nextDouble();
        }
        double totalScore = score + shiftScore;
        if (totalScore > 100) {
            System.out.println("Total points = 100/100");
        } else {
            System.out.println("Total points = totalScore");
        }
        double weightedScore = (totalScore / 100) * weight;
        System.out.println("Weighted score = ((totalScore / 100) * weight) / weight");
        return weightedScore;
    }

    private static void intro() {
        System.out.println("This program reads exam/homework scores");
        System.out.println("and reports your overall course grade.");
    }


}
