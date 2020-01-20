import java.util.*;
public class Main {
	public static int[] s;
	public static int[] team;
	public static int ith;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int n = scan.nextInt();
			s = new int[n+1];
			for (int j = 1; j <= n; j++) {
				s[j] = scan.nextInt();
			}
			
			team = new int[n+1];
			ith = 0;
			
			int res = n;
			for (int j = 1; j <= n; j++) {
				if (team[j] == 0) {
					res -= dfs(j, ith+1);
				} 
			}
			
			System.out.println(res);
		}
		
		scan.close();
	}

	public static int dfs(int v, int start) {
		int n = s[v];
		
		if (team[v] == 0) {
			ith += 1;
			team[v] = ith;
		} 
		
		if (team[v] >= team[n] && team[n] >= start) {
			return ith - team[n] + 1;
		}

		if (team[n] > 0) {
			return 0;
		}
		
		return dfs(n, start);
	}
}
