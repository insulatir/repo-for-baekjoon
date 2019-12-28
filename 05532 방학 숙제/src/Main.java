import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int L = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int lang = (int) Math.ceil((double) A / (double) C);
		int math = (int) Math.ceil((double) B / (double) D);
		
		System.out.println(L - Math.max(lang, math));
		
		scan.close();
	}

}
