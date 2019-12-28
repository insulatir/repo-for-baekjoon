import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		String result = "";
		int[] a0 = new int[41];
		int[] a1 = new int[41];
		a0[0] = 1;
		a0[1] = 0;
		a1[0] = 0;
		a1[1] = 1;
		for(int i = 2; i < 41; i++) {
			a0[i] = a0[i-1] + a0[i-2];
			a1[i] = a1[i-1] + a1[i-2];
		}
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			result += a0[N] + " " + a1[N] + "\n";
		}
		bw.write(result);
		bw.flush();
		bw.close();
	}

}
