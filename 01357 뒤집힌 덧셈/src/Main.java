import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.print(rev(rev(x)+rev(y)));
		scan.close();
	}

	private static int rev(int x) {
		if(x < 10) return x;
		else if(10 <= x && x < 100) {
			return x/10 + 10*(x%10);
		}
		else if(100 <= x && x < 1000) {
			return x/100 + ((x/10)%10)*10 + (x%10)*100;
		}
		else
			return x/1000 + ((x/100)%10)*10 + ((x/10)%10)*100 + (x%10)*1000;
	}
}
