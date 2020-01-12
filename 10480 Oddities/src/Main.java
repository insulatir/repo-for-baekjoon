import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			System.out.print(x + " is ");
			System.out.println(x%2==0?"even":"odd");
		}
		
		scan.close();
	}

}
