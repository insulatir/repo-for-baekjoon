import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num = new int[1001];
		int count = 1;
		for (int i = 1; i < num.length;) {
			int stand = count;
			while (count > 0 && i < num.length) {
				num[i] = stand;
				count -= 1;
				i += 1;
			}
			
			count = stand + 1;
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int res = 0;
		for (int i = A; i <= B; i++) {
			res += num[i];
		}
		
		bw.write(res + "");
		
		bw.flush();
		bw.close();
	}

}
