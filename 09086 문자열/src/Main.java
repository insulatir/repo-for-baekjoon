import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			String word = scan.next();
			System.out.print(word.charAt(0));
			System.out.println(word.charAt(word.length()-1));
		}
		
		scan.close();
	}

}
