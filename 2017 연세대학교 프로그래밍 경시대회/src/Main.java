import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		if (N % 2 == 0) {
			if (N < 6) {
				System.out.print(0);
			} else {
				System.out.print((N-4)/2);
			}
		} else {
			System.out.print(0);
		}
		
		scan.close();
	}

}
