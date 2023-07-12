import java.util.Scanner;

public class combinationFactoriel {
    public static void main(String[] args) {
        int n,r,fact=1,fact1=1,fact2=1,hold=0;

        Scanner input = new Scanner(System.in);
        System.out.println("For C(n,r) statement");
        System.out.println("Enter the n value and r value : ");
        n = input.nextInt();
        r= input.nextInt();


        for (int i=1; i<=n; ++i){
            fact = fact*i;


        }
        for(int j=1; j<=r; ++j){
            fact1=fact1*j;

        }
        for(int k=1; k<=(n-r); ++k){
            fact2 = fact2*k;

        }
        double combinationOfFact=(fact)/((fact1)*(fact2));
        System.out.println(combinationOfFact);

    }
}
