import java.util.*;
public class Main {
	static int INF = Integer.MAX_VALUE;
	static int[] d = new int[100001];
	static List<ArrayList<Node>> graph = new ArrayList<>();
	
	public static class Node implements Comparable<Node> {
		int index;
		int distance;
		
		public Node (int index, int distance) {
			this.index = index;
			this.distance = distance;
		}
		
		public int compareTo(Node other) {
			if (this.distance < other.distance) {
				return -1;
			}
			
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int V = scan.nextInt();
		int E = scan.nextInt();
		int K = scan.nextInt();
		
		for (int i = 0; i <= V; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < E; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			int w = scan.nextInt();
			graph.get(u).add(new Node(v, w));
		}
		
		Arrays.fill(d, INF);
		
		dijk(K);
		
		for (int i = 1;i <= V; i++) {
			if (d[i] == INF) {
				System.out.println("INF");
			} else {
				System.out.println(d[i]);
			}
		}
		
		scan.close();
	}

	public static void dijk(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		d[start] = 0;
		pq.add(new Node(start, 0));
		while (!pq.isEmpty()) {
			Node now = pq.poll();
			int dis = now.distance;
			int idx = now.index;
			if (d[idx] < dis) {
				continue;
			}
			
			for (Node next : graph.get(idx)) {
				if (d[idx] + next.distance < d[next.index]) {
					d[next.index] = d[idx] + next.distance;
					pq.add(new Node(next.index, d[next.index]));
				}
			}
		}
	}
}
