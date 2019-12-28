import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] array = br.readLine().split(" ");
		bw.write(Integer.parseInt(array[0]) + Integer.parseInt(array[1]) + "");
		bw.flush();
		bw.close();
	}

}
