import java.util.Scanner;

public class TaskNine{
   static Scanner input = new Scanner(System.in); 
   public static void main(String[] args){
      double sum = 0;
      for(int count = 1; count<=10; count ++){
       System.out.printf("Enter score %d between (0-100): ", count);
       double score = input.nextDouble();
       
       if(score < 1 || score > 99){
        continue;
        }  
        sum+=score;
      }
      
      System.out.println(sum);
     
   }

}
