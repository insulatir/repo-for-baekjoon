import java.math.BigInteger;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BigInteger N = new BigInteger(bf.readLine());
		bw.write(N.remainder(new BigInteger("20000303")) + "");
		
		bw.flush();
		bw.close();
	}

}
