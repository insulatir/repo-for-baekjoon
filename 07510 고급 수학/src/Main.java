import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			long[] tri = new long[3];
			tri[0] = scan.nextLong();
			tri[1] = scan.nextLong();
			tri[2] = scan.nextLong();
			boolean rec = false;
			Arrays.sort(tri);
			rec = tri[0]*tri[0]+tri[1]*tri[1] == tri[2]*tri[2];
			System.out.println("Scenario #" + i + ":");
			System.out.println(rec?"yes":"no");
			System.out.println();
		}
		
		scan.close();
	}

}
