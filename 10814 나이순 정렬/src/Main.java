import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Deque<String>> deques = new ArrayList<Deque<String>>();
		for (int i = 0; i <= 200; i++) {
			Deque<String> deque = new ArrayDeque<String>();
			deques.add(deque);
		}
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			int age = scan.nextInt();
			String name = scan.next();
			
			deques.get(age).addLast(name);
		}
		
		for (int i = 1; i < 201; i++) {
			while (!deques.get(i).isEmpty()) {
				System.out.println(i + " " + deques.get(i).removeFirst());
			}
		}
		
		scan.close();
	}

}
