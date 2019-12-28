import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int result = 0;
		String bx = Integer.toBinaryString(x);
		
		for(int i = 0; i < bx.length(); i++)
			if(bx.charAt(i) == '1')
				result++;
		
		System.out.print(result);
			
		scan.close();
	}

}
