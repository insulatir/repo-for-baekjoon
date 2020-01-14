import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int x3 = scan.nextInt();
		int y3 = scan.nextInt();
		
		double[] tri = new double[3];
		tri[0] = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		tri[1] = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		tri[2] = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		Arrays.sort(tri);
		
		double a = tri[0];
		double b = tri[1];
		double c = tri[2];
		
		if (a + b > c) {
			if (a == b && b == c) {
				System.out.print("JungTriangle");
			} else if (a == b || b == c || a == c) {
				if (Math.round(c*c) > Math.round(a*a) + Math.round(b*b)) {
					System.out.print("Dunkak2Triangle");
				} else if (Math.round(c*c) == Math.round(a*a) + Math.round(b*b)) {
					System.out.print("Jikkak2Triangle");
				} else {
					System.out.print("Yeahkak2Triangle");
				}
			} else {
				if (Math.round(c*c) > Math.round(a*a) + Math.round(b*b)) {
					System.out.print("DunkakTriangle");
				} else if (Math.round(c*c) == Math.round(a*a) + Math.round(b*b)) {
					System.out.print("JikkakTriangle");
				} else {
					System.out.print("YeahkakTriangle");
				}
			}
		} else {
			System.out.print("X");
		}
		
		scan.close();
	}

}
