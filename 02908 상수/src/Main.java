import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] array = br.readLine().split(" ");
		int A = Integer.parseInt(array[0]);
		int B = Integer.parseInt(array[1]);
		int iA = A + (A % 10 - A / 100) * 99;
		int iB = B + (B % 10 - B / 100) * 99;
		bw.write(Integer.max(iA, iB) + "");
		bw.flush();
		bw.close();
	}

}
