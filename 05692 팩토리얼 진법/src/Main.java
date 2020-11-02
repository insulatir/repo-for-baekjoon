import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		while (!n.equals("0")) {
			char[] num = n.toCharArray();
			
			switch (n.length()) {
			case 1:
				System.out.println(Integer.parseInt(num[0]+"")*1);
				break;
			case 2:
				System.out.println(Integer.parseInt(num[0]+"")*1*2
						+ Integer.parseInt(num[1]+"")*1);
				break;
			case 3:
				System.out.println(Integer.parseInt(num[0]+"")*1*2*3
						+ Integer.parseInt(num[1]+"")*1*2
						+ Integer.parseInt(num[2]+"")*1);
				break;
			case 4:
				System.out.println(Integer.parseInt(num[0]+"")*1*2*3*4
						+ Integer.parseInt(num[1]+"")*1*2*3
						+ Integer.parseInt(num[2]+"")*1*2
						+ Integer.parseInt(num[3]+"")*1);
				break;
			case 5:
				System.out.println(Integer.parseInt(num[0]+"")*1*2*3*4*5
						+ Integer.parseInt(num[1]+"")*1*2*3*4
						+ Integer.parseInt(num[2]+"")*1*2*3
						+ Integer.parseInt(num[3]+"")*1*2
						+ Integer.parseInt(num[4]+"")*1);
				break;
			}
			
			n = scan.next();
		}
		
		scan.close();
	}

}
