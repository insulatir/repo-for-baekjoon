import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 1;
		int N = Integer.parseInt(br.readLine());
		int temp = N;
		int next = (N % 10) * 10 + (N / 10 + N % 10) % 10;
		for(int i = 2; next != N; i++) {
			temp = next;
			next = (temp % 10) * 10 + (temp / 10 + temp % 10) % 10;
			count = i;
		}
		bw.write(count + "");
		bw.flush();
		bw.close();
	}

}
