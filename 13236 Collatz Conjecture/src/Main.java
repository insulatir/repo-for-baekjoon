import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		while (n != 1) {
			System.out.print(n + " ");
			n = n % 2 == 0 ? n / 2 : n * 3 + 1;
		}
		
		System.out.print(n);
		
		scan.close();
	}

}
