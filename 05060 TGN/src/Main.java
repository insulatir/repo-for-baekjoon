import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			int r = scan.nextInt();
			int e = scan.nextInt();
			int c = scan.nextInt();
			switch (Integer.signum(e - c - r)) {
			case 1:
				System.out.println("advertise");
				break;
			case 0:
				System.out.println("does not matter");
				break;
			case -1:
				System.out.println("do not advertise");
				break;
			}
		}
		
		scan.close();
	}

}
