import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			minHeap.add(scan.nextInt());
		}
		
		int result = 0;
		for (int i = 0; i < N-1; i++) {
			int a = minHeap.poll();
			int b = minHeap.poll();
			result += a + b;
			minHeap.add(a + b);
		}
		
		System.out.println(result);
		
		scan.close();
	}

}
