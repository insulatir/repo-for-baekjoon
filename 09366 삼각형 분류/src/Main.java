import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 1; i <= T; i++) {
			System.out.print("Case #" + i + ": ");
			int[] tri = new int[3];
			tri[0] = scan.nextInt();
			tri[1] = scan.nextInt();
			tri[2] = scan.nextInt();
			Arrays.sort(tri);
			if (tri[2] < tri[1] + tri[0]) {
				if (tri[0] == tri[1] && tri[1] == tri[2]) {
					System.out.println("equilateral");
				} else if (tri[0] == tri[1] || tri[0] == tri[2] || tri[1] == tri[2]) {
					System.out.println("isosceles");
				} else {
					System.out.println("scalene");
				}
			} else {
				System.out.println("invalid!");
			}
		}
		
		scan.close();
	}

}
