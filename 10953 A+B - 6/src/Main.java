import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i ++) {
			String[] array = br.readLine().split(",");
			System.out.println(Integer.parseInt(array[0])+Integer.parseInt(array[1]));
		}
		bw.flush();
		bw.close();
	}

}
