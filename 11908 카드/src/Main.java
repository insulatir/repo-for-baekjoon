import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int max = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int c = scan.nextInt();
			sum += c;
			if (max < c) {
				max = c;
			}
		}
		
		System.out.print(sum - max);
		
		scan.close();
	}

}
