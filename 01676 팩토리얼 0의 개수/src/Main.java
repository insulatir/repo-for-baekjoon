import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int zero = 0;
		zero = N/5 + N/25 + N/125;
		System.out.print(zero);
		scan.close();
	}

}
