import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = scan.nextInt();
		int w = scan.nextInt();
		
		int count = 0;
		int sheep = 0;
		int goat = 0;
		for (int i = 1; i < n; i++) {
			if ((w-i*a)%b == 0 && i + (w-i*a)/b == n) {
				count += 1;
				sheep = i;
				goat = (w-i*a)/b;
			}
		}
		
		if (count == 1) {
			System.out.print(sheep + " " + goat);
		} else {
			System.out.print(-1);
		}
		
		scan.close();
	}

}
