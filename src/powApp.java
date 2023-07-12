import java.util.Scanner;

public class powApp {
    public static void main(String[] args) {
        int base,up;
        double result=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz : ");
        base = input.nextInt();
        System.out.println("Üs olacak sayıyı giriniz : ");
        up = input.nextInt();

        for(int i =0 ; i<=1;++i){

            result = Math.pow(base,up);
        }
        System.out.println(result);

    }
}
