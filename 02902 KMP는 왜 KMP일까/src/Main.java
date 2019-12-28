import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		String[] arr = s.split("-");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].charAt(0));
		}
		
		scan.close();
	}

}
