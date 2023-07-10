import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1,number2,select;


        System.out.println("Enter the number 1 : ");
        number1 = input.nextInt();

        System.out.println("Enter the number 2 : ");
        number2 = input.nextInt();

        System.out.println("Select the action you want to do : ");
        System.out.println("1.Addition\n2.Extraction\n3.Multiplication\n4.Division\n");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Addition is : "+ (number1+number2));
                break;
            case 2:
                System.out.println("Extraction is : "+ (number1-number2));
                break;
            case 3:
                System.out.println("Multiplication is : "+ (number1*number2));
                break;
            case 4:
                System.out.println("Division is : "+ (number1/number2));
                break;
            default:
                System.out.println("Opps! Something went wrong.");
        }

    }
}
