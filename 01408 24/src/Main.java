import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] curr = scan.next().split(":");
		String[] miss = scan.next().split(":");
		int h = Integer.parseInt(miss[0]) - Integer.parseInt(curr[0]);
		int m = Integer.parseInt(miss[1]) - Integer.parseInt(curr[1]);
		int s = Integer.parseInt(miss[2]) - Integer.parseInt(curr[2]);
		
		if (s < 0) {
			s += 60;
			m -= 1;
		}
		if (m < 0) {
			m += 60;
			h -= 1;
		}
		if (h < 0) {
			h += 24;
		}
		
		System.out.print(h < 10 ? "0" + h : h);
		System.out.print(":");
		System.out.print(m < 10 ? "0" + m : m);
		System.out.print(":");
		System.out.print(s < 10 ? "0" + s : s);
		
		scan.close();
	}

}
