import java.util.InputMismatchException;
import java.util.Scanner;  // Import the Scanner class

public class Calculator {

    public static void main(String[] args) {

        int num1;
        int num2;
        String operator;


        Scanner input = new Scanner(System.in);

        try {
            System.out.println("please enter the first number");
            num1 = input.nextInt();
            System.out.println("please enter the second number");
            num2 = input.nextInt();

        System.out.println("Please enter operation");
        operator = input.next();

        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                try {
                    System.out.println(num1 / num2);
                }
                catch (ArithmeticException e) {
                    System.out.println("cant divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /");
            }
        }
        catch(InputMismatchException e) {
            System.out.println("please enter a number");
            Calculator.main(null);
        }
    }
}
