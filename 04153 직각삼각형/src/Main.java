import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] res = new int[3];
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		res[0] = a;
		res[1] = b;
		res[2] = c;
		Arrays.sort(res);
		
		while (a != 0) {
			if (res[0] * res[0] + res[1] * res[1] == res[2] * res[2]) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			res[0] = a;
			res[1] = b;
			res[2] = c;
			Arrays.sort(res);
		}
		
		scan.close();
	}

}
