import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = br.readLine();
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch != 'C' && ch != 'A' && ch != 'M' && ch != 'B' && ch != 'R' && ch != 'I' && ch != 'D' && ch != 'G' && ch != 'E') {
				bw.write(ch + "");
			}
		}
		
		bw.flush();
		bw.close();
	}

}
