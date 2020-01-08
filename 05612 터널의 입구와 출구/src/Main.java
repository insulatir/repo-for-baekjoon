import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] car = new int[n+1];
		car[0] = m;
		boolean not0 = true;
		for (int i = 1; i <= n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			m = m + a - b;
			car[i] = m;
			if (m < 0) {
				not0 = false;
				break;
			}
		}
		
		if (not0) {
			Arrays.sort(car);
			System.out.print(car[n]);
		} else {
			System.out.print(0);
		}
		
		scan.close();
	}

}
