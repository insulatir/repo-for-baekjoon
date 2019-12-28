import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String hex = scan.next();
		System.out.println(Integer.parseInt(hex, 16));
		
		scan.close();
	}

}
