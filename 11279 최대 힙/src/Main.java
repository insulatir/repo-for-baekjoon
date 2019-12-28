import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			int x = scan.nextInt();
			if (x == 0) {
				if (maxHeap.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(maxHeap.poll());
				}
			} else {
				maxHeap.add(x);
			}
		}
		
		scan.close();
	}

}
