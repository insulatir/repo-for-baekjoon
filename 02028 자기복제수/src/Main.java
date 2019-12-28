import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int squre = N * N;
			
			if (0 < N && N < 10) {
				if (squre % 10 == N) {
					bw.write("YES\n");
				} else {
					bw.write("NO\n");
				}
			} else if (10 <= N && N < 100) {
				if (squre % 100 == N) {
					bw.write("YES\n");
				} else {
					bw.write("NO\n");
				}
			} else if (100 <= N && N < 1000) {
				if (squre % 1000 == N) {
					bw.write("YES\n");
				} else {
					bw.write("NO\n");
				}
			} else {
				bw.write("NO\n");
			}
		}
		
		bw.flush();
		bw.close();
	}

}
