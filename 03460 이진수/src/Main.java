import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = scan.nextInt();
			String binary = Integer.toBinaryString(n);
					
			for(int j = binary.length() - 1; j >= 0; j--)
				if(binary.charAt(j) == '1')
					System.out.print(binary.length() - 1 - j + " ");
		}
		
		scan.close();
	}

}
