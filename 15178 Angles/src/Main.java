import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			System.out.print(a + " " + b + " " + c + " ");
			System.out.println(a+b+c!=180?"Check":"Seems OK");
		}
		
		scan.close();
	}

}
