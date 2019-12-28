import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
			for(int j = n-1; j >= 0; j--) {
				for(int k = 0; k < j; k++)
					System.out.print(" ");
				for(int k = n-j; k > 0; k--)
					System.out.print("*");
				System.out.println(" ");
			}
			for(int j = 1; j < n; j++) {
				for(int k = 0; k < j; k++)
					System.out.print(" ");
				for(int k = n-j; k > 0; k--)
					System.out.print("*");
				System.out.println(" ");
			}
		scan.close();
	}

}
