import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		int[][] sum = new int[N][10];
		for(int i = 0; i < 10; i++)
			sum[0][i] = 1;
		for(int i = 1; i < N; i++) 
			for(int j = 0; j < 10; j++) {
				switch(j) {
				case 0:
					sum[i][0] = sum[i-1][1] % 1000000000;
					break;
				case 9:
					sum[i][9] = sum[i-1][8] % 1000000000;
					break;
				default:
					sum[i][j] = (sum[i-1][j+1] % 1000000000 + sum[i-1][j-1] % 1000000000) % 1000000000;
					break;
				}
			}
		for(int i = 1; i < 10; i++)
			result = (result % 1000000000 + sum[N-1][i] % 1000000000) % 1000000000;
		bw.write(result + "");
		bw.flush();
		bw.close();
	}

}
