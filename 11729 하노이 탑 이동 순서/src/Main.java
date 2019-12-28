import java.util.*;
public class Main {
	public static int[] move;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		move = new int[(int)Math.pow(2, N)-1];
		System.out.println((int)Math.pow(2, N)-1);
		
		move(N);
		for (int i = 0; i < move.length; i++) {
			System.out.println(move[i]/10 + " " + move[i] % 10);
		}
		
		scan.close();
	}

	public static void move(int N) {
		if (N == 1) {
			move[0] = 13;
			return;
		}
		
		int a = 1;
		int b = 0;
		if (N % 2 == 0) {
			b = 2;
		} else {
			b = 3;
		}
		
		move(N-1);
		
		for (int i = (int)Math.pow(2, N-1)-2; i >= 0; i--) {
			move[2*i+1] = move[i];
		}
		
		for (int i = 0; i < (int)Math.pow(2, N-1); i++) {
			move[2*i] = 10 * a + b;
			a = b;
			
			if (N % 2 == 0) {
				b += 1;
				if (b == 4) {
					b = 1;
				}
			} else {
				b -= 1;
				if (b == 0) {
					b = 3;
				}
			}
		}
	}
}
