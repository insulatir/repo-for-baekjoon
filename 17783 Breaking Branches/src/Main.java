import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.print(n % 2 == 0 ? "Alice\n" + n / 2 : "Bob");
		
		scan.close();
	}

}
