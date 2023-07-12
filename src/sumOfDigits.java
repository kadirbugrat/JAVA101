import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {

        int number,hold=0,remain=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = input.nextInt();

        while(!(number == 0)){
            remain = remain + number%10;
            number = number/10;
            hold=remain;

        }
        System.out.println(hold);

    }
}
