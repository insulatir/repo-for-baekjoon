import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < N.length(); i++) {
			nums.add(Integer.parseInt(N.charAt(i) + ""));
		}
		
		int three = 0;
		for (int item : nums) {
			three += item;
		}
		
		Collections.sort(nums);
		
		if (three % 3 == 0 && nums.get(0) == 0) {
			Collections.reverse(nums);
			for (int item : nums) {
				System.out.print(item);
			}
		} else {
			System.out.print(-1);
		}
		
		scan.close();
	}

}
