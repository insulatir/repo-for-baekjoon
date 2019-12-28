import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(oneNumber(Integer.parseInt(br.readLine())) + "");
		bw.flush();
		bw.close();
	}

	public static int oneNumber(int N) {
		int count = 99;
		if(N < 100) return N;
		if(N == 1000) return oneNumber(999);
		else {
			for(int i = 100; i <= N; i++)
				if((i / 100 - (i /10) % 10) == ((i / 10) % 10 - i % 10)) 
					count++;
		}
		return count;
	}
}
