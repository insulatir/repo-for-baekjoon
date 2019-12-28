import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		for(int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i));
			if(i % 10 == 9)
				System.out.println();
		}
		scanner.close();
	}

}
