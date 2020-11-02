import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int k1 = scan.nextInt();
		int n2 = scan.nextInt();
		int k2 = scan.nextInt();
		
		System.out.print(n1 * k1 + n2 * k2);
		
		scan.close();
	}

}
