import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] fact = new int[13];
		fact[0] = 1;
		for(int i = 1; i < fact.length; i++)
			fact[i] = i * fact[i-1];
		System.out.print(fact[N]);
		scan.close();
	}
	
}
