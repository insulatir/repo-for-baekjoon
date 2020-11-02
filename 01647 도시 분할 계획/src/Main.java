import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

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
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		int N = Integer.parseInt(s.split(" ")[0]);
		int M = Integer.parseInt(s.split(" ")[1]); 		
		
		// Graph
		list = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			list.add(new LinkedList<>());
		}

		for (int i = 0; i < M; i++) {
			s = bf.readLine();
			int A = Integer.parseInt(s.split(" ")[0]);
			int B = Integer.parseInt(s.split(" ")[1]);
			int C = Integer.parseInt(s.split(" ")[2]);
			
			list.get(A-1).add(new Edge(A-1, B-1, C));
			list.get(B-1).add(new Edge(B-1, A-1, C));
		}
		
		bw.write(printPrim(N, 0) + "");
		
		bw.flush();
		bw.close();
	}

	public static int printPrim(int v, int s) {
		// 최소힙 기반 우선순위 큐 pq
		// cost 기준
		PriorityQueue<Edge> pq = new PriorityQueue<>((Edge e1, Edge e2) -> 
							{return Integer.compare(e1.c, e2.c);});
		// 대기 정점
		Queue<Integer> q = new LinkedList<>();
		visit = new boolean[v];
		
		// s 출발
		q.add(s);
		
		int mst = 0;
		int max_cost = 0;
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
	                if (max_cost < edge.c) {
	                	max_cost = edge.c;
	                }
	                break;
				} 
			}
		}

		// res
		return mst-max_cost;
	}
}
