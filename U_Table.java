import java.util.Scanner;

public class U_Table {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = io.nextInt();

        System.out.println("The table of " + num1);
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            int result = num1 * i;
            System.out.println(num1 + " x " + i + " = " + result);
        }

        io.close();
    }
}

