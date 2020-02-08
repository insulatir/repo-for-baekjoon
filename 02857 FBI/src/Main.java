import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		for (int i = 1; i <= 5; i++) {
			String name = scan.next();
			if (name.contains("FBI")) {
				System.out.print(i + " ");
				count += 1;
			}
		}
		
		if (count == 0) {
			System.out.print("HE GOT AWAY!");
		}
		
		scan.close();
	}

}
