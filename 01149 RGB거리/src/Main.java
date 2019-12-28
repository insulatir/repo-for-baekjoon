import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		int[][] rgb = new int[N][3];
		int[][] sum = new int[N][3];
		for(int i = 0; i < N; i++) {
			String[] array = br.readLine().split(" ");
			rgb[i][0] = Integer.parseInt(array[0]);
			rgb[i][1] = Integer.parseInt(array[1]);
			rgb[i][2] = Integer.parseInt(array[2]);
		}
		sum[0][0] = rgb[0][0];
		sum[0][1] = rgb[0][1];
		sum[0][2] = rgb[0][2];
		for(int i = 1; i < N; i++) {
			sum[i][0] = Math.min(rgb[i][0] + sum[i-1][1], rgb[i][0] + sum[i-1][2]);
			sum[i][1] = Math.min(rgb[i][1] + sum[i-1][0], rgb[i][1] + sum[i-1][2]);
			sum[i][2] = Math.min(rgb[i][2] + sum[i-1][0], rgb[i][2] + sum[i-1][1]);
		}
		for(int i = 0; i < 3; i++)
			if(min > sum[N-1][i]) min = sum[N-1][i];
		bw.write(min + "");
		bw.flush();
		bw.close();
	}

}
