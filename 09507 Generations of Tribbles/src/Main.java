import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		long[] koong = new long[68];
		koong[0] = 1;
		koong[1] = 1;
		koong[2] = 2;
		koong[3] = 4;
		for(int i = 4; i < koong.length; i++)
			koong[i] = koong[i-1] + koong[i-2] + koong[i-3] + koong[i-4];
		for(int i = 0; i < t; i++)
			System.out.println(koong[scan.nextInt()]);
		scan.close();
	}

}
