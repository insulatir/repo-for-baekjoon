import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			int balance = 0;
			for (int j = 0; j < N; j++) {
				balance += scan.nextInt();
			}
			System.out.println(balance < 0 ? "Left" : 
				balance > 0 ? "Right" : "Equilibrium");
		}
		
		scan.close();
	}

}
