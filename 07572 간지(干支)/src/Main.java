import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		N += 57;
		int remain = N % 60 + 59;
		System.out.print((char)(remain % 12 + 65) + "" + remain % 10);
		
		scan.close();
	}

}
