import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Q = scan.nextInt();
		for (int i = 0; i < Q; i++) {
			long a = scan.nextLong();
			System.out.println((a&-a)==a?1:0);
		}
		
		scan.close();
	}

}
