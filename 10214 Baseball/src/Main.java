import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int Y = 0;
			int K = 0;
			for (int j = 0; j < 9; j++) {
				Y += scan.nextInt();
				K += scan.nextInt();
			}
			System.out.println(Y<K?"Korea":Y>K?"Yonsei":"Draw");
		}
		
		scan.close();
	}

}
