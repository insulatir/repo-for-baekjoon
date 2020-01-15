import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.next();
		int len = 10;
		for (int i = 0; i < line.length()-1; i++) {
			char current = line.charAt(i);
			char next = line.charAt(i+1);
			
			if (current == next) {
				len += 5;
			} else {
				len += 10;
			}
		}
		
		System.out.print(len);
		
		scan.close();
	}

}
