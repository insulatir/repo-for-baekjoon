import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 0;
		for(int i = 0; i < N; i++) {
			String string = scan.nextLine();
			Stack<Character> ab = new Stack<Character>();
			char temp = ' ';
			int count = 0;
			for(int j = 0; j < string.length(); j++)
				ab.push(string.charAt(j));
			for(int j = 0; j < string.length(); j++) {
				temp = ab.pop();
				if(temp == ab.peek()) {
					ab.pop();
					j++;
				}
				else {
					count++;
					if(count > 1)
						continue;
				}
			}
			if(0 <= count && count < 2)
				result++;
				
		}
		System.out.print(result);
		scan.close();
	}

}
