import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		Deque<Integer> de = new ArrayDeque<Integer>();
		for (int i = 1; i <= N; i++) {
			de.addLast(i);
		}
		
		while (de.size() > 1) {
			de.removeFirst();
			
			int first = de.removeFirst();
			de.addLast(first);
		}
		
		System.out.println(de.getFirst());
		
		scan.close();
	}

}
