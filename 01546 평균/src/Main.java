import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int M = 0;
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += Integer.parseInt(s[i]);
			if(Integer.parseInt(s[i]) > M) M = Integer.parseInt(s[i]);
		}
		//float average = (float)(sum / N);
		//float cAver = average / M * 100;
		float cAver = (float)sum * 100 / (float)(N * M);
		bw.write(cAver + "");
		bw.flush();
		bw.close();
	}

}
