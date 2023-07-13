import java.util.Scanner;

public class drawingDiamond {
    public static void main(String[] args) {
        int number ;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        number = input.nextInt();

        for(int i=1 ; i<=number;i++){
            for(int j =0;j<=(number-i);j++){
                System.out.print(" ");

            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
                }
            System.out.println();
        }
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
