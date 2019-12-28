import java.io.*;
import java.math.BigDecimal;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		BigDecimal ans = pow(new BigDecimal("0.5"), N);
		
		bw.write(ans.toPlainString());
		
		bw.flush();
		bw.close();
	}

	public static BigDecimal pow(BigDecimal a, int n) {
		if (n == 1) {
			return a;
		}
		
		if (n % 2 == 0) {
			BigDecimal half = pow(a, n/2);
			return half.multiply(half);
		} else {
			return pow(a, n-1).multiply(a);
		}
	}
}
