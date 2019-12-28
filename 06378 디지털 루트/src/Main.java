import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		
		for(; !n.equals("0"); ) {
			int temp = 0;
			
			for(int i = 0; i < n.length(); i++) {
				temp += n.charAt(i) - '0';
			}
			
			n = Integer.toString(temp);
			
			if(temp < 10) {
				System.out.println(temp);
				n = scan.next();
			}
			
		}
		
		scan.close();
	}

}
