import java.util.Scanner;

    public class TaskSix{
      public static void main(String[] args){
      
      	System.out.println("Question 6:");
        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.print("Characters at even indexes: ");

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }

        System.out.println();

    }
}
      
 
