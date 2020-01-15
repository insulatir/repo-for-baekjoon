import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int carlos = scan.nextInt();
		boolean buffoon = true;
		for (int i = 0; i < N-1; i++) {
			if (carlos < scan.nextInt()) {
				buffoon = false;
				break;
			}
		}
		
		System.out.print(buffoon ? "S" : "N");
		
		scan.close();
	}

}
