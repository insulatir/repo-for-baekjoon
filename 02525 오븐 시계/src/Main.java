import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		
		int hour = A;
		int min = B + C;
		
		while (min >= 60) {
			min -= 60;
			hour += 1;
		}
		
		while (hour >= 24) {
			hour -= 24;
		}
		
		bw.write(hour + " " + min);
		
		bw.flush();
		bw.close();
	}

}
