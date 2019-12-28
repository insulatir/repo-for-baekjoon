import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		
		
		bw.flush();
		bw.close();
	}

}
