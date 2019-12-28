import java.io.*;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] road = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			road[i] = Integer.parseInt(st.nextToken());
		}
		
		int max_len = 0;
		for (int i = 0; i< N-1; i++) {
			int start = road[i];
			int end = 0;
			for (int j = i+1; j < N; j++) {
				if (road[j-1] >= road[j]) {
					end = road[j-1];
					break;
				} 
				end = road[j];
			}
			int len = end - start;
			max_len = Math.max(max_len, len);
		}
		
		bw.write(max_len + "");
		
		bw.flush();
		bw.close();
	}

}
