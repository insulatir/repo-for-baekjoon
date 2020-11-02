import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			arr.add(scan.nextInt());
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		
		for (int n : arr) {
			System.out.println(n);
		}
		
		scan.close();
	}

}
