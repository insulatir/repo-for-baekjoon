import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		BigInteger[][] map = new BigInteger[101][101];
		
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				map[i][j] = new BigInteger("-1");
			}
		}
		
		System.out.print(pascal(n, m, map));
		
		scan.close();
	}
	
	public static BigInteger check(int n, int m, BigInteger[][] map) {
		if (n < m) {
			return new BigInteger("0");
		}
		
		if (m == 0) {
			return new BigInteger("1");
		}
		
		return map[n][m];
	}

	public static BigInteger pascal(int n, int m, BigInteger[][] map) {
		BigInteger a = check(n-1, m-1, map);
		if (a.equals(new BigInteger("-1"))) {
			map[n-1][m-1] = pascal(n-1, m-1, map);
			a = map[n-1][m-1];
		}
		
		BigInteger b = check(n-1, m, map);
		if (b.equals(new BigInteger("-1"))) {
			map[n-1][m] = pascal(n-1, m, map);
			b = map[n-1][m];
		}
		
		return a.add(b);
	}
}
