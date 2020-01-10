import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			long a = scan.nextLong();
			long b = scan.nextLong();	
			
			int count = 0;
			while (a % 2 == 0) {
				a /= 2;
				count += 1;
			}
			
			System.out.println(n - count);
		}
		
		scan.close();
	}

}
