import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[][] people = new int[15][15];
		String result = "";
		for(int i = 0; i < 15; i++)
			people[i][0] = i;
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				int sum = 0;
				for(int k = 1; k <= j; k++)
					sum += people[k][i-1];
				people[j][i] = sum;
			}
		}
		for(int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			result += people[n][k] + "\n";
		}
		bw.write(result);
		bw.flush();
		bw.close();
	}

}
