import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int[][] stick = new int[2][n];
			int[][] score = new int[3][n];
			
			int max = 0;
			
			for(int j = 0; j < 2; j++)
				for(int k = 0; k < n; k++)
					stick[j][k] = scan.nextInt();
			
			score[0][0] = 0;
			score[1][0] = stick[0][0];
			score[2][0] = stick[1][0];
			
			for(int j = 1; j < n; j++) {				
				max = 0;
				
				for(int k = 0; k < 3; k++)
					if(max < score[k][j-1])
						max = score[k][j-1];
				
				score[0][j] = max;
				score[1][j] = Math.max(score[0][j-1], score[2][j-1])+stick[0][j];
				score[2][j] = Math.max(score[0][j-1], score[1][j-1])+stick[1][j];
			}
			
			max = 0;
			
			for(int j = 0; j < 3; j++)
				if(max < score[j][n-1])
					max = score[j][n-1];
			
			System.out.println(max);
		}
		
		scan.close();		
	}

}
