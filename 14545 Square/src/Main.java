import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int P = scan.nextInt();
		for (int i = 0; i < P; i++) {
			long l = scan.nextLong();
			System.out.println(l * (l + 1) * (l + l + 1) / 6);
		}
		
		scan.close();
	}

}
