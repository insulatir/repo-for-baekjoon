import java.io.*;
public class Main {
	static int[] last;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] Ns = new int[5];
		for (int i = 0; i < 5; i++) {
			Ns[i] = Integer.parseInt(br.readLine());
		}
		
		last = new int[10001];
		last(10000);
		
		for (int i : Ns) {
			bw.write(i + " -> " + last[i] + "\n");
		}
		
		bw.flush();
		bw.close();
	}

	public static void last(int N) {
		last[0] = 1;
		for (int i = 1; i <= N; i++) {
			int mul = i % 10;
			if (mul == 0) {
				mul = i / 10;
			}
			last[i] = (last[i-1] * mul) % 10;
			if (last[i] == 0) {
				last[i] = (last[i-1] * mul) / 10;
			}
		}
	}
}
