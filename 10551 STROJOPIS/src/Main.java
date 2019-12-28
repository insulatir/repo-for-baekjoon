import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		int[] finger = new int[8];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			switch (ch) {
			case '1':
			case 'Q':
			case 'A':
			case 'Z':
				finger[0] += 1;
				break;
			case '2':
			case 'W':
			case 'S':
			case 'X':
				finger[1] += 1;
				break;
			case '3':	
			case 'E':
			case 'D':
			case 'C':
				finger[2] += 1;
				break;
			case '4':
			case '5':
			case 'R':
			case 'T':
			case 'F':
			case 'G':
			case 'V':
			case 'B':
				finger[3] += 1;
				break;
			case '6':
			case '7':
			case 'Y':
			case 'U':
			case 'H':
			case 'J':
			case 'N':
			case 'M':
				finger[4] += 1;
				break;
			case '8':
			case 'I':
			case 'K':
			case ',':
				finger[5] += 1;
				break;
			case '9':
			case 'O':
			case 'L':
			case '.':
				finger[6] += 1;
				break;
			case '0':
			case 'P':
			case ';':
			case '/':
			case '-':
			case '[':
			case '\'':
			case '=':
			case ']':
				finger[7] += 1;
				break;
			}
		}
		
		for (int i : finger) {
			System.out.println(i);
		}
		
		scan.close();
	}

}
