import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			String X = scan.next();
			
			Set<Integer> set = new HashSet<>();
			for (int j = 0; j < X.length(); j++) {
				set.add(Integer.parseInt(X.substring(j, j+1)));
			}
			
			System.out.println(set.size());
		}
		
		scan.close();
	}

}
