import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String oct = scan.next();
		
		char first = oct.charAt(0);
		switch (first) {
		case '0':
			System.out.print("0");
			break;
		case '1':
			System.out.print("1");
			break;
		case '2':
			System.out.print("10");
			break;
		case '3':
			System.out.print("11");
			break;
		case '4':
			System.out.print("100");
			break;
		case '5':
			System.out.print("101");
			break;
		case '6':
			System.out.print("110");
			break;
		case '7':
			System.out.print("111");
			break;
		default:
			break;
		}
		
		for (int i = 1; i < oct.length(); i++) {
			char ith = oct.charAt(i);
			switch (ith) {
			case '0':
				System.out.print("000");
				break;
			case '1':
				System.out.print("001");
				break;
			case '2':
				System.out.print("010");
				break;
			case '3':
				System.out.print("011");
				break;
			case '4':
				System.out.print("100");
				break;
			case '5':
				System.out.print("101");
				break;
			case '6':
				System.out.print("110");
				break;
			case '7':
				System.out.print("111");
				break;
			default:
				break;
			}
		}
		
		scan.close();
	}	

}
