import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		System.out.print(s.codePointAt(0)-44031);
		
		scan.close();
	}

}
