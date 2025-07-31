import java.util.Scanner;
public class VendingBuddy {
    Scanner io = new Scanner(System.in);
    int choice;
    int quantity;
    int totalAmount;

    void DrinkMenu() {
        System.out.println("Enter 1 for Coca-Cola – ₹25");
        System.out.println("Enter 2 for Pepsi – ₹25");
        System.out.println("Enter 3 for Champa – ₹20");
        System.out.println("Enter 4 for Fanta – ₹20");
        System.out.println("Enter 5 for Mountain Dew – ₹30");
    }

    void Choice() {
        System.out.print("Enter your choice: ");
        choice = io.nextInt();
        if (choice != 0) {
            switch (choice) {
                case 1 -> {
                    System.out.println("You choose Coca-Cola – ₹25");
                }
                case 2 -> {
                    System.out.println("You choose Pepsi – ₹25");
                }
                case 3 -> {
                    System.out.println("You choose Champa – ₹20");
                }
                case 4 -> {
                    System.out.println("You choose Fanta – ₹20");
                }
                case 5 -> {
                    System.out.println("You choose Mountain Dew – ₹30");
                }
                default -> System.out.println("Choose correct option.");
            }
        } else {
            System.out.println("Please! Choose between 1 and 5.");
        }
    }

    void PriceCalculation() {
        switch (choice) {
            case 1 -> {
                //taking quantity
                System.out.print("Quantity of Coca-Cola: ");
                quantity = io.nextInt();
                //Calculating
                if (quantity <= 20) {
                    totalAmount = 25 * quantity;
                    System.out.println("Total: " + totalAmount);
                } else {
                    System.out.println("Sorry, I don’t have that much stock available.");
                }
            }
            case 2 -> {
                //taking quantity
                System.out.print("Quantity of Pepsi: ");
                quantity = io.nextInt();
                //Calculating
                if (quantity <= 20) {
                    totalAmount = 25 * quantity;
                    System.out.println("Total: " + totalAmount);
                } else {
                    System.out.println("Sorry, I don’t have that much stock available.");
                }
            }
            case 3 -> {
                //taking quantity
                System.out.print("Quantity of Champa: ");
                quantity = io.nextInt();
                //Calculating
                if (quantity <= 20) {
                    totalAmount = 20 * quantity;
                    System.out.println("Total: " + totalAmount);
                } else {
                    System.out.println("Sorry, I don’t have that much stock available.");
                }
            }
            case 4 -> {
                //taking quantity
                System.out.print("Quantity of Fanta: ");
                quantity = io.nextInt();
                //Calculating
                if (quantity <= 20) {
                    totalAmount = 20 * quantity;
                    System.out.println("Total: " + totalAmount);
                } else {
                    System.out.println("Sorry, I don’t have that much stock available.");
                }
            }
            case 5 -> {
                //taking quantity
                System.out.print("Quantity of Mountain Dew: ");
                quantity = io.nextInt();
                //Calculating
                if (quantity <= 20) {
                    totalAmount = 30 * quantity;
                    System.out.println("Total: " + totalAmount);
                } else {
                    System.out.println("Sorry, I don’t have that much stock available.");
                }
            }
            default ->
                    System.out.println("Please provide the quantity so that I can calculate the cost.\uD83D\uDE0A");
        }
    }
    void MethodOfPayment(){
        System.out.println("Click 1 for offline payment.");
        System.out.println("Click 2 for online payment.");
        byte MOP = io.nextByte();
        if(MOP==1){
            System.out.print("Insert coins in the slot to proceed!\nThank You");
        } else if(MOP==2){
            System.out.print("Sorry, online payment option is currently not available.\nThank You");
        } else{
            System.out.print("Please! Choose correct option.\nThank You");
        }
    }

    public static void main(String[] args) {
        VendingBuddy vendMachine = new VendingBuddy();
        vendMachine.DrinkMenu();
        vendMachine.Choice();
        vendMachine.PriceCalculation();
        vendMachine.MethodOfPayment();
    }
}
