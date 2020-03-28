import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			String a = scan.next();
			
			int max = 1;
			int count = 1;
			for (int j = 1; j < 8; j++) {
				if (a.charAt(j-1) == a.charAt(j)) {
					count += 1;
				} else {
					if (max < count) {
						max = count;
					}
					
					count = 1;
				}
			}
			
			if (max < count) {
				max = count;
			}
			
			System.out.println(max);
		}
		
		scan.close();
	}

}
