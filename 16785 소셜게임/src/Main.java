import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int day = 0;
		int coin = 0;
		
		while (coin < C) {
			day += 1;
			coin += A;
			if (day % 7 == 0) {
				coin += B;
			}
		}
		
		System.out.print(day);
		
		scan.close();
	}

}
