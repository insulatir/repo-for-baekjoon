package e;
import java.util.*;
public class Main {
	static List<ArrayList<Integer>> map;
	static boolean[] visited;
	static int K;
	static int visit;
	static boolean ok;
	static List<Integer> list;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			K = 1 + (int)(Math.log(N) / Math.log(2));
			
			map = new ArrayList<>();
			visited = new boolean[N+1];
			visit = 0;
			ok = true;
				
			for (int j = 0; j <= N; j++) {
				ArrayList<Integer> sub = new ArrayList<>();
				map.add(sub);
			}
			
			for (int j = 1; j <= N; j++) {
				String line = scan.next();
				for (int k = 1; k <= N; k++) {
					if (line.charAt(k-1) == 'W') {
						map.get(j).add(k);
					}
				}
			}

			list = new ArrayList<>();
			
			for (int j = 1; j <= N; j++) {
				dfs(j);
				list.add(j);
				if (!ok) {
					list.clear();
					visited = new boolean[N+1];
					visit = 0;
					ok = true;
				} else {
					break;
				}
			}
			
			for (int j = list.size()-1; j >= 0; j--) {
				System.out.print(list.get(j) + " ");
			}
			
			System.out.println();
		}
		
		scan.close();
	}

	public static void dfs(int V) {
		visited[V] = true;
		visit += 1;
		
		if (visit == K) {
			return;
		}
		
		for (int n : map.get(V)) {
			if (!visited[n]) {
				dfs(n);
				
				for (int i : list) {
					if (!map.get(n).contains(i)) {
						ok = false;
					}
				}
				
				list.add(n);
			}
		}
	}
}
