import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		int[] alph = new int[26];
		for (int i = 0; i < S.length(); i++) {
			alph[S.charAt(i) - 'a'] += 1;
		}
		
		for (int i : alph) {
			bw.write(i + " ");
		}
		
		bw.flush();
		bw.close();
	}

}
