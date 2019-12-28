import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		List<Integer> lope = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			lope.add(scan.nextInt());
		}
		
		Collections.sort(lope);
		
		int maxW = 0;
		
		for (int i = 0; i < N; i++) {
			if (maxW < lope.get(i) * (N-i)) {
				maxW = lope.get(i) * (N-i);
			}
		}
		
		System.out.println(maxW);
		
		scan.close();
	}

}
