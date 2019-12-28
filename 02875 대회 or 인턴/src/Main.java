import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int ans = Math.min(N / 2, M);
		int diff = K - (N + M - ans * 3);
		if (diff < 0) {
			diff = 0;
		}
		
		ans -= Math.ceil((double)diff / 3);
		
		bw.write(ans + "");
		
		bw.flush();
		bw.close();
	}

}
