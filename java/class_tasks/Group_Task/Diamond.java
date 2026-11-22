import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an odd number for rows: ");
        int number = input.nextInt();

        if (number % 2 == 0 || number < 1) {
            System.out.println("Enter an odd number");
        } else {
            for (int row = 1; row <= number; row += 2) {
                for (int space = number - 1; space >= row; space -= 2) {
                    System.out.print(" ");
                }
                for (int star = 1; star <= row; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        
        }

       
    }
}
