import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean first = true;
		for(int i = 0; i < 2*n; i++) {
			for(int j = 0; j < n; j++) 
				if(first) 
					if(j%2 == 0)
						System.out.print("*");
					else
						System.out.print(" ");
				else 
					if(j%2 == 1)
						System.out.print("*");
					else
						System.out.print(" ");
			first = !first;	
			if(i%2 != n%2)
				System.out.print(" ");
			System.out.println();
		}
			
		scan.close();
	}

}
