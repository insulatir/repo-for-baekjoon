import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] small = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			small[i] = Integer.parseInt(br.readLine());
			sum += small[i];
		}
		
		int diff = sum - 100;
		for (int i = 0; i < 8; i++) {
			for (int j = i+1; j < 9; j++) {
				if (diff == small[i] + small[j]) {
					for (int k = 0; k < 9; k++) {
						if (k != i && k != j) {
							bw.write(small[k] + "\n");
						}
					}
				}
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}
