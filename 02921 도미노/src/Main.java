import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] domino = new int[10001];
		for(int i = 1; i < 1001; i++)
			domino[i] = domino[i-1] + 3*i*(i+1)/2;
		System.out.print(domino[n]);
		scan.close();
	}

}
