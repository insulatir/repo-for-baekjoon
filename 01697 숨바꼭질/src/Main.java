import java.util.*;
import java.io.*;
public class Main {
	static boolean[] visited;
	static int[] check;
	static int K;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		visited = new boolean[100001];
		check = new int[100001];
		
		bfs(N);
		
		bw.write(check[K] + "");
		
		bw.flush();
		bw.close();
	}

	public static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		
		visited[v] = true;
		q.add(v);
		
		while (!q.isEmpty()) {
			int n = q.poll();
			
			if (n == K) {
				break;
			}
			
			int[] ns = new int[3];
			ns[0] = n -1;
			ns[1] = n + 1;
			ns[2] = n * 2;
			for (int i : ns) {
				if (0 <= i && i <= 100000) {
					if (visited[i] == false && check[i] == 0) {
						visited[i] = true;
						check[i] = check[n] + 1;
						q.add(i);
					}
				}
			}
		}
	}
}
