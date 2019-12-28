import java.util.*;
public class Main {
	static long[][] poly;
	static long[][] oliv;
	static List<Long> res;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		poly = new long[N][2];
		for (int i = 0; i < N; i++) {
			poly[i][0] = scan.nextLong();
			poly[i][1] = scan.nextLong();
		}
		
		int M = scan.nextInt();
		oliv = new long[M][2];
		for (int i = 0; i < M; i++) {
			oliv[i][0] = scan.nextLong();
			oliv[i][1] = scan.nextLong();
		}
		
		res = new LinkedList<Long>();
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				if (j == (i + 1) % N || j == (i - 1 + N) % N) {
					continue;
				}
				
				long x1 = poly[i][0];
				long y1 = poly[i][1];
				long x2 = poly[j][0];
				long y2 = poly[j][1];
				long x3 = oliv[0][0];
				long y3 = oliv[0][1];
				
				boolean valid = true;
				long op = ccw(x1, x2, x3, y1, y2, y3);
				for (int k = 1; k < M; k++) {
					x3 = oliv[k][0];
					y3 = oliv[k][1];
					
					long afOp = ccw(x1, x2, x3, y1, y2, y3);
					if (op != afOp) {
						valid = false;
						break;
					}
					
					op = afOp;
				}
				
				long max = 0;
				if (valid) {
					for (int k = 0; k < N; k++) {
						x3 = poly[k][0];
						y3 = poly[k][1];
						
						if (op * ccw(x1, x2, x3, y1, y2, y3) < 0) {
							long s = Math.abs((x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1));
							max = Math.max(max, s);
						}
					}
					
					System.out.println();
				}
				
				res.add(max);
			}
		}
		
		Collections.sort(res);
		System.out.println(res.get(res.size()-1));
		
		scan.close();
	}

	public static long ccw(long x1, long x2, long x3, long y1, long y2, long y3) {
		long op = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
		return Long.signum(op);
	}
}
