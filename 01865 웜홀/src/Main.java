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
		
		int TC = scan.nextInt();
		for (int i = 0; i < TC; i++) {
			N = scan.nextInt();
			int M = scan.nextInt();
			int W = scan.nextInt();

			list = new ArrayList<>();
			for (int j = 0; j <= N; j++) {
				ArrayList<Edge> sub = new ArrayList<>();
				list.add(sub);
			}
			
			for (int j = 0; j < M; j++) {
				int S = scan.nextInt();
				int E = scan.nextInt();
				int T = scan.nextInt();
				
				list.get(S).add(new Edge(E, T));
				list.get(E).add(new Edge(S, T));
			}
			
			for (int j = 0; j < W; j++) {
				int S = scan.nextInt();
				int E = scan.nextInt();
				int T = scan.nextInt();
				
				list.get(S).add(new Edge(E, -T));
			}
			
			dist = new int[N+1];
			Arrays.fill(dist, Integer.MAX_VALUE);
			
			if (belman(1)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		scan.close();
	}

	public static boolean belman(int V) {
		dist[V] = 0;
		
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				for (Edge edge : list.get(j)) {
					if (dist[j] != Integer.MAX_VALUE && dist[edge.q] > dist[j] + edge.w) {
						dist[edge.q] = dist[j] + edge.w;
						if (i == N) {
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}
}
