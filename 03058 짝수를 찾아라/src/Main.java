import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			List<Integer> num = new ArrayList<>();
			int sum = 0;
			for (int j = 0; j < 7; j++) {
				int n = scan.nextInt();
				if (n % 2 == 0) {
					num.add(n);
					sum += n;
				}
			}
			Collections.sort(num);
			System.out.println(sum + " " + num.get(0));
		}
		
		scan.close();
	}

}
