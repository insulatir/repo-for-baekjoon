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
		visited[V] = true;			// �湮
		System.out.print(V + " ");
		
		for (int i : map.get(V)) {	// V�� ����� ������ ��
			if (!visited[i]) {		// �湮���� ���� ���� �湮
				dfs(i);
			}
		}
	}
	
	public static void bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		
		visited[V] = true;				// ���� ��� �湮
		q.add(V);						// ť�� ����
	
		while (!q.isEmpty()) {			// ť�� �� ������ �ݺ�
			int N = q.poll();			// �湮�� ��� ����
			System.out.print(N + " ");
			
			for (int i : map.get(N)) { 	// ���� ���
				if (!visited[i]) {
					visited[i] = true; 	// �湮
					q.add(i);			// ť ����
				}
			}
		}
	}
}
