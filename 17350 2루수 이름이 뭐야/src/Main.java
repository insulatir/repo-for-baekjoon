import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		boolean anj = false;
		for (int i = 0; i < n; i++) {
			String name = scan.next();
			if (name.equals("anj")) {
				anj = true;
				break;
			}
		}
		
		System.out.println(anj ? "构具;" : "构具?");
		
		scan.close();
	}

}
