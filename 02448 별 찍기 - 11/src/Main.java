import java.io.*;
public class Main {
	private static char[][] tri;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		tri = new char[N][2*N-1];
		for(int i = 0; i < N; i++)
			for(int j = 0; j < 2*N-1; j++)
				tri[i][j] = ' ';
		drawTree(0, 0, N);
		for(int i = N-1; i >= 0; i--) {
			for(int j = 0; j < 2*N-1; j++) 
				bw.write(tri[i][j] == '*' ? '*' : ' ');
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void drawTree(int y, int x, int N) {
		if(N == 3) {
			tri[y][x] = tri[y][x+1] = tri[y][x+2] = tri[y][x+3] = tri[y][x+4] = '*';
			tri[y+1][x+1] = tri[y+1][x+3] = '*';
			tri[y+2][x+2] = '*';
			return;
		}
		drawTree(y, x, N/2);
		drawTree(y+N/2, x+N/2, N/2);
		drawTree(y, x+N, N/2);
	}
}

