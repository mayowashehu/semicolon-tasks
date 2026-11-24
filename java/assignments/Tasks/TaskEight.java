public class TaskEight{
	public static void main(String[] args){
	int total = 0;
	int sum =0;
		for (int count = 1; count<=10; count ++){
			if (count % 4 == 0){
			for (int power = 1; power <=5; power++){
			  int powers = (int)Math.pow(count,power);
			  total +=powers;
			}
			
			}
		}
		System.out.println(total);
	}
}
