import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String bin = scan.next();
		int first = bin.length() % 3;
		int num = bin.length() / 3;
		
		String one = bin.substring(0, first);
		if (!one.equals("")) {
			BintoOct(one);
		}

		for (int i = 0; i < num; i++) {
			int begin = first + i * 3;
			int end = begin + 3;
			String part = bin.substring(begin, end);
			BintoOct(part);
		}
		
		scan.close();
	}	

	public static void BintoOct(String bin) {
		int binary = Integer.parseInt(bin);
		switch(binary) {
		case 0:
			System.out.print(0);
			break;
		case 1:
			System.out.print(1);
			break;
		case 10:
			System.out.print(2);
			break;
		case 11:
			System.out.print(3);
			break;
		case 100:
			System.out.print(4);
			break;
		case 101:
			System.out.print(5);
			break;
		case 110:
			System.out.print(6);
			break;
		case 111:
			System.out.print(7);
			break;
		default:
			break;
		}
	}
}
