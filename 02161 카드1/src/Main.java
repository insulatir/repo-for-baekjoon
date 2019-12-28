import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Deque<Integer> de = new ArrayDeque<Integer>();
		
		int N = scan.nextInt();
		for (int i = 1; i <= N; i++) {
			de.addLast(i);
		}
		
		while (de.size() > 1) {
			System.out.print(de.removeFirst() + " ");
			int first = de.removeFirst();
			de.addLast(first);
		}
		
		System.out.print(de.remove());
		
		scan.close();
	}

}
