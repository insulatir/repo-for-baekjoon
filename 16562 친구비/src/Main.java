import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

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
				
		int n = scan.nextInt();
		int M = scan.nextInt();
		int k = scan.nextInt();
		
		// Graph
		list = new LinkedList<>();
		for (int i = 0; i <= n; i++) {
			list.add(new LinkedList<>());
		}
		
		for (int i = 1; i <= n; i++) {
			int cost = scan.nextInt();
			list.get(0).add(new Edge(0, i, cost));
			list.get(i).add(new Edge(i, 0, cost));
		}
		
		for (int i = 1; i <= M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			list.get(a).add(new Edge(a, b, 0));
			list.get(b).add(new Edge(b, a, 0));
		}
		
		printPrim(n+1, 0, k);
		
		scan.close();
	}

	public static void printPrim(int n, int s, int k) {
		// 최소힙 기반 우선순위 큐 pq
		// cost 기준
		PriorityQueue<Edge> pq = new PriorityQueue<>((Edge e1, Edge e2) -> 
							{return Integer.compare(e1.c, e2.c);});
		// 대기 정점
		Queue<Integer> q = new LinkedList<>();
		visit = new boolean[n];
		
		// s 출발
		q.add(s);
		
		int mst = 0;
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
		System.out.print(mst <= k ? mst : "Oh no");
	}
}
