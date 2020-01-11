import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		int door = scan.nextInt();
		if (N.equals("1") || N.equals("2") || N.equals("3")
				|| N.equals("4") || N.equals("5")) {
			for (int i = 1; i < Integer.parseInt(N); i++) {
				door = 1 - door;
				System.out.println(door);
			}
		} else {
			System.out.print("Love is open door");
		}
		
		scan.close();
	}

}
