import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		int exist = 1;
		for (int i = 0; i < M; i++) {
			int X = scan.nextInt();
			int Y = scan.nextInt();
			
			if (X == exist) {
				exist = Y;
			} else if (Y == exist) {
				exist = X;
			}
		}
		
		System.out.print(exist);
		
		scan.close();
	}

}
