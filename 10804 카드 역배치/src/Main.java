import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] card = new int[21];
		for (int i = 1; i <= 20; i++) {
			card[i] = i;
		}
		
		for (int i = 0; i < 10; i++) {
			int f = scan.nextInt();
			int b = scan.nextInt();
			Stack<Integer> rev = new Stack<>();
			for (int j = f; j <= b; j++) {
				rev.push(card[j]);
			}
			for (int j = f; j <= b; j++) {
				card[j] = rev.pop();
			}
		}
		
		for (int i = 1; i < 21; i++) {
			System.out.print(card[i]);
			if (i < 20) {
				System.out.print(" ");
			}
		}
		
		scan.close();
	}

}
