import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int plus = Integer.parseInt(st.nextToken());
		int minus = Integer.parseInt(st.nextToken());
		
		if ((plus + minus) % 2 == 1) {
			bw.write("-1");
		} else {
			int a = (plus + minus) / 2;
			int b = (plus - minus) / 2;
			
			if (b < 0) {
				bw.write("-1");
			} else {
				bw.write(a + " " + b);
			}
		}
		
		bw.flush();
		bw.close();
	}

}
