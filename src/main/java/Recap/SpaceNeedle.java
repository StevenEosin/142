package Recap;

public class SpaceNeedle {
    private static final int SIZE = 8;

    public static void main(String[] args) {
        bodyNeedle();
        spaceTopUpperHalf();
        needleRim();
        spaceTopLowerHalf();
        bodyNeedle();
        bodySpaceNeedle();
        spaceTopUpperHalf();
        needleRim();
    }

    private static void bodySpaceNeedle() {
        for (int i = 0; i < SIZE * SIZE; i++) {
            for (int j = 0; j <= SIZE * 2; j++) {
                System.out.print(" ");
            } System.out.print("|");
            for (int k = 0; k < SIZE / 2; k++) {
                System.out.print("%");
            } System.out.print("|");
            for (int l = 1; l < SIZE / 4; l++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int k = 0; k < SIZE / 2; k++) {
                System.out.print("%");
            } System.out.println("|");
        }
    }

    private static void spaceTopLowerHalf() {
        for (int i = 0; i < SIZE; i++) {
            for (int k = 0; k < i * 2; k++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for (int j = 1; j < SIZE * 3 - (i * 2); j++) {
                System.out.print("/\\");
            } System.out.println("_/");
        }
    }

    private static void needleRim() {
        System.out.print("|");
        for (int i = 0; i < SIZE * 6; i++) {
            System.out.print("\"");
        } System.out.println("|");
    }


    private static void spaceTopUpperHalf() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <= SIZE * 2 - (i * 3); j++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int l = 0; l < (SIZE * i) - i; l++) {
                System.out.print(":");
            }
            System.out.print("|");
            for (int k = 1; k < SIZE / 4; k++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int n = 0; n < (SIZE * i) -i; n++) {
                System.out.print(":");
            }
            System.out.println("\\__ ");
        }
    }

    private static void bodyNeedle() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE * 3; j++) {
                System.out.print(" ");
            } System.out.print("|");
            for (int k = 1; k < SIZE / 4; k++) {
                System.out.print(" ");
            } System.out.println("|");
        }
    }

}
