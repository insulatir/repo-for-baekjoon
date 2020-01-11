import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.next();
		while (!line.equals("#")) {
			int res = 0;
			
			for (int i = line.length()-1; i >= 0; i--) {
				res += Math.pow(8, line.length()-1-i) * getNum(line.substring(i, i+1));
			}
			
			System.out.println(res);
			
			line = scan.next();
		}
		
		scan.close();
	}

	public static int getNum(String s) {
		switch (s) {
			case "-":
				return 0;
			case "\\":
				return 1;
			case "(":
				return 2;
			case "@":
				return 3;
			case "?":
				return 4;
			case ">":
				return 5;
			case "&":
				return 6;
			case "%":
				return 7;
			case "/":
				return -1;
			default:
				return 0;
		}
	}
}
