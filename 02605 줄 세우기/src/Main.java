import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		List<Integer> line = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			int num = scan.nextInt();
			line.add(num, i);
		}
		
		for (int i = line.size()-1; i > 0; i--) {
			System.out.print(line.get(i) + " ");
		}
		
		System.out.print(line.get(0));
		
		scan.close();
	}

}
