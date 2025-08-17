import java.util.Scanner;
import java.util.Random;
public class FunGame1 {
    Scanner io = new Scanner(System.in);
    Random ran = new Random();

    void guessGame(){
        int winNumber = ran.nextInt(5) + 1;
        System.out.println("[Enter number between 1 to 5]");
        System.out.print("Enter number: ");
        byte guessNumber = io.nextByte();
        //verification
        if((guessNumber<1) || (guessNumber>5)){
            System.out.println("Invalid input! Please enter a number between 1 and 5.");
        }
        //game logic
        if(guessNumber == winNumber){
            System.out.println("You nailed it! You're a genius.");
        } else if(guessNumber < winNumber){
            System.out.println("Too low! Try aiming higher.");
        } else {
            System.out.println("Too high! Try aiming lower.");
        }

    }

    public static void main(String[] args) {
        FunGame1 g1 = new FunGame1();
        g1.guessGame();
    }

}
