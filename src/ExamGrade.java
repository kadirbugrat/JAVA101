import java.util.Scanner;

public class ExamGrade {

    public static void main(String[] args) {

        int mat,fiz, turk, kim, muz;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the mat Grade: ");
        mat = input.nextInt();
        System.out.println("Enter the fiz Grade: ");
        fiz = input.nextInt();
        System.out.println("Enter the turk Grade: ");
        turk = input.nextInt();
        System.out.println("Enter the kim Grade: ");
        kim = input.nextInt();
        System.out.println("Enter the muz Grade: ");
        muz = input.nextInt();

        int sum = (mat+fiz+kim+turk+muz);
        double averageGrade = sum/5.0;

        System.out.println("Your average grade is: "+averageGrade);
        if(averageGrade >= 55){
            System.out.println("Congratulations! You Passed the Class!");

        }else {
            System.out.println("Opps! You Failed!");

        }


    }
}
