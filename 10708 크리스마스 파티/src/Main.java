import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] res = new int[N+1];
		int[] target = new int[M];
		
		for (int i = 0; i < M; i++) {
			target[i] = scan.nextInt();
		}

		for (int i = 0; i < M; i++) {
			int[] expect = new int[N+1];
			int[] score = new int[N+1];
			
			for (int j = 1; j < N+1; j++) {
				expect[j] = scan.nextInt();
			}
			
			for (int j = 1; j < N+1; j++) {
				int tar = target[i];
				if (j == tar) {
					score[j] += 1;
				} else {
					if (expect[j] == tar) {
						score[j] += 1;
					} else {
						score[tar] += 1;
					}
				}
			}
			
			for (int j = 1; j < N+1; j++) {
				res[j] += score[j];
			}
		}
		
		for (int i = 1; i < N+1; i++) {
			System.out.println(res[i]);
		}
		
		scan.close();
	}

}
