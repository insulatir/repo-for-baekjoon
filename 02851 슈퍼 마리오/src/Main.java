import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int before = 0;
		int after = scan.nextInt();
		int i = 1;
		while (after <= 100 && i < 10) {
			before = after;
			after += scan.nextInt();
			i += 1;
		}

		System.out.println(100 - before >= after - 100 ? after : before);
		
		scan.close();
	}

}
