import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		while (a != 0 && b != 0) {
			if (b % a == 0) {
				bw.write("factor\n");
			} else if (a % b == 0) {
				bw.write("multiple\n");
			} else {
				bw.write("neither\n");
			}
			
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
		}
		
		bw.flush();
		bw.close();
	}

}
