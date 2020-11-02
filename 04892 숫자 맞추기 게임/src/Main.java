import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int test = 1;
		while (n != 0) {
			System.out.print(test + ". ");
			
			if (n % 2 == 0) {
				System.out.print("even ");
			} else {
				System.out.print("odd ");
			}
			
			n = 3 * n;
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (n + 1) / 2;
			}
			
			n = 3 * n;
			
			n = n / 9;
			
			System.out.println(n);
			
			test += 1;
			n = scan.nextInt();
		}
		
		scan.close();
	}

}
