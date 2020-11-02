import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		int[][] rgb = new int[N][3];
		int[][] sum = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			String[] array = br.readLine().split(" ");
			rgb[i][0] = Integer.parseInt(array[0]);
			rgb[i][1] = Integer.parseInt(array[1]);
			rgb[i][2] = Integer.parseInt(array[2]);
		}
		
		for (int j = 0; j < 3; j++) {
			if (j == 0) {
				sum[N-1][0] = rgb[N-1][0];
				sum[N-1][1] = 1000*1000+1;
				sum[N-1][2] = 1000*1000+1;
			} else if (j == 1) {
				sum[N-1][0] = 1000*1000+1;
				sum[N-1][1] = rgb[N-1][1];
				sum[N-1][2] = 1000*1000+1;
			} else {
				sum[N-1][0] = 1000*1000+1;
				sum[N-1][1] = 1000*1000+1;
				sum[N-1][2] = rgb[N-1][2];
			}
			
			for (int i = N-2; i >= 0; i--) {
				sum[i][0] = Math.min(rgb[i][0] + sum[i+1][1], rgb[i][0] + sum[i+1][2]);
				sum[i][1] = Math.min(rgb[i][1] + sum[i+1][0], rgb[i][1] + sum[i+1][2]);
				sum[i][2] = Math.min(rgb[i][2] + sum[i+1][0], rgb[i][2] + sum[i+1][1]);
			}
			
			if (j == 0) {
				if (min > sum[0][1]) {
					min = sum[0][1];
				}
				if (min > sum[0][2]) {
					min = sum[0][2];
				}
			} else if (j == 1) {
				if (min > sum[0][0]) {
					min = sum[0][0];
				}
				if (min > sum[0][2]) {
					min = sum[0][2];
				}
			} else {
				if (min > sum[0][0]) {
					min = sum[0][0];
				}
				if (min > sum[0][1]) {
					min = sum[0][1];
				}
			}
		}
		
		bw.write(min + "");
		bw.flush();
		bw.close();
	}

}
