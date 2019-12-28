import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int P = scan.nextInt();
		
		int X = A * P;
		int Y = P <= C ? B : B + (P - C) * D;
		System.out.println(X < Y ? X : Y);
		
		scan.close();
	}

}
