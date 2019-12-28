import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> num = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreElements()) {
			num.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		long ans = 0;
		
		for (int i : num) {
			i -= B;
			ans += 1;

			if (i < 0) {
				i = 0;
			}
			
			ans += Math.ceil((double) i / C);
		}
		
		bw.write(ans + "");
		
		bw.flush();
		bw.close();
	}

}
