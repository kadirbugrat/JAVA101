import java.util.Scanner;

public class findHoroscope {
    public static void main(String[] args) {
        String month;
        int day;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Month: ");
        month=input.nextLine();
        System.out.println("Enter the Day: ");
        day=input.nextInt();

        if(month.equals("Mart")){
            if(day>=21 && day<=31){
                System.out.println("Burcunuz Koç");

            }else{
                System.out.println("Burcunuz Balık");
            }

        }
        if(month.equals("Nisan")){
            if(day>=21 && day<=31){
                System.out.println("Burcunuz Boğa");

            }else{
                System.out.println("Burcunuz Koç");
            }

        }
        if(month.equals("Mayıs")){
            if(day>=22 && day<=31){
                System.out.println("Burcunuz İkizler");

            }else{
                System.out.println("Burcunuz Boğa");
            }

        }
        if(month.equals("Haziran")){
            if(day>=23 && day<=31){
                System.out.println("Burcunuz Yengeç");

            }else{
                System.out.println("Burcunuz İkizler");
            }

        }
        if(month.equals("Temmuz")){
            if(day>=21 && day<=31){
                System.out.println("Burcunuz Aslan");

            }else{
                System.out.println("Burcunuz Yengeç");
            }

        }
        if(month.equals("Ağustos")){
            if(day>=21 && day<=31){
                System.out.println("Burcunuz Başak");

            }else{
                System.out.println("Burcunuz Aslan");
            }

        }
        if(month.equals("Eylül")){
            if(day>=21 && day<=31){
                System.out.println("Burcunuz Terazi");

            }else{
                System.out.println("Burcunuz Başak");
            }

        }
        if(month.equals("Ekim")){
            if(day>=21 && day<=31){
                System.out.println("Burcunuz Akrep");

            }else{
                System.out.println("Burcunuz Terazi");
            }

        }
        if(month.equals("Kasım")){
            if(day>=21 && day<=31){
                System.out.println("Burcunuz Yay");

            }else{
                System.out.println("Burcunuz Akrep");
            }

        }
        if(month.equals("Aralık")){
            if(day>=21 && day<=31){
                System.out.println("Burcunuz Oğlak");

            }else{
                System.out.println("Burcunuz Yay");
            }

        }
        if(month.equals("Ocak")){
            if(day>=21 && day<=31){
                System.out.println("Burcunuz Kova");

            }else{
                System.out.println("Burcunuz Oğlak");
            }

        }
        if(month.equals("Şubat")){
            if(day>=21 && day<31){
                System.out.println("Burcunuz Balık");

            }else{
                System.out.println("Burcunuz Kova");
            }

        }





    }
}
