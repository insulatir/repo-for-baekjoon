import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(2);
		for (int i = 3; i <= 2000000000; i++) {
			int r = list.get(i);
			for (int j = 0; j < r && list.size() <= 2000000001; j++) {
				list.add(i);
			}
		}
		
		bw.write(list.get(n) + "");
		
		bw.flush();
		bw.close();
	}

}
