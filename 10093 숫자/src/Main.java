import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextLong();
		long B = scan.nextLong();
		
		if (A < B) {
			System.out.println(B-A-1);
			
			for (long i = A+1; i < B; i++) {
				System.out.print(i + " ");
			}
		} else if (A > B) {
			System.out.println(A-B-1);
			
			for (long i = B+1; i < A; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print(0);
		}
		
		scan.close();
	}

}
