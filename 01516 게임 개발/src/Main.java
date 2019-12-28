import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	static List<List<Integer>> adj;
	static int[] indegree;
	static int[] time;
	static int[] res;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		adj = new LinkedList<List<Integer>>();
		for (int i = 0; i <= N; i++) {
			List<Integer> list = new LinkedList<Integer>();
			adj.add(list);
		}
		
		indegree = new int[N+1];
		time = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			int t = scan.nextInt();
			time[i] = t;
			
			int prev = scan.nextInt();
			for (; prev != -1; ) {
				adj.get(prev).add(i);
				indegree[i] += 1;
				prev = scan.nextInt();
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
				res[i] = time[i];
				q.add(i);
			}
		}
		
		for (int i = 0; i < N; i++) {
			int curr = q.poll();
			
			for (int item : adj.get(curr)) {
				res[item] = Math.max(res[item], res[curr] + time[item]);
				
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
