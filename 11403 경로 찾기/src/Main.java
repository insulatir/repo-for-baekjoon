import java.util.*;
public class Main {
	public static List<ArrayList<Integer>> list;
	public static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		visited = new boolean[N];
		list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> sub = new ArrayList<>();
			list.add(sub);
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int check = scan.nextInt();
				if (check == 1) {
					list.get(i).add(j);
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				visited = new boolean[N];
				System.out.print(bfs(i, j) + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}

	public static int bfs(int i, int j) {
		Queue<Integer> q = new LinkedList<>();
		visited[i] = true;
		q.add(i);
		int valid = 0;
		while (!q.isEmpty()) {
			int n = q.poll();
			for (int u : list.get(n)) {
				if (i == j && j == u) {
					valid = 1;
					break;
				}
				if (!visited[u]) {
					visited[u] = true;
					q.add(u);
					if (u == j) {
						valid = 1;
						break;
					}
				}
			}
		}
		
		return valid;
	}
}
