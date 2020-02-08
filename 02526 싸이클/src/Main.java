import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int P = scan.nextInt();
		int next = N;
		List<Integer> list = new ArrayList<>();
		while (!list.contains(next)) {
			list.add(next);
			next = (next * N) % P;
		}
		
		System.out.print(list.size()-list.indexOf(next));
		
		scan.close();
	}

}
