import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int q = scan.nextInt();
		int sum = 0;
		int[] a = new int[n];
		int[] qs = new int[q];
		int[] ss = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = scan.nextInt();
		
		for(int i = 0; i < q; i++)
			qs[i] = scan.nextInt();
		
		for(int i = 0; i < n; i++)
			ss[i] = a[i%n] * a[(i+1)%n] * a[(i+2)%n] * a[(i+3)%n];
		
		for(int i = 0; i < n; i++)
			sum += ss[i];
		
		for(int i = 0; i < q; i++) {
			int qi = qs[i]-1;
			int qib = 0;
			
			if(qi-3 < 0)
				qib = (qi-3)%n+n;
			else
				qib = (qi-3)%n;
			
			sum -= 2*(ss[(qib+3)%n]+ss[(qib+2)%n]+ss[(qib+1)%n]+ss[qib]);
			
			for(int j = 0; j < 4; j++)
				ss[(qib+j)%n] *= -1;
			
			System.out.println(sum);
		}
		
		scan.close();
	}

}
