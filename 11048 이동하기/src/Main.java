import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] maze = new int[n][m];
		int[][] candy = new int[n][m]; 
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				maze[i][j] = scan.nextInt();
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++) {
				int a = 0;
				int b = 0;
				int c = 0;
				
				if(i-1 >= 0) 
					a = candy[i-1][j];
				
				if(j-1 >= 0) {
					b = candy[i][j-1];
					if(i-1 >= 0)
						c = candy[i-1][j-1];
				}
				
				candy[i][j] = maze[i][j] + Math.max(Math.max(a, b), c);
			}
		
		System.out.println(candy[n-1][m-1]);
		
		scan.close();
	}

}
