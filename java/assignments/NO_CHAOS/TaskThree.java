import java.util.Scanner;

    public class TaskThree{
      public static void main(String[] args){
      
      	double baseSalary = 5000;
        double target = 30000;
        double sales = 0;
        double commission = 0;
        double totalIncome = 0;

        while (totalIncome < target) {
            sales = sales + 100;   // increase by 100 each time

            if (sales <= 5000) {
                commission = sales * 0.06;
            } else if (sales <= 10000) {
                commission = (5000 * 0.06) + ((sales - 5000) * 0.08);
            } else {
                commission = (5000 * 0.06) + (5000 * 0.08) + ((sales - 10000) * 0.10);
            }

            totalIncome = baseSalary + commission;
        }

        System.out.println("Minimum sales needed is approximately: " + sales);
        System.out.println("Total income at that point: " + totalIncome);
        System.out.println();
      
       }
   }
