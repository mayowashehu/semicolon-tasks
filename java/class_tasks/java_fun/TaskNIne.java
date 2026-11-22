import java.util.Scanner;

public class TaskNine{
   static Scanner input = new Scanner(System.in); 
   public static void main(String[] args){
      int sum = 0;
      for(int count = 1; count<=10; count ++){
       System.out.printf("Enter score %d between (0-100): ", count);
       int score = input.nextInt();
       
       if(score < 0 || score > 100){
        continue;
        }  
        sum+=score;
        
      }
      
      System.out.println(sum);
     
   }

}
