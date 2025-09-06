import java.util.Scanner;
public class Calculator_V1{
    float num1;
    char operators;
    float num2;
    float result;
    void collectUserData(){
        Scanner io = new Scanner(System.in);
        System.out.println("Welcome! to Mr.Calcu");
        System.out.print("Enter first number: ");
        num1 = io.nextFloat();
        System.out.print("Enter a operator: '+' '-' '*' '/': ");
        operators = io.next().charAt(0);
        System.out.print("Enter second number: ");
        num2 = io.nextFloat();
    }

    void performCalculation(){
        switch(operators){
            case '+' ->{
                result = num1 + num2;
                System.out.print(result);
            }
            case '-' ->{
                result = num1 - num2;
                System.out.print(result);
            }
            case '*','x','X' ->{
                result = num1 * num2;
                System.out.print(result);
            }
            case '/' ->{
                if (num2==0){
                    System.out.print("Denominator cannot be zero.");
                }
                else {
                    result = num1 / num2;
                    System.out.print(result);
                }
            }
            default -> System.out.print("Invalid operator!");
        }
    }
    public static void main(String[] args) {
        Calculator_V1 mr_calcu = new Calculator_V1();
        mr_calcu.collectUserData();
        mr_calcu.performCalculation();
    }
}
