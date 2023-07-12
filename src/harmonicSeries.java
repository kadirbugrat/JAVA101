import java.util.Scanner;

public class harmonicSeries {
    public static void main(String[] args) {
        int number;
        double hold=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = input.nextInt();

        for(int i =1; i<=number; ++i){
            hold = hold + 1.0/i ;

        }
        System.out.println(hold);
    }
}
