import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++)
			num[i] = scan.nextInt();
		Arrays.sort(num);
		System.out.print(num[0] + " " + num[n-1]);
		scan.close();
	}

}
