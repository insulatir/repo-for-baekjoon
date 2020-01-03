import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Br = scan.nextInt();
		int Bc = scan.nextInt();
		int Dr = scan.nextInt();
		int Dc = scan.nextInt();
		int Jr = scan.nextInt();
		int Jc = scan.nextInt();
		
		int B = Math.max(Math.abs(Br-Jr), Math.abs(Bc-Jc));
		int D = Math.abs(Dr-Jr) + Math.abs(Dc-Jc);
		
		System.out.print(B < D ? "bessie" : B > D ? "daisy" : "tie");
		
		scan.close();
	}

}
