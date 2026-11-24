import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        System.out.println("Three digit numbers that satisfy the condition:");

        for (int count = 100; count <= 999; count++) {
            int num = count;
            int sum = 0;

            int digit1 = num / 100;        
            int digit2 = (num / 10) % 10;    
            int digit3 = num % 10;           

            sum = (digit1 * digit1) + (digit2 * digit2) + (digit3 * digit3);

            if (sum == count) {
                System.out.println(count);
            }
        }

        System.out.println();
        }
    }
