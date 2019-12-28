import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int X = Integer.parseInt(br.readLine());
		int n = (int)((Math.sqrt(8*X-7)+1)/2.0);
		int a = 0;
		int b = 0;
		String result = "";
		if(n%2 == 1) {
			b = X-n*(n-1)/2;
			a = n+1-b;
		}
		else {
			a = X-n*(n-1)/2;
			b = n+1-a;
		}
		result += a + "/" + b;
		bw.write(result);
		bw.flush();
		bw.close();
	}

}
