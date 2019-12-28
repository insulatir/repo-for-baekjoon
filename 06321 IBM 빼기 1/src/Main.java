import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			String com = scan.next();
			char[] chars = com.toCharArray();
			
			for(int j = 0; j < chars.length; j++) {
				if(chars[j] == 'Z') {
					chars[j] = 'A';
					continue;
				}
				
				chars[j] += 1;
			}
			
			com = new String(chars);
				
			System.out.println("String #" + (i + 1));
			System.out.println(com + "\n");
		}
		
		scan.close();
	}

}
