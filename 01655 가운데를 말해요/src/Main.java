import java.util.*;
public class Main {
	static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		runningMedian(N);
		
		scan.close();
	}

	public static void runningMedian(int n) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		for (int cnt = 1; cnt <= n; cnt++) {
			// 반복문 불변식:
			// 1. maxHeap의 크기는 minHeap의 크기와 같거나 1 더 큼
			// 2. maxHeap.peek() <= minHeap.peek()
			if (maxHeap.size() == minHeap.size()) {
				// 우선 1번 불변식부터 만족
				maxHeap.add(scan.nextInt());
			} else {
				minHeap.add(scan.nextInt());
			}
			
			if (!minHeap.isEmpty() && ! maxHeap.isEmpty() &&
					minHeap.peek() < maxHeap.peek()) {
				// 2번 불변식이 깨졌을 경우 복구
				int a = maxHeap.poll();
				int b = minHeap.poll();
				maxHeap.add(b);
				minHeap.add(a);
			}
			
			System.out.println(maxHeap.peek());
		}
	}
}
