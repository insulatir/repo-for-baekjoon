import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		long A = Long.parseLong(s.split(" ")[0]);
		long B = Long.parseLong(s.split(" ")[1]);
		
		for (int i = 0; i < gcd(Math.max(A, B), Math.min(A, B)); i++) {
			bw.write("1");
		}
		
		bw.flush();
		bw.close();
	}

	public static long gcd(long a, long b) {
		long n = 0;
		while (b != 0) {
			n = a % b;
			a = b;
			b = n;
		}
		return a;
	}
}
