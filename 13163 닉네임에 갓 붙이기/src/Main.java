import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			st.nextToken();
			System.out.print("god");
			while (st.hasMoreTokens()) {
				System.out.print(st.nextToken());
			}
			System.out.println();
		}
	}

}
