import java.util.Scanner;
public class Calculator {

    void calculation() {
        Scanner io = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter first number: ");
        double num1 = io.nextDouble();
        System.out.println("Enter an operator '+' '-' 'x/*' '/'");
        System.out.print("Operator: ");
        char operator = io.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = io.nextDouble();
        double result;
        //switch
        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println("Result: "+result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println("Result: "+result);
            }
            case 'x', '*' -> {
                result = num1 * num2;
                System.out.println("Result: "+result);
            }
            case '/' -> {
                if(num2!=0){
                    result = num1 / num2;
                    System.out.println("Result: "+result);
                } else{
                    System.out.println("Error: Division by zero!");
                }
            }
            default -> System.out.println("Invalid operator!");
        }
        io.close();
    }

    public static void main(String[] args) {
            Calculator call = new Calculator();
            call.calculation();
    }
    
}
