import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int quot = (n - 1) / 4;
		int rema = (n - 1) % 4;
		
		if (quot % 2 == 0) {
			System.out.println(rema + 1);
		} else {
			System.out.println(5 - rema);
		}
		
		scan.close();
	}

}
