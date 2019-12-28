import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ah = scan.nextInt();
		int am = scan.nextInt();
		int as = scan.nextInt();
		ah = scan.nextInt() - ah;
		am = scan.nextInt() - am;
		as = scan.nextInt() - as;
		int bh = scan.nextInt();
		int bm = scan.nextInt();
		int bs = scan.nextInt();
		bh = scan.nextInt() - bh;
		bm = scan.nextInt() - bm;
		bs = scan.nextInt() - bs;
		int ch = scan.nextInt();
		int cm = scan.nextInt();
		int cs = scan.nextInt();
		ch = scan.nextInt() - ch;
		cm = scan.nextInt() - cm;
		cs = scan.nextInt() - cs;
		
		if (as < 0) {
			as += 60;
			am -= 1;
		}
		if (am < 0) {
			am += 60;
			ah -= 1;
		}
		if (bs < 0) {
			bs += 60;
			bm -= 1;
		}
		if (bm < 0) {
			bm += 60;
			bh -= 1;
		}
		if (cs < 0) {
			cs += 60;
			cm -= 1;
		}
		if (cm < 0) {
			cm += 60;
			ch -= 1;
		}
		
		System.out.println(ah + " " + am + " " + as);
		System.out.println(bh + " " + bm + " " + bs);
		System.out.println(ch + " " + cm + " " + cs);
		
		scan.close();
	}

}
