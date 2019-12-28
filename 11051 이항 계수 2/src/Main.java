import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[][] c = new int[1001][1001];
		
		for(int i = 0; i < 1001; i++)
			for(int j = 0; j <= i; j++) {
				if(j == 0)
					c[i][j] = 1;
				else
					c[i][j] = (c[i-1][j] + c[i-1][j-1])%10007; 
			}
		
		System.out.print(c[n][k]);
		
		scan.close();
	}

}
