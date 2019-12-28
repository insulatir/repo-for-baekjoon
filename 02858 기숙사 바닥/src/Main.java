import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int R = scan.nextInt();
		int B = scan.nextInt();
		
		int a = ((R-4)/2 + (int)Math.sqrt((R-4)*(R-4)/4 - 4*B))/2;
		int b = B / a;
		
		System.out.println((a + 2) + " " + (b + 2));
		
		scan.close();		
	}

}
