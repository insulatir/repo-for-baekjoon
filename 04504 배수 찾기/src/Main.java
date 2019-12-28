import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int num = scan.nextInt();
		while (num > 0) {
			if (num % n == 0) {
				System.out.println(num + " is a multiple of " + n + ".");
			} else {
				System.out.println(num + " is NOT a multiple of " + n + ".");
			}
			
			num = scan.nextInt();
		}
		
		scan.close();
	}

}
