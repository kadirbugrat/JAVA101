import java.util.Scanner;

public class activitySuggestion {
    public static void main(String[] args) {
        int heat;

        System.out.println("Enter the Temperature: ");

        Scanner input = new Scanner(System.in);
        heat = input.nextInt();





        if(heat<=5){
            System.out.println("You can Ski");
        } else if (heat>5 && heat<=15) {
            System.out.println("You can go to the Cinema");
        } else if (heat>15 && heat<=25) {
            System.out.println("You can go to the Picnic");
        }else{
            System.out.println("You can Swim");
        }


    }
}
