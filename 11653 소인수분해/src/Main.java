import java.io.*;
import java.util.*;
public class Main {
	static boolean[] num;
	static List<Integer> prime;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		num = new boolean[10000001];
		prime = new ArrayList<>();
		
		era(num.length-1);
		
		for (int i : prime) {
			if (N == 1) {
				break;
			}
			
			while (N % i == 0) {
				N /= i;
				bw.write(i + "\n");
			}
		}
		
		bw.flush();
		bw.close();
	}

	public static void era(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (num[i]) {
				continue;
			}
			
			for (int j = i + i; j <= n; j += i) {
				num[j] = true;
			}
		}
		
		for (int i = 2; i <= n; i++) {
			if (!num[i]) {
				prime.add(i);
			}
		}
	}
}
