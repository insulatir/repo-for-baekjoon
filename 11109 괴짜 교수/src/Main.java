import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int d = scan.nextInt();
			int n = scan.nextInt();
			int s = scan.nextInt();
			int p = scan.nextInt();
			
			System.out.println(d+n*p>n*s?"do not parallelize"
					:d+n*p<n*s?"parallelize":"does not matter");
		}
		
		scan.close();
	}

}
