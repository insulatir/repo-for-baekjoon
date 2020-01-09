import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int a = 0;
		int b = 0;
		int sum = (int)(-1+Math.sqrt(8*N-7))/2+2;
		b = sum-1+N-(sum-1)*(sum)/2;
		a = sum-b;
		
		System.out.print(a + " " + b);
		
		scan.close();
	}

}
