import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int max = 0;
		boolean[] check = new boolean[201];
		for (int i = 0; i < n; i++) {
			int cite = scan.nextInt();
			if (i == n - 1) {
				max = cite;
			}
			check[cite] = true;
		}
		
		boolean good_job = true;
		for (int i = 1; i < max; i++) {
			if (!check[i]) {
				System.out.println(i);
				good_job = false;
			}
		}
		
		if (good_job) {
			System.out.print("good job");
		}
		
		scan.close();
	}

}
