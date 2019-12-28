import java.util.*;

import javax.print.attribute.IntegerSyntax;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String cell = scan.next();
		while (!cell.equals("R0C0")) {
			int n = Integer.parseInt(cell.split("C")[0].split("R")[1]);
			int m = Integer.parseInt(cell.split("C")[1]);
			
			int rm = m - 1;
			int first = rm % 26;
			int second = (rm / 26 - 1) % 26;
			int third = (rm / (26 * 26) - 1) % 26;
			int fourth = (rm / (26 * 26 * 26) - 1) % 26;
			int fifth = (rm / (26 * 26 * 26 * 26) - 1) % 26;

			if (0 <= rm && rm < 26) {
				System.out.print(Character.toChars(first + 65));
				System.out.println();
			} else if (26 <= rm && rm < 26 * 26 + 26) {
				System.out.print(Character.toChars(second + 65));
				System.out.print(Character.toChars(first + 65));
				System.out.println();
			} else if (26 * 26 + 26 <= rm && rm < 26 * 26 * 26 + 26 * 26 + 26) {
				System.out.print(Character.toChars(third + 65));
				System.out.print(Character.toChars(second + 65));
				System.out.print(Character.toChars(first + 65));
				System.out.println();
			} else if (26 * 26 * 26 + 26 * 26 + 26 <= rm && rm < 26 * 26 * 26 * 26 + 26 * 26 * 26 + 26 * 26 + 26) {
				System.out.print(Character.toChars(fourth + 65));
				System.out.print(Character.toChars(third + 65));
				System.out.print(Character.toChars(second + 65));
				System.out.print(Character.toChars(first + 65));
				System.out.println();
			} else if (26 * 26 * 26 * 26 + 26 * 26 * 26 + 26 * 26 + 26 <= rm && rm < 26 * 26 * 26 * 26 * 26 + 26 * 26 * 26 * 26 + 26 * 26 * 26 + 26 * 26 + 26) {
				System.out.print(Character.toChars(fifth + 65));
				System.out.print(Character.toChars(fourth + 65));
				System.out.print(Character.toChars(third + 65));
				System.out.print(Character.toChars(second + 65));
				System.out.print(Character.toChars(first + 65));
				System.out.println();
			}
			
			cell = scan.next();
		}
		
		scan.close();
	}

}
