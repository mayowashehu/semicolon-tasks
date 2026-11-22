import java.util.Scanner;

public class TaskTwo{
   static Scanner input = new Scanner(System.in); 
   public static void main(String[] args){
      double sum = 0.0;
      double average = 0.0;
      for(int count = 1; count<=10; count ++){
       System.out.printf("Enter score %d: ", count);
       int score = input.nextDouble();
        sum +=score;  
      }
      average = sum / 10;
      System.out.println(average);
     
   }

}
