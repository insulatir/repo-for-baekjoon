import java.util.*;
public class Main {
	static int A;
	static int C;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextInt();
		int B = scan.nextInt();
		C = scan.nextInt();
		
		System.out.println(pow(B));
		
		scan.close();
	}

	public static long pow(int b) {
		if (b == 0) {
			return 1 % C;
		}
		
		long half = pow(b/2) % C;
		if (b % 2 == 0) {
			return (half * half) % C;
		} else {
			return ((half * half) % C * A) % C;
		}
	}
}
