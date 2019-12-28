import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] tree = new int[n];
		// tree가 다 자라는 일수
		int[] day = new int[n];
		// tree가 다 자란 날짜
		for(int i = 0; i < n; i++)
			tree[i] = scan.nextInt();
		Arrays.sort(tree);
		// 오름차순
		for(int i = 0; i < n; i++)
			day[i] = tree[i] + n-i-1;
			// 오름차순이므로, 1씩 늘어나는 날짜를 거꾸로 더한다.
		Arrays.sort(day);
		// 오름차순
		System.out.print(day[day.length-1] + 2);
		// max_day
		scan.close();
	}

}
