import java.util.Scanner;
public class SimpleATM {
    Scanner io = new Scanner(System.in);
    int currentBalance = 1000;
    final String pin = "@123";

    void ATM_Sim(){
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║     WELCOME TO Aditya's ATM     ║");
        System.out.println("╚═════════════════════════════════╝");
        //getting pin
        System.out.print("Enter your pin: ");
        String password = io.nextLine();

        //conditioning
        if(password.equals(pin)){
            //Giving instruction and taking input
        System.out.println("Click 1 to check balance");
        System.out.println("Click 2 to withdraw money");
        System.out.println("Click 3 to deposit money");
        System.out.println("Click 4 to exit");
        System.out.print("Enter your choice: ");
            byte choice = io.nextByte();

            if(choice==1){
                System.out.println("Your current balance is: "+currentBalance);
            } else if(choice==2){
                System.out.print("Enter amount to withdraw: ");
                int withdraw = io.nextInt();
                if(withdraw>currentBalance){
                    System.out.println("Insufficient balance!");
                } else{
                    currentBalance = currentBalance - withdraw;
                    System.out.println("Your current balance after withdraw: "+currentBalance);
                }
            } else if(choice==3){
                System.out.print("Enter amount to deposit: ");
                int deposit = io.nextInt();
                currentBalance = currentBalance + deposit;
                System.out.println("Your current balance after deposit: "+currentBalance);
            } else if(choice==4) {
                System.exit(0);
            } else{
                System.out.println("Invalid choice");
            }
        }
        else{
            System.out.println("Invalid pin");

        }

    }

    public static void main(String[] args) {
        SimpleATM cr7 = new SimpleATM();
        cr7.ATM_Sim();
    }

}
