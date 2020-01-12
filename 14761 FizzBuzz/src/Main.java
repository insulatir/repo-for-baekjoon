import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int N = scan.nextInt();
		
		for (int i = 1; i <= N; i++) {
			boolean divide = false;
			if (i % X == 0) {
				divide = true;
				System.out.print("Fizz");
			} 
			if (i % Y == 0) {
				divide = true;
				System.out.print("Buzz");
			}
			System.out.println(divide?"":i);
		}
		
		scan.close();
	}

}
