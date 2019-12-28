import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> num = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			num.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(num);
		for(int i = 0; i < N; i++) {
			bw.write(num.get(i) + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
