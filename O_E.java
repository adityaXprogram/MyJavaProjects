import java.util.Scanner;
public class O_E {
    void oddEven(int num) {
        if(num % 2 == 0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }

    void n_p(int num){
        if(num > 0){
            System.out.println(num + " Positive number");
        } else if (num < 0) {
            System.out.println(num + " Negative number");
        }
        else{
            System.out.println("The number is zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        O_E lo = new O_E();
        lo.oddEven(num);
        lo.n_p(num);
        sc.close();
    }
}