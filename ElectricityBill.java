import java.util.Scanner;
class ElectricityBill{
    Scanner io = new Scanner(System.in);
    String unit100 = "Click 1 for 100 units.";
    String unit200 = "Click 2 for 200 units.";
    String unit300 = "Click 3 for 300 units.";

    void process(){
        System.out.println(unit100);
        System.out.println(unit200);
        System.out.println(unit300);
        byte number = io.nextByte();

        if(number==1){
            System.out.println("Charge: ₹2 per unit");
            int u100 = 100*2;
            System.out.println("Electricity will be: " + "₹"+ u100);
        } else if (number==2) {
            System.out.println("Charge: ₹3 per unit");
            int u200 = 200*3;
            System.out.println("Electricity will be: " + "₹"+u200);
        } else if (number==3) {
            System.out.println("Charge: ₹4 per unit");
            int u300 = 300 * 3;
            System.out.println("Electricity will be: " + "₹"+ u300);
        } else{
            System.out.println("Invalid number chosen");
        }

    }

    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();
        eb.process();
    }

}