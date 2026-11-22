import java.util.Scanner;

public class Diamond{

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an odd number for rows: ");
        int rows =input.nextInt();
        int counter =1;
        int star = 1;
        int step = 2


        if (rows % 2 == 0 || rows < 1){

            System.out.println("You just entered an even or invalid number... program exiting now!");
            return;
        }else if(rows == 1){
            System.out.println( * );
        }
        
       else {
            for (int row =1; row <= rows; row++){
                int spaces = (rows-star) / 2;
                for (int space =1; space <= spaces; space++ ){
                    System.out.print(" ");
                    for(int count =1; count<= counter; count++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }

}