import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int P = scan.nextInt();
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		int p = 0;
		int m = 0;
		int n = 0;
		
		if (1 <= P%(A+B) && P%(A+B) <= A) {
			p += 1;
		}
		if (1 <= P%(C+D) && P%(C+D) <= C) {
			p += 1;
		}
		if (1 <= M%(A+B) && M%(A+B) <= A) {
			m += 1;
		}
		if (1 <= M%(C+D) && M%(C+D) <= C) {
			m += 1;
		}
		if (1 <= N%(A+B) && N%(A+B) <= A) {
			n += 1;
		}
		if (1 <= N%(C+D) && N%(C+D) <= C) {
			n += 1;
		}
		
		System.out.println(p);
		System.out.println(m);
		System.out.print(n);
		
		scan.close();
	}

}
