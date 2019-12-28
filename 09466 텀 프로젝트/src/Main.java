import java.util.*;
import java.io.*;
public class Main {
	static List<ArrayList<Integer>> list;
	static boolean[] visited;
	static boolean[] student;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] stu = new int[n+1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				stu[j] = Integer.parseInt(st.nextToken());
			}
			
			visited = new boolean[n+1];
			student = new boolean[n+1];
			
			list = new ArrayList<>();
			for (int j = 0; j <= n; j++) {
				ArrayList<Integer> sub = new ArrayList<>();
				list.add(sub);
			}
			
			for (int j = 1; j <= n; j++) {
				list.get(j).add(stu[j]);
			}
		}
		
		bw.flush();
		bw.close();
	}

	public static void dfs(int v, int first) {
		visited[v] = true;
		
		for (int i : list.get(v)) {
			if (!visited[i]) {
				dfs(i, first);
			}
		}
		
		if (v == first) {
			
		}
	}
}
