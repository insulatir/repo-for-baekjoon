import java.util.*;
import java.io.*;
import java.math.BigDecimal;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigDecimal a = BigDecimal.valueOf(Double.parseDouble(st.nextToken()));
		int b = Integer.parseInt(st.nextToken());
		
		bw.write(squre(a, b).toPlainString() + "");
		
		bw.flush();
		bw.close();
	}

	public static BigDecimal squre(BigDecimal a, int b) {
		if (b == 1) {
			return a;
		}
		
		if (b % 2 == 1) {
			return squre(a, b-1).multiply(a);
		} else {
			BigDecimal half = squre(a, b/2);
			return half.multiply(half);
		}
	}
}
