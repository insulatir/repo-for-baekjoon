import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		int res = 0;
		for (int i = 0; i < word.length(); i++) {
			char ith = word.charAt(i);
			if (ith == 'a' || ith == 'e' || ith == 'i' || ith == 'o' || ith == 'u') {
				res += 1;
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
