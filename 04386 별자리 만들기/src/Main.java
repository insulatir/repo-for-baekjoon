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
		double c;
		
		public Edge(int u, int v, double c) {
			this.u = u;
			this.v = v;
			this.c = c;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		int n = scan.nextInt();
		double[][] stars = new double[n][2];
		for (int i = 0; i < n; i++) {
			stars[i][0] = scan.nextDouble();
			stars[i][1] = scan.nextDouble();
		}

		// Graph
		list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(new LinkedList<>());
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				double len = Math.sqrt((stars[i][0]-stars[j][0])*(stars[i][0]-stars[j][0])
						+(stars[i][1]-stars[j][1])*(stars[i][1]-stars[j][1]));
				list.get(i).add(new Edge(i, j, len));
				list.get(j).add(new Edge(j, i, len));
			}
		}
		
		printPrim(n, 0);
		
		scan.close();
	}

	public static void printPrim(int n, int s) {
		// 최소힙 기반 우선순위 큐 pq
		// cost 기준
		PriorityQueue<Edge> pq = new PriorityQueue<>((Edge e1, Edge e2) -> 
							{return Double.compare(e1.c, e2.c);});
		// 대기 정점
		Queue<Integer> q = new LinkedList<>();
		visit = new boolean[n];
		
		// s 출발
		q.add(s);
		
		double mst = 0;
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
