import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double sum = 0;
		double divide = 0;
		for (int i = 0; i < n; i++) {
			int atbats = scan.nextInt();
			if (atbats > -1) {
				sum += atbats;
				divide += 1;
			}
		}
		
		System.out.print(sum / divide);
		
		scan.close();
	}

}
