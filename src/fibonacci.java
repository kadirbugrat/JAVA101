import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int number,first=0,second=1, sum=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = input.nextInt();

        System.out.print(first+" "+second+" ");
        for(int i=2 ;i<=number;i++ ) {

            sum=first+second;
            System.out.print(sum+" ");
            first=second;
            second=sum;


            }



        }
    }

