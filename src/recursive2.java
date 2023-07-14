import java.util.Scanner;

public class recursive2 {

    static void recursiveMethod(int n) {

        System.out.print(n + " ");
        if (n<=0){
            return;
        }
        recursiveMethod(n - 5);
        System.out.print(n + " ");
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = input.nextInt();

        recursiveMethod(number);

    }
}
