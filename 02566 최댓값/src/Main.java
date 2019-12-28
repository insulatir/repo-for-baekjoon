import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int maxi = 0;
		int maxj = 0;
		StringTokenizer st;
		for (int i = 1; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < 10; j++) {
				int num = Integer.parseInt(st.nextToken());
				if (max < num) {
					max = num;
					maxi = i;
					maxj = j;
				}
			}
		}
		
		bw.write(max + "\n");
		bw.write(maxi + " " + maxj);
		
		bw.flush();
		bw.close();
	}

}
