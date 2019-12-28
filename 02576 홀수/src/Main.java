import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Integer> odd = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
			int n = scan.nextInt();
			if (n % 2 == 1) {
				odd.add(n);
			}
		}
		
		if (odd.isEmpty()) {
			System.out.println(-1);
		} else {
			int sum = 0;
			int min = 101;
			for (int i : odd) {
				sum += i;
				if (min > i) {
					min = i;
				}
			}
			
			System.out.println(sum);
			System.out.println(min);
		}
		
		scan.close();
	}

}
