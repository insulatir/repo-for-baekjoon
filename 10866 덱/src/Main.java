import java.util.*;
public class Main {
	static Scanner scan;
	static Deque<Integer> de;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		de = new ArrayDeque<Integer>();
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			let(scan.next());
		}
		
		scan.close();
	}

	public static void let(String command) {
		switch (command) {
		case "push_front":
			int X1 = scan.nextInt();
			de.addFirst(X1);
			break;
		case "push_back":
			int X2 = scan.nextInt();
			de.addLast(X2);
			break;
		case "pop_front":
			System.out.println(de.isEmpty() ? -1 : de.removeFirst());
			break;
		case "pop_back":
			System.out.println(de.isEmpty() ? -1 : de.removeLast());
			break;
		case "size":
			System.out.println(de.size());
			break;
		case "empty":
			System.out.println(de.isEmpty() ? 1 : 0);
			break;
		case "front":
			System.out.println(de.isEmpty() ? -1 : de.getFirst());
			break;
		case "back":
			System.out.println(de.isEmpty() ? -1 : de.getLast());
			break;
		}
	}
}
