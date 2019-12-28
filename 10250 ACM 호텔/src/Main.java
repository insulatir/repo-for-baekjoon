import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		String string = "";
		for(int i = 0; i < T; i++) {
			String[] array = br.readLine().split(" ");
			int H = Integer.parseInt(array[0]);
			//int W = Integer.parseInt(array[1]);
			int N = Integer.parseInt(array[2]);
			int X = (N-1) / H + 1;
			int Y = 0;
			if(N % H == 0) Y = H;
			else Y = N % H;
			// X, Y의 범위 확인
			int result = 100*Y + X;
			string += result + "\n";
		}
		bw.write(string);
		bw.flush();
		bw.close();
	}

}
