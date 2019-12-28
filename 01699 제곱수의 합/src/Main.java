import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] squre = new int[n+1];
		for(int i = 1; i < squre.length; i++) {
			for(int j = 1; j <= (int)Math.sqrt(i); j++)
				if(squre[i] > squre[i-j*j]+1 || squre[i] == 0)
					squre[i] = squre[i-j*j]+1;
		}
		System.out.print(squre[n]);
		scan.close();
	}

}
