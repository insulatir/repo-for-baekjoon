import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {
			words[i] = scan.next();
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < words[j].length()) {
					System.out.print(words[j].charAt(i));
				}
			}
		}
		
		scan.close();
	}

}
