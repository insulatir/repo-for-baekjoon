import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			int count = 0;
			for (int a = 1; a < n; a++) {
				for (int b = a+1; b < n; b++) {
					if ((a*a+b*b+m) % (a*b) == 0) {
						count += 1;
					}
				}
			}
			System.out.print(count);
			if (i < T-1) {
				System.out.println();
			}
		}
		
		scan.close();
	}

}
