import java.util.Scanner;

public class CircleMeasurement {
    public static void main(String[] args) {

        int r;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the r variable: ");
        r=input.nextInt();

        double FieldCircle=pi*Math.pow(r,2);
        double PeriMeterCircle=2*pi*r;

        System.out.println("Field of Circle is : "+ FieldCircle);
        System.out.println("Perimeter of Circle is :"+ PeriMeterCircle);

    }
}
