import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("You get " + a/b + " piece(s) and your dad gets " + a%b + " piece(s).");
		}
		
		scan.close();
	}

}
