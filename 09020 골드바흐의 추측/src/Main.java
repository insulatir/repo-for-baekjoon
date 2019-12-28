import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
	static int[] num;
	static List<Integer> prime;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		era(10000);
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			int a = 0;
			int b = 0;
			int big = 1;
			int small = n-2;
			Iterator<Integer> it = prime.iterator();
			while (big < small) {
				big = it.next();
				small = n - big;
				if (prime.contains(small)) {
					a = Math.min(small, big);
					b = Math.max(small, big);
				}
			}
			
			bw.write(a + " " + b + "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void era(int n) {
		num = new int[n+1];
		prime = new ArrayList<>();
		
		for (int i = 2; i * i <= n; i++) {
			if (num[i] == 1) {
				continue;
			}
			
			for (int j = i + i; j <= n; j += i) {
				num[j] = 1;
			}
		}
		
		for (int i = 2; i <= n; i++) {
			if (num[i] == 0) {
				prime.add(i);
			}
		}
	}
}
