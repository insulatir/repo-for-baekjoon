import java.util.*;
public class Main {
	public static class Meet {
		int start;
		int finish;
		
		public Meet(int start, int finish) {
			this.start = start;
			this.finish = finish;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		PriorityQueue<Meet> pq = new PriorityQueue<>(
				(Meet m1, Meet m2) -> 
				{
					if (m1.finish != m2.finish) {
						return m1.finish - m2.finish;
					} else {
						return Integer.compare(m1.start, m2.start);
					}
				});
		int finish = 0;
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			int s = scan.nextInt();
			int f = scan.nextInt();
			if (s > f) {
				int temp = s;
				s = f;
				f = temp;
			}
			pq.add(new Meet(s, f));
		}
		
		while (!pq.isEmpty()) {
			Meet m = pq.poll();
			if (finish <= m.start) {
				count += 1;
				finish = m.finish;
			} 
		}
		
		System.out.println(count);
		
		scan.close();
	}

}
