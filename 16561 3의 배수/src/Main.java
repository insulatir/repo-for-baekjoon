import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.print((n/3-1)*(n/3-2)/2);
		
		scan.close();
	}

}
