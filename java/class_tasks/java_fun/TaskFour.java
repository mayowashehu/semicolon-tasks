import java.util.Scanner;

public class TaskFour{
   static Scanner input = new Scanner(System.in); 
   public static void main(String[] args){
      double sum = 0.0;
      for(int count = 1; count<=10; count ++){
       System.out.printf("Enter score %d: ", count);
       double score = input.nextDouble();
       
       if( count % 2 == 0){
        sum +=score;  
        }
      }
      
      System.out.printf("The sum of 2nd, 4th, 6th, 8th, and 10th number is: %f", sum);
     
   }

}
