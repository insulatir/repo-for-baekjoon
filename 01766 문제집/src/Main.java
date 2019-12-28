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
			int prev = scan.nextInt();
			int curr = scan.nextInt();
			
			adj.get(prev).add(curr);
			indegree[curr] += 1;
		}
		
		topo(N);
		
		scan.close();
	}

	public static void topo(int N) {
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
		res = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			if (indegree[i] == 0) {
				minheap.add(i);
			}
		}
		
		for (int i = 0; i < N; i++) {
			int curr = minheap.poll();
			res[i] = curr;
			
			for (int item : adj.get(curr)) {
				indegree[item] -= 1;
				if (indegree[item] == 0) {
					minheap.add(item);
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
