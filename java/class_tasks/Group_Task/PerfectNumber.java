import java.util.Scanner;

public class PerfectNumber {
    public static String isPerfectNumber(int number) {
        if (number < 1) {
            return "Invalid Number";
        }

        int sum = 0;
        for (int count = 1; count < number; count++) {
            if (number % count == 0) {
                sum += count;
            }
        }

        if (sum == number) {
            return String.format("%d is a perfect number", number);
        } else {
            return String.format("%d is not a perfect number", number);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int number = input.nextInt();
        String result = isPerfectNumber(number);
        System.out.println(result);
        
    }
}
