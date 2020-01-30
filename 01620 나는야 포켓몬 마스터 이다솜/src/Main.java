import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		HashMap<Integer, String> i2s = new HashMap<>();
		HashMap<String, Integer> s2i = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			String pokemon = scan.next();
			i2s.put(i, pokemon);
			s2i.put(pokemon, i);
		}
		
		for (int i = 0; i < M; i++) {
			String q = scan.next();
			if (q.matches("^[0-9]*$")) {
				System.out.println(i2s.get(Integer.parseInt(q)));
			} else {
				System.out.println(s2i.get(q));
			}
		}
		
		scan.close();
	}

}
