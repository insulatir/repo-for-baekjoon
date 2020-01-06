import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int p1 = scan.nextInt();
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		int p2 = scan.nextInt();
		
		if (p1+p2 < s1+s2) {
			System.out.print("Esteghlal");
		} else if (p1+p2 > s1+s2) {
			System.out.print("Persepolis");
		} else {
			if (s1 > p2) {
				System.out.print("Esteghlal");
			} else if (s1 < p2) {
				System.out.print("Persepolis");
			} else {
				System.out.print("Penalty");
			}
		}
		
		scan.close();
	}

}
