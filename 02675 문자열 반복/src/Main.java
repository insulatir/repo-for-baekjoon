import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		String result = "";
		for(int i = 0; i < T; i++) {
			String[] array = br.readLine().split(" ");
			int R = Integer.parseInt(array[0]);
			String S = array[1];
			String temp = "";
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++)
					temp += S.charAt(j);
			}
			result += temp + "\n";	
		}
		bw.write(result);
		bw.flush();
		bw.close();
	}

}
