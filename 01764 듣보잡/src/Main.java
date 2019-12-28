import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		Set<String> has = new HashSet<String>();
		List<String> res = new ArrayList<String>();
		int count = 0;
		
		for (int i = 0; i < N+M; i++) {
			String name = scan.next();
			if (!has.add(name)) {
				count += 1;
				res.add(name);
			}
		}
		
		System.out.println(count);
		
		Collections.sort(res);
		for (String item : res) {
			System.out.println(item);
		}
		
		scan.close();
	}

}
