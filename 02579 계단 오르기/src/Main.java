import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] scores = new int[n];
		int[][] sum = new int[n][2];
		for(int i = 0; i < n; i++)
			scores[i] = Integer.parseInt(br.readLine());
		sum[0][0] = scores[0];
		sum[1][0] = scores[1];
		sum[1][1] = scores[0] + scores[1];
		for(int i = 2; i < n; i++) {
			sum[i][0] = Math.max(sum[i-2][0], sum[i-2][1]) + scores[i];
			sum[i][1] = sum[i-1][0] + scores[i];
		}
		bw.write(Math.max(sum[n-1][0], sum[n-1][1]) + "");
		bw.flush();
		bw.close();
	}
	
}
