import java.util.Scanner;

public class disivibleNumbers {
    public static void main(String[] args) {

        int number,hold=0,count=0;
        double averageNumbers=0;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number : ");
        number = input.nextInt();

        for (int i=1; i<=number;++i){
            if(i%3==0 && i%4==0){
                hold = hold + i;
                count++;
            }

        }
        System.out.println(count);
        double result = hold/count;
        System.out.println(result);

    }
}
