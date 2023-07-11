import java.util.Scanner;

public class arrangement {

    public static void main(String[] args) {

        int a,b,c;
        int smallest,biggest, medium;

        System.out.println("Enter the numbers: ");
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        System.out.println("Unarrangement = "+a+","+b+","+c);

        if(a<b && a < c){
            if(b<c){
                smallest=a;
                medium=b;
                biggest=c;
            }else {
                smallest=a;
                medium=c;
                biggest=b;
            }
        }else if (b<a && b<c){
            if(c<a){
                smallest=b;
                medium=c;
                biggest=a;
            }else {
                smallest=b;
                medium=a;
                biggest=c;
            }

        }else{
            if(a<b){
                smallest=c;
                medium=a;
                biggest=b;
            }else {
                smallest=c;
                medium=b;
                biggest=a;
            }

        }

        System.out.println("Arrangement = "+smallest+","+medium+","+biggest);

    }
}
