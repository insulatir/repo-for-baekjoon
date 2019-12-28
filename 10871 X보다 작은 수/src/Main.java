import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		int N = Integer.parseInt(a[0]);
		int X = Integer.parseInt(a[1]);
		String result = "";
		for(int i = 0; i < N; i++)
			if(Integer.parseInt(b[i]) < X) result += b[i] + " ";
		bw.write(result);
		bw.flush();
		bw.close();
	}

}
