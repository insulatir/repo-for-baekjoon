import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		while (true) {
			String N = n + "";
			int divide = 0;
			for (int i = 0; i < N.length(); i++) {
				int ith = Integer.parseInt(N.substring(i, i+1));
				divide += ith;
			}
			
			if (n % divide == 0) {
				break;
			}
			
			n += 1;
		}
		
		System.out.print(n);
		
		scan.close();
	}

}
