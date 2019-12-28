import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> xs = new ArrayList<>();
		List<Integer> ys = new ArrayList<>();
		
		StringTokenizer st;
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if (xs.contains(x)) {
				xs.remove(xs.indexOf(x));
			} else {
				xs.add(x);
			}
			
			if (ys.contains(y)) {
				ys.remove(ys.indexOf(y));
			} else {
				ys.add(y);
			}
		}
		
		bw.write(xs.get(0) + " " + ys.get(0));
		
		bw.flush();
		bw.close();
	}

}
