import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int I = scan.nextInt();
		int res = 0;
		for (int i = 1; i <= I; i++) {
			if (I % i == 0) {
				res += i;
			}
		}
		System.out.print(res);
		
		scan.close();
	}

}
