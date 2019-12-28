import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			int x = scan.nextInt();
			if (x == 0) {
				if (minHeap.isEmpty() && maxHeap.isEmpty()) {
					System.out.println(0);
				} else {
					if (minHeap.peek() == null) {
						System.out.println(maxHeap.poll());
						continue;
					}
					if (maxHeap.peek() == null) {
						System.out.println(minHeap.poll());
						continue;
					}
					
					int x1 = minHeap.peek();
					int x2 = maxHeap.peek();
					if (x1 == x2 * -1) {
						System.out.println(maxHeap.poll());
					} else {
						if (x1 < x2 * -1) {
							System.out.println(minHeap.poll());
						} else {
							System.out.println(maxHeap.poll());
						}
					}
				}
			} else {
				if (x > 0) {
					minHeap.add(x);
				} else {
					maxHeap.add(x);
				}
			}
		}
		
		scan.close();
	}

}
