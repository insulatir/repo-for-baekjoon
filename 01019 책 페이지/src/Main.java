import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long[] res = new long[10];
		
		for (int i = 1; i <= N; i++) {
			String page = i + "";
			for (int j = 0; j < page.length(); j++) {
				res[page.charAt(j)-'0'] += 1;
			}
		}
		
		for (long num : res) {
			System.out.print(num + " ");
		}
		
		scan.close();
	}

}
