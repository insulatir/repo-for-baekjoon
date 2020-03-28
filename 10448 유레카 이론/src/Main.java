import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Integer> tri = new ArrayList<>();
		for (int i = 1; i < 45; i++) {
			tri.add(i * (i+1) / 2);
		}
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int K = scan.nextInt();
			int t = 0;
			
			loop:
			for (int n : tri) {
				for (int m : tri) {
					for (int k : tri) {
						if (n + m + k == K) {
							t = 1;
							break loop;
						}
					}
				}
			}
			
			System.out.println(t);
		}
		
		scan.close();
	}

}
