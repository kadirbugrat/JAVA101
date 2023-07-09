import java.util.Scanner;

public class BodyIndex {
    public static void main(String[] args) {

        double weight;
        double height;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the body index ");

        System.out.println("Weight: ");
        weight = input1.nextFloat();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Height: ");
        height = input2.nextDouble();

        double index = (weight)/(Math.pow(height,2));
        System.out.println("Body mass index: "+ index);
    }
}
