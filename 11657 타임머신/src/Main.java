import java.util.*;
public class Main {
	static List<ArrayList<Edge>> list;
	static int[] dist;
	static int N;
	
	public static class Edge {
		int q;
		int w;
		
		public Edge(int q, int w) {
			this.q = q;
			this.w = w;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		list = new ArrayList<>();
		
		N = scan.nextInt();
		int M = scan.nextInt();
		for (int i = 0; i <= N; i++) {
			ArrayList<Edge> sub = new ArrayList<>();
			list.add(sub);
		}
		
		for (int i = 0; i < M; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			
			list.get(A).add(new Edge(B, C));
		}
		
		dist = new int[N+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		if (belman(1)) {
			System.out.println("-1");
		} else {
			for (int i = 2; i <= N; i++) {
				if (dist[i] == Integer.MAX_VALUE) {
					System.out.println("-1");
				} else {
					System.out.println(dist[i]);
				}
			}
		}
		
		scan.close();
	}

	public static boolean belman(int V) {
		dist[V] = 0; 
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				for (Edge edge : list.get(j)) {
					if (dist[j] < Integer.MAX_VALUE && dist[edge.q] > edge.w + dist[j]) {
						// dist[j] = INF면 최단거리 결정 x
 						dist[edge.q] = edge.w + dist[j];
						if (i == N) {
							// 1 ~ V : cycle
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}
	
}
