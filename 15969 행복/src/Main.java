import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int max = 0;
		int min = 1000;
		for (int i = 0; i < N; i++) {
			int score = scan.nextInt();
			if (max < score) {
				max = score;
			}
			if (min > score) {
				min = score;
			}
		}
		
		System.out.print(max - min);
		
		scan.close();
	}

}
