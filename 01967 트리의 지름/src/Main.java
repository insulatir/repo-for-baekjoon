import java.util.*;
import java.io.*;
public class Main {
	static List<ArrayList<Edge>> list;
	static boolean[] visited;
	static int[] check;
	static int n;
	
	public static class Edge {
		int weight;
		int v;
		
		public Edge(int v, int weight) {
			this.weight = weight;
			this.v = v;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		n = Integer.parseInt(br.readLine());

		list = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			ArrayList<Edge> sub = new ArrayList<>();
			list.add(sub);
		}
		
		for (int i = 0; i < n-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list.get(a).add(new Edge(b, c));
			list.get(b).add(new Edge(a, c));
		}
		
		int max = 0;
		for (int i = 1; i <= n; i++) {
			if (list.get(i).size() == 1) {
				visited = new boolean[n+1];
				check = new int[n+1];
				bfs(i);
				for (int j = 1; j <= n; j++) {
					if (max < check[j]) {
						max = check[j];
					}
				}
			}
		}
		
		bw.write(max + "");
			
		bw.flush();
		bw.close();
	}

	public static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		
		visited[v] = true;
		q.add(v);
		
		while (!q.isEmpty()) {
			int n = q.poll();
			for (Edge edge : list.get(n)) {
				int V = edge.v;
				int w = edge.weight;
				
				if (!visited[V]) {
					visited[V] = true;
					check[V] = check[n] + w;
					q.add(V);
				}
			}
		}
	}
}
