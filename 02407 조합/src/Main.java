import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		BigInteger[][] com = new BigInteger[101][101];
		
		com[1][1] = BigInteger.valueOf(1);
		
		for(int i = 2; i < 101; i++)
			for(int j = 0; j <= i; j++) {
				if(j == 0)
					com[i][j] = BigInteger.valueOf(1);
				else
					com[i][j] = com[i-1][j].add(com[i-1][j-1]);
			}
		
		System.out.print(com[n][m]);
		
		scan.close();
	}

}
