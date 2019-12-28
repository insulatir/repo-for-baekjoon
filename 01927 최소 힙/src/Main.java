import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			int x = scan.nextInt();
			if (x == 0) {
				if (minHeap.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(minHeap.poll());
				}
			} else {
				minHeap.add(x);
			}
		}
		
		scan.close();
	}

}
