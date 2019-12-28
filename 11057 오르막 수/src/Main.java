import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] up = new int[1001][10];
		int sum = 0;
		
		for(int i = 0; i < 10; i++)
			up[1][i] = 1;
		
		for(int i = 2; i < 1001; i++) 
			for(int j = 0; j < 10; j++)
				for(int k = 0; k <= j; k++)
					up[i][j] += (up[i-1][k])%10007;
		
		for(int i = 0; i < 10; i++)
			sum += (up[n][i])%10007;
		
		System.out.print(sum%10007);
			
		scan.close();
	}

}
