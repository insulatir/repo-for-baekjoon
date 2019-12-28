import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			int sumOfse = 0;
			double sum = 0;
			for (int j = 0; j < N; j++) {
				int se = scan.nextInt();
				sumOfse += se;
				sum += se * scan.nextDouble();
			}
			
			System.out.println(sumOfse + " " + Math.round((sum / (double) sumOfse) * 10) / 10.0);

		}
		
		scan.close();
	}

}
