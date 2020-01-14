import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		int d = scan.nextInt();
		while (c != 0) {
			int[] cost = new int[3];
			cost[0] = 30 * c + 40 * d;
			cost[1] = 35 * c + 30 * d;
			cost[2] = 40 * c + 20 * d;
			Arrays.sort(cost);
			System.out.println(cost[0]);
			
			c = scan.nextInt();
			d = scan.nextInt();
		}
		
		scan.close();
	}

}
