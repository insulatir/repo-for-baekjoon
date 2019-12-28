import java.util.*;
public class Main {
	static List<List<Integer>> adj;
	static int[] indegree;
	static int[] res;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		adj = new LinkedList<List<Integer>>();
		for (int i = 0; i <= N; i++) {
			List<Integer> list = new LinkedList<Integer>();
			adj.add(list);
		}
		
		indegree = new int[N+1];
		
		for (int i = 0; i < M; i++) {
			int num = scan.nextInt();
			int prev = scan.nextInt();
			for (int j = 0; j < num-1; j++) {
				int curr = scan.nextInt();
				indegree[curr] += 1;
				
				adj.get(prev).add(curr);
				prev = curr;
			}
		}
		
		topo(N);
		
		scan.close();
	}

	public static void topo(int N) {
		Queue<Integer> q = new LinkedList<Integer>();
		res = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			if (indegree[i] == 0) {
				q.add(i);
			}
		}
		
		for (int i = 0; i < N; i++) {
			if (q.isEmpty()) {
				System.out.println(0);
				return;
			}
			
			int curr = q.poll();
			res[i] = curr;
			
			for (int item : adj.get(curr)) {
				indegree[item] -= 1;
				if (indegree[item] == 0) {
					q.add(item);
				}
			}
		}
		
		for (int item : res) {
			if (item != 0) {
				System.out.println(item);
			}
		}
	}
}
