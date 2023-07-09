import java.util.Scanner;

public class greengrocer {
    public static void main(String[] args) {
        double PeerPrice = 2.14;
        double ApplePrice = 3.67;
        double TomatoesPrice = 1.11;
        double BananaPrice = 0.95;
        double EggplantPrice = 5.00;

        int Peer,Apple,Tomatoes,Banana,Eggplant;

        Scanner input = new Scanner(System.in);

        System.out.println("How many kilos of Peers: ");
        Peer = input.nextInt();
        System.out.println("How many kilos of Apples: ");
        Apple = input.nextInt();
        System.out.println("How many kilos of Tomatoes: ");
        Tomatoes = input.nextInt();
        System.out.println("How many kilos of Bananas: ");
        Banana = input.nextInt();
        System.out.println("How many kilos of Eggplants: ");
        Eggplant = input.nextInt();


        double totalPrice = (Peer*PeerPrice)+(Apple*ApplePrice)+(Tomatoes*TomatoesPrice)+(Banana*BananaPrice)+(Eggplant*EggplantPrice);

        System.out.println("Your total Price is : "+ totalPrice +  " TL");
    }
}
