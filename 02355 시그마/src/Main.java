import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextInt();
		long B = scan.nextInt();
		long L = A < B ? B - A + 1 : A - B + 1;
		
		if (L % 2 == 0) {
			System.out.println((A + B) * ((L + 1) / 2));
		} else {
			System.out.println((A + B) * ((L + 1) / 2) - (A + B) / 2);
		}
		
		scan.close();
	}

}
