package partA.ex01;

import java.util.Scanner;

public class SquareRootWhile {
    public static String squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double x = scanner.nextDouble();
        while (x <= 0) {
            System.out.println("Input a number more than 0");
            x = scanner.nextDouble();
            if (x >=0){
               x= Math.sqrt(x);
            }
        }
        return String.valueOf(x);
    }

    public static void main(String args[]) {
        String outputSquareRoot = squareRoot();
        System.out.println(outputSquareRoot);

    }
}
