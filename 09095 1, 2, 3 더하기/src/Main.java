import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] c = new int[11];
		c[1] = 1;
		c[2] = 2;
		c[3] = 4;
		for(int i = 4; i < 11; i++)
			c[i] = c[i-1] + c[i-2] + c[i-3];
		for(int i = 0; i < t; i++) {
			int n = scan.nextInt();
			System.out.println(c[n]);
		}
		scan.close();
	}

}
