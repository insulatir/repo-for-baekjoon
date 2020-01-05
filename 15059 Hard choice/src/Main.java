import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Ca = scan.nextInt();
		int Ba = scan.nextInt();
		int Pa = scan.nextInt();
		int Cr = scan.nextInt();
		int Br = scan.nextInt();
		int Pr = scan.nextInt();
		
		int p = 0;
		
		if (Ca < Cr) {
			p += Cr - Ca;
		}
		if (Ba < Br) {
			p += Br - Ba;
		}
		if (Pa < Pr) {
			p += Pr - Pa;
		}
		
		System.out.print(p);
		
		scan.close();
	}

}
