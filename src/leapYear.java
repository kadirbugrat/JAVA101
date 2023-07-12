import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        year = input.nextInt();


        if(year%4==0 && !(year%100==0) || year%400==0){
            System.out.println(year + " Artık bir yıldır!");

        }
       else{
            System.out.println(" Artık bir yıl değildir!");
        }
    }
}
