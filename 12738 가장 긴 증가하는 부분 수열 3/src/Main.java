import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] array = new int[n];
		List<Integer> dp = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		
		int top = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (array[i] > top) {
				top = array[i];
				dp.add(array[i]);
			} else {
				int index = lower_bound(dp, array[i]);
				dp.set(index, array[i]);
				if (index == dp.size()-1) {
					top = array[i];
				}
			}
		}
		
		System.out.print(dp.size());
		
		scan.close();
	}

	public static int lower_bound(List<Integer> data, int target) {
		int s = 0;
		int e = data.size();
		
		while (s < e) {
			int m = (s + e) / 2;
			
			if (data.get(m) >= target) {
				e = m;
			} else {
				s = m + 1;
			}
		}
		
		return e;
	}
}
