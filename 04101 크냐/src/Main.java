import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		while (a != 0) {
			System.out.println(a > b ? "Yes" : "No");
			a = scan.nextInt();
			b = scan.nextInt();
		}
		
		scan.close();
	}

}
