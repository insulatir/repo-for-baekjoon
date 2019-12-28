import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] file = new String[N];
		for (int i = 0; i < N; i++) {
			file[i] = br.readLine();
		}
		
		char[] chs = new char[file[0].length()];
		for (int i = 0; i < file[0].length(); i++) {
			char ch = file[0].charAt(i);
			boolean equal = true;
			for (int j = 1; j < N; j++) {
				if (ch != file[j].charAt(i)) {
					equal = false;
					chs[i] = '?';
				}
			}
			if (equal) {
				chs[i] = ch;
			}
		}
		
		for (char ch : chs) {
			bw.write(ch + "");
		}
		
		bw.flush();
		bw.close();
	}

}
