import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int K = Integer.parseInt(br.readLine());
		int[] fibo = new int[46];
		fibo[1] = 1;
		for (int i = 2; i <= 45; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		bw.write(fibo[K-1] + " " + fibo[K]);
		
		bw.flush();
		bw.close();
	}

}
