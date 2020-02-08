import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int e = scan.nextInt();
		int f = scan.nextInt();
		int c = scan.nextInt();
		
		int empty = e + f;
		int res = 0;
		while (empty >= c) {
			empty -= c;
			res += 1;
			empty += 1;
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
