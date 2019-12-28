import java.util.*;
import java.io.*;
public class Main {
	
	public static class ABC {
		int A;
		int B;
		int C;
		boolean visited;
		
		public ABC(int A, int B, int C, boolean visited) {
			this.A = A;
			this.B = B;
			this.C = C;
			this.visited = visited;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		
		
		bw.flush();
		bw.close();
	}

	public static void bfs(ABC abc) {
		Queue<ABC> q = new LinkedList<>();
		
		abc.visited = true;
		q.add(abc);
		
		while (!q.isEmpty()) {
			ABC n = q.poll();
			
		}
	}
}
