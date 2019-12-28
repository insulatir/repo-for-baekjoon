import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long N = Integer.parseInt(br.readLine());
		// int는 -20억 ~ 20억
		double n = 0;
		if(N == 1) n = 1;
		else n = Math.sqrt((double)(4*N-5)/(double)12) + 1.5;
		// 4*N에서 N이 10억이면 40이라서 벗어남. 즉, NaN
		int result = (int) n;
		bw.write(result + "");
		bw.flush();
		bw.close();
	}

}
