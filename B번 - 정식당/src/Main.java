import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
	
		Map<String, Long> a = new HashMap<>();
		Map<String, Long> b = new HashMap<>();
		List<String> c = new ArrayList<>();
		
		for (int i = 0; i < A; i++) {
			st = new StringTokenizer(br.readLine());
			a.put(st.nextToken(), Long.parseLong(st.nextToken()));
		}
		for (int i = 0; i < B; i++) {
			st = new StringTokenizer(br.readLine());
			b.put(st.nextToken(), Long.parseLong(st.nextToken()));
		}
		for (int i = 0; i < C; i++) {
			c.add(br.readLine());
		}
		
		int N = Integer.parseInt(br.readLine());
		String[] menu = new String[N];
		for (int i = 0; i < N; i++) {
			menu[i] = br.readLine();
		}
		
		boolean ok = true;
		
		int service = 0;
		int special_stand = 0;
		int special = 0;
		int stand = 0;
		
		for (String s : menu) {
			if (c.contains(s)) {
				service += 1;
			} else if (b.containsKey(s)) {
				special += 1;
				special_stand += b.get(s);
			} else {
				stand += a.get(s);
				special_stand += a.get(s);
			}
		}
		
		if (service > 1) {
			ok = false;
		} else {
			if (service == 1) {
				if (special_stand < 50000) {
					ok = false;
				} else {
					if (special > 0) {
						if (stand < 20000) {
							ok = false;
						}
					}
				}
			} else {
				if (special > 0) {
					if (stand < 20000) {
						ok = false;
					}
				}
			}
		}
		
		bw.write(ok ? "Okay" : "No");
		
		bw.flush();
		bw.close();
	}

}
