import java.util.Scanner;

public class TaskTen{
   static Scanner input = new Scanner(System.in); 
   public static void main(String[] args){
      double sum = 0;
      double average =0.0;
      int validCount =0;
      for(int count = 1; count<=10; count ++){
       System.out.printf("Enter score %d between (0-100): ", count);
       double score = input.nextDouble();
       
       if(score < 0 || score > 100){
        continue;
        }  
        sum+=score;
        validCount++;
        
      }
      if (validCount > 0){
      average = sum / validCount;
      }
      System.out.printf("%.2f%n", average);
     
   }

}
