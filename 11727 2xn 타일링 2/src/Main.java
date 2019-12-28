import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] tile = new int[1001];
		tile[0] = 1;
		tile[1] = 1;
		for(int i = 2; i < tile.length; i++)
			tile[i] = (tile[i-1] + tile[i-2]*2)%10007;
		System.out.print(tile[n]);
		scan.close();
	}

}
