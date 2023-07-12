import java.util.Scanner;

public class pow4and5 {
    public static void main(String[] args) {

        int number;
        double powerFour=0,powerFive=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = input.nextInt();
        System.out.println("1 den "+number+"'e kadar olan sayıların 4. ve 5. kuvveti");
        System.out.println("");

        for(int i = 1; i<=number; ++i){
            powerFour = Math.pow(i,4);
            powerFive = Math.pow(i,5);
            System.out.println("4. kuvveti = "+powerFour+"  5. kuvveti = "+ powerFive);

        }
    }
}
