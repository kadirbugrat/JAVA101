import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        int EdgeOne;
        int EdgeTwo;
        int hipo;

        System.out.println("Enter the Short Edges: ");
        Scanner input = new Scanner(System.in);
        EdgeOne = input.nextInt();
        EdgeTwo = input.nextInt();

        hipo = (int)Math.sqrt(Math.pow(EdgeOne,2)+Math.pow(EdgeTwo,2));
        System.out.println("Hipotenus is :" + hipo);


    }
}
