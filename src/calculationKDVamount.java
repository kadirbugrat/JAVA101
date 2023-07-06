import java.util.Scanner;

public class calculationKDVamount {

    public static void main(String[] args) {
        int money;
        int KDV = 18;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Money Variable : ");
        money = input.nextInt();

        double priceWithKDV = money + (KDV * money) / 100.0;

        System.out.println("Price without KDV is : " + money);
        System.out.println("KDV  price is : %" + KDV);
        System.out.println("Your new price is : " + priceWithKDV);
    }
}