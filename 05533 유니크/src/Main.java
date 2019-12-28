import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[][] num = new int[N][3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				num[i][j] = scan.nextInt();
			}
		}
		
		int[][] score = num;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = j+1; k < N; k++) {
					int A = num[j][i];
					int B = num[k][i];
					
					if (A == B) {
						score[j][i] = 0;
						score[k][i] = 0;
					} else {
						if (score[j][i] != 0) {
							score[j][i] = A;
						}
						if (score[k][i] != 0) {
							score[k][i] = B;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			int sum = 0;
			
			for (int j : score[i]) {
				sum += j;
			}

			System.out.println(sum);
		}
		
		scan.close();
	}

}
