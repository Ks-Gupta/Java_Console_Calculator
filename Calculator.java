package Java_Console_Calculator;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            // Enter Numbers
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            // Select the operator
            System.out.print("Enter operation: ");
            String operation = input.next();

            switch (operation) {
                    case "+":
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case "-":
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case "*":
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("Cannot divide by zero");
                        } else {
                            System.out.println("Result: " + (num1 / num2));
                        }
                        break;
                    default:
                        System.out.println("Invalid operation");
            }
        }
    }
}
