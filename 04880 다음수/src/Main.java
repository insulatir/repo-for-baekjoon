import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		int a3 = scan.nextInt();
		while (!(a1 == 0 && a2 == 0 && a3 == 0)) {
			if (a2+a2==a1+a3) {
				System.out.println("AP " + (a3+a2-a1));
			} else {
				System.out.println("GP " + (a3*a2/a1));
			}
			a1 = scan.nextInt();
			a2 = scan.nextInt();
			a3 = scan.nextInt();
		}
		
		scan.close();
	}

}
