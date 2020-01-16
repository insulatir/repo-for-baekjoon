import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int[] cardA = new int[10];
		int[] cardB = new int[10];
		for (int i = 0; i < 10; i++) {
			cardA[i] = scan.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			cardB[i] = scan.nextInt();
		}
 		for (int i = 0; i < 10; i++) {
			if (cardA[i] < cardB[i]) {
				B += 1;
			} else if (cardA[i] > cardB[i]) {
				A += 1;
			}
		}
		
		System.out.print(A > B ? "A" : A < B ? "B" : "D");
		
		scan.close();
	}

}
