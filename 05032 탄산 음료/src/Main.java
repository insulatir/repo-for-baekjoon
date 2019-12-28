import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int e = scan.nextInt();
		int f = scan.nextInt();
		int c = scan.nextInt();
		
		int res = 0;
		int valid = (e + f) / c;
		int empty = (e + f) % c;
		while (valid > 0) {
			res += valid;
			valid = (valid + empty) / c;
			empty = (valid + empty) % c;
		}
		
		System.out.println(res);
		
		scan.close();
	}

}
