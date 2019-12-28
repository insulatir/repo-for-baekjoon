import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ans = 0;
		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(st.nextToken());
			ans += num * num;
			ans = ans % 10;
		}
		
		bw.write(ans + "");
		
		bw.flush();
		bw.close();
	}

}
