import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String Ns = br.readLine();
		Integer[] num = new Integer[Ns.length()];
		
		String[] token = Ns.split("");
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(token[i]);
		}
		
		Arrays.sort(num, Collections.reverseOrder());
		
		for (int i : num) {
			bw.write(i + "");
		}
		
		bw.flush();
		bw.close();
	}

}
