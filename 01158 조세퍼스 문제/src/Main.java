import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		List<Integer> list = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		System.out.print("<");
		while (!list.isEmpty()) {
			for (int i = 0; i < K-1; i++) {
				list.add(list.remove(0));
			}
			
			if (list.size() > 1) {
				System.out.print(list.remove(0) + ", ");
			} else {
				System.out.print(list.remove(0));
			}
		}
		System.out.print(">");
		
		scan.close();
	}

}
