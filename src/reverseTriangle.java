import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz : ");
        number = input.nextInt();

        for(int c=number; c>=0;c--){

            for(int t=0;t<=(number-c);++t ){
                System.out.print(" ");
            }
            for(int y=1;y<=(2*c)-1;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
