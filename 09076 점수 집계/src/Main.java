import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int[] score = new int[5];
			for (int j = 0; j < 5; j++) {
				score[j] = scan.nextInt();
			}
			Arrays.sort(score);
			int[] coo = new int[3];
			for (int j = 0; j < 3; j++) {
				coo[j] = score[j+1];
			}
			if (coo[2] - coo[0] < 4) {
				System.out.println(coo[0] + coo[1] + coo[2]);
			} else {
				System.out.println("KIN");
			}
		}
		
		scan.close();
	}

}
