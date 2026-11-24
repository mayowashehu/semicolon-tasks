import java.util.Scanner;

    public class TaskFour{
      public static void main(String[] args){
      
      System.out.println("Question 4:");
        System.out.print("Enter a string: ");
        String word = sc.next();

        String reverse = "";
        int length = word.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }

        System.out.println();
      
       }
   }
