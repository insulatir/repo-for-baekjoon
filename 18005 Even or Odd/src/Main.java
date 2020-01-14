import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		if (n % 2 == 0) {
			if (n % 4 == 0) {
				System.out.println(2);
			} else {
				System.out.print(1);
			}
		} else {
			System.out.print(0);
		}
		
		scan.close();
	}

}
