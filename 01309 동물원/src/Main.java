import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[][] lions = new long[100001][2];
		lions[1][0] = 1;
		lions[1][1] = 2;
		for(int i = 2; i < 100001; i++) {
			lions[i][0] = (lions[i-1][1] + lions[i-1][0])%9901;
			lions[i][1] = (lions[i-1][1] + lions[i-1][0]*2)%9901;
		}
		System.out.print((lions[n][0]+lions[n][1])%9901);
		scan.close();
	}

}
