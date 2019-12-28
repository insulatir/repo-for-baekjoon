import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long N = scan.nextLong();
		long result = ((3 * N * N + 5 * N + 2) / 2) % 45678;
		System.out.println(result);
		
		scan.close();
	}

}
