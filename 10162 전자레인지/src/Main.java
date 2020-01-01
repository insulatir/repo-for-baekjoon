import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		int A = 0;
		int B = 0;
		int C = 0;
		
		A = T / 300;
		T = T % 300;
		B = T / 60;
		T = T % 60;
		C = T / 10;
		T = T % 10;
		
		System.out.print(T == 0 ? A + " " + B + " " + C : -1);
		
		scan.close();
	}

}
