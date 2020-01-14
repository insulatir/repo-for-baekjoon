import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean[] x = new boolean[5];
		boolean res = true;
		
		for (int i = 0; i < 5; i++) {
			x[i] = scan.nextInt() == 1;
		}
		for (int i = 0; i < 5; i++) {
			res = res && (x[i] ^ (scan.nextInt() == 1));
		}
		
		System.out.print(res?"Y":"N");
		
		scan.close();
	}

}
