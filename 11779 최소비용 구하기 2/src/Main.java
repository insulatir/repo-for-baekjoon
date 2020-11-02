import java.util.*;
public class Main {
	static int INF = (int) 1e9;
	static int[] d = new int[1001];
	static List<ArrayList<Node>> graph = new ArrayList<>();
	
	public static class Node implements Comparable<Node> {
		int i;
		int d;
		
		public Node(int i, int d) {
			this.i = i;
			this.d = d;
		}
		
		public int compareTo(Node other) {
			if (this.d < other.d) {
				return -1;
			}
			
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			graph.get(a).add(new Node(b, c));
		}
		
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		dijk(start);
		System.out.println(d[end]);
		
		scan.close();
	}

	public static void dijk(int start) {
		Arrays.fill(d, INF);
		PriorityQueue<Node> pq = new PriorityQueue<>();
		d[start] = 0;
		pq.add(new Node(start, 0));
		while (!pq.isEmpty()) {
			Node now = pq.poll();
			int dis = now.d;
			int idx = now.i;
			if (d[idx] < dis) {
				continue;
			}
			for (Node next : graph.get(idx)) {
				if (d[idx] + next.d < d[next.i]) {
					d[next.i] = d[idx] + next.d;
					pq.add(new Node(next.i, d[next.i]));
				}
			}
		}
	}
}
