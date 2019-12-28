// 1
/*import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(countForFibonachi(n));
		scanner.close();
	}
	
	static int countForFibonachi(int a) {
		if(a < 2) {
			return 1;
		}
		return countForFibonachi(a-2) + countForFibonachi(a-1);
	}

}
*/
// 2
import java.util.*;
public class Main {
	
	private static int count;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		fibonachi(n);
		System.out.println(count);
		scanner.close();
	}
	
	static void fibonachi(int a) {
		if(a < 2) {
			count++;
			return;
		}
		fibonachi(a-2);
		fibonachi(a-1);
	}
}