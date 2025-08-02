import java.util.Scanner;
public class Mr_TicketBuddy {
    Scanner io = new Scanner(System.in);
    byte choice;
    int ticket;
    int total;
    int paymentOption;
    String email;
    void SelectingMovie(){
        System.out.println("Hii! I am Mr.TicketBuddy.");
        System.out.println("1 – Avengers: Endgame – ₹120\n2 – Joker – ₹100\n3 – Toy Story – ₹80\n4 – Inception – ₹150");
        System.out.print("Enter your movie choice (1–4): ");
        choice = io.nextByte();
        if (choice < 1 || choice > 4) {
            System.out.println("Please! Enter your movie choice between 1 and 4.");
            System.exit(0);
        }
    }
    void QuantityOfTicket(){
        System.out.print("How many ticket you want?: ");
        ticket = io.nextInt();
        if(ticket<=0 || ticket>5){
            System.out.println("You can buy a maximum of 5 tickets. Need more? Please contact the manager.");
            System.exit(0);
        }
    }

    void PriceCalculation(){
        switch(choice){
            case 1 ->{
                System.out.println("You choose Avengers: Endgame – ₹120");
                System.out.println("You want "+ticket+" ticket");
                total = 120 * ticket;
                System.out.println("Total cost: ₹"+total);
            }
            case 2 ->{
                System.out.println("You choose Joker – ₹100");
                System.out.println("You want "+ticket+" ticket");
                total = 100 * ticket;
                System.out.println("Total cost: ₹"+total);
            }
            case 3 ->{
                System.out.println("You choose Toy Story – ₹80");
                System.out.println("You want "+ticket+" ticket");
                total = 80 * ticket;
                System.out.println("Total cost: ₹"+total);
            }
            case 4 ->{
                System.out.println("You choose Inception – ₹150");
                System.out.println("You want "+ticket+" ticket");
                total = 150 * ticket;
                System.out.println("Total cost: ₹"+total);
            }
            default -> System.out.println("Please! Enter your movie choice between 1 and 4.");
        }
    }
    void Payment(){
        System.out.println("1 - Offline Payment");
        System.out.println("2 - Online Payment");
        System.out.print("Payment option: ");
        paymentOption = io.nextInt();
        if(paymentOption<1 || paymentOption>2){
            System.out.println("Invalid choice!");
            System.exit(0);
        } else if(paymentOption==1){
            System.out.println("You have chosen offline payment.\nPlease pay at the cinema hall and present your receipt to the staff before making the payment.");
            System.out.println("Enter email to get receipt.");
            io.nextLine();
            System.out.print("Email: ");
            email = io.nextLine();
            System.out.print("Receipt has been sent to your email.\nThank you for booking your ticket with Mr.TicketBuddy.");
        } else{
            System.out.print("Sorry! Online payment is not available now.");
        }
    }

    public static void main(String[] args) {
        Mr_TicketBuddy tb = new Mr_TicketBuddy();
        tb.SelectingMovie();
        tb.QuantityOfTicket();
        tb.PriceCalculation();
        tb.Payment();
    }
}
