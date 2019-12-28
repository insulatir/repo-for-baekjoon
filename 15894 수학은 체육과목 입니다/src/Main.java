import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long ans = 4 * Long.parseLong(br.readLine());
		bw.write(ans + "");
		
		bw.flush();
		bw.close();
	}

}
