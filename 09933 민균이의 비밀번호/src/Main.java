import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		Set<String> set = new HashSet<>();
		
		String res = "";
		for (int i = 0; i < N; i++) {
			String word = scan.next();
			String rev = "";
			for (int j = 0; j < word.length(); j++) {
				rev += word.charAt(word.length()-1-j);
			}
			set.add(word);
			if (set.contains(rev)) {
				res = word;
				break;
			}
		}
		
		System.out.print(res.length() + " " + res.charAt(res.length()/2));
		
		scan.close();
	}

}
