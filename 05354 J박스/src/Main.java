import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int size = Integer.parseInt(br.readLine());
			
			for (int j = 0; j < size; j++) {
				for (int k = 0; k < size; k++) {
					if (j == 0 || k == 0|| j == size-1 || k == size-1) {
						bw.write("#");
					} else {
						bw.write("J");
					}
				}
				bw.write("\n");
			}
			if (i != T-1) {
				bw.write("\n");
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}
