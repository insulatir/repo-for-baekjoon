import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		boolean[] fence = new boolean[101];
		for (int i = a; i <= b; i++) {
			fence[i] = true;
		}
		for (int i = c; i <= d; i++) {
			fence[i] = true;
		}
		
		int res = 0;
		int count = 0;
		boolean before = false;
		for (int i = 0; i <= 100; i++) {
			count += before ^ fence[i] ? 1 : 0;
			if (fence[i]) {
				res += 1;
			}
			before = fence[i];
		}
		
		System.out.print(count < 3 ? res - 1 : res - 2);
		
		scan.close();
	}

}
