import java.util.Scanner;

public class averageGrade {
    public static void main(String[] args) {

        // Initialize variables
        int math, physic, chem, turkish, hist, music;

        //Declaration the Scanner Class
        Scanner input = new Scanner(System.in);

        //Prompt the Grade from User
        System.out.println("Enter the Math Grade: ");
        math = input.nextInt();
        System.out.println("Enter the physic Grade: ");
        physic = input.nextInt();
        System.out.println("Enter the chem Grade: ");
        chem = input.nextInt();
        System.out.println("Enter the turkish Grade: ");
        turkish = input.nextInt();
        System.out.println("Enter the hist Grade: ");
        hist = input.nextInt();
        System.out.println("Enter the music Grade: ");
        music = input.nextInt();

        int sum = (math+physic+chem+turkish+hist+music);
        double averageGrade = sum/6.0;

        System.out.println("Your average grade is: "+averageGrade);

        String message = (averageGrade>=60) ? "Passed the Class" : "Failed the Class";
        System.out.println(message);




    }
}
