import java.util.Scanner;

public class TaskSix{
   static Scanner input = new Scanner(System.in); 
   public static void main(String[] args){
      double sum = 0.00;
      double average = 0.00;
      int validCount =0;
      for(int count = 1; count<=10; count ++){
       System.out.printf("Enter score %d: ", count);
       double score = input.nextDouble();
       
       if(score % 2 == 0){
        sum +=score;  
        validCount ++;
        }
      }
      average = sum / validCount;
      System.out.println(average);
     
   }

}
