import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int number,hold=0 ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = input.nextInt();

        for(int i =1 ; i<=number/2; i++){
            if(number%i==0) {
                hold = hold + i;
            }
        }
        if(hold==number){
            System.out.println(number + " is Perfect Number!");
        }else{
            System.out.println(number + " is not Perfect Number!");
        }

    }
}
