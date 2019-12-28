import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		double D = scan.nextDouble();
		
		double s0 = A / C + B / D;
		double s1 = C / D + A / B;
		double s2 = D / B + C / A;
		double s3 = B / A + D / C;
		
		if (s0 > s1) {
			if (s2 > s3) {
				if (s0 > s2) {
					System.out.println(0);
				} else {
					System.out.println(2);
				}
			} else {
				if (s0 > s3) {
					System.out.println(0);
				} else {
					System.out.println(3);
				}
			}
		} else {
			if (s2 > s3) {
				if (s1 > s2) {
					System.out.println(1);
				} else {
					System.out.println(2);
				}
			} else {
				if (s1 > s3) {
					System.out.println(1);
				} else {
					System.out.println(3);
				}
			}
		}
		
		scan.close();
	}

}
