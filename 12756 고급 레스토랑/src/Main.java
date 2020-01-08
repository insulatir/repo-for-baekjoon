import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Aa = scan.nextInt();
		int Ah = scan.nextInt();
		int Ba = scan.nextInt();
		int Bh = scan.nextInt();
		
		int A = (Ah - 1) / Ba;
		int B = (Bh - 1) / Aa;
		
		System.out.print(A>B?"PLAYER A":A<B?"PLAYER B":"DRAW");
		
		scan.close();
	}

}
