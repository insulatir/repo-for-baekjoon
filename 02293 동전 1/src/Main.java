import java.io.*;
public class Main {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] array = br.readLine().split(" ");
		int n = Integer.parseInt(array[0]);
		int k = Integer.parseInt(array[1]);
		int[] coins = new int[n];
		int[][] cases = new int[n][k+1];
		for(int i = 0; i < n; i++) 
			coins[i] = Integer.parseInt(br.readLine());
		for(int i = 0; i <= k; i++)
			if(i % coins[0] == 0) cases[0][i] = 1;
		for(int i = 1; i < n; i++) 
			for(int j = 0; j <= k; j++) {
				if(j < coins[i]) cases[i][j] = cases[i-1][j];
				else cases[i][j] = cases[i-1][j] + cases[i][j-coins[i]];
			}
		bw.write(cases[n-1][k] + "");
		bw.flush();
		bw.close();
	}
	
}
