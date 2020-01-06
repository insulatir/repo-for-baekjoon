import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int score = 0;
		int k = 0;
		for (int i = 0; i < N; i++) {
			int n = scan.nextInt();
			if (n == 1) {
				k += 1;
				score += k;
			} else {
				k = 0;
			}
		}
		
		System.out.print(score);
		
		scan.close();
	}

}
