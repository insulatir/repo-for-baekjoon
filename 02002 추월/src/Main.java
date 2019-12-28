import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			map.put(scan.next(), i);
		}
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			String car = scan.next();
			int before = map.get(car);
			if (i < before) {
				count += 1;
			}
		}
		
		System.out.println(count);
		
		scan.close();
	}

}
