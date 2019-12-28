import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		List<Integer> num = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			if (i != L) {
				num.add(i);
			}
		}
		
		String nine = Integer.toString(N, 9);
		StringBuilder ans = new StringBuilder("");
		for (int i = 0; i < nine.length(); i++) {
			int index = nine.charAt(i)-'0';
			if (L == 0) {
				index -= 1;
			}
			ans.append(num.get(index));
		}
		
		bw.write(ans.toString());
		
		bw.flush();
		bw.close();
	}

}
