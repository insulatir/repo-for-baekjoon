import java.util.*;
public class Main {
	static List<LinkedList<Edge>> list;
	static int[] dist;
	static int V;
	
	public static class Edge {
		int q;
		int w;
		
		public Edge(int q, int w) {
			this.q = q;
			this.w = w;
		}
	}
	
	public static class Vertex {
		int d;
		int i;
		
		public Vertex(int i, int d) {
			this.i = i;
			this.d = d;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		V = scan.nextInt();
		int E = scan.nextInt();
		int start = scan.nextInt();
		
		list = new ArrayList<>();
		for (int i = 0; i <= V; i++) {
			LinkedList<Edge> sub = new LinkedList<>();
			list.add(sub);
		}
		
		for (int i = 0; i < E; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			int w = scan.nextInt();
			
			list.get(u).add(new Edge(v, w));
		}
		
		dist = new int[V+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		
		dijk(start);
		
		for (int i = 1; i <= V; i++) {
			if (dist[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			} else {
				System.out.println(dist[i]);
			}
		}
		
		scan.close();
	}
	
	public static void dijk(int v) {
		PriorityQueue<Vertex> pq = new PriorityQueue<>(
				(Vertex v1, Vertex v2) -> Integer.compare(v1.d, v2.d));
		
		pq.add(new Vertex(v, 0));
		
		while (!pq.isEmpty()) {
			Vertex n = pq.poll();
			dist[n.i] = Math.min(dist[n.i], n.d);
			for (Edge edge : list.get(n.i)) {
				if (dist[edge.q] > dist[n.i] + edge.w) {
					dist[edge.q] = dist[n.i] + edge.w;
					pq.add(new Vertex(edge.q, dist[edge.q]));
				}
			}
		}
	}
}
