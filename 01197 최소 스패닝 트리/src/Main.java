import java.util.*;

public class Main {
	public static List<List<Edge>> list;
	public static boolean[] visit;
	
	// Edge
	public static class Edge {
		int u;
		int v;
		int c;
		
		public Edge(int u, int v, int c) {
			this.u = u;
			this.v = v;
			this.c = c;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Vertex 배열
		int[] V = new int[scan.nextInt()];
		for (int i = 0; i < V.length; i++) {
			V[i] = i;
		}		
		
		// Graph
		list = new LinkedList<>();
		for (int i = 0; i < V.length; i++) {
			list.add(new LinkedList<>());
		}
		
		int E = scan.nextInt();
		for (int i = 0; i < E; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			
			list.get(A).add(new Edge(A, B, C));
			list.get(B).add(new Edge(B, A, C));
		}
		
		printPrim(V, 0);
		
		scan.close();
	}

	public static void printPrim(int[] V, int s) {
		// 최소힙 기반 우선순위 큐 pq
		// cost 기준
		PriorityQueue<Edge> pq = new PriorityQueue<>((Edge e1, Edge e2) -> 
							{return Integer.compare(e1.c, e2.c);});
		// 대기 정점
		Queue<Integer> q = new LinkedList<>();
		visit = new boolean[V.length];
		
		// s 출발
		q.add(s);
		
		long mst = 0;
		while (!q.isEmpty()) {
			int current = q.poll();
			visit[current] = true;
			
			for (Edge edge : list.get(current)) {
				if (!visit[edge.v]) {
					pq.add(edge);
				}
			}
			
			while (!pq.isEmpty()) {
                Edge edge = pq.poll();
				if (!visit[edge.v]) {
					q.add(edge.v);     
	                visit[edge.v] = true;
	                mst += edge.c;
	                break;
				} 
			}
		}

		// MST
		System.out.print(mst);
	}
}
