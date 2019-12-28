import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			System.out.println((m+m-n) + " " + (n-m));
		}
		
		scan.close();
	}

}
