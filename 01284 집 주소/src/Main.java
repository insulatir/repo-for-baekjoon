import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		while (!N.equals("0")) {
			int width = 1;
			for (int i = 0; i < N.length(); i++) {
				char num = N.charAt(i);
				if (num == '1') {
					width += 2;
				} else if (num == '0') {
					width += 4;
				} else {
					width += 3;
				}
				width += 1;
			}
			
			System.out.println(width);
			
			N = scan.next();
		}
		
		scan.close();
	}

}
