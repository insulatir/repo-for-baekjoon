import java.io.*;
public class Main {
	public static int[][] star;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		star = new int[N][N];
	
		rec(N, 0, 0);
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (star[i][j] == 1) {
					bw.write("*");
				} else {
					bw.write(" ");
				}
			}
			
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void rec(int N, int y, int x) {
		if (N == 1) {
			star[y][x] = 1;
			return;
		}
		
		int n = N/3;	
		rec(n, y, x);
		rec(n, y+n, x);
		rec(n, y+2*n, x);
		rec(n, y+2*n, x+n);
		rec(n, y+2*n, x+2*n);
		rec(n, y+n, x+2*n);
		rec(n, y, x+2*n);
		rec(n, y, x+n);
	}
}
