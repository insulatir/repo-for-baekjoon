import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int max = 0;
		int maxi = 0;
		for (int i = 1; i <= N; i++) {
			int score = scan.nextInt() * 1000000
					+ (50 - scan.nextInt()) * 1000
					+ (179 - scan.nextInt());
			if (max < score) {
				max = score;
				maxi = i;
			}
		}
		
		System.out.print(maxi);
		
		scan.close();
	}

}
