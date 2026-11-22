import java.util.Scanner;

public class TaskEleven{
   static Scanner input = new Scanner(System.in); 
   public static void main(String[] args){
      for(int count = 1; count<=10; count ++){
       System.out.printf("Enter Prime number %d: ", count);
       int number = input.nextInt();
       if(number < 2){
        System.out.priht("invalid! number is not a prime number");
        } else{
          for (primer =2; primer * primer <= number; primer++){
            if(number % primer == 0){
              Systen.out.printf("%d is not a prime number", number);
          } else{
            System.out.printf("%d is a prime number", number);
          }
        }
      
       
      }
   
}
