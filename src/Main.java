import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Please pick an option to perform on two numbers: ");
            System.out.println("1] Add");
            System.out.println("2] Subtract");
            System.out.println("3] Divide");
            System.out.println("4] Multiply");
            System.out.println("0] Exit");
            System.out.println("Decimals will be ignored and will assume the first digit");
            double operation = sc.nextDouble();
            operation = Math.floor(operation);

            if (operation == 1.0) {
                double input1 = input();
                double input2 = input();

                System.out.println();
                System.out.println("Answer: " + add(input1, input2));
                System.out.println();
                System.out.println();

            } else if (operation == 2.0) {
                double input1 = input();
                double input2 = input();

                System.out.println();
                System.out.println("Answer: " + subtract(input1, input2));
                System.out.println();
                System.out.println();

            } else if (operation == 3.0) {
                double input1 = input();
                double input2 = input();

                if (input2 == 0) {
                    System.out.println();
                    System.out.println("Anything divided by 0 is undefined");
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("Answer: " + divide(input1, input2));
                    System.out.println();
                    System.out.println();
                }

            } else if (operation == 4.0) {
                double input1 = input();
                double input2 = input();

                System.out.println();
                System.out.println("Answer: " + multiply(input1, input2));
                System.out.println();
                System.out.println();

            } else if (operation == 0) {
                running = false;

            } else {
                continue;
            }
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double output = sc.nextDouble();
        return output;
    }
}
