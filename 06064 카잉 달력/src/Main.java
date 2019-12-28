import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int lcm = M * N / gcd(M, N);
			boolean ok = false;
			while (x <= lcm && y <= lcm) {
				if (x < y) {
					x += M;
				} else if (x > y) {
					y += N;
				} else {
					ok = true;
					break;
				}
			}
			
			bw.write(ok ? x + "\n" : "-1\n");
		}
		
		bw.flush();
		bw.close();
	}

	public static int gcd(int a, int b) {
		if (a < b) {
			gcd(b, a);
		}
		
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a%b);
	}
}
