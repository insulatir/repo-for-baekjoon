import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			long X = scan.nextLong();
			
			boolean squre = false;
			long sqrt = (long)Math.sqrt(X);
			
			while (X < sqrt * sqrt) {
				sqrt -= 1;
			}
			
			if (X == sqrt * sqrt) {
				squre = true;
			}
			
			System.out.print(squre ? 1 : 0);
			
			if (i != N-1) {
				System.out.print(" ");
			}
		}
		
		scan.close();
	}

}
