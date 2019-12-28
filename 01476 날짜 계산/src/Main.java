import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int E = scan.nextInt();
		int S = scan.nextInt();
		int M = scan.nextInt();
		
		int year = 28 * 19 * inverse(28 * 19, 15) * E +
				15 * 19 * inverse(15 * 19, 28) * S +
				15 * 28 * inverse(15 * 28, 19) * M;
		
		System.out.println(year % (15 * 28 * 19) == 0 ? 7980 : year % (15 * 28 * 19));
		
		scan.close();
	}

	public static int inverse(int a, int b) {
		int si = 1;
		int sii = 0;
		int ti = 0;
		int tii = 1;
		int ri = a;
		int rii = b;
		int q = a / b;
		
		while (rii != 0) {
			int sb = sii;
			int tb = tii;
			int rb = rii;
			q = ri / rii;
			sii = si - sii * q;
			tii = ti - tii * q;
			rii = ri % rii;
			si = sb;
			ti = tb;
			ri = rb;
		}
		
		return (si + b) % b;
	}
}
