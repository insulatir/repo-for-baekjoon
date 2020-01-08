import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String op = scan.next();
		int res = num;
		while (!(op.equals("="))) {
			num = scan.nextInt();
			switch(op) {
			case "+":
				res = res + num;
				break;
			case "-":
				res = res - num;
				break;
			case "*":
				res = res * num;
				break;
			case "/":
				res = res / num;
				break;
			}
			op = scan.next();
		}
		
		System.out.print((int)res);
		
		scan.close();
	}

}
