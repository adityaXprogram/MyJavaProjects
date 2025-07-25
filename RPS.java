import java.util.Scanner;
import java.util.Random;
public class RPS{//RPC stands for Rock Paper Scissor
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        Random ran = new Random();
        int randomInt = ran.nextInt(3);
        //instruction and user Input
        System.out.println("Enter 0 for rock.");
        System.out.println("Enter 1 for paper.");
        System.out.println("Enter 2 for scissor.");
        System.out.print("Enter number between 0 and 2: ");
        int userInput = io.nextInt();
        //checking choice
        if(userInput<0 || userInput>2) {
            System.out.println("Invalid choice!");
            return;
        }
        //game logic
        if(userInput == randomInt){
            System.out.println("It's a draw!");
        } else if ((userInput == 0 && randomInt == 2)||
                   (userInput == 2 && randomInt == 1)||
                   (userInput == 1 && randomInt == 0 )){
            System.out.println("You won!");
        } else{
            System.out.println("You lose!");
        }
    }
}

