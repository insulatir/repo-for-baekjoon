import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			
			int res = 0;
			
			while (st.hasMoreElements()) {
				res += Integer.parseInt(st.nextToken());
			}
			
			System.out.println(res);
		}
	}

}
