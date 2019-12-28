import java.util.*;
import java.io.*;
public class Main {
	static int R, C, ZR, ZC;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		ZR = Integer.parseInt(st.nextToken());
		ZC = Integer.parseInt(st.nextToken());
		
		String[][] news = new String[R][C];
		for (int i = 0; i < R; i++) {
			news[i] = br.readLine().split("");
		}
		
		for (int i = 0; i < R*ZR; i++) {
			for (int j = 0; j < C*ZC; j++) {
				bw.write(news[i/ZR][j/ZC]);
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
	
}
