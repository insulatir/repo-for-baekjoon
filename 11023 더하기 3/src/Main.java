import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int res = 0;
		
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		while (st.hasMoreElements()) {
			res += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(res);
	}

}
