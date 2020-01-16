import java.util.*;
public class Main {
	static boolean[] visit;
	static int[] count;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			visit = new boolean[10000];
			count = new int[10000];
			
			bfs(a, b);
		}
		
		scan.close();
	}

	public static void bfs(int v, int w) {
		Queue<String> q = new LinkedList<>();
		
		visit[v] = true;
		q.add(v + "");
		
		boolean possible = false;
		while (!q.isEmpty()) {
			String u = q.poll();
			
			if (Integer.parseInt(u) == w) {
				possible = true;
				break;
			}
			
			for (int i = 0; i < 4; i++) {
				int[] is = new int[4];
				for (int j = 0; j < 4; j++) {
					is[j] = u.charAt(j) - 48;
				}
				
				int ith = is[i];
				for (int j = 0; j < 10; j++) {
					is[i] = j;
					int n = is[0] * 1000 + is[1] * 100 + is[2] * 10 + is[3];
					if (isValidPrime(n) && j != ith) {
						if (!visit[n]) {
							visit[n] = true;
							count[n] = count[Integer.parseInt(u)] + 1;
							q.add(n + "");
						}
					}
				}
			}
		}
		
		System.out.println(possible ? count[w] : "Impossible");
	}
	
	public static boolean isValidPrime(int n) {
		if (n >= 1000) {
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			
			return true;
		} else {
			return false;
		}
	}
}
