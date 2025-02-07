package partA.ex01;

import java.util.Scanner;

public class SquareRootWhile {
    public static String squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number;
        while (true) {
            number = scanner.nextDouble();
            if (number >= 0) {
                break;
            }
            System.out.println("Invalid input. Please enter a non-negative number.");

        }
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);
        scanner.close();
        return "";
    }


    public static void main(String args[]) {
        String outputSquareRoot = squareRoot();
        System.out.println(outputSquareRoot);

    }
}
