import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] tree = new int[n];
		// tree�� �� �ڶ�� �ϼ�
		int[] day = new int[n];
		// tree�� �� �ڶ� ��¥
		for(int i = 0; i < n; i++)
			tree[i] = scan.nextInt();
		Arrays.sort(tree);
		// ��������
		for(int i = 0; i < n; i++)
			day[i] = tree[i] + n-i-1;
			// ���������̹Ƿ�, 1�� �þ�� ��¥�� �Ųٷ� ���Ѵ�.
		Arrays.sort(day);
		// ��������
		System.out.print(day[day.length-1] + 2);
		// max_day
		scan.close();
	}

}
