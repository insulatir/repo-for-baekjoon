import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		String B = st.nextToken();
		String C = st.nextToken();
		String D = st.nextToken();
		
		long AB = Long.parseLong(A + B);
		long CD = Long.parseLong(C + D);
		
		bw.write(AB + CD + "");
		
		bw.flush();
		bw.close();
	}

}
