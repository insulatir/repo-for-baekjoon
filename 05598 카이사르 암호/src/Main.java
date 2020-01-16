import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		for (int i = 0; i < word.length(); i++) {
			char ith = word.charAt(i);
			if (ith >= 68) {
				System.out.print((char)(ith - 3));
			} else {
				System.out.print((char)(ith + 23));
			}
		}
		
		scan.close();
	}

}
