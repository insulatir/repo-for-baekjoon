import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		
		if ((n1 == 8 || n1 == 9) && (n2 == n3) && (n4 == 8 || n4 == 9)) {
			System.out.print("ignore");
		} else {
			System.out.print("answer");
		}
		
		scan.close();
	}

}
