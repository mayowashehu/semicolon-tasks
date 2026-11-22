import java.util.Scanner;

public class LargestNumber{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer : ");
        int number = input.nextInt();
        int largest= number;

        for (int count = 2; count <=10; count++){
            System.out.printf("Enter integer number %d: ", count);
            number = input.nextInt();
            
            if(number > largest){
                largest=number;
            }
         
        }

        System.out.println("Largest number is: " + largest);
    }
}
