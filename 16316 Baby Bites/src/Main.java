import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		boolean sense = true;
		for (int i = 1; i <= n; i++) {
			String ith = scan.next();
			if (ith.equals(i + "") || ith.equals("mumble")) {
				continue;
			} else {
				sense = false;
				break;
			}
		}
		
		System.out.print(sense?"makes sense":"something is fishy");
		
		scan.close();
	}

}
