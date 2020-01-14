import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		while (n != -1) {
			int miles = 0;
			int before = 0;
			for (int i = 0; i < n; i++) {
				int s = scan.nextInt();
				int t = scan.nextInt();
				
				miles += s * (t - before);
				before = t;
			}
			
			System.out.println(miles + " miles");
			
			n = scan.nextInt();
		}
		
		scan.close();
	}

}
