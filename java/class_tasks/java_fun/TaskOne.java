import java.util.Scanner;

public class TaskOne{
   static Scanner input = new Scanner(System.in); 
   public static void main(String[] args){
      double sum = 0.0;
      for(int count = 1; count<=10; count ++){
       System.out.printf("Enter score %d: ", count);
       double score = input.nextDouble();
        sum +=score;  
      }
      
      System.out.println(sum);
     
   }

}
