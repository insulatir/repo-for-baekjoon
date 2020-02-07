import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			TreeMap<Integer, Integer> Q = new TreeMap<>();
			int k = scan.nextInt();
			for (int j = 0; j < k; j++) {
				String f = scan.next();
				int n = scan.nextInt();
				if (f.equals("I")) {
					Q.put(n, Q.containsKey(n) ? Q.get(n) + 1 : 1);
				} else {
					if (!Q.isEmpty()) {
						if (n == -1) {
							if (Q.get(Q.firstKey()) == 1) {
								Q.pollFirstEntry();
							} else {
								Q.put(Q.firstKey(), Q.get(Q.firstKey()) - 1);
							}
						} else {
							if (Q.get(Q.lastKey()) == 1) {
								Q.pollLastEntry();
							} else {
								Q.put(Q.lastKey(), Q.get(Q.lastKey()) - 1);
							}
						}
					}
				}
			}
			
			System.out.println(Q.isEmpty() ? "EMPTY" : Q.lastKey() + " " + Q.firstKey());
		}
		
		scan.close();
	}

}
