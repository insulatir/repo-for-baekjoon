import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		String minA = a;
		String minB = b;
		
		String maxA = a;
		String maxB = b;
		
		minA = minA.replace('6', '5');
		maxA = maxA.replace('5', '6');
		
		minB = minB.replace('6', '5');
		maxB = maxB.replace('5', '6');
		
		int min = Integer.parseInt(minA) + Integer.parseInt(minB);
		int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
		
		System.out.print(min + " " + max);
			
		scan.close();
	}

}
