import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String string = br.readLine();
		int result = string.charAt(0);
		bw.write(result + "");
		bw.flush();
		bw.close();
	}

}
