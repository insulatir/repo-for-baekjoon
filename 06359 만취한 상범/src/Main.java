import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] prison = new int[101];
		prison[5] = 2;
		for(int i = 6; i < prison.length; i++) {
			int kOpen = 0;
			for(int j = 1; j <= i; j++) 
				if(i%j == 0)
					kOpen = 1-kOpen;
			prison[i] = prison[i-1] + kOpen;
		}
		for(int i = 0; i < t; i++)
			System.out.println(prison[scan.nextInt()]);
		scan.close();
	}

}
