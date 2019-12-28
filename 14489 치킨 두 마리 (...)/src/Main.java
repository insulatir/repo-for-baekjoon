import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		System.out.println(A + B - 2 * C < 0 ? A + B : A + B - 2 * C);
		scan.close();
	}

}
