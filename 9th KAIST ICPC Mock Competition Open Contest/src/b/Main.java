package b;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[11];
		int V = 0;
		for (int i = 0; i < 11; i++) {
			score[i] = scan.nextInt();
			V += scan.nextInt();
		}
		
		Arrays.sort(score);
		
		int ans = 0;
		for (int i = 10; i >= 0; i--) {
			ans += (11-i) * score[i];
		}
		
		ans += V * 20;
		
		System.out.println(ans);
		
		scan.close();
	}

}
