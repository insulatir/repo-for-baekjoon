import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				score[i] += scan.nextInt();
			}
		}
		
		int max = 0;
		int maxi = 0;
		for (int i = 0; i < 5; i++) {
			if (max < score[i]) {
				max = score[i];
				maxi = i + 1;
			}
		}
		
		System.out.print(maxi + " " + max);
		
		scan.close();
	}

}
