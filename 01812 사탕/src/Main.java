import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int s1 = 0;
		int s[] = new int[n];
		int ss[] = new int[n];
		
		for(int i = 0; i < n; i++)
			ss[i] = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(i == 0 || i == n-1)
				s1 += ss[i];
			else
				s1 -= ss[i];
		}
		
		s[0] = s1/2;
		
		for(int i = 1; i < n; i++)
			s[i] = ss[i-1] - s[i-1];
		
		for(int i = 0; i < n; i++)
			System.out.println(s[i]);
		
		scan.close();
	}

}
