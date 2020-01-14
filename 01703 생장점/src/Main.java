import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		while (a != 0) {
			int res = 1;
			for (int i = 0; i < a; i++) {
				res = res * scan.nextInt() - scan.nextInt();
			}
			System.out.println(res);
			a = scan.nextInt();
		}
		
		scan.close();
	}

}
