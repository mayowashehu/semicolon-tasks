import java.util.Scanner;

    public class TaskTwo{
      public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);

        double total = 0;
        int count = 0;
        double average;

        System.out.println("Enter numbers (type -1 to stop):");

        while (true) {
            int number = sc.nextInt();

            if (number == -1) {
                break;
            }

            total = total + number;
            count = count + 1;
            average = total / count;

            System.out.println("Current average is: " + average);
        }

        System.out.println();
        
  }
}
