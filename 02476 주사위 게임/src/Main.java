import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] score = new int[N];
		for (int i = 0; i < N; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if (a == b && b == c) {
				score[i] = 10000+a*1000;
			} else if (a == b) {
				score[i] = 1000+a*100;
			} else if (b == c) {
				score[i] = 1000+b*100;
			} else if (a == c) {
				score[i] = 1000+c*100;
			} else {
				score[i] = Math.max(Math.max(a, b), c)*100;
			}
		}
		
		Arrays.sort(score);
		
		System.out.print(score[N-1]);
		
		scan.close();
	}

}
