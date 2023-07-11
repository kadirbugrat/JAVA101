import java.util.Scanner;

public class flyingPrice {
    public static void main(String[] args) {

        int km,yas,type;
        double price = 0.10;
        double discount1=0.50; //12 yas indirimi %50
        double discount2=0.10; //12-24 yas indirmi %10
        double discount3=0.30; //65 yas indirimi %30
        double discount4=0.20; //gidis-donus kampanyası
        double hold = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Gidiş Dönüş, 2 => Tek Yön  ): ");
        type = input.nextInt();



        switch (type){
            case 1:
                if(km>0 && yas>0){
                double totalPrice = km * price;

                if (yas <= 12) {
                    hold = totalPrice * (discount1);
                    totalPrice= totalPrice-hold;
                    hold = totalPrice * (discount4);
                    totalPrice = totalPrice-hold;
                    totalPrice=totalPrice*2;

                    System.out.println("Toplam tutar : " + totalPrice);

                } else if (yas > 12 && yas <= 24) {
                    hold = totalPrice * (discount2);
                    totalPrice= totalPrice-hold;
                    hold = totalPrice * (discount4);
                    totalPrice = totalPrice-hold;
                    totalPrice=totalPrice*2;

                    System.out.println("Toplam tutar : " + totalPrice);

                } else if (yas > 65) {
                    hold = totalPrice * (discount3);
                    totalPrice= totalPrice-hold;
                    hold = totalPrice * (discount4);
                    totalPrice = totalPrice-hold;
                    totalPrice=totalPrice*2;

                    System.out.println("Toplam tutar : " + totalPrice);

                } else {
                    hold = totalPrice * (discount4);
                    totalPrice= totalPrice-hold;
                    totalPrice=totalPrice*2;
                    System.out.println("Toplam tutar : " + totalPrice);
                }
                }else {
                    System.out.println("Something went wrongé");
                }

                break;
            case 2:

                if (km>0 && yas>0){

                    double totalPrice = km*price;

                    if(yas<=12){
                        hold=totalPrice*(discount1);
                        totalPrice= totalPrice-hold;
                        System.out.println("Toplam tutar : "+totalPrice);

                    } else if (yas > 12 && yas <= 24) {
                        hold=totalPrice*(discount2);
                        totalPrice= totalPrice-hold;
                        System.out.println("Toplam tutar : "+totalPrice);

                    } else if (yas>65) {
                        hold=totalPrice*(discount3);
                        totalPrice= totalPrice-hold;
                        System.out.println("Toplam tutar : "+totalPrice);

                    }else {
                        System.out.println("Toplam tutar : "+totalPrice);

                    }

                } else {
                    System.out.println("Something went wrong!");
                }
                break;
            default:
                System.out.println("Something went wrong!");

        }



    }
}
