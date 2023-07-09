import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {

        int kiloMeter;
        double perKiloMeter=2.20;
        double total=10.0;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the KiloMeter: ");
        kiloMeter = input.nextInt();

        total = total + (kiloMeter * perKiloMeter);


        if(total<20) {
            System.out.println("Your price is : 20" );
        }
        else {
            System.out.println(total);
        }
    }
}
