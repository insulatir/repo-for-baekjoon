import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int K = scan.nextInt();
		Stack<Long> s = new Stack<Long>();
		
		for (int i = 0; i < K; i++) {
			long order = scan.nextLong();
			
			if (order != 0) {
				s.add(order);
			} else {
				s.pop();
			}
		}
		
		int res = 0;
		while (!s.empty()) {
			res += s.pop();
		}
		
		System.out.println(res);
		
		scan.close();
	}

}
