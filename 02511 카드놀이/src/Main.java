import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> A = new ArrayList<>();
		while (st.hasMoreTokens()) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		List<Integer> B = new ArrayList<>();
		while (st.hasMoreTokens()) {
			B.add(Integer.parseInt(st.nextToken()));
		}
		
		int a = 0;
		int b = 0;
		int a_win = -1;
		int b_win = -1;
		for (int i = 0; i < 10; i++) {
			if (A.get(i) > B.get(i)) {
				a += 3;
				a_win = i;
			} else if (A.get(i) < B.get(i)) {
				b += 3;
				b_win = i;
			} else {
				a += 1;
				b += 1;
			}
		}
		
		bw.write(a + " " + b + "\n");
		if (a > b) {
			bw.write("A");
		} else if (a < b) {
			bw.write("B");
		} else {
			if (a_win > b_win) {
				bw.write("A");
			} else if (a_win < b_win) {
				bw.write("B");
			} else {
				bw.write("D");
			}
		}
		
		bw.flush();
		bw.close();
	}

}
