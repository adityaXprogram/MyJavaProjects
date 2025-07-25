import java.util.Scanner;

class Mod_SI {
    int principal;
    int rate;
    int time;
    int simpleInterest;
    int amount;

    // Method to get input from user
    void getInput() {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter the Principal (in ₹): ");
        principal = io.nextInt();
        System.out.print("Enter the Time (in years): ");
        time = io.nextInt();
        io.close();
    }

    // Method to calculate rate based on time
    void calculateRate() {
        if (time <= 0) {
            System.out.println("Invalid time");
        } else if (time <= 2) {
            rate = 5;
        } else if (time <= 5) {
            rate = 8;
        } else if (time <= 10) {
            rate = 10;
        } else {
            rate = 12;
        }
    }
    // Method to calculate simple interest and amount
    void calculateAndDisplay() {
        simpleInterest = (principal * rate * time) / 100;
        amount = principal + simpleInterest;
        System.out.println("According to question:-\nPrincipal: " + "₹" + principal + "\nRate: " + rate + "%" + "\nTime: " + time + "years");
        System.out.println("S.I. = ₹" + simpleInterest + ".");
        System.out.println("Amount = ₹" + amount + ".");
    }

    public static void main(String[] args) {
        Mod_SI obj = new Mod_SI();
        obj.getInput();
        obj.calculateRate();
        obj.calculateAndDisplay();
    }
}

