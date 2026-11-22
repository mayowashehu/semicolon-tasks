import java.util.Scanner;

public class TaskEight{
   static Scanner input = new Scanner(System.in); 
   public static void main(String[] args){
      double sum = 0;
      int count = 1;
       
      while (count <= 10){
          System.out.printf("Enter score %d between (0-100): ", count);
      double score = input.nextDouble();
      if(score < 1 || score > 99){
        System.out.println("Enter valid score my nigga!");
        } else{
          sum+=score;
          count++;
        }
    
      }
      
      System.out.println(sum);
     
   }

}
