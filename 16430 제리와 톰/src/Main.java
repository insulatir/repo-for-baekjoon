import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		while ((B-A) % 2 == 0 && B % 2 == 0) {
			A /= 2;
			B /= 2;
		}
		
		while ((B-A) % 3 == 0 && B % 3 == 0) {
			A /= 3;
			B /= 3;
		}
		
		System.out.print(B-A + " " + B);
		
		scan.close();
	}

}
