import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int q1 = 0;
		int q2 = 0;
		int q3 = 0;
		int q4 = 0;
		int ax = 0;
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			if (x == 0 || y == 0) {
				ax += 1;
			} else {
				if (x > 0) {
					if (y > 0) {
						q1 += 1;
					} else {
						q4 += 1;
					}
				} else {
					if (y > 0) {
						q2 += 1;
					} else {
						q3 += 1;
					}
				}
			}
		}
		
		System.out.println("Q1: " + q1);
		System.out.println("Q2: " + q2);
		System.out.println("Q3: " + q3);
		System.out.println("Q4: " + q4);
		System.out.println("AXIS: " + ax);
		
		scan.close();
	}

}
