import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			String bin = scan.next();
			String[] hms = bin.split(":");
			String h = Integer.toBinaryString(Integer.parseInt(hms[0]));
			String m = Integer.toBinaryString(Integer.parseInt(hms[1]));
			String s = Integer.toBinaryString(Integer.parseInt(hms[2]));

			int len_h = h.length();
			int len_m = m.length();
			int len_s = s.length();
			
			for (int j = 0; j < 6-len_h; j++) {
				h = "0" + h;
			}
			for (int j = 0; j < 6-len_m; j++) {
				m = "0" + m;
			}
			for (int j = 0; j < 6-len_s; j++) {
				s = "0" + s;
			}
			
			for (int j = 0; j < 6; j++) {
				System.out.print(h.charAt(j) + "" + m.charAt(j) + "" + s.charAt(j));
			}
			
			System.out.print(" ");
			
			System.out.println(h + m + s);
		}
		
		scan.close();
	}

}
