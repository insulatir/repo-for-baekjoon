import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = n/5; i >= 0; i--) {
			if((n-i*5)%3 == 0) {
				System.out.print(i+(n-i*5)/3);
				break;
			}
			else
				if(i == 0)
					System.out.print(-1);
		}
		
		scan.close();
	}

}
