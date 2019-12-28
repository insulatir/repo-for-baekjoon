import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		int p = scan.nextInt();
		
		for(int i = 0; i < 5; i++)
			System.out.print(scan.nextInt() - (l * p) + " ");
		
		scan.close();
	}

}
