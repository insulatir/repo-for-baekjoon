import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int gcd = gcd(A, B);
		bw.write((A / gcd) + "/" + (B / gcd) + "\n");
		for (int i = 2; i < N; i++) {
			B = Integer.parseInt(st.nextToken());
			gcd = gcd(A, B);
			bw.write((A / gcd) + "/" + (B / gcd) + "\n");
		}
		
		bw.flush();
		bw.close();
	}

	public static int gcd(int a, int b) {
		if (b > a) {
			return gcd(b, a);
		}
		
		if (a % b == 0) {
			return b;
		}
		
		return gcd(b, a%b);
	}
}
