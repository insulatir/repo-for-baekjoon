import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int V = scan.nextInt();
		String vote = scan.next();
		int A = 0;
		int B = 0;
		for (int i = 0; i < V; i++) {
			if (vote.charAt(i) == 'A') {
				A += 1;
			} else {
				B += 1;
			}
		}
		
		System.out.print(A > B ? "A" : A < B ? "B" : "Tie");
		
		scan.close();
	}

}
