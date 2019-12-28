import java.util.*;
import java.io.*;
public class Main {
	static List<ArrayList<Integer>> map;
	static boolean[] visited;
	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		map = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			map.add(list);
		}	
		
		visited = new boolean[N+1];
		for (int i = 1; i <= N; i++) {
			map.get(i).add(Integer.parseInt(br.readLine()));
		}
		
		int max = 0;
		int maxi = 0;
		for (int i = 1; i <= N; i++) {
			count = 0;
			dfs(i);
			visited = new boolean[N+1];
			if (max < count) {
				max = count;
				maxi = i;
			}
		}
		
		bw.write(maxi + "");
		
		bw.flush();
		bw.close();
	}

	public static void dfs(int v) {
		visited[v] = true;
		count += 1;
		
		for (int n : map.get(v)) {
			if (!visited[n]) {
				dfs(n);
			}
		}
	}
}
