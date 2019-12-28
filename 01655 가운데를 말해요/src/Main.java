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
			// �ݺ��� �Һ���:
			// 1. maxHeap�� ũ��� minHeap�� ũ��� ���ų� 1 �� ŭ
			// 2. maxHeap.peek() <= minHeap.peek()
			if (maxHeap.size() == minHeap.size()) {
				// �켱 1�� �Һ��ĺ��� ����
				maxHeap.add(scan.nextInt());
			} else {
				minHeap.add(scan.nextInt());
			}
			
			if (!minHeap.isEmpty() && ! maxHeap.isEmpty() &&
					minHeap.peek() < maxHeap.peek()) {
				// 2�� �Һ����� ������ ��� ����
				int a = maxHeap.poll();
				int b = minHeap.poll();
				maxHeap.add(b);
				minHeap.add(a);
			}
			
			System.out.println(maxHeap.peek());
		}
	}
}
