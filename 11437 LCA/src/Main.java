import java.util.*;
import java.io.*;
public class Main {
	static int N, M;
    static int MAX = 1000001;
    // 100������ ���, 21�� �� ����� �� (2^i)��° �θ��ΰ�
    static int[][] parent = new int[MAX][21];
    static int[] d = new int[MAX];
    static boolean [] visited = new boolean[MAX]; 
    static ArrayList<Integer>[] arr;
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token;
        N = Integer.parseInt(br.readLine());
        arr = new ArrayList[N+1];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < N-1; i++) {
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            arr[a].add(b);
            arr[b].add(a);            
        }
        
        dfs(1, 0);
        set_parent();
        
        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
         
            bw.write(lca(a, b) + "\n");
        }
        
        bw.flush();
    }
    
    public static void dfs(int v, int depth) {
        visited[v] = true;
        // ���� ����
        d[v] = depth;
        
        for (int next : arr[v]) {
            if (!visited[next]) {
            	// next�� �ٷ� �� ������ v
            	parent[next][0] = v;
                dfs(next, depth+1);
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
        // ���� : a < b
		if (d[a] > d[b]) {
            int t = a;
            a = b;
            b = t;
        }
    
        for (int i = 20; i >= 0; i--) {
        	int jump = 1 << i;
            // ���� ũ�� jump
        	if (d[b]-d[a] >= jump) {
                b = parent[b][i];
            }
        }
        
        /// a, b�� ���� ����
    
        if(a == b) {
        	return a;
        }
    
        // lca ã��
        for (int i = 20; i >= 0; i--) {
            if (parent[a][i] != parent[b][i]) {
                a = parent[a][i];
                b = parent[b][i];
            }
        }
    
        return parent[a][0];
    }
}