import java.util.Scanner;

public class recursivePower {

    static int power(int base, int exp){

        if(exp==0){
            return 1;
        }else{
            return base*power(base,exp-1);
        }


    }
    public static void main(String[] args) {

        int taban,us;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value : ");
        taban = input.nextInt();
        System.out.print("Enter the exp value : ");
        us = input.nextInt();

        System.out.println(power(taban,us));

    }
}
