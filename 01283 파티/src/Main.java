import java.util.*;
public class Main {
	static int INF = (int) 1e9;
	static int[] d = new int[1001];
	static List<ArrayList<Node>> graph = new ArrayList<>();
	
	public static class Node implements Comparable<Node>{
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
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int X = scan.nextInt();
		
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < M; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int T = scan.nextInt();
			graph.get(A).add(new Node(B, T));
		}
		
		int max = 0;
		for (int i = 1; i <= N; i++) {
			int time = 0;
			dijk(i);
			time += d[X];
			dijk(X);
			time += d[i];
			max = Math.max(max, time);
		}
		
		System.out.print(max);
		
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
