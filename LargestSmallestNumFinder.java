import java.util.Scanner;
public class LargestSmallestNumFinder {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = io.nextInt();
        System.out.print("Enter second number: ");
        int num2 = io.nextInt();
        io.close();
        //conditional statement
        if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        } else if (num1==num2) {
            System.out.println("Both number are equal");
        } else{
            System.out.println(num2+" is greater than "+num1);
        }
        System.out.println("Happy Java-ing! 👨‍💻👩‍💻");
    }
}
