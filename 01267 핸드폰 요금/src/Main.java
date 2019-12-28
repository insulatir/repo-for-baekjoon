import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int Y = 0;
		int M = 0;
		for (int i = 0; i < N; i++) {
			int bill = scan.nextInt();
			Y += ((bill / 30) + 1) * 10;
			M +=((bill / 60) + 1) * 15;
		}
		
		if (Y < M) {
			System.out.println("Y " + Y);
		} else if (Y > M) { 
			System.out.println("M " + M);
		} else {
			System.out.println("Y M " + Y);
		}
		
		scan.close();
	}

}
