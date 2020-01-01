import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int d = scan.nextInt();
		
		System.out.print(100*m+d < 218 ? "Before" : 100*m+d == 218 ? "Special" : "After");
		
		scan.close();
	}

}
