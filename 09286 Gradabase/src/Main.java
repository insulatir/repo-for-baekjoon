import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Case " + i + ":");
			int m = scan.nextInt();
			for (int j = 0; j < m; j++) {
				int grade = scan.nextInt();
				if (grade < 6) {
					System.out.println(grade+1);
				}
			}
		}
		
		scan.close();
	}

}
