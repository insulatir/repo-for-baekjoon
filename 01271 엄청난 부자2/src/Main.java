import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger n = new BigInteger(st.nextToken());
		BigInteger m = new BigInteger(st.nextToken());
		
		BigInteger[] dr = n.divideAndRemainder(m);
		bw.write(dr[0] + "\n" + dr[1]);
		
		bw.flush();
		bw.close();
	}

}
