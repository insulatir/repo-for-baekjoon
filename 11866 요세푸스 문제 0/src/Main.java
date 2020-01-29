import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		System.out.print("<");
		
		while (!q.isEmpty()) {
			for (int i = 0; i < K-1; i++) {
				q.add(q.poll());
			}
			
			if (q.size() > 1) {
				System.out.print(q.poll() + ", ");
			} else {
				System.out.print(q.poll() + ">");
			}
		}
		
		scan.close();
	}

}
