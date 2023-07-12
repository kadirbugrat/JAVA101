import java.io.FilterOutputStream;
import java.util.Scanner;

public class disivibleNumbers2 {
    public static void main(String[] args) {
        int number,hold=0,sum=0;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Number : ");

        number = input.nextInt();
        do{
            if(number%4==0){
                hold = hold + number;
            }else{
                System.out.println("-");
            }
            number = input.nextInt();

        }while (!(number%2==1));

        System.out.println(hold);


    }
}

