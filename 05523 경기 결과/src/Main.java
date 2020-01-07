import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int a = 0;
		int b = 0;
		for (int i = 0; i < N; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			if (A > B) {
				a += 1;
			} else if (A < B) {
				b += 1;
			} 
		}
		
		System.out.print(a + " " + b);
		
		scan.close();
	}

}
