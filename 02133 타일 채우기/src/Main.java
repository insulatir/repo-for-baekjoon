import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] tile = new long[31];
		tile[0] = 1;
		tile[2] = 3;
		tile[4] = 11;
		for(int i = 5; i < 31; i++) {
			tile[i] += tile[i-2];
			for(int j = 2; j <= i; j = j+2)
				tile[i] += tile[i-j]*2;
		}
		System.out.print(tile[n]);
		scan.close();
	}

}
