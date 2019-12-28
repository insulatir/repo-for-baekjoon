import java.util.*;
public class Main {
	static List<List<Integer>> adj;
	static int[] indegree;
	static int[] str;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int K = scan.nextInt();
			int M = scan.nextInt();
			int P = scan.nextInt();
		
			adj = new LinkedList<List<Integer>>();
			
			for (int j = 0; j <= M; j++) {
				List<Integer> list = new LinkedList<Integer>();
				adj.add(list);
			}
			
			indegree = new int[M+1];
			str = new int[M+1];
			
			for (int j = 0; j < P; j++) {
				int prev = scan.nextInt();
				int curr = scan.nextInt();
				
				adj.get(prev).add(curr);
				indegree[curr] += 1;
			}
			
			
			topo(M);
			
			System.out.println(K + " " + str[M]);
		}
		
		scan.close();
	}

	public static void topo(int M) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1; i <= M; i++) {
			if (indegree[i] == 0) {
				q.add(i);
				str[i] = 1;
			}
		}
		
		for (int i = 0; i < M; i++) {
			int curr = q.poll();
			for (int next : adj.get(curr)) {
				indegree[next] -= 1;
				str[next] = Math.max(str[next], str[curr]);
				
				if (indegree[next] == 0) {
					q.add(next);
					
					int count = 0;
					for (int j = 1; j <= M; j++) {
						if (adj.get(j).contains(next)) {
							if (str[j] == str[next]) {
								count += 1;
							}
						}
					}
					
					if (count > 1) {
						str[next] += 1;
					}
				}
			}
		}
		
		
	}
}
