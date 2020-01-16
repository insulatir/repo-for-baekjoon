import java.util.*;
public class Main {
	static List<ArrayList<Integer>> list;
	static boolean[] visit;
	static int[] count;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		list = new ArrayList<>();
		int n = scan.nextInt();
		for (int i = 0; i <= n; i++) {
			ArrayList<Integer> sub = new ArrayList<>();
			list.add(sub);
		}
		visit = new boolean[n+1];
		count = new int[n+1];
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int m = scan.nextInt();
		for (int i = 0; i < m; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			list.get(x).add(y);
			list.get(y).add(x);
		}
		
		bfs(a, b);
		
		scan.close();
	}

	public static void bfs(int x, int y) {
		Queue<Integer> q = new LinkedList<>();
		
		visit[x] = true;
		q.add(x);
		
		boolean valid = false;
		while (!q.isEmpty()) {
			int u = q.poll();
			if (u == y) {
				valid = true;
				break;
			}
			for (int i : list.get(u)) {
				if (!visit[i]) {
					visit[i] = true;
					count[i] = count[u] + 1;
					q.add(i);
				}
			}
		}

		System.out.print(valid ? count[y] : -1);
	}
}
