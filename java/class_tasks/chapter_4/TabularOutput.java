public class TabularOutput{
    public static void main(String[] args){
        System.out.printf("%-10s%-10s%-10s%-10s%n", "N", "N^2", "N^3", "N^4");

        for (int count =1; count <= 5; count ++){
            int power2=count * count;
            int power3 =count * count * count;
            int power4 = count * count * count *count;
            System.out.printf("%-10d%-10d%-10d%-10d%n", count, power2, power3, power4);
        }
    }
}
