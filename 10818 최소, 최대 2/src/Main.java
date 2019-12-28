import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		PriorityQueue<Integer> minpq = new PriorityQueue<>();
		PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			minpq.add(num);
			maxpq.add(num);
		}
		
		bw.write(minpq.poll() + " " + maxpq.poll());
		
		bw.flush();
		bw.close();
	}

}
