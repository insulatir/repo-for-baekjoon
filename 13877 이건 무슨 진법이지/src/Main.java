import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			System.out.print(scan.next() + " ");
			
			String D = scan.next();
			boolean o = true;
			int oct = 0;
			for (int j = 0; j < D.length(); j++) {
				int ith = Integer.parseInt(D.substring(j, j+1));
				oct += ith * Math.pow(8, D.length()-1-j);
				if (ith >= 8) {
					o = false;
					break;
				}
			}
			System.out.print(o ? oct + " " : 0 + " ");
			System.out.print(Integer.parseInt(D) + " ");
			int hex = 0;
			for (int j = 0; j < D.length(); j++) {
				hex += Integer.parseInt(D.substring(j, j+1)) 
						* Math.pow(16, D.length()-1-j);
			}
			System.out.println(hex);
		}
		
		scan.close();
	}

}
