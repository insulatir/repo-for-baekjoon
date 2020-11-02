import java.util.*;
import java.io.*;
public class Main {
	static int N, M;
    static int MAX = 1000001;
    // 100만개의 노드, 21은 각 노드의 몇 (2^i)번째 부모인가
    static int[][] parent = new int[MAX][21];
    static int[] d = new int[MAX];
    static int[] root_dist = new int[MAX];
    static boolean [] visited = new boolean[MAX]; 
    static ArrayList<Integer>[] arr;
    static ArrayList<vector>[] dist;
    
    public static class vector {
    	int b;
    	int c;
    	
    	public vector(int b, int c) {
    		this.b = b;
    		this.c = c;
    	}
    }
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token;
        N = Integer.parseInt(br.readLine());
        arr = new ArrayList[N+1];
        dist =new ArrayList[N+1];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
            dist[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < N-1; i++) {
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());
            arr[a].add(b);
            arr[b].add(a);
            vector AC = new vector(a, c);
            vector BC = new vector(b, c);
            dist[a].add(BC);
            dist[b].add(AC);
        }
        
        dfs(1, 0, 0);
        set_parent();
        
        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
         
            bw.write(root_dist[a] + root_dist[b] - 2 * root_dist[lca(a,b)] + "\n");
        }
        
        bw.flush();
    }
    
    public static void dfs(int v, int depth, int dis) {
        visited[v] = true;
        // 깊이 저장
        d[v] = depth;
        // 길이 저장
        root_dist[v] = dis;
        
        for (int next : arr[v]) {
            if (!visited[next]) {
            	// next의 바로 윗 조상이 v
            	parent[next][0] = v;
            	for (vector vec : dist[next]) {
            		if (vec.b == v) {
            			dfs(next, depth+1, dis+vec.c);
            		}
            	}
            }
        }
    }
    
	public static void set_parent() {
        for (int j = 1; j < 21; j++) {
            for (int i = 1; i <= N; i++) {
                parent[i][j] = parent[parent[i][j - 1]][j - 1];
            }
        }
    }
	
	public static int lca(int a, int b) {
        // 깊이 : a < b
		if (d[a] > d[b]) {
            int t = a;
            a = b;
            b = t;
        }
    
        for (int i = 20; i >= 0; i--) {
        	int jump = 1 << i;
            // 가장 크게 jump
        	if (d[b]-d[a] >= jump) {
                b = parent[b][i];
            }
        }
        
        /// a, b의 깊이 동일
    
        if (a == b) {
        	return a;
        }
    
        // lca 찾기
        for (int i = 20; i >= 0; i--) {
            if (parent[a][i] != parent[b][i]) {
                a = parent[a][i];
                b = parent[b][i];
            }
        }
    
        return parent[a][0];
    }
}