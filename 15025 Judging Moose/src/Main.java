import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		int r = scan.nextInt();
		
		if (l == r) {
			if (l > 0) {
				System.out.print("Even " + 2*l);
			} else {
				System.out.print("Not a moose");
			}
		} else {
			if (l < r) {
				System.out.print("Odd " + 2*r);
			} else {
				System.out.print("Odd " + 2*l);
			}
		}
		
		scan.close();
	}

}
