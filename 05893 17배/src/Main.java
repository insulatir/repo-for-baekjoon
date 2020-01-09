import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		String N4 = N + "0000";
		N = "0000" + N;
		String res = "";
		
		int c = 0;
		for (int i = N4.length()-1; i >= -1; i--) {
			char n = '0';
			char n4 = '0';
			if (i >= 0) {
				n = N.charAt(i);
				n4 = N4.charAt(i);
			} 
			int a = Integer.parseInt(n+"");
			int b = Integer.parseInt(n4+"");
			switch(a+b+c) {
			case 0:
				res = "0" + res;
				c = 0;
				break;
			case 1:
				res = "1" + res;
				c = 0;
				break;
			case 2:
				res = "0" + res;
				c = 1;
				break;
			case 3:
				res = "1" + res;
				c = 1;
				break;
			}
		}
		
		if (res.charAt(0) == '0') {
			res = res.substring(1);
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
