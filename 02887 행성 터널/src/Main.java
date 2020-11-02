import java.util.*;

public class Main {
	public static List<List<Edge>> list;
	public static boolean[] visit;
	
	public static class Point {
		int p;
		int x, y, z;
		
		public Point(int p, int x, int y, int z) {
			this.p = p;
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	
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
		
		int v = scan.nextInt();
		
		// Graph
		list = new LinkedList<>();
		for (int i = 0; i < v; i++) {
			list.add(new LinkedList<>());
		}
		
		int[][] xyz = new int[v][3];
		for (int i = 0; i < v; i++) {
			xyz[i][0] = scan.nextInt();
			xyz[i][1] = scan.nextInt();
			xyz[i][2] = scan.nextInt();
		}
		
		for (int i = 0; i < v; i++) {
			for (int j = i+1; j < v; j++) {
				int x = Math.abs(xyz[i][0] - xyz[j][0]);
				int y = Math.abs(xyz[i][1] - xyz[j][1]);
				int z = Math.abs(xyz[i][2] - xyz[j][2]);
				int len = Math.min(x, Math.min(y, z));
				
				list.get(i).add(new Edge(i, j, len));
				list.get(j).add(new Edge(j, i, len));
			}
		}
		
		printPrim(v, 0);
		
		scan.close();
	}

	public static void printPrim(int v, int s) {
		// 최소힙 기반 우선순위 큐 pq
		// cost 기준
		PriorityQueue<Edge> pq = new PriorityQueue<>((Edge e1, Edge e2) -> 
							{return Integer.compare(e1.c, e2.c);});
		// 대기 정점
		Queue<Integer> q = new LinkedList<>();
		visit = new boolean[v];
		
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
