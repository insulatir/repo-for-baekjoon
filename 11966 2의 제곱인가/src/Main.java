import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		List<Integer> squre2 = new ArrayList<>();
		for (int i = 0; i <= 30; i++) {
			squre2.add((int)Math.pow(2, i));
		}
		
		System.out.print(squre2.contains(N)?1:0);
		
		scan.close();
	}

}
