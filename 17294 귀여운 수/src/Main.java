import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String k = scan.next();
		boolean result = true;
		for (int i = 0; i < k.length()-1; i++) {
			if (k.charAt(i+1) - k.charAt(i) != k.charAt(1) - k.charAt(0)) {
				result = false;
			}
		}
		
		String res = result ? "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!" : "흥칫뿡!! <(￣ ﹌ ￣)>";
		System.out.print(res);
		
		scan.close();
	}

}
