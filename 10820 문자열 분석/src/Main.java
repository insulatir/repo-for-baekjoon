import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			
			for (int i = 0; i < line.length(); i++) {
				char ith = line.charAt(i);
				
				if (97 <= ith && ith < 123) {
					a += 1;
				} else if (65 <= ith && ith < 91) {
					b += 1;
				} else if (48 <= ith && ith < 58) {
					c += 1;
				} else {
					d += 1;
				}
			}

			System.out.println(a + " " + b + " " + c + " " + d);
		}
		
		scan.close();
	}

}
