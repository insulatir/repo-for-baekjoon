import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (pq.size() < K) {
				pq.add(num);
			} else {
				if (pq.peek() > num) {
					pq.poll();
					pq.add(num);
				}
			}
		}
		
		bw.write(pq.poll() + "");
		
		bw.flush();
		bw.close();
	}

}
