import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your operation: ");
        int value=scan.nextInt();
        System.out.print("Enter your first number: ");
        double a=scan.nextInt();
        System.out.print("Enter your second number: ");
        double b=scan.nextInt();
        switch (value){

            case 1:
                double sum = a + b;
                System.out.println("Addition of first and second number is "+ sum);
                break;

            case 2:
                double sub = a - b;
                System.out.println("Subtraction of first and second number is "+ sub);
                break;

            case 3:
                double mul = a * b;
                System.out.println("Multiplication of first and second number is "+ mul);
                break;

            case 4:
                try {
                    double div = a / b;
                    System.out.println("Division of first and second number is "+ div);
                }
                catch (ArithmeticException  e) {
                    System.out.println("Exception: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("This calculator can perform only ( + - * / ) operations");
        }

    }
}