import java.util.*;
public class Main {
	public static List<Integer> list;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		while (n != -1) {
			if (perfect(n)) {
				System.out.print(n + " = ");
				for (int i = 0; i < list.size()-1; i++) {
					System.out.print(list.get(i) + " + ");
				}
				System.out.println(list.get(list.size()-1));
			} else {
				System.out.println(n + " is NOT perfect.");
			}
			
			n = scan.nextInt();
		}
		
		scan.close();
	}

	public static boolean perfect(int n) {
		int sum = 0;
		list = new LinkedList<Integer>();	

		for (int i = 1; i < n-1; i++) {
			if (n % i == 0) {
				sum += i;
				list.add(i);
			}
		}
		
		return sum == n;
	}
}
