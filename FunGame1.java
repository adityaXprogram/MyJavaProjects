import java.util.Scanner;
public class FunGame1 {
    Scanner io = new Scanner(System.in);

    void guessGame(){

        byte winNumber = 73;
        System.out.println("[Enter number between 1 to 100]");
        System.out.print("Enter number: ");
        byte guessNumber = io.nextByte();

        //Conditional Statement

        if(guessNumber == winNumber){
            System.out.println("You nailed it! You're a genius.");
        } else if(guessNumber < winNumber){
            System.out.println("\uD83D\uDCC9 Too low! Try aiming higher.");
        } else {
            System.out.println("\uD83D\uDCC8 Too high! Try aiming lower.");
        }

    }

    public static void main(String[] args) {
        FunGame1 g1 = new FunGame1();
        g1.guessGame();
    }

}
