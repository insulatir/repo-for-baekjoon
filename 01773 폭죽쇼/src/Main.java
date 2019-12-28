import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new LinkedList<Integer>();
		
		int N = scan.nextInt();
		int C = scan.nextInt();
		int[] stu = new int[N];
		for (int i = 0; i < N; i++) {
			stu[i] = scan.nextInt();
		}

		for (int i = 0; i < N; i++) {
			int time = stu[i];
			
			for (int j = 1; j * time <= C; j++) {
				if (!list.contains(j * time)) {
					list.add(j * time);
				}
			}
		}
		
		System.out.println(list.size());
		
		scan.close();
	}

}
