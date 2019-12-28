import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] p = new int[n+1];
		int[] card = new int[n+1];
		for(int i = 1; i <= n; i++)
			p[i] = scan.nextInt();
		for(int i = 1; i <= n; i++) 
			for(int j = 1; j <= i; j++) 
				if(card[i] < card[i-j]+p[j])
					card[i] = card[i-j]+p[j];
		System.out.print(card[n]);
		scan.close();
	}

}
