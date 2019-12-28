import java.io.*;
import java.util.*;
public class Main {
	static List<ArrayList<Integer>> list;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		list = new ArrayList<>();
		
		for (int i = 0; i <= N; i++) {
			ArrayList<Integer> sub = new ArrayList<>();
			list.add(sub);
		}
		
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		visited = new boolean[N+1];
		
		bfs(1);
		
		int count = 0;
		for (boolean virus : visited) {
			if (virus) {
				count += 1;
			}
		}
		
		bw.write((count-1) + "");
		
		bw.flush();
		bw.close();
	}

	public static void bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		
		visited[V] = true;
		q.add(V);
		
		while (!q.isEmpty()) {
			int n = q.poll();
			
			for (int i : list.get(n)) {
				if (!visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}
}
