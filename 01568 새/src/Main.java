import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		int i = 1;
		while (N > 0) {
			N -= i;
			ans += 1;
			if (N < 0) {
				N += i;
				ans -= 1;
				i = 0;
			}
			i += 1;
		}
		
		bw.write(ans + "");
		
		bw.flush();
		bw.close();
	}

}
