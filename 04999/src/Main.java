import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String aaah = scan.next();
		String aah = scan.next();
		
		System.out.print(aaah.length() >= aah.length() ? "go" : "no");
		
		scan.close();
	}

}
