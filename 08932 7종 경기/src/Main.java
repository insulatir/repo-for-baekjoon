import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int res = 0;
				res += (int) (9.23076 * Math.pow(26.7-scan.nextInt(), 1.835));
				res += (int) (1.84523 * Math.pow(scan.nextInt()-75, 1.348));
				res += (int) (56.0211 * Math.pow(scan.nextInt()-1.5, 1.05));
				res += (int) (4.99087 * Math.pow(42.5-scan.nextInt(), 1.81));
				res += (int) (0.188807 * Math.pow(scan.nextInt()-210, 1.41));
				res += (int) (15.9803 * Math.pow(scan.nextInt()-3.8, 1.04));
				res += (int) (0.11193 * Math.pow(254-scan.nextInt(), 1.88));
				System.out.println(res);
		}
		
		scan.close();
	}

}
