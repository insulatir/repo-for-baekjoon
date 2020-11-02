import java.util.*;
public class Main {
	static int INF = Integer.MAX_VALUE;
	static int[] d = new int[1001];
	static List<ArrayList<Node>> graph = new ArrayList<>();
	
	public static class Node implements Comparable<Node> {
		int index;
		int distance;
		
		public Node (int i, int d) {
			this.index = i;
			this.distance = d;
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
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			graph.get(a).add(new Node(b, c));
		}
		
		Arrays.fill(d, INF);
		
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		dijk(start);
		
		System.out.print(d[end]);
		
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
