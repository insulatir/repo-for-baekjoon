import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] people = new int[11];
		StringTokenizer st;
		for (int i = 1; i <= 10; i++) {
			st = new StringTokenizer(br.readLine());
			people[i] = people[i-1] - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(people);
		
		bw.write(people[10] + "");
		
		bw.flush();
		bw.close();
	}

}
