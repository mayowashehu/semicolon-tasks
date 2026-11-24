import java.util.Scanner;

    public class TaskFive{
      public static void main(String[] args){
      
      	System.out.println("Question 5:");
        System.out.print("Enter a string: ");
        String text = sc.next();

        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase();   // make everything small letter

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels = vowels + 1;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants = consonants + 1;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println();
      
       }
   }
