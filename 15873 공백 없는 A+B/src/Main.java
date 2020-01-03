import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		int A, B = 0;
		
		if (s > 1000) {
			A = 10;
			B = 10;
		} else if (s > 109) {
			A = s / 100;
			B = 10;
		} else if (s > 100) {
			A = 10;
			B = s % 100;
		} else {
			A = s / 10;
			B = s % 10;
		}
		
		System.out.print(A+B);
		
		scan.close();
	}

}
