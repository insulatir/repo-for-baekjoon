import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		while (!line.equals("END")) {
			for (int i = 0; i < line.length(); i++) {
				System.out.print(line.charAt(line.length()-i-1));
			}
			
			System.out.println();
			
			line = scan.nextLine();
		}
		
		scan.close();
	}
	
}
