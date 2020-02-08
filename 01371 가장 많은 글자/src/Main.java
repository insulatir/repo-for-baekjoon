import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] count = new int[26];
		while (scan.hasNextLine()) {
			String word = scan.nextLine();
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) != ' ') {
					count[word.charAt(i)-97] += 1;
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < 26; i++) {
			if (max < count[i]) {
				max = count[i];
			}
		}
		for (int i = 0; i < 26; i++) {
			if (max == count[i]) {
				System.out.print((char)(i+97));
			}
		}
		
		scan.close();
	}

}
