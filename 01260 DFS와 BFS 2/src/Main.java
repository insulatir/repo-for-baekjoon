import java.util.*;
public class Main {
	static List<ArrayList<Integer>> map;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		map = new ArrayList<ArrayList<Integer>>();
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int V = scan.nextInt();
		visited = new boolean[N+1];
		
		for (int i = 0; i <= N; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			map.add(list);
		}
		
		for (int i = 0; i < M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			map.get(a).add(b);
			map.get(b).add(a);
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(map.get(i));
		}
		
		dfs(V);
		
		scan.close();
	}

	public static void dfs(int V) {
		visited[V] = true;			// 방문
		System.out.print(V + " ");
		
		for (int i : map.get(V)) {	// V와 연결된 정점들 중
			if (!visited[i]) {		// 방문하지 않은 정점 방문
				dfs(i);
			}
		}
	}
	
	public static void bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		
		visited[V] = true;				// 현재 노드 방문
		q.add(V);						// 큐에 삽입
	
		while (!q.isEmpty()) {			// 큐가 빌 때까지 반복
			int N = q.poll();			// 방문한 노드 추출
			System.out.print(N + " ");
			
			for (int i : map.get(N)) { 	// 인접 노드
				if (!visited[i]) {
					visited[i] = true; 	// 방문
					q.add(i);			// 큐 삽입
				}
			}
		}
	}
}
