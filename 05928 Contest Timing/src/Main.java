import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int D = scan.nextInt();
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		int m = (D-11)*1440 + (H-11)*60 + (M-11);
		
		System.out.print(m>=0?m:-1);
		
		scan.close();
	}

}
