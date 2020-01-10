import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int P = scan.nextInt();
		
		while (true) {
			List<Integer> pages = new ArrayList<>();
			pages.add(N+1-P);
			P = P % 2 == 0 ? P-1 : P+1;
			pages.add(P);
			pages.add(N+1-P);
			Collections.sort(pages);
			
			for (int i = 0; i < pages.size()-1; i++) {
				System.out.print(pages.get(i) + " ");
			}
			System.out.println(pages.get(pages.size()-1));
			
			N = scan.nextInt();
			if (N == 0) {
				break;
			}
			P = scan.nextInt();
		}
		
		scan.close();
	}

}
