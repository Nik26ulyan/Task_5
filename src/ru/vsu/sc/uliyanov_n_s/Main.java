package ru.vsu.sc.uliyanov_n_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printFirstPhrase();

        int s = readSizeOfFigure("Size: ");

        drawFigure(s);
    }

    static void printFirstPhrase() {
        System.out.println("Enter the size of the figure with an odd number that is greater than or equal to five.");
    }

    static int readSizeOfFigure(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        int s;

        if (scanner.hasNextInt()) {
            s = scanner.nextInt();
            if (s < 5 || s % 2 == 0) {
                System.out.println("Invalid value! Number can't be even adn less than five. Try again.");
                return readSizeOfFigure(text);
            }
        } else {
            System.out.println("Invalid value! You need to enter a INTEGER NUMBER. Try again.");
            return readSizeOfFigure(text);
        }

        return s;
    }

    static void drawFigure(int s) {
        int tmp = (s - 1) / 2;

        drawBorderLine(s);

        for (int i = 0; i < tmp; i++) {
            System.out.print("|");

            drawUpperPartOfFigure(i, tmp);

            System.out.print("|");
            System.out.println();
        }

        drawMiddleLineOfFigure(s);

        for (int i = 0; i < tmp; i++) {
            System.out.print("|");

            drawLowerPartOfFigure(i, tmp);

            System.out.print("|");
            System.out.println();
        }

        drawBorderLine(s);
    }

    static void drawBorderLine(int s) {
        System.out.print("+");

        for (int i = 0; i < s; i++) {
            System.out.print("-");
        }

        System.out.print("+");
        System.out.println();
    }

    static void drawUpperPartOfFigure(int i, int tmp) {
        for (int j = tmp - i; j < tmp; j++) {
            System.out.print(" ");
        }

        System.out.print("*");

        for (int k = tmp - i; k > 1; k--) {
            System.out.print(" ");
        }

        System.out.print("*");

        for (int k = tmp - i; k > 1; k--) {
            System.out.print(" ");
        }

        System.out.print("*");

        for (int k = tmp - i; k < tmp; k++) {
            System.out.print(" ");
        }
    }

    static void drawMiddleLineOfFigure(int s) {
        System.out.print("|");

        for (int i = 0; i < s; i++) {
            System.out.print("*");
        }

        System.out.print("|");
        System.out.println();
    }

    static void drawLowerPartOfFigure(int i, int tmp) {
        for (int k = tmp - i; k > 1; k--) {
            System.out.print(" ");
        }

        System.out.print("*");

        for (int k = tmp - i; k < tmp; k++) {
            System.out.print(" ");
        }

        System.out.print("*");

        for (int j = tmp - i; j < tmp; j++) {
            System.out.print(" ");
        }

        System.out.print("*");

        for (int k = tmp - i; k > 1; k--) {
            System.out.print(" ");
        }
    }
}
